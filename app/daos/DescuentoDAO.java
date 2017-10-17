package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Descuento;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class DescuentoDAO{

    private Database db;

    @Inject
    private DescuentoDAO(Database db) {
        this.db = db;
    }

    public List<Descuento> getDescuento(){
        List<Descuento> _dataList = new ArrayList<Descuento>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_DESCUENTO, r.CODIGO, r.DESCRIPCION_DESCUENTO, r.VALOR_DESCUENTO, "
            + "r.PORCENTAJE_COLOCACION, r.PORCENTAJE_CUOTA, r.EN_DESEMBOLSO, r.EN_CUOTA, "
            + "r.PORCENTAJE_SALDO, r.ES_DISTRIBUIDO, r.ES_ACTIVO "
            + "FROM \"col$descuentos\" r WHERE r.ES_ACTIVO <> 0 ORDER BY r.DESCRIPCION_DESCUENTO";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Descuento o = new Descuento();
                    o.set_codigo(rs.getString("CODIGO"));
                    o.set_descripcion(rs.getString("DESCRIPCION_DESCUENTO"));
                    o.set_enCuota(rs.getBoolean("EN_CUOTA"));
                    o.set_enDesembolso(rs.getBoolean("EN_DESEMBOLSO"));
                    o.set_esActivo(rs.getBoolean("ES_ACTIVO"));
                    o.set_esDistribuido(rs.getBoolean("ES_DISTRIBUIDO"));
                    o.set_id(rs.getInt("ID_DESCUENTO"));
                    o.set_porcentajeColocacion(rs.getFloat("PORCENTAJE_COLOCACION"));
                    o.set_porcentajeCuota(rs.getFloat("PORCENTAJE_CUOTA"));
                    o.set_porcentajeSaldo(rs.getFloat("PORCENTAJE_SALDO"));
                    o.set_valor(rs.getFloat("VALOR_DESCUENTO"));
                    _dataList.add(o);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}