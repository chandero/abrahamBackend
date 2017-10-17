package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Linea;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class LineaDAO{

    private Database db;

    @Inject
    private LineaDAO(Database db) {
        this.db = db;
    }

    public List<Linea> getLinea(){
        List<Linea> _dataList = new ArrayList<Linea>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_LINEA, r.DESCRIPCION_LINEA, r.VECES_APORTES, r.VECES_AHORROS, "
            + "r.PORCENTAJE_CREDITO, r.PORCENTAJE_APORTES, r.PORCENTAJE_AHORROS, "
            + "r.MINIMO_CAPITALIZAR, r.CAPITALIZACION_ACUMULADA, r.ES_VIVIENDA, "
            + "r.ES_ORDINARIA, r.TASA, r.PUNTOS_ADICIONALES, r.ESTADO, r.CF_REDONDEO "
            + "FROM \"col$lineas\" r WHERE r.ESTADO <> 0";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Linea o = new Linea();
                    o.set_capitalizacionAcumulada(rs.getBoolean("CAPITALIZACION_ACUMULADA"));
                    o.set_cfRedondeo(rs.getBoolean("CF_REDONDEO"));
                    o.set_descripcion(rs.getString("DESCRIPCION_LINEA"));
                    o.set_esOrdinaria(rs.getBoolean("ES_ORDINARIA"));
                    o.set_estado(rs.getBoolean("ESTADO"));
                    o.set_esVivienda(rs.getBoolean("ES_VIVIENDA"));
                    o.set_id(rs.getInt("ID_LINEA"));
                    o.set_minimoCapitalizar(rs.getFloat("MINIMO_CAPITALIZAR"));
                    o.set_porcentajeAhorros(rs.getFloat("PORCENTAJE_AHORROS"));
                    o.set_porcentajeAportes(rs.getFloat("PORCENTAJE_APORTES"));
                    o.set_porcentajeCredito(rs.getFloat("PORCENTAJE_CREDITO"));
                    o.set_puntosAdicionales(rs.getFloat("PUNTOS_ADICIONALES"));
                    o.set_tasa(rs.getFloat("TASA"));
                    o.set_vecesAhorros(rs.getFloat("VECES_AHORROS"));
                    o.set_vecesAportes(rs.getFloat("VECES_APORTES"));
                    _dataList.add(o);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}