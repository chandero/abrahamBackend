package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.*;
import java.sql.Connection;
import javax.inject.Inject;

import commons.NamedParameterStatement;
import play.db.*;

public class SolicitudDAO {

    private Database _db;

    @Inject
    private SolicitudDAO(Database _db) {
        this._db = _db;
    }

    public List<Solicitud> getSolicitud() {
        List<Solicitud> _dataList = new ArrayList<Solicitud>();

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_SOLICITUD, r.ID_PERSONA, r.ID_IDENTIFICACION, r.VALOR_SOLICITADO, "
            + "r.PLAZO, r.AMORTIZACION, r.GARANTIA, r.TIPO_CUOTA, r.ESTADO, r.LINEA, "
            + "r.FECHA_RECEPCION, r.OFICINA, r.DESTINO, r.FECHA_CONCEPTO, r.ID_EMPLEADO, "
            + "r.ENTE_APROBADOR, r.NUMERO_ACTA, r.TASA_INTERES, r.PLAZO_APROBADO, "
            + "r.DESCRIPCION_GARANTIA, r.NUMERO_CODEUDORES, r.RESPALDO, r.VALOR_APROBADO, "
            + "r.ID_ANALISIS, r.INGRESOS, r.DISPONIBLE, r.DEDUCCIONES, r.VALOR_CUOTA, "
            + "r.DISPONIBILIDAD, r.SOLV_ECONOMICA, r.EXP_CREDITOS, r.INVERSION, "
            + "r.CLASIFICACION, r.ES_DESEMBOLSO_PARCIAL, r.PAGO_INTERES, r.ID_COPIA, "
            + "r.OBSERVACION, r.S_VIDA, r.S_EXEQUIAL, r.ES_FUNDACION, r.NUMERO_RIESGO, "
            + "r.FECHA_ANALISIS "
            + "FROM \"col$solicitud\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null) {
                while (rs.next()) {
                    Solicitud o = copyData(rs);
                    _dataList.add(o);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return _dataList;
    }

    public Solicitud getSolicitud(String _numero) {
        Solicitud s = null;

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_SOLICITUD, r.ID_PERSONA, r.ID_IDENTIFICACION, r.VALOR_SOLICITADO, "
            + "r.PLAZO, r.AMORTIZACION, r.GARANTIA, r.TIPO_CUOTA, r.ESTADO, r.LINEA, "
            + "r.FECHA_RECEPCION, r.OFICINA, r.DESTINO, r.FECHA_CONCEPTO, r.ID_EMPLEADO, "
            + "r.ENTE_APROBADOR, r.NUMERO_ACTA, r.TASA_INTERES, r.PLAZO_APROBADO, "
            + "r.DESCRIPCION_GARANTIA, r.NUMERO_CODEUDORES, r.RESPALDO, r.VALOR_APROBADO, "
            + "r.ID_ANALISIS, r.INGRESOS, r.DISPONIBLE, r.DEDUCCIONES, r.VALOR_CUOTA, "
            + "r.DISPONIBILIDAD, r.SOLV_ECONOMICA, r.EXP_CREDITOS, r.INVERSION, "
            + "r.CLASIFICACION, r.ES_DESEMBOLSO_PARCIAL, r.PAGO_INTERES, r.ID_COPIA, "
            + "r.OBSERVACION, r.S_VIDA, r.S_EXEQUIAL, r.ES_FUNDACION, r.NUMERO_RIESGO, "
            + "r.FECHA_ANALISIS "
            + "FROM \"col$solicitud\" r WHERE r.ID_SOLICITUD = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, _numero);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null) {
                while (rs.next()) {
                    s = copyData(rs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }

    public List<Solicitud> getSolicitud(Integer _tipo, String _numero) {
        List<Solicitud> _dataList = new ArrayList<Solicitud>();

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_SOLICITUD, r.ID_PERSONA, r.ID_IDENTIFICACION, r.VALOR_SOLICITADO, "
            + "r.PLAZO, r.AMORTIZACION, r.GARANTIA, r.TIPO_CUOTA, r.ESTADO, r.LINEA, "
            + "r.FECHA_RECEPCION, r.OFICINA, r.DESTINO, r.FECHA_CONCEPTO, r.ID_EMPLEADO, "
            + "r.ENTE_APROBADOR, r.NUMERO_ACTA, r.TASA_INTERES, r.PLAZO_APROBADO, "
            + "r.DESCRIPCION_GARANTIA, r.NUMERO_CODEUDORES, r.RESPALDO, r.VALOR_APROBADO, "
            + "r.ID_ANALISIS, r.INGRESOS, r.DISPONIBLE, r.DEDUCCIONES, r.VALOR_CUOTA, "
            + "r.DISPONIBILIDAD, r.SOLV_ECONOMICA, r.EXP_CREDITOS, r.INVERSION, "
            + "r.CLASIFICACION, r.ES_DESEMBOLSO_PARCIAL, r.PAGO_INTERES, r.ID_COPIA, "
            + "r.OBSERVACION, r.S_VIDA, r.S_EXEQUIAL, r.ES_FUNDACION, r.NUMERO_RIESGO, "
            + "r.FECHA_ANALISIS "
            + "FROM \"col$solicitud\" r WHERE r.ID_PERSONA = ?,  r.ID_IDENTIFICACION = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, _numero);
            stmt.setInt(2, _tipo);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null) {
                while (rs.next()) {
                    Solicitud td = copyData(rs);
                    _dataList.add(td);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return _dataList;
    }

    public Solicitud addSolicitud(Solicitud p) {
        NamedParameterStatement stmt;
        Integer result = 0;
        Solicitud solicitud = null;
        Connection conn = _db.getConnection();
        try {
            String sql = "INSERT INTO \"col$solicitud\" VALUES (:ID_SOLICITUD, :ID_PERSONA, :ID_IDENTIFICACION, :VALOR_SOLICITADO, "
            + ":PLAZO, :AMORTIZACION, :GARANTIA, :TIPO_CUOTA, :ESTADO, :LINEA, :FECHA_RECEPCION, :OFICINA, :DESTINO, :FECHA_CONCEPTO, "
            + ":ID_EMPLEADO, :ENTE_APROBADOR, :NUMERO_ACTA, :TASA_INTERES, :PLAZO_APROBADO, :DESCRIPCION_GARANTIA, :NUMERO_CODEUDORES, "
            + ":RESPALDO, :VALOR_APROBADO, :ID_ANALISIS, :INGRESOS, :DISPONIBLE, :DEDUCCIONES, :VALOR_CUOTA, :DISPONIBILIDAD, "
            + ":SOLV_ECONOMICA, :EXP_CREDITOS, :INVERSION, :CLASIFICACION, :ES_DESEMBOLSO_PARCIAL, :PAGO_INTERES, :ID_COPIA, :OBSERVACION, "
            + ":S_VIDA, :S_EXEQUIAL, :ES_FUNDACION, :NUMERO_RIESGO, :FECHA_ANALISIS)";
            stmt = new NamedParameterStatement(conn, sql);
            copyData(p, stmt);
            result = stmt.executeUpdate();
            if (result > 0){
                solicitud = p;
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
        return solicitud;
    }
    

    public Solicitud updateSolicitud(Solicitud p) {
        NamedParameterStatement stmt;
        Integer result = 0;
        Solicitud solicitud = null;
        Connection conn = _db.getConnection();
        try {
            String sql = "UPDATE \"col$solicitud\" SET "
            + "ID_SOLICITUD = :ID_SOLICITUD," 
            + "ID_PERSONA = :ID_PERSONA," 
            + "ID_IDENTIFICACION = :ID_IDENTIFICACION,"  
            + "VALOR_SOLICITADO = :VALOR_SOLICITADO," 
            + "PLAZO = :PLAZO," 
            + "AMORTIZACION = :AMORTIZACION," 
            + "GARANTIA = :GARANTIA," 
            + "TIPO_CUOTA = :TIPO_CUOTA," 
            + "ESTADO = :ESTADO," 
            + "LINEA = :LINEA," 
            + "FECHA_RECEPCION = :FECHA_RECEPCION," 
            + "OFICINA = :OFICINA," 
            + "DESTINO = :DESTINO," 
            + "FECHA_CONCEPTO = :FECHA_CONCEPTO," 
            + "ID_EMPLEADO = :ID_EMPLEADO, " 
            + "ENTE_APROBADOR = :ENTE_APROBADOR," 
            + "NUMERO_ACTA = :NUMERO_ACTA," 
            + "TASA_INTERES = :TASA_INTERES," 
            + "PLAZO_APROBADO = :PLAZO_APROBADO," 
            + "DESCRIPCION_GARANTIA = :DESCRIPCION_GARANTIA," 
            + "NUMERO_CODEUDORES = :NUMERO_CODEUDORES," 
            + "RESPALDO = :RESPALDO, " 
            + "VALOR_APROBADO = :VALOR_APROBADO," 
            + "ID_ANALISIS = :ID_ANALISIS, "
            + "INGRESOS = :INGRESOS," 
            + "DISPONIBLE = :DISPONIBLE," 
            + "DEDUCCIONES = :DEDUCCIONES," 
            + "VALOR_CUOTA = :VALOR_CUOTA," 
            + "DISPONIBILIDAD = :DISPONIBILIDAD," 
            + "SOLV_ECONOMICA = :SOLV_ECONOMICA," 
            + "EXP_CREDITOS = :EXP_CREDITOS," 
            + "INVERSION = :INVERSION," 
            + "CLASIFICACION = :CLASIFICACION," 
            + "ES_DESEMBOLSO_PARCIAL = :ES_DESEMBOLSO_PARCIAL,"  
            + "PAGO_INTERES = :PAGO_INTERES," 
            + "ID_COPIA = :ID_COPIA," 
            + "OBSERVACION = :OBSERVACION," 
            + "S_VIDA = :S_VIDA," 
            + "S_EXEQUIAL = :S_EXEQUIAL," 
            + "ES_FUNDACION = :ES_FUNDACION," 
            + "NUMERO_RIESGO = :NUMERO_RIESGO," 
            + "FECHA_ANALISIS = :FECHA_ANALISIS "
            + "WHERE ID_SOLICITUD = :ID_SOLICITUD";
            stmt = new NamedParameterStatement(conn, sql);
            copyData(p, stmt);
            result = stmt.executeUpdate();
            if (result > 0){
                solicitud = p;
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
        return solicitud;
    }

    private void copyData(Solicitud o, NamedParameterStatement stmt) throws SQLException {
        stmt.setInt("AMORTIZACION", o.get_amortizacionCapital());
        if (o.get_analista() != null){
            stmt.setString("ID_ANALISIS", o.get_analista().get_id());
        }
        if (o.get_clasificacion() != null) {
            stmt.setInt("CLASIFICACION", o.get_clasificacion().get_id());
        }
        stmt.setFloat("DEDUCCIONES", o.get_deducciones().floatValue());
        stmt.setString("DESCRIPCION_GARANTIA", o.get_descripcionGarantia());
        stmt.setString("DESTINO", o.get_destino());
        stmt.setFloat("DISPONIBILIDAD", o.get_disponibilidad().floatValue());
        stmt.setFloat("DISPONIBLE", o.get_disponible().floatValue());
        if (o.get_empleado() != null) {
            stmt.setString("ID_EMPLEADO", o.get_empleado().get_id());
        }
        if (o.get_enteAprobador() != null ) {
            stmt.setInt("ENTE_APROBADOR", o.get_enteAprobador().get_id());
        }
        stmt.setBoolean("ID_COPIA", o.get_esCopia());
        stmt.setBoolean("ES_DESEMBOLSO_PARCIAL", o.get_esDesembolsoParcial());
        stmt.setBoolean("ES_FUNDACION" ,o.get_esFundacion());
        if (o.get_estado() != null) {
            stmt.setInt("ESTADO", o.get_estado().get_id());
        }
        stmt.setString("EXP_CREDITOS", o.get_experienciaCreditos());
        stmt.setDate("FECHA_ANALISIS", o.get_fechaAnalisis());
        stmt.setDate("FECHA_CONCEPTO", o.get_fechaConcepto());
        stmt.setDate("FECHA_RECEPCION", o.get_fechaRecepcion());
        if (o.get_garantia() != null) {
            stmt.setInt("GARANTIA", o.get_garantia().get_id());
        }
        stmt.setString("ID_SOLICITUD", o.get_id());
        stmt.setFloat("INGRESOS", o.get_ingresos().floatValue());
        if (o.get_inversion() != null) {
            stmt.setInt("INVERSION", o.get_inversion().get_id());
        }  
        if (o.get_linea() != null) {
            stmt.setInt("LINEA" , o.get_linea().get_id());
        }
        stmt.setString("ID_PERSONA", o.get_numero());
        stmt.setString("NUMERO_ACTA", o.get_numeroActa());
        stmt.setInt("NUMERO_CODEUDORES", o.get_numeroCodeudores());
        stmt.setInt("NUMERO_RIESGO", o.get_numeroRiesgo());
        stmt.setString("OBSERVACION", o.get_observacacion());
        if (o.get_Oficina() != null ){
            stmt.setInt("OFICINA", o.get_Oficina().get_id());
        }
        stmt.setInt("PAGO_INTERES", o.get_pagoInteres());
        stmt.setInt("PLAZO", o.get_plazo());
        stmt.setInt("PLAZO_APROBADO", o.get_plazoAprobado());
        if (o.get_respaldo() != null){
            stmt.setInt("RESPALDO", o.get_respaldo().get_id());
        }
        stmt.setBoolean("S_EXEQUIAL", o.get_seguroExequial());
        stmt.setBoolean("S_VIDA", o.get_seguroVida());
        stmt.setBoolean("SOLV_ECONOMICA", o.get_solvenciaEconomica());
        stmt.setFloat("TASA_INTERES", o.get_tasaInteres().floatValue());
        stmt.setInt("ID_IDENTIFICACION", o.get_tipo()); //Tipo Identificacion
        if (o.get_tipoCuota() != null){
            stmt.setInt("TIPO_CUOTA", o.get_tipoCuota().get_id());
        }
        stmt.setFloat("VALOR_SOLICITADO", o.get_valor().floatValue());
        stmt.setFloat("VALOR_APROBADO", o.get_valorAprobado().floatValue());
        stmt.setFloat("VALOR_CUOTA", o.get_valorCuota().floatValue());
    }

    private Solicitud copyData(ResultSet rs) {
        Solicitud o = new Solicitud();
        try {
            o.set_amortizacionCapital(rs.getInt(""));
            Empleado a = new Empleado();
            a.set_id(rs.getString("ID_ANALISTA"));
            o.set_analista(a);
            Clasificacion c = new Clasificacion();
            c.set_id(rs.getInt("CLASIFICACION"));
            o.set_clasificacion(c);
            o.set_deducciones(rs.getFloat("DEDUCCIONES"));
            o.set_descripcionGarantia(rs.getString("DESCRIPCION_GARANTIA"));
            o.set_destino(rs.getString("DESTINO"));
            o.set_disponibilidad(rs.getFloat("DISPONIBILIDAD"));
            o.set_disponible(rs.getFloat("DISPONIBLE"));
            Empleado e = new Empleado();
            e.set_id(rs.getString("ID_EMPLEADO"));
            o.set_empleado(e);
            EnteAprobador ea = new EnteAprobador();
            ea.set_id(rs.getInt("ENTE_APROBADOR"));
            o.set_enteAprobador(ea);
            o.set_esCopia(rs.getBoolean("ID_COPIA"));
            o.set_esDesembolsoParcial(rs.getBoolean("ES_DESEMBOLSO_PARCIAL"));
            o.set_esFundacion(rs.getBoolean("ES_FUNDACION"));
            EstadoSolicitud es = new EstadoSolicitud();
            es.set_id(rs.getInt("ESTADO"));
            o.set_estado(es);
            o.set_experienciaCreditos(rs.getString("EXP_CREDITOS"));
            o.set_fechaAnalisis(new java.util.Date(rs.getDate("FECHA_ANALISIS").getTime()));
            o.set_fechaConcepto(new java.util.Date(rs.getDate("FECHA_CONCEPTO").getTime()));
            o.set_fechaRecepcion(new java.util.Date(rs.getDate("FECHA_RECEPCION").getTime()));
            Garantia g = new Garantia();
            g.set_id(rs.getInt("GARANTIA"));
            o.set_garantia(g);
            o.set_id(rs.getString("ID_SOLICITUD"));
            o.set_ingresos(rs.getFloat("INGRESOS"));
            Inversion i = new Inversion();
            i.set_id(rs.getInt("INVERSION"));
            o.set_inversion(i);
            Linea l = new Linea();
            l.set_id(rs.getInt("LINEA"));
            o.set_linea(l);
            o.set_numero(rs.getString("ID_PERSONA"));
            o.set_numeroActa(rs.getString("NUMERO-ACTA"));
            o.set_numeroCodeudores(rs.getInt("NUMERO_CODEUDORES"));
            o.set_numeroRiesgo(rs.getInt("NUMERO_RIESGO"));
            o.set_observacacion(rs.getString("OBSERVACION"));
            Agencia ag = new Agencia();
            ag.set_id(rs.getInt("OFICINA"));
            o.set_oficina(ag);
            o.set_pagoInteres(rs.getInt("PAGO_INTERES"));
            o.set_plazo(rs.getInt("PLAZO"));
            o.set_plazoAprobado(rs.getInt("PLAZO_APROBADO"));
            Respaldo r = new Respaldo();
            r.set_id(rs.getInt("RESPALDO"));
            o.set_respaldo(r);
            o.set_seguroExequial(rs.getBoolean("S_EXEQUIAL"));
            o.set_seguroVida(rs.getBoolean("S_VIDA"));
            o.set_solvenciaEconomica(rs.getBoolean("SOLV_ECONOMICA"));
            o.set_tasaInteres(rs.getFloat("TASA_INTERES"));
            o.set_tipo(rs.getInt("ID_IDENTIFICACION"));
            TipoCuota tc = new TipoCuota();
            tc.set_id(rs.getInt("TIPO_CUOTA"));
            o.set_tipoCuota(tc);
            o.set_valor(rs.getFloat("VALOR_SOLICITADO"));
            o.set_valorAprobado(rs.getFloat("VALOR_APROBADO"));
            o.set_valorCuota(rs.getFloat("VALOR_CUOTA"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}