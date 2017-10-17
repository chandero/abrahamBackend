package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoDireccion;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoDireccionDAO{

    private Database db;

    @Inject
    private TipoDireccionDAO(Database db) {
        this.db = db;
    }

    public List<TipoDireccion> getTipoDireccion(){
        List<TipoDireccion> _dataList = new ArrayList<TipoDireccion>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_DIRECCION, t.DESCRIPCION_DIRECCION FROM \"gen$tiposdireccion\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoDireccion td = new TipoDireccion();
                    td.set_id(rs.getInt("ID_DIRECCION"));
                    td.set_descripcion(rs.getString("DESCRIPCION_DIRECCION"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}