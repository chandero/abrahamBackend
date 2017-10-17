package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.EnteAprobador;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class EnteAprobadorDAO {

    private Database db;

    @Inject
    private EnteAprobadorDAO(Database db) {
        this.db = db;
    }

    public List<EnteAprobador> getEnteAprobador(){
        List<EnteAprobador> _dataList = new ArrayList<EnteAprobador>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_ENTE_APROBADOR, t.DESCRIPCION_ENTE_APROBADOR, t.MONTO_MAXIMO FROM \"col$enteaprobador\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    EnteAprobador td = new EnteAprobador();
                    td.set_id(rs.getInt("ID_ENTE_APROBADOR"));
                    td.set_descripcion(rs.getString("DESCRIPCION_ENTE_APROBADOR"));
                    td.set_monto(rs.getBigDecimal("MONTO_MAXIMO"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}