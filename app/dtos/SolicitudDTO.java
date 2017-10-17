package dtos;

import java.util.Date;
import models.Solicitud;

public class SolicitudDTO {
    private String _id;
    private Integer _tipo;
    private String _numero;
    private Number _valor;
    private Integer _plazo;
    private Integer _amortizacionCapital;
    private GarantiaDTO _garantia;
    private TipoCuotaDTO _tipoCuota;
    private EstadoSolicitudDTO _estado;
    private LineaDTO _linea;
    private Date _fechaRecepcion;
    private AgenciaDTO _oficina;
    private String _destino;
    private Date _fechaConcepto;
    private EmpleadoDTO _empleado;
    private EnteAprobadorDTO _enteAprobador;
    private String _numeroActa;
    private Number _tasaInteres;
    private Integer _plazoAprobado;
    private String _descripcionGarantia;
    private Integer _numeroCodeudores;
    private RespaldoDTO _respaldo;
    private Number _valorAprobado;
    private EmpleadoDTO _analista;
    private Number _ingresos;
    private Number _disponible;
    private Number _deducciones;
    private Number _valorCuota;
    private Number _disponibilidad;
    private Boolean _solvenciaEconomica;
    private String _experienciaCreditos;
    private InversionDTO _inversion;
    private ClasificacionDTO _clasificacion;
    private Boolean _esDesembolsoParcial;
    private Integer _pagoInteres;
    private Boolean _esCopia;
    private String _observacacion;
    private Boolean _seguroVida;
    private Boolean _seguroExequial;
    private Boolean _esFundacion;
    private Integer _numeroRiesgo;
    private Date _fechaAnalisis;

    /**
     * @return the _id
     */
    public String get_id() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * @return the _tipo
     */
    public Integer get_tipo() {
        return _tipo;
    }

    /**
     * @param _tipo the _tipo to set
     */
    public void set_tipo(Integer _tipo) {
        this._tipo = _tipo;
    }

    /**
     * @return the _numero
     */
    public String get_numero() {
        return _numero;
    }

    /**
     * @param _numero the _numero to set
     */
    public void set_numero(String _numero) {
        this._numero = _numero;
    }

    /**
     * @return the _valor
     */
    public Number get_valor() {
        return _valor;
    }

    /**
     * @param _valor the _valor to set
     */
    public void set_valor(Number _valor) {
        this._valor = _valor;
    }

    /**
     * @return the _plazo
     */
    public Integer get_plazo() {
        return _plazo;
    }

    /**
     * @param _plazo the _plazo to set
     */
    public void set_plazo(Integer _plazo) {
        this._plazo = _plazo;
    }

    /**
     * @return the _amortizacionCapital
     */
    public Integer get_amortizacionCapital() {
        return _amortizacionCapital;
    }

    /**
     * @param _amortizacionCapital the _amortizacionCapital to set
     */
    public void set_amortizacionCapital(Integer _amortizacionCapital) {
        this._amortizacionCapital = _amortizacionCapital;
    }

    /**
     * @return the _garantia
     */
    public GarantiaDTO get_garantia() {
        return _garantia;
    }

    /**
     * @param _garantia the _garantia to set
     */
    public void set_garantia(GarantiaDTO _garantia) {
        this._garantia = _garantia;
    }

    /**
     * @return the _tipoCuota
     */
    public TipoCuotaDTO get_tipoCuota() {
        return _tipoCuota;
    }

    /**
     * @param _tipoCuota the _tipoCuota to set
     */
    public void set_tipoCuota(TipoCuotaDTO _tipoCuota) {
        this._tipoCuota = _tipoCuota;
    }

    /**
     * @return the _estado
     */
    public EstadoSolicitudDTO get_estado() {
        return _estado;
    }

    /**
     * @param _estado the _estado to set
     */
    public void set_estado(EstadoSolicitudDTO _estado) {
        this._estado = _estado;
    }

    /**
     * @return the _linea
     */
    public LineaDTO get_linea() {
        return _linea;
    }

    /**
     * @param _linea the _linea to set
     */
    public void set_linea(LineaDTO _linea) {
        this._linea = _linea;
    }

    /**
     * @return the _fechaRecepcion
     */
    public Date get_fechaRecepcion() {
        return _fechaRecepcion;
    }

    /**
     * @param _fechaRecepcion the _fechaRecepcion to set
     */
    public void set_fechaRecepcion(Date _fechaRecepcion) {
        this._fechaRecepcion = _fechaRecepcion;
    }

    /*
    *   @return the _agencia
    */
    public AgenciaDTO get_Oficina() {
        return _oficina;
    }

    /**
     * @param _oficina the _oficina to set
     */
    public void set_oficina(AgenciaDTO _oficina) {
        this._oficina = _oficina;
    }

    /**
     * @return the _destino
     */
    public String get_destino() {
        return _destino;
    }

    /**
     * @param _destino the _destino to set
     */
    public void set_destino(String _destino) {
        this._destino = _destino;
    }

    /**
     * @return the _fechaConcepto
     */
    public Date get_fechaConcepto() {
        return _fechaConcepto;
    }

    /**
     * @param _fechaConcepto the _fechaConcepto to set
     */
    public void set_fechaConcepto(Date _fechaConcepto) {
        this._fechaConcepto = _fechaConcepto;
    }

    /**
     * @return the _empleado
     */
    public EmpleadoDTO get_empleado() {
        return _empleado;
    }

    /**
     * @param _empleado the _empleado to set
     */
    public void set_empleado(EmpleadoDTO _empleado) {
        this._empleado = _empleado;
    }

    /**
     * @return the _enteAprobador
     */
    public EnteAprobadorDTO get_enteAprobador() {
        return _enteAprobador;
    }

    /**
     * @param _enteAprobador the _enteAprobador to set
     */
    public void set_enteAprobador(EnteAprobadorDTO _enteAprobador) {
        this._enteAprobador = _enteAprobador;
    }

    /**
     * @return the _numeroActa
     */
    public String get_numeroActa() {
        return _numeroActa;
    }

    /**
     * @param _numeroActa the _numeroActa to set
     */
    public void set_numeroActa(String _numeroActa) {
        this._numeroActa = _numeroActa;
    }

    /**
     * @return the _tasaInteres
     */
    public Number get_tasaInteres() {
        return _tasaInteres;
    }

    /**
     * @param _tasaInteres the _tasaInteres to set
     */
    public void set_tasaInteres(Number _tasaInteres) {
        this._tasaInteres = _tasaInteres;
    }

    /**
     * @return the _plazoAprobado
     */
    public Integer get_plazoAprobado() {
        return _plazoAprobado;
    }

    /**
     * @param _plazoAprobado the _plazoAprobado to set
     */
    public void set_plazoAprobado(Integer _plazoAprobado) {
        this._plazoAprobado = _plazoAprobado;
    }

    /**
     * @return the _descripcionGarantia
     */
    public String get_descripcionGarantia() {
        return _descripcionGarantia;
    }

    /**
     * @param _descripcionGarantia the _descripcionGarantia to set
     */
    public void set_descripcionGarantia(String _descripcionGarantia) {
        this._descripcionGarantia = _descripcionGarantia;
    }

    /**
     * @return the _numeroCodeudores
     */
    public Integer get_numeroCodeudores() {
        return _numeroCodeudores;
    }

    /**
     * @param _numeroCodeudores the _numeroCodeudores to set
     */
    public void set_numeroCodeudores(Integer _numeroCodeudores) {
        this._numeroCodeudores = _numeroCodeudores;
    }

    /**
     * @return the _respaldo
     */
    public RespaldoDTO get_respaldo() {
        return _respaldo;
    }

    /**
     * @param _respaldo the _respaldo to set
     */
    public void set_respaldo(RespaldoDTO _respaldo) {
        this._respaldo = _respaldo;
    }

    /**
     * @return the _valorAprobado
     */
    public Number get_valorAprobado() {
        return _valorAprobado;
    }

    /**
     * @param _valorAprobado the _valorAprobado to set
     */
    public void set_valorAprobado(Number _valorAprobado) {
        this._valorAprobado = _valorAprobado;
    }

    /**
     * @return the _analista
     */
    public EmpleadoDTO get_analista() {
        return _analista;
    }

    /**
     * @param _analista the _analista to set
     */
    public void set_analista(EmpleadoDTO _analista) {
        this._analista = _analista;
    }

    /**
     * @return the _ingresos
     */
    public Number get_ingresos() {
        return _ingresos;
    }

    /**
     * @param _ingresos the _ingresos to set
     */
    public void set_ingresos(Number _ingresos) {
        this._ingresos = _ingresos;
    }

    /**
     * @return the _disponible
     */
    public Number get_disponible() {
        return _disponible;
    }

    /**
     * @param _disponible the _disponible to set
     */
    public void set_disponible(Number _disponible) {
        this._disponible = _disponible;
    }

    /**
     * @return the _deducciones
     */
    public Number get_deducciones() {
        return _deducciones;
    }

    /**
     * @param _deducciones the _deducciones to set
     */
    public void set_deducciones(Number _deducciones) {
        this._deducciones = _deducciones;
    }

    /**
     * @return the _valorCuota
     */
    public Number get_valorCuota() {
        return _valorCuota;
    }

    /**
     * @param _valorCuota the _valorCuota to set
     */
    public void set_valorCuota(Number _valorCuota) {
        this._valorCuota = _valorCuota;
    }

    /**
     * @return the _disponibilidad
     */
    public Number get_disponibilidad() {
        return _disponibilidad;
    }

    /**
     * @param _disponibilidad the _disponibilidad to set
     */
    public void set_disponibilidad(Number _disponibilidad) {
        this._disponibilidad = _disponibilidad;
    }

    /**
     * @return the _solvenciaEconomica
     */
    public Boolean get_solvenciaEconomica() {
        return _solvenciaEconomica;
    }

    /**
     * @param _solvenciaEconomica the _solvenciaEconomica to set
     */
    public void set_solvenciaEconomica(Boolean _solvenciaEconomica) {
        this._solvenciaEconomica = _solvenciaEconomica;
    }

    /**
     * @return the _experienciaCreditos
     */
    public String get_experienciaCreditos() {
        return _experienciaCreditos;
    }

    /**
     * @param _experienciaCreditos the _experienciaCreditos to set
     */
    public void set_experienciaCreditos(String _experienciaCreditos) {
        this._experienciaCreditos = _experienciaCreditos;
    }

    /**
     * @return the _inversion
     */
    public InversionDTO get_inversion() {
        return _inversion;
    }

    /**
     * @param _inversion the _inversion to set
     */
    public void set_inversion(InversionDTO _inversion) {
        this._inversion = _inversion;
    }

    /**
     * @return the _clasificacion
     */
    public ClasificacionDTO get_clasificacion() {
        return _clasificacion;
    }

    /**
     * @param _clasificacion the _inversion to set
     */
    public void set_clasificacion(ClasificacionDTO _inversion) {
        this._clasificacion = _clasificacion;
    }

    /**
     * @return the _esDesembolsoParcial
     */
    public Boolean get_esDesembolsoParcial() {
        return _esDesembolsoParcial;
    }

    /**
     * @param _esDesembolsoParcial the _esDesembolsoParcial to set
     */
    public void set_esDesembolsoParcial(Boolean _esDesembolsoParcial) {
        this._esDesembolsoParcial = _esDesembolsoParcial;
    }

    /**
     * @return the _pagoInteres
     */
    public Integer get_pagoInteres() {
        return _pagoInteres;
    }

    /**
     * @param _pagoInteres the _pagoInteres to set
     */
    public void set_pagoInteres(Integer _pagoInteres) {
        this._pagoInteres = _pagoInteres;
    }

    /**
     * @return the _esCopia
     */
    public Boolean get_esCopia() {
        return _esCopia;
    }

    /**
     * @param _esCopia the _esCopia to set
     */
    public void set_esCopia(Boolean _esCopia) {
        this._esCopia = _esCopia;
    }

    /**
     * @return the _observacacion
     */
    public String get_observacacion() {
        return _observacacion;
    }

    /**
     * @param _observacacion the _observacacion to set
     */
    public void set_observacacion(String _observacacion) {
        this._observacacion = _observacacion;
    }

    /**
     * @return the _seguroVida
     */
    public Boolean get_seguroVida() {
        return _seguroVida;
    }

    /**
     * @param _seguroVida the _seguroVida to set
     */
    public void set_seguroVida(Boolean _seguroVida) {
        this._seguroVida = _seguroVida;
    }

    /**
     * @return the _seguroExequial
     */
    public Boolean get_seguroExequial() {
        return _seguroExequial;
    }

    /**
     * @param _seguroExequial the _seguroExequial to set
     */
    public void set_seguroExequial(Boolean _seguroExequial) {
        this._seguroExequial = _seguroExequial;
    }

    /**
     * @return the _esFundacion
     */
    public Boolean get_esFundacion() {
        return _esFundacion;
    }

    /**
     * @param _esFundacion the _esFundacion to set
     */
    public void set_esFundacion(Boolean _esFundacion) {
        this._esFundacion = _esFundacion;
    }

    /**
     * @return the _numeroRiesgo
     */
    public Integer get_numeroRiesgo() {
        return _numeroRiesgo;
    }

    /**
     * @param _numeroRiesgo the _numeroRiesgo to set
     */
    public void set_numeroRiesgo(Integer _numeroRiesgo) {
        this._numeroRiesgo = _numeroRiesgo;
    }

    /**
     * @return the _fechaAnalisis
     */
    public Date get_fechaAnalisis() {
        return _fechaAnalisis;
    }

    /**
     * @param _fechaAnalisis the _fechaAnalisis to set
     */
    public void set_fechaAnalisis(Date _fechaAnalisis) {
        this._fechaAnalisis = _fechaAnalisis;
    }

    public Solicitud create() {
        Solicitud o = new Solicitud();
        o.set_amortizacionCapital(this.get_amortizacionCapital());
        o.set_analista(this.get_analista().create());
        o.set_clasificacion(this.get_clasificacion().create());
        o.set_deducciones(this.get_deducciones());
        o.set_descripcionGarantia(this.get_descripcionGarantia());
        o.set_destino(this.get_destino());
        o.set_disponibilidad(this.get_disponibilidad());
        o.set_disponible(this.get_disponible());
        o.set_empleado(this.get_empleado().create());
        o.set_enteAprobador(this.get_enteAprobador().create());
        o.set_esCopia(this.get_esCopia());
        o.set_esDesembolsoParcial(this.get_esDesembolsoParcial());
        o.set_esFundacion(this.get_esFundacion());
        o.set_estado(this.get_estado().create());
        o.set_experienciaCreditos(this.get_experienciaCreditos());
        o.set_fechaAnalisis(this.get_fechaAnalisis());
        o.set_fechaConcepto(this.get_fechaConcepto());
        o.set_fechaRecepcion(this.get_fechaRecepcion());
        o.set_garantia(this.get_garantia().create());
        o.set_id(this.get_id());
        o.set_ingresos(this.get_ingresos());
        o.set_inversion(this.get_inversion().create());
        o.set_linea(this.get_linea().create());
        o.set_numero(this.get_numero());
        o.set_numeroActa(this.get_numeroActa());
        o.set_numeroCodeudores(this.get_numeroCodeudores());
        o.set_numeroRiesgo(this.get_numeroRiesgo());
        o.set_observacacion(this.get_observacacion());
        o.set_oficina(this.get_Oficina().create());
        o.set_pagoInteres(this.get_pagoInteres());
        o.set_plazo(this.get_plazo());
        o.set_plazoAprobado(this.get_plazoAprobado());
        o.set_respaldo(this.get_respaldo().create());
        o.set_seguroExequial(this.get_seguroExequial());
        o.set_seguroVida(this.get_seguroVida());
        o.set_solvenciaEconomica(this.get_solvenciaEconomica());
        o.set_tasaInteres(this.get_tasaInteres());
        o.set_tipo(this.get_tipo());
        o.set_tipoCuota(this.get_tipoCuota().create());
        o.set_valor(this.get_valor());
        o.set_valorAprobado(this.get_valorAprobado());
        o.set_valorCuota(this.get_valorCuota());
        return o;
    }

}