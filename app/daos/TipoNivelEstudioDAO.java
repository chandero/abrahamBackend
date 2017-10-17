package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoNivelEstudio;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoNivelEstudioDAO{

    private Database db;

    @Inject
    private TipoNivelEstudioDAO(Database db) {
        this.db = db;
    }

    public List<TipoNivelEstudio> getTipoNivelEstudio(){
        List<TipoNivelEstudio> _dataList = new ArrayList<TipoNivelEstudio>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_NIVEL, t.DESCRIPCION_NIVEL FROM \"gen$nivelestudio\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoNivelEstudio tp = new TipoNivelEstudio();
                    tp.set_id(rs.getInt("ID_NIVEL"));
                    tp.set_descripcion(rs.getString("DESCRIPCION_NIVEL"));
                    _dataList.add(tp);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}