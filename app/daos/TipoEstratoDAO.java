package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoEstrato;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoEstratoDAO{

    private Database db;

    @Inject
    private TipoEstratoDAO(Database db) {
        this.db = db;
    }

    public List<TipoEstrato> getTipoEstrato(){
        List<TipoEstrato> _dataList = new ArrayList<TipoEstrato>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_ESTRATO, t.DESCRIPCION FROM \"gen$estrato\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoEstrato tp = new TipoEstrato();
                    tp.set_id(rs.getInt("ID_ESTRATO"));
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