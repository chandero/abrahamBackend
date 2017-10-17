package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Agencia;
import models.Empleado;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class EmpleadoDAO {

    private Database db;

    @Inject
    private EmpleadoDAO(Database db) {
        this.db = db;
    }

    public List<Empleado> getEmpleado() {
        List<Empleado> _dataList = new ArrayList<Empleado>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_EMPLEADO, r.DOCUMENTO, r.PRIMER_APELLIDO, r.SEGUNDO_APELLIDO, "
                    + "r.NOMBRE, r.NUMERO_CUENTA, r.ULTIMO_CAMBIO_PASABORDO, r.AG, r.CONTRASENA, " + "r.TIPO "
                    + "FROM \"gen$empleado\" r WHERE r.TIPO <> 99";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null) {
                while (rs.next()) {
                    Empleado td = new Empleado();
                    Agencia a = new Agencia();
                    a.set_id(rs.getInt("AG"));
                    td.set_agencia(a);
                    td.set_contrasena(rs.getString("CONTRASENA"));
                    td.set_cuenta(rs.getString("NUMERO_CUENTA"));
                    td.set_documento("DOCUMENTO");
                    td.set_id(rs.getString("ID_EMPLEADO"));
                    td.set_nombre(rs.getString("NOMBRE"));
                    td.set_primerApellido(rs.getString("PRIMER_APELLIDO"));
                    td.set_segundoApellido(rs.getString("SEGUNDO_APELLIDO"));
                    td.set_tipo(rs.getInt("TIPO"));
                    td.set_ultimoCambioPasabordo(rs.getDate("ULTIMO_CAMBIO_PASABORDO"));
                    _dataList.add(td);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return _dataList;
    }

    public Empleado getEmpleado(String _id) {
        Empleado _empleado = null;

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_EMPLEADO, r.DOCUMENTO, r.PRIMER_APELLIDO, r.SEGUNDO_APELLIDO, "
                    + "r.NOMBRE, r.NUMERO_CUENTA, r.ULTIMO_CAMBIO_PASABORDO, r.AG, r.CONTRASENA, " + "r.TIPO "
                    + "FROM \"gen$empleado\" r WHERE r.TIPO > 0 and r.ID_EMPLEADO = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, _id);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null) {
                while (rs.next()) {
                    Empleado td = new Empleado();
                    Agencia a = new Agencia();
                    a.set_id(rs.getInt("AG"));
                    td.set_agencia(a);
                    td.set_contrasena(rs.getString("CONTRASENA"));
                    td.set_cuenta(rs.getString("NUMERO_CUENTA"));
                    td.set_documento("DOCUMENTO");
                    td.set_id(rs.getString("ID_EMPLEADO"));
                    td.set_nombre(rs.getString("NOMBRE"));
                    td.set_primerApellido(rs.getString("PRIMER_APELLIDO"));
                    td.set_segundoApellido(rs.getString("SEGUNDO_APELLIDO"));
                    td.set_tipo(rs.getInt("TIPO"));
                    td.set_ultimoCambioPasabordo(rs.getDate("ULTIMO_CAMBIO_PASABORDO"));
                    _empleado = td;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return _empleado;
    }

    public Boolean passwordCheck(String _id, String _password){
        Empleado _empleado = null;
        
                PreparedStatement stmt;
                Connection conn = db.getConnection();
                try {
                    String sql;
                    sql = "SELECT r.ID_EMPLEADO, r.DOCUMENTO, r.PRIMER_APELLIDO, r.SEGUNDO_APELLIDO, "
                            + "r.NOMBRE, r.NUMERO_CUENTA, r.ULTIMO_CAMBIO_PASABORDO, r.AG, r.CONTRASENA, " + "r.TIPO "
                            + "FROM \"gen$empleado\" r WHERE r.TIPO > 0 and r.ID_EMPLEADO = ? and r.CONTRASENA = ?";
                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, _id);
                    stmt.setString(2, _password);
                    ResultSet rs = stmt.executeQuery();
                    //Extract data from result set
                    if (rs != null) {
                        while (rs.next()) {
                            Empleado td = new Empleado();
                            Agencia a = new Agencia();
                            a.set_id(rs.getInt("AG"));
                            td.set_agencia(a);
                            td.set_contrasena(rs.getString("CONTRASENA"));
                            td.set_cuenta(rs.getString("NUMERO_CUENTA"));
                            td.set_documento("DOCUMENTO");
                            td.set_id(rs.getString("ID_EMPLEADO"));
                            td.set_nombre(rs.getString("NOMBRE"));
                            td.set_primerApellido(rs.getString("PRIMER_APELLIDO"));
                            td.set_segundoApellido(rs.getString("SEGUNDO_APELLIDO"));
                            td.set_tipo(rs.getInt("TIPO"));
                            td.set_ultimoCambioPasabordo(rs.getDate("ULTIMO_CAMBIO_PASABORDO"));
                            _empleado = td;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        
                return _empleado != null;
    }
}