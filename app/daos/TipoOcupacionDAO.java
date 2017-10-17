package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoOcupacion;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoOcupacionDAO{

    private Database db;

    @Inject
    private TipoOcupacionDAO(Database db) {
        this.db = db;
    }

    public List<TipoOcupacion> getTipoOcupacion(){
        List<TipoOcupacion> _dataList = new ArrayList<TipoOcupacion>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_OCUPACION, t.DESCRIPCION FROM \"gen$tiposocupacion\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoOcupacion tp = new TipoOcupacion();
                    tp.set_id(rs.getInt("ID_OCUPACION"));
                    tp.set_descripcion(rs.getString("DESCRIPCION"));
                    _dataList.add(tp);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}