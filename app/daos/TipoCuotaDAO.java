package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoCuota;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoCuotaDAO{

    private Database db;

    @Inject
    private TipoCuotaDAO(Database db) {
        this.db = db;
    }

    public List<TipoCuota> getTipoCuota(){
        List<TipoCuota> _dataList = new ArrayList<TipoCuota>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_TIPOS_CUOTA, r.DESCRIPCION_TIPO_CUOTA, r.CAPITAL, r.INTERES, r.TIPO_CUOTA, r.ES_VARIABLE, r.ES_FIJA FROM \"col$tiposcuota\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoCuota td = new TipoCuota();
                    td.set_id(rs.getInt("ID_TIPOS_CUOTA"));
                    td.set_descripcion(rs.getString("DESCRIPCION_TIPO_CUOTA"));
                    td.set_capital(rs.getString("CAPITAL"));
                    td.set_esFija(rs.getBoolean("ES_FIJA"));
                    td.set_esVariable(rs.getBoolean("ES_VARIABLE"));
                    td.set_interes(rs.getString("INTERES"));
                    td.set_tipoCuota(rs.getString("TIPO_CUOTA"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}