package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoReferencia;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoReferenciaDAO{

    private Database db;

    @Inject
    private TipoReferenciaDAO(Database db) {
        this.db = db;
    }

    public List<TipoReferencia> getTipoReferencia(){
        List<TipoReferencia> _dataList = new ArrayList<TipoReferencia>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_REFERENCIA, r.DESCRIPCION_REFERENCIA FROM \"gen$tiposreferencia\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoReferencia td = new TipoReferencia();
                    td.set_id(rs.getInt("ID_REFERENCIA"));
                    td.set_descripcion(rs.getString("DESCRIPCION_REFERENCIA"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}