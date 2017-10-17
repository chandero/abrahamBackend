package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoRespaldo;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoRespaldoDAO{

    private Database db;

    @Inject
    private TipoRespaldoDAO(Database db) {
        this.db = db;
    }

    public List<TipoRespaldo> getTipoRespaldo(){
        List<TipoRespaldo> _dataList = new ArrayList<TipoRespaldo>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_RESPALDO, r.DESCRIPCION_RESPALDO FROM \"col$respaldo\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoRespaldo td = new TipoRespaldo();
                    td.set_id(rs.getInt("ID_RESPALDO"));
                    td.set_descripcion(rs.getString("DESCRIPCION_RESPALDO"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}