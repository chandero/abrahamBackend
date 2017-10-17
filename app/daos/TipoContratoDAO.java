package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoContrato;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoContratoDAO{

    private Database db;

    @Inject
    private TipoContratoDAO(Database db) {
        this.db = db;
    }

    public List<TipoContrato> getTipoContrato(){
        List<TipoContrato> _dataList = new ArrayList<TipoContrato>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_CONTRATO, t.DESCRIPCION FROM \"gen$tiposcontrato\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoContrato td = new TipoContrato();
                    td.set_id(rs.getInt("ID_CONTRATO"));
                    td.set_descripcion(rs.getString("DESCRIPCION"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}