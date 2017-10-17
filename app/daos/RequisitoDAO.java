package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Requisito;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class RequisitoDAO{

    private Database db;

    @Inject
    private RequisitoDAO(Database db) {
        this.db = db;
    }

    public List<Requisito> getRequisito(){
        List<Requisito> _dataList = new ArrayList<Requisito>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_REQUISITO, t.DESCRIPCION FROM \"col$requisitos\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Requisito td = new Requisito();
                    td.set_id(rs.getInt("ID_REQUISITO"));
                    td.set_descripcion(rs.getString("DESCRIPCION"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }

    public Requisito add(Requisito r){
        PreparedStatement stmt;
        Connection conn = db.getConnection();
        
        try {
            conn.setAutoCommit(false);
            String sql;
            sql = "INSERT INTO \"col$requisitos\" (DESCRIPCION) VALUES (?)";
            stmt = conn.prepareStatement(sql);
            Integer result = stmt.executeUpdate();
            if (result > 0){
                
                conn.commit();
            }
        } catch ( Exception e){
            try {
            conn.rollback();
            } catch (SQLException e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        }      
        return r;
    }
}