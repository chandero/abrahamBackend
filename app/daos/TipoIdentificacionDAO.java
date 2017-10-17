package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoIdentificacion;
import connections.ConnectionFactory;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoIdentificacionDAO{

    private Database db;

    @Inject
    private TipoIdentificacionDAO(Database db) {
        this.db = db;
    }

    public List<TipoIdentificacion> getTipoIdentificacion(){
        List<TipoIdentificacion> _dataList = new ArrayList<TipoIdentificacion>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_IDENTIFICACION, t.DESCRIPCION_IDENTIFICACION, t.INICIAL_IDENTIFICACION FROM \"gen$tiposidentificacion\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoIdentificacion ti = new TipoIdentificacion();
                    ti.set_id(rs.getInt("ID_IDENTIFICACION"));
                    ti.set_descripcion(rs.getString("DESCRIPCION_IDENTIFICACION"));
                    ti.set_inicial(rs.getString("INICIAL_IDENTIFICACION"));
                    _dataList.add(ti);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}