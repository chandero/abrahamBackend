package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoPersona;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoPersonaDAO{

    private Database db;

    @Inject
    private TipoPersonaDAO(Database db) {
        this.db = db;
    }

    public List<TipoPersona> getTipoPersona(){
        List<TipoPersona> _dataList = new ArrayList<TipoPersona>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_TIPO_PERSONA, t.DESCRIPCION_PERSONA, t.SEXO FROM \"gen$tipospersona\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoPersona tp = new TipoPersona();
                    tp.set_id(rs.getInt("ID_TIPO_PERSONA"));
                    tp.set_descripcion(rs.getString("DESCRIPCION_PERSONA"));
                    tp.set_sexo(rs.getBoolean("SEXO"));
                    _dataList.add(tp);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}