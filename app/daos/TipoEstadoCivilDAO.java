package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoEstadoCivil;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoEstadoCivilDAO{

    private Database db;

    @Inject
    private TipoEstadoCivilDAO(Database db) {
        this.db = db;
    }

    public List<TipoEstadoCivil> getTipoEstadoCivil(){
        List<TipoEstadoCivil> _dataList = new ArrayList<TipoEstadoCivil>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_TIPO_ESTADO_CIVIL, r.DESCRIPCION_ESTADO_CIVIL, r.CONYUGE_ESTADO_CIVIL FROM \"gen$tiposestadocivil\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoEstadoCivil td = new TipoEstadoCivil();
                    td.set_id(rs.getInt("ID_TIPO_ESTADO_CIVIL"));
                    td.set_descripcion(rs.getString("DESCRIPCION_ESTADO_CIVIL"));
                    td.set_conyuge(rs.getBoolean("CONYUGE_ESTADO_CIVIL"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}