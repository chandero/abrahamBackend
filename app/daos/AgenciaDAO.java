package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Agencia;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class AgenciaDAO{

    private Database db;

    @Inject
    private AgenciaDAO(Database db) {
        this.db = db;
    }

    public List<Agencia> getAgencia(){
        List<Agencia> _dataList = new ArrayList<Agencia>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_AGENCIA, t.DESCRIPCION_AGENCIA FROM \"gen$agencia\" t WHERE t.ACTIVA <> 0 ORDER BY t.DESCRIPCION_AGENCIA";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Agencia td = new Agencia();
                    td.set_id(rs.getInt("ID_AGENCIA"));
                    td.set_descripcion(rs.getString("DESCRIPCION_AGENCIA"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}