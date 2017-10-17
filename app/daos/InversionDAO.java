package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Inversion;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class InversionDAO{

    private Database db;

    @Inject
    private InversionDAO(Database db) {
        this.db = db;
    }

    public List<Inversion> getInversion(){
        List<Inversion> _dataList = new ArrayList<Inversion>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_INVERSION, t.DESCRIPCION_INVERSION FROM \"col$inversion\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Inversion td = new Inversion();
                    td.set_id(rs.getInt("ID_INVERSION"));
                    td.set_descripcion(rs.getString("DESCRIPCION_INVERSION"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }

    public Inversion add(Inversion r){
        PreparedStatement stmt;
        Connection conn = db.getConnection();
        
        try {
            conn.setAutoCommit(false);
            String sql;
            sql = "INSERT INTO \"col$Inversions\" (DESCRIPCION_INVERSION) VALUES (?)";
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