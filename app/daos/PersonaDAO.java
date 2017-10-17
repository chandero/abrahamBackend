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

public class PersonaDAO {

    private Database _db;

    @Inject
    private PersonaDAO(Database _db) {
        this._db = _db;
    }

    public List<Persona> getPersona() {
        List<Persona> _dataList = new ArrayList<Persona>();

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_IDENTIFICACION, r.ID_PERSONA, r.LUGAR_EXPEDICION, "
                    + "r.FECHA_EXPEDICION, r.NOMBRE, r.PRIMER_APELLIDO, r.SEGUNDO_APELLIDO, "
                    + "r.ID_TIPO_PERSONA, r.SEXO, r.FECHA_NACIMIENTO, r.LUGAR_NACIMIENTO, "
                    + "r.PROVINCIA_NACIMIENTO, r.DEPTO_NACIMIENTO, r.PAIS_NACIMIENTO, "
                    + "r.ID_TIPO_ESTADO_CIVIL, r.ID_CONYUGE, r.ID_IDENTIFICACION_CONYUGE, "
                    + "r.NOMBRE_CONYUGE, r.PRIMER_APELLIDO_CONYUGE, r.SEGUNDO_APELLIDO_CONYUGE, "
                    + "r.ID_APODERADO, r.ID_IDENTIFICACION_APODERADO, r.NOMBRE_APODERADO, "
                    + "r.PRIMER_APELLIDO_APODERADO, r.SEGUNDO_APELLIDO_APODERADO, r.PROFESION, "
                    + "r.ID_ESTADO, r.ID_TIPO_RELACION, r.ID_CIIU, r.EMPRESA_LABORA, "
                    + "r.FECHA_INGRESO_EMPRESA, r.CARGO_ACTUAL, r.DECLARACION, "
                    + "r.INGRESOS_A_PRINCIPAL, r.INGRESOS_OTROS, r.INGRESOS_CONYUGE, "
                    + "r.INGRESOS_CONYUGE_OTROS, r.DESC_INGR_OTROS, r.EGRESOS_ALQUILER, "
                    + "r.EGRESOS_SERVICIOS, r.EGRESOS_TRANSPORTE, r.EGRESOS_ALIMENTACION, "
                    + "r.EGRESOS_DEUDAS, r.EGRESOS_OTROS, r.DESC_EGRE_OTROS, r.EGRESOS_CONYUGE, "
                    + "r.OTROS_EGRESOS_CONYUGE, r.TOTAL_ACTIVOS, r.TOTAL_PASIVOS, r.EDUCACION, "
                    + "r.RETEFUENTE, r.ACTA, r.FECHA_REGISTRO, r.FOTO, r.FIRMA, "
                    + "r.ESCRITURA_CONSTITUCION, r.DURACION_SOCIEDAD, r.CAPITAL_SOCIAL, "
                    + "r.MATRICULA_MERCANTIL, r.FOTO_HUELLA, r.DATOS_HUELLA, r.EMAIL, "
                    + "r.ID_EMPLEADO, r.FECHA_ACTUALIZACION " + "FROM \"gen$persona\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null) {
                while (rs.next()) {
                    Persona o = copyData(rs);
                    _dataList.add(o);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return _dataList;
    }

    public List<Persona> getPersona(Integer _tipo, String _numero) {
        List<Persona> _dataList = new ArrayList<Persona>();

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_IDENTIFICACION, r.ID_PERSONA, r.LUGAR_EXPEDICION, "
                    + "r.FECHA_EXPEDICION, r.NOMBRE, r.PRIMER_APELLIDO, r.SEGUNDO_APELLIDO, "
                    + "r.ID_TIPO_PERSONA, r.SEXO, r.FECHA_NACIMIENTO, r.LUGAR_NACIMIENTO, "
                    + "r.PROVINCIA_NACIMIENTO, r.DEPTO_NACIMIENTO, r.PAIS_NACIMIENTO, "
                    + "r.ID_TIPO_ESTADO_CIVIL, r.ID_CONYUGE, r.ID_IDENTIFICACION_CONYUGE, "
                    + "r.NOMBRE_CONYUGE, r.PRIMER_APELLIDO_CONYUGE, r.SEGUNDO_APELLIDO_CONYUGE, "
                    + "r.ID_APODERADO, r.ID_IDENTIFICACION_APODERADO, r.NOMBRE_APODERADO, "
                    + "r.PRIMER_APELLIDO_APODERADO, r.SEGUNDO_APELLIDO_APODERADO, r.PROFESION, "
                    + "r.ID_ESTADO, r.ID_TIPO_RELACION, r.ID_CIIU, r.EMPRESA_LABORA, "
                    + "r.FECHA_INGRESO_EMPRESA, r.CARGO_ACTUAL, r.DECLARACION, "
                    + "r.INGRESOS_A_PRINCIPAL, r.INGRESOS_OTROS, r.INGRESOS_CONYUGE, "
                    + "r.INGRESOS_CONYUGE_OTROS, r.DESC_INGR_OTROS, r.EGRESOS_ALQUILER, "
                    + "r.EGRESOS_SERVICIOS, r.EGRESOS_TRANSPORTE, r.EGRESOS_ALIMENTACION, "
                    + "r.EGRESOS_DEUDAS, r.EGRESOS_OTROS, r.DESC_EGRE_OTROS, r.EGRESOS_CONYUGE, "
                    + "r.OTROS_EGRESOS_CONYUGE, r.TOTAL_ACTIVOS, r.TOTAL_PASIVOS, r.EDUCACION, "
                    + "r.RETEFUENTE, r.ACTA, r.FECHA_REGISTRO, r.FOTO, r.FIRMA, "
                    + "r.ESCRITURA_CONSTITUCION, r.DURACION_SOCIEDAD, r.CAPITAL_SOCIAL, "
                    + "r.MATRICULA_MERCANTIL, r.FOTO_HUELLA, r.DATOS_HUELLA, r.EMAIL, "
                    + "r.ID_EMPLEADO, r.FECHA_ACTUALIZACION "
                    + "FROM \"gen$persona\" r WHERE r.ID_IDENTIFICACION = ? and r.ID_PERSONA = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, _tipo);
            stmt.setString(2, _numero);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null) {
                while (rs.next()) {
                    Persona td = copyData(rs);
                    _dataList.add(td);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return _dataList;
    }

    public List<Persona> getPersona(String _filter) {
        List<Persona> _dataList = new ArrayList<Persona>();

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_IDENTIFICACION, r.ID_PERSONA, r.LUGAR_EXPEDICION, "
                    + "r.FECHA_EXPEDICION, r.NOMBRE, r.PRIMER_APELLIDO, r.SEGUNDO_APELLIDO, "
                    + "r.ID_TIPO_PERSONA, r.SEXO, r.FECHA_NACIMIENTO, r.LUGAR_NACIMIENTO, "
                    + "r.PROVINCIA_NACIMIENTO, r.DEPTO_NACIMIENTO, r.PAIS_NACIMIENTO, "
                    + "r.ID_TIPO_ESTADO_CIVIL, r.ID_CONYUGE, r.ID_IDENTIFICACION_CONYUGE, "
                    + "r.NOMBRE_CONYUGE, r.PRIMER_APELLIDO_CONYUGE, r.SEGUNDO_APELLIDO_CONYUGE, "
                    + "r.ID_APODERADO, r.ID_IDENTIFICACION_APODERADO, r.NOMBRE_APODERADO, "
                    + "r.PRIMER_APELLIDO_APODERADO, r.SEGUNDO_APELLIDO_APODERADO, r.PROFESION, "
                    + "r.ID_ESTADO, r.ID_TIPO_RELACION, r.ID_CIIU, r.EMPRESA_LABORA, "
                    + "r.FECHA_INGRESO_EMPRESA, r.CARGO_ACTUAL, r.DECLARACION, "
                    + "r.INGRESOS_A_PRINCIPAL, r.INGRESOS_OTROS, r.INGRESOS_CONYUGE, "
                    + "r.INGRESOS_CONYUGE_OTROS, r.DESC_INGR_OTROS, r.EGRESOS_ALQUILER, "
                    + "r.EGRESOS_SERVICIOS, r.EGRESOS_TRANSPORTE, r.EGRESOS_ALIMENTACION, "
                    + "r.EGRESOS_DEUDAS, r.EGRESOS_OTROS, r.DESC_EGRE_OTROS, r.EGRESOS_CONYUGE, "
                    + "r.OTROS_EGRESOS_CONYUGE, r.TOTAL_ACTIVOS, r.TOTAL_PASIVOS, r.EDUCACION, "
                    + "r.RETEFUENTE, r.ACTA, r.FECHA_REGISTRO, r.FOTO, r.FIRMA, "
                    + "r.ESCRITURA_CONSTITUCION, r.DURACION_SOCIEDAD, r.CAPITAL_SOCIAL, "
                    + "r.MATRICULA_MERCANTIL, r.FOTO_HUELLA, r.DATOS_HUELLA, r.EMAIL, "
                    + "r.ID_EMPLEADO, r.FECHA_ACTUALIZACION "
                    + "FROM \"gen$persona\" r WHERE r.NOMBRE LIKE ? or r.PRIMER_APELLIDO LIKE ? OR r.SEGUNDO_APELLIDO LIKE ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, _filter);
            stmt.setString(2, _filter);
            stmt.setString(3, _filter);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null) {
                while (rs.next()) {
                    Persona td = copyData(rs);
                    _dataList.add(td);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return _dataList;
    }

    public Integer addPersona(Persona p) {
        NamedParameterStatement stmt;
        Integer result = 0;
        Connection conn = _db.getConnection();
        try {
            String sql = "INSERT INTO \"gen$persona\" VALUES (:ID_IDENTIFICACION, :ID_PERSONA, :LUGAR_EXPEDICION, "
                    + ":FECHA_EXPEDICION, :NOMBRE, "
                    + ":PRIMER_APELLIDO, :SEGUNDO_APELLIDO, "
                    + ":ID_TIPO_PERSONA, :SEXO, "
                    + ":FECHA_NACIMIENTO, :LUGAR_NACIMIENTO, "
                    + ":PROVINCIA_NACIMIENTO, :DEPTO_NACIMIENTO, "
                    + ":PAIS_NACIMIENTO, :ID_TIPO_ESTADO_CIVIL, "
                    + ":ID_CONYUGE, :ID_IDENTIFICACION_CONYUGE, "
                    + ":NOMBRE_CONYUGE, :PRIMER_APELLIDO_CONYUGE, "
                    + ":SEGUNDO_APELLIDO_CONYUGE, :ID_APODERADO, "
                    + ":ID_IDENTIFICACION_APODERADO, "
                    + ":NOMBRE_APODERADO, "
                    + ":PRIMER_APELLIDO_APODERADO, "
                    + ":SEGUNDO_APELLIDO_APODERADO, :PROFESION, "
                    + ":ID_ESTADO, :ID_TIPO_RELACION, :ID_CIIU, "
                    + ":EMPRESA_LABORA, :FECHA_INGRESO_EMPRESA, "
                    + ":CARGO_ACTUAL, :DECLARACION, "
                    + ":INGRESOS_A_PRINCIPAL, :INGRESOS_OTROS, "
                    + ":INGRESOS_CONYUGE, :INGRESOS_CONYUGE_OTROS, "
                    + ":DESC_INGR_OTROS, :EGRESOS_ALQUILER, "
                    + ":EGRESOS_SERVICIOS, :EGRESOS_TRANSPORTE, "
                    + ":EGRESOS_ALIMENTACION, :EGRESOS_DEUDAS, "
                    + ":EGRESOS_OTROS, :DESC_EGRE_OTROS, "
                    + ":EGRESOS_CONYUGE, :OTROS_EGRESOS_CONYUGE, "
                    + ":TOTAL_ACTIVOS, :TOTAL_PASIVOS, "
                    + ":EDUCACION, :RETEFUENTE, :ACTA , "
                    + ":FECHA_REGISTRO, :FOTO, :FIRMA, "
                    + ":ESCRITURA_CONSTITUCION, :DURACION_SOCIEDAD, "
                    + ":CAPITAL_SOCIAL, :MATRICULA_MERCANTIL, "
                    + ":FOTO_HUELLA, :DATOS_HUELLA, :EMAIL, "
                    + ":ID_EMPLEADO, :FECHA_ACTUALIZACION ";
            stmt = new NamedParameterStatement(conn, sql);
            copyData(p, stmt);
            result = stmt.executeUpdate();
            if (result > 0){
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
        return result;
    }
    

    public Integer updatePersona(Persona p) {
        NamedParameterStatement stmt;
        Integer result = 0;
        Connection conn = _db.getConnection();
        try {
            String sql = "UPDATE \"gen$persona\" SET " + "LUGAR_EXPEDICION = :LUGAR_EXPEDICION, "
                    + "FECHA_EXPEDICION = :FECHA_EXPEDICION, " + "NOMBRE = :NOMBRE, "
                    + "PRIMER_APELLIDO = :PRIMER_APELLIDO, " + "SEGUNDO_APELLIDO = :SEGUNDO_APELLIDO, "
                    + "ID_TIPO_PERSONA = :ID_TIPO_PERSONA, " + "SEXO = :SEXO, "
                    + "FECHA_NACIMIENTO = :FECHA_NACIMIENTO, " + "LUGAR_NACIMIENTO = :LUGAR_NACIMIENTO, "
                    + "PROVINCIA_NACIMIENTO = :PROVINCIA_NACIMIENTO, " + "DEPTO_NACIMIENTO = :DEPTO_NACIMIENTO, "
                    + "PAIS_NACIMIENTO = :PAIS_NACIMIENTO, " + "ID_TIPO_ESTADO_CIVIL = :ID_TIPO_ESTADO_CIVIL, "
                    + "ID_CONYUGE = :ID_CONYUGE, " + "ID_IDENTIFICACION_CONYUGE = :ID_IDENTIFICACION_CONYUGE, "
                    + "NOMBRE_CONYUGE = :NOMBRE_CONYUGE, " + "PRIMER_APELLIDO_CONYUGE = :PRIMER_APELLIDO_CONYUGE, "
                    + "SEGUNDO_APELLIDO_CONYUGE = :SEGUNDO_APELLIDO_CONYUGE, " + "ID_APODERADO = :ID_APODERADO, "
                    + "ID_IDENTIFICACION_APODERADO = :ID_IDENTIFICACION_APODERADO, "
                    + "NOMBRE_APODERADO = :NOMBRE_APODERADO, "
                    + "PRIMER_APELLIDO_APODERADO = :PRIMER_APELLIDO_APODERADO, "
                    + "SEGUNDO_APELLIDO_APODERADO = :SEGUNDO_APELLIDO_APODERADO, " + "PROFESION = :PROFESION, "
                    + "ID_ESTADO = :ID_ESTADO, " + "ID_TIPO_RELACION = :ID_TIPO_RELACION, " + "ID_CIIU = :ID_CIIU, "
                    + "EMPRESA_LABORA = :EMPRESA_LABORA, " + "FECHA_INGRESO_EMPRESA = :FECHA_INGRESO_EMPRESA, "
                    + "CARGO_ACTUAL = :CARGO_ACTUAL, " + "DECLARACION = :DECLARACION, "
                    + "INGRESOS_A_PRINCIPAL = :INGRESOS_A_PRINCIPAL, " + "INGRESOS_OTROS = :INGRESOS_OTROS, "
                    + "INGRESOS_CONYUGE = :INGRESOS_CONYUGE, " + "INGRESOS_CONYUGE_OTROS = :INGRESOS_CONYUGE_OTROS, "
                    + "DESC_INGR_OTROS = :DESC_INGR_OTROS, " + "EGRESOS_ALQUILER = :EGRESOS_ALQUILER, "
                    + "EGRESOS_SERVICIOS = :EGRESOS_SERVICIOS, " + "EGRESOS_TRANSPORTE = :EGRESOS_TRANSPORTE, "
                    + "EGRESOS_ALIMENTACION = :EGRESOS_ALIMENTACION, " + "EGRESOS_DEUDAS = :EGRESOS_DEUDAS, "
                    + "EGRESOS_OTROS = :EGRESOS_OTROS, " + "DESC_EGRE_OTROS = :DESC_EGRE_OTROS, "
                    + "EGRESOS_CONYUGE = :EGRESOS_CONYUGE, " + "OTROS_EGRESOS_CONYUGE = :OTROS_EGRESOS_CONYUGE, "
                    + "TOTAL_ACTIVOS = :TOTAL_ACTIVOS, " + "TOTAL_PASIVOS = :TOTAL_PASIVOS, "
                    + "EDUCACION = :EDUCACION, " + "RETEFUENTE = :RETEFUENTE, " + "ACTA = :ACTA , "
                    + "FECHA_REGISTRO = :FECHA_REGISTRO, " + "FOTO = :FOTO, " + "FIRMA = :FIRMA, "
                    + "ESCRITURA_CONSTITUCION = :ESCRITURA_CONSTITUCION, " + "DURACION_SOCIEDAD = :DURACION_SOCIEDAD, "
                    + "CAPITAL_SOCIAL = :CAPITAL_SOCIAL, " + "MATRICULA_MERCANTIL = :MATRICULA_MERCANTIL, "
                    + "FOTO_HUELLA = :FOTO_HUELLA, " + "DATOS_HUELLA = :DATOS_HUELLA, " + "EMAIL = :EMAIL, "
                    + "ID_EMPLEADO = :ID_EMPLEADO, " + "FECHA_ACTUALIZACION = :FECHA_ACTUALIZACION "
                    + "WHERE ID_IDENTIFICACION = :ID_IDENTIFICACION AND ID_PERSONA = :ID_PERSONA";
            stmt = new NamedParameterStatement(conn, sql);
            copyData(p, stmt);
            result = stmt.executeUpdate();
            if (result > 0){
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
        return result;
    }

    private void copyData(Persona o, NamedParameterStatement stmt) throws SQLException {
        stmt.setString("ACTA", o.get_acta());
        stmt.setFloat("CAPITAL_SOCIAL", o.get_capitalSolcial().floatValue());
        stmt.setString("CARGO_ACTUAL",o.get_cargoActual());
        if (o.get_ciiu() != null){
            stmt.setString("ID_CIIU", o.get_ciiu().get_id());
        }
        stmt.setBytes("DATOS_HUELLA", o.get_datosHuella());
        stmt.setString("DECLARACION", o.get_declaracion());
        stmt.setString("DEPTO_NACIMIENTO", o.get_deptoNacimiento());
        stmt.setString("DESC_EGRE_OTROS", o.get_descripcionEgresosOtros());
        stmt.setString("DESC_INGR_OTROS", o.get_descripcionIngresosOtros());
        stmt.setInt("DURACION_SOCIEDAD", o.get_duracionSociedad());
        stmt.setBoolean("EDUCACION", o.get_educacion());
        stmt.setFloat("EGRESOS_ALIMENTACION", o.get_egresosAlimentacion().floatValue());
        stmt.setFloat("EGRESOS_ALQUILER", o.get_egresosAlquiler().floatValue());
        stmt.setFloat("EGRESOS_CONYUGE",   o.get_egresosConyuge().floatValue());
        stmt.setFloat("EGRESOS_DEUDAS", o.get_egresosDeudas().floatValue());
        stmt.setFloat("EGRESOS_OTROS",  o.get_egresosOtros().floatValue());
        stmt.setFloat("EGRESOS_OTROS", o.get_egresosOtrosConyuge().floatValue());
        stmt.setFloat("EGRESOS_SERVICIOS", o.get_egresosServicios().floatValue());
        stmt.setFloat("EGRESOS_TRANSPORTE", o.get_egresosTransporte().floatValue());
        stmt.setString("EMAIL",  o.get_email());
        if (o.get_empleado() != null) {
            stmt.setString("ID_EMPLEADO", o.get_empleado().get_id());
        }
        stmt.setString("EMPRESA_LABORA",  o.get_empresaLabora());
        stmt.setString("ESCRITURA_CONSTITUCION",  o.get_escrituraConstitucion());
        if (o.get_estado() != null) {
            stmt.setInt("ID_ESTADO", o.get_estado().get_id());
        }
        stmt.setDate("FECHA_ACTUALIZACION", o.get_fechaActualizacion());
        stmt.setDate("FECHA_EXPEDICION", o.get_fechaExpedicion());
        stmt.setDate("FECHA_INGRESO_EMPRESA", o.get_fechaIngresoEmpresa());
        stmt.setDate("FECHA_NACIMIENTO", o.get_fechaNacimiento());
        stmt.setDate("FECHA_REGISTRO", o.get_fechaRegistro());
        stmt.setBytes("FIRMA", o.get_firma());
        stmt.setBytes("FOTO", o.get_foto());
        stmt.setBytes("FOTO_HUELLA",  o.get_fotoHuella());
        stmt.setFloat("INGRESOS_CONYUGE", o.get_ingresoConyuge().floatValue());
        stmt.setFloat("INGRESOS_CONYUGE_OTROS", o.get_ingresoConyugeOtros().floatValue());
        stmt.setFloat("INGRESOS_OTROS", o.get_ingresoOtros().floatValue());
        stmt.setFloat("INGRESOS_A_PRINCIPAL", o.get_ingresoPrincipal().floatValue());
        stmt.setString("LUGAR_EXPEDICION", o.get_lugarExpedicion());
        stmt.setString("LUGAR_NACIMIENTO", o.get_lugarNacimiento());
        stmt.setString("MATRICULA_MERCANTIL", o.get_matriculaMercantil());
        stmt.setString("NOMBRE", o.get_nombre());
        stmt.setString("NOMBRE_APODERADO", o.get_nombreApoderado());
        stmt.setString("NOMBRE_CONYUGE", o.get_nombreConyuge());
        stmt.setString("ID_PERSONA", o.get_numero());
        stmt.setString("ID_APODERADO", o.get_numeroApoderado());
        stmt.setString("ID_CONYUGE", o.get_numeroConyuge());
        stmt.setString("PAIS", o.get_paisNacimiento());
        stmt.setString("PRIMER_APELLIDO", o.get_primerApellido());
        stmt.setString("PRIMER_APELLIDO_APODERADO", o.get_primerApellidoApoderado());
        stmt.setString("PRIMER_APELLIDO_CONYUGE", o.get_primerApellidoConyuge());
        stmt.setString("PROFESION", o.get_profesion());
        stmt.setString("PROVINCIA_NACIMIENTO", o.get_provinciaNacimiento());
        stmt.setBoolean("RETEFUENTE", o.get_retefuente());
        stmt.setString("SEGUNDO_APELLIDO", o.get_segundoApellido());
        stmt.setString("SEGUNDO_APELLIDO_APODERADO", o.get_segundoApellidoApoderado());
        stmt.setString("SEGUNDO_APELLIDO_CONYUGE", o.get_segundoApellidoConyuge());
        stmt.setString("SEXO", o.get_sexo());
        stmt.setInt("ID_IDENTIFICACION", o.get_tipo());
        stmt.setInt("ID_IDENTIFICACION_APODERADO", o.get_tipoApoderado());
        stmt.setInt("ID_IDENTIFICACION_CONYUGE", o.get_tipoConyuge());
        if (o.get_tipoEstadoCivil() != null ) {
            stmt.setInt("ID_TIPO_ESTADO_CIVIL", o.get_tipoEstadoCivil().get_id());
        }
        if (o.get_tipoPersona() != null) {
            stmt.setInt("ID_TIPO_PERSONA", o.get_tipoPersona().get_id());
        }
        if (o.get_tipoRelacion() != null) {
            stmt.setInt("ID_TIPO_RELACION", o.get_tipoRelacion().get_id());
        }
        stmt.setFloat("TOTAL_ACTIVOS", o.get_totalActivos().floatValue());
        stmt.setFloat("TOTAL_PASIVOS", o.get_totalPasivos().floatValue());
    }

    private Persona copyData(ResultSet rs) {
        Persona o = new Persona();
        try {
            o.set_acta(rs.getString("ACTA"));
            o.set_capitalSolcial(rs.getFloat("CAPITAL_SOCIAL"));
            o.set_cargoActual(rs.getString("CARGO_ACTUAL"));
            String _ciiuId = rs.getString("ID_CIIU");
            if (_ciiuId != null) {
                TipoCiiu _ciiu = new TipoCiiu();
                _ciiu.set_id(_ciiuId);
                o.set_ciiu(_ciiu);
            }
            o.set_datosHuella(rs.getBytes("DATOS_HUELLA"));
            o.set_declaracion(rs.getString("DECLARACION"));
            o.set_deptoNacimiento(rs.getString("DEPTO_NACIMIENTO"));
            o.set_descripcionEgresosOtros(rs.getString("DESC_EGRE_OTROS"));
            o.set_descripcionIngresosOtros(rs.getString("DESC_INGR_OTROS"));
            o.set_duracionSociedad(rs.getInt("DURACION_SOCIEDAD"));
            o.set_educacion(rs.getBoolean("EDUCACION"));
            o.set_egresosAlimentacion(rs.getFloat("EGRESOS_ALIMENTACION"));
            o.set_egresosAlquiler(rs.getFloat("EGRESOS_ALQUILER"));
            o.set_egresosConyuge(rs.getFloat("EGRESOS_CONYUGE"));
            o.set_egresosDeudas(rs.getFloat("EGRESOS_DEUDAS"));
            o.set_egresosOtros(rs.getFloat("EGRESOS_OTROS"));
            o.set_egresosOtrosConyuge(rs.getFloat("EGRESOS_OTROS"));
            o.set_egresosServicios(rs.getFloat("EGRESOS_SERVICIOS"));
            o.set_egresosTransporte(rs.getFloat("EGRESOS_TRANSPORTE"));
            o.set_email(rs.getString("EMAIL"));
            if (rs.getString("ID_EMPLEADO") != null) {
                Empleado _empleado = new Empleado();
                _empleado.set_id(rs.getString("ID_EMPLEADO"));
                o.set_empleado(_empleado);
            }
            o.set_empresaLabora(rs.getString("EMPRESA_LABORA"));
            o.set_escrituraConstitucion(rs.getString("ESCRITURA_CONSTITUCION"));
            TipoEstadoPersona _estado = new TipoEstadoPersona();
            _estado.set_id(rs.getInt("ID_ESTADO"));
            o.set_estado(_estado);
            o.set_fechaActualizacion(rs.getDate("FECHA_ACTUALIZACION"));
            o.set_fechaExpedicion(rs.getDate("FECHA_EXPEDICION"));
            o.set_fechaIngresoEmpresa(rs.getDate("FECHA_INGRESO_EMPRESA"));
            o.set_fechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
            o.set_fechaRegistro(rs.getDate("FECHA_REGISTRO"));
            o.set_firma(rs.getBytes("FIRMA"));
            o.set_foto(rs.getBytes("FOTO"));
            o.set_fotoHuella(rs.getBytes("FOTO_HUELLA"));
            o.set_ingresoConyuge(rs.getFloat("INGRESOS_CONYUGE"));
            o.set_ingresoConyugeOtros(rs.getFloat("INGRESOS_CONYUGE_OTROS"));
            o.set_ingresoOtros(rs.getFloat("INGRESOS_OTROS"));
            o.set_ingresoPrincipal(rs.getFloat("INGRESOS_A_PRINCIPAL"));
            o.set_lugarExpedicion(rs.getString("LUGAR_EXPEDICION"));
            o.set_lugarNacimiento(rs.getString("LUGAR_NACIMIENTO"));
            o.set_matriculaMercantil(rs.getString("MATRICULA_MERCANTIL"));
            o.set_nombre(rs.getString("NOMBRE"));
            o.set_nombreApoderado(rs.getString("NOMBRE_APODERADO"));
            o.set_nombreConyuge(rs.getString("NOMBRE_CONYUGE"));
            o.set_numero(rs.getString("ID_PERSONA"));
            o.set_numeroApoderado(rs.getString("ID_APODERADO"));
            o.set_numeroConyuge(rs.getString("ID_CONYUGE"));
            o.set_paisNacimiento(rs.getString("PAIS"));
            o.set_primerApellido(rs.getString("PRIMER_APELLIDO"));
            o.set_primerApellidoApoderado(rs.getString("PRIMER_APELLIDO_APODERADO"));
            o.set_primerApellidoConyuge(rs.getString("PRIMER_APELLIDO_CONYUGE"));
            o.set_profesion(rs.getString("PROFESION"));
            o.set_provinciaNacimiento(rs.getString("PROVINCIA_NACIMIENTO"));
            o.set_retefuente(rs.getBoolean("RETEFUENTE"));
            o.set_segundoApellido(rs.getString("SEGUNDO_APELLIDO"));
            o.set_segundoApellidoApoderado(rs.getString("SEGUNDO_APELLIDO_APODERADO"));
            o.set_segundoApellidoConyuge(rs.getString("SEGUNDO_APELLIDO_CONYUGE"));
            o.set_sexo(rs.getString("SEXO"));
            o.set_tipo(rs.getInt("ID_IDENTIFICACION"));
            o.set_tipoApoderado(rs.getInt("ID_IDENTIFICACION_APODERADO"));
            o.set_tipoConyuge(rs.getInt("ID_IDENTIFICACION_CONYUGE"));
            TipoEstadoCivil _estadoCivil = new TipoEstadoCivil();
            _estadoCivil.set_id(rs.getInt("ID_TIPO_ESTADO_CIVIL"));
            o.set_tipoEstadoCivil(_estadoCivil);
            TipoPersona _tipoPersona = new TipoPersona();
            _tipoPersona.set_id(rs.getInt("ID_TIPO_PERSONA"));
            o.set_tipoPersona(_tipoPersona);
            TipoRelacion _tipoRelacion = new TipoRelacion();
            _tipoRelacion.set_id(rs.getInt("ID_TIPO_RELACION"));
            o.set_tipoRelacion(_tipoRelacion);
            o.set_totalActivos(rs.getFloat("TOTAL_ACTIVOS"));
            o.set_totalPasivos(rs.getFloat("TOTAL_PASIVOS"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}