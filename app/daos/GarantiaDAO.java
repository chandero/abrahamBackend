package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Garantia;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class GarantiaDAO{

    private Database db;

    @Inject
    private GarantiaDAO(Database db) {
        this.db = db;
    }

    public List<Garantia> getGarantia(){
        List<Garantia> _dataList = new ArrayList<Garantia>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_GARANTIA, t.DESCRIPCION_GARANTIA FROM \"col$garantia\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Garantia td = new Garantia();
                    td.set_id(rs.getInt("ID_GARANTIA"));
                    td.set_descripcion(rs.getString("DESCRIPCION_GARANTIA"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}