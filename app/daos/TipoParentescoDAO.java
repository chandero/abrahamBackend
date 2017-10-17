package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoParentesco;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoParentescoDAO{

    private Database db;

    @Inject
    private TipoParentescoDAO(Database db) {
        this.db = db;
    }

    public List<TipoParentesco> getTipoParentesco(){
        List<TipoParentesco> _dataList = new ArrayList<TipoParentesco>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_PARENTESCO, r.DESCRIPCION_PARENTESCO FROM \"gen$tiposparentesco\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoParentesco td = new TipoParentesco();
                    td.set_id(rs.getInt("ID_PARENTESCO"));
                    td.set_descripcion(rs.getString("DESCRIPCION_PARENTESCO"));
                   _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}