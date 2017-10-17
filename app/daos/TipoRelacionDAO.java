package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoRelacion;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoRelacionDAO{

    private Database db;

    @Inject
    private TipoRelacionDAO(Database db) {
        this.db = db;
    }

    public List<TipoRelacion> getTipoRelacion(){
        List<TipoRelacion> _dataList = new ArrayList<TipoRelacion>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_TIPO_RELACION, r.DESCRIPCION_RELACION FROM \"gen$tiposrelacion\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoRelacion td = new TipoRelacion();
                    td.set_id(rs.getInt("ID_TIPO_RELACION"));
                    td.set_descripcion(rs.getString("DESCRIPCION_RELACION"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}