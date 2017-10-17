package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Clasificacion;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class ClasificacionDAO{

    private Database db;

    @Inject
    private ClasificacionDAO(Database db) {
        this.db = db;
    }

    public List<Clasificacion> getClasificacion(){
        List<Clasificacion> _dataList = new ArrayList<Clasificacion>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_CLASIFICACION, t.DESCRIPCION_CLASIFICACION FROM \"col$clasificacion\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Clasificacion td = new Clasificacion();
                    td.set_id(rs.getInt("ID_CLASIFICACION"));
                    td.set_descripcion(rs.getString("DESCRIPCION_CLASIFICACION"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}