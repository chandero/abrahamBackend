package connections;

import play.Play;

import java.util.Properties;
import javax.inject.Inject;
import java.sql.Connection;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionFactory {

  private String dbproto;
  private String dbbase;
  private String dbport;
  private String dbname;
  private String dbuser;
  private String dbpass;
  private String dbdriver;

  @Inject
  play.Application application;

  private static ConnectionFactory instance = new ConnectionFactory();

  public static ConnectionFactory getInstance() {
    if (instance == null) {
      instance = new ConnectionFactory();
    }
    return instance;
  }

  private ConnectionFactory() {
    Properties prop = null;
    try {
      prop = new Properties();
      InputStream is = null;
      if (application != null){
        is = application.resourceAsStream("db.conf");
        prop.load(is);
      } else {
        System.out.println("ConnectionFactory Linea 45 - no existe application");
      }
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("ConnectionFactory linea 44, - leyendo archivo de propiedades de db");
    this.dbdriver = prop.getProperty("dbdriver", "org.firebirdsql.jdbc.FBDriver");
    this.dbproto = prop.getProperty("dbproto", "jdbc");
    this.dbbase = prop.getProperty("dbbase", "firebirdsql");
    this.dbport = prop.getProperty("dbport", "3050");
    this.dbname = prop.getProperty("dbname", "C:/opt/db/database.fdb");
    this.dbuser = prop.getProperty("dbuser", "SYSDBA");
    this.dbpass = prop.getProperty("dbpass", "masterkey");
    System.out.println("ConnectionFactory linea 44, - parametros leidos db:" + this.dbname);

  }

  private Connection createConnection() {
    System.out.println("ConnectionFactory linea 61, - creando conexión");
    Connection connection = null;
    try {
      System.out.println("ConnectionFactory linea 64, - driver asignado '" + this.dbdriver + "'");
      Class.forName(this.dbdriver);
      String url = this.dbproto + ":" + this.dbbase + "/" + this.dbport + ":" + this.dbname;
      System.out.println("ConnectionFactory linea 64, - url '" + url + "'");
      connection = DriverManager.getConnection(url,this.dbuser, this.dbpass);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    if (connection != null) {
      return connection;
    } else {
      return null;
    }
  }

  public static Connection getConnection() {
    return instance.createConnection();
  }
}