package dtos;

import java.util.Date;
import models.Persona;

public class PersonaDTO {
	private Integer _tipo;
	private String _numero;
	private String _lugarExpedicion;
	private Date _fechaExpedicion;
	private String _nombre;
	private String _primerApellido;
	private String _segundoApellido;
	private TipoPersonaDTO _tipoPersona;
	private String _sexo;
	private Date _fechaNacimiento;
	private String _lugarNacimiento;
	private String _provinciaNacimiento;
	private String _deptoNacimiento;
	private String _paisNacimiento;
	private TipoEstadoCivilDTO _tipoEstadoCivil;
	private Integer _tipoConyuge;
	private String _numeroConyuge;
	private String _nombreConyuge;
	private String _primerApellidoConyuge;
	private String _segundoApellidoConyuge;
	private Integer _tipoApoderado;
	private String _numeroApoderado;
	private String _nombreApoderado;
	private String _primerApellidoApoderado;
	private String _segundoApellidoApoderado;
	private String _profesion;
	private TipoEstadoPersonaDTO _estado;
	private TipoRelacionDTO _tipoRelacion;
	private TipoCiiuDTO _ciiu;
	private String _empresaLabora;
	private Date _fechaIngresoEmpresa;
	private String _cargoActual;
	private String _declaracion;
	private Number _ingresoPrincipal;
	private Number _ingresoOtros;
	private Number _ingresoConyuge;
	private Number _ingresoConyugeOtros;
	private String _descripcionIngresosOtros;
	private Number _egresosAlquiler;
	private Number _egresosServicios;
	private Number _egresosTransporte;
	private Number _egresosAlimentacion;
	private Number _egresosDeudas;
	private Number _egresosOtros;
	private String _descripcionEgresosOtros;
	private Number _egresosConyuge;
	private Number _egresosOtrosConyuge;
	private Number _totalActivos;
	private Number _totalPasivos;
	private Boolean _educacion;
	private Boolean _retefuente;
	private String _acta;
	private Date _fechaRegistro;
	private byte[] _foto;
	private byte[] _firma;
	private String _escrituraConstitucion;
	private Integer _duracionSociedad;
	private Number _capitalSolcial;
	private String _matriculaMercantil;
	private byte[] _fotoHuella;
	private byte[] _datosHuella;
	private String _email;
	private EmpleadoDTO _empleado;
	private Date _fechaActualizacion;
	
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
	 * @return the _lugarExpedicion
	 */
	public String get_lugarExpedicion() {
		return _lugarExpedicion;
	}

	/**
	 * @param _lugarExpedicion the _lugarExpedicion to set
	 */
	public void set_lugarExpedicion(String _lugarExpedicion) {
		this._lugarExpedicion = _lugarExpedicion;
	}

	/**
	 * @return the _fechaExpedicion
	 */
	public Date get_fechaExpedicion() {
		return _fechaExpedicion;
	}

	/**
	 * @param _fechaExpedicion the _fechaExpedicion to set
	 */
	public void set_fechaExpedicion(Date _fechaExpedicion) {
		this._fechaExpedicion = _fechaExpedicion;
	}

	/**
	 * @return the _nombre
	 */
	public String get_nombre() {
		return _nombre;
	}

	/**
	 * @param _nombre the _nombre to set
	 */
	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	/**
	 * @return the _primerApellido
	 */
	public String get_primerApellido() {
		return _primerApellido;
	}

	/**
	 * @param _primerApellido the _primerApellido to set
	 */
	public void set_primerApellido(String _primerApellido) {
		this._primerApellido = _primerApellido;
	}

	/**
	 * @return the _segundoApellido
	 */
	public String get_segundoApellido() {
		return _segundoApellido;
	}

	/**
	 * @param _segundoApellido the _segundoApellido to set
	 */
	public void set_segundoApellido(String _segundoApellido) {
		this._segundoApellido = _segundoApellido;
	}

	/**
	 * @return the _tipoPersona
	 */
	public TipoPersonaDTO get_tipoPersona() {
		return _tipoPersona;
	}

	/**
	 * @param _tipoPersona the _tipoPersona to set
	 */
	public void set_tipoPersona(TipoPersonaDTO _tipoPersona) {
		this._tipoPersona = _tipoPersona;
	}

	/**
	 * @return the _sexo
	 */
	public String get_sexo() {
		return _sexo;
	}

	/**
	 * @param _sexo the _sexo to set
	 */
	public void set_sexo(String _sexo) {
		this._sexo = _sexo;
	}

	/**
	 * @return the _fechaNacimiento
	 */
	public Date get_fechaNacimiento() {
		return _fechaNacimiento;
	}

	/**
	 * @param _fechaNacimiento the _fechaNacimiento to set
	 */
	public void set_fechaNacimiento(Date _fechaNacimiento) {
		this._fechaNacimiento = _fechaNacimiento;
	}

	/**
	 * @return the _lugarNacimiento
	 */
	public String get_lugarNacimiento() {
		return _lugarNacimiento;
	}

	/**
	 * @param _lugarNacimiento the _lugarNacimiento to set
	 */
	public void set_lugarNacimiento(String _lugarNacimiento) {
		this._lugarNacimiento = _lugarNacimiento;
	}

	/**
	 * @return the _provinciaNacimiento
	 */
	public String get_provinciaNacimiento() {
		return _provinciaNacimiento;
	}

	/**
	 * @param _provinciaNacimiento the _provinciaNacimiento to set
	 */
	public void set_provinciaNacimiento(String _provinciaNacimiento) {
		this._provinciaNacimiento = _provinciaNacimiento;
	}

	/**
	 * @return the _deptoNacimiento
	 */
	public String get_deptoNacimiento() {
		return _deptoNacimiento;
	}

	/**
	 * @param _deptoNacimiento the _deptoNacimiento to set
	 */
	public void set_deptoNacimiento(String _deptoNacimiento) {
		this._deptoNacimiento = _deptoNacimiento;
	}

	/**
	 * @return the _paisNacimiento
	 */
	public String get_paisNacimiento() {
		return _paisNacimiento;
	}

	/**
	 * @param _paisNacimiento the _paisNacimiento to set
	 */
	public void set_paisNacimiento(String _paisNacimiento) {
		this._paisNacimiento = _paisNacimiento;
	}

	/**
	 * @return the _tipoEstadoCivil
	 */
	public TipoEstadoCivilDTO get_tipoEstadoCivil() {
		return _tipoEstadoCivil;
	}

	/**
	 * @param _tipoEstadoCivil the _tipoEstadoCivil to set
	 */
	public void set_tipoEstadoCivil(TipoEstadoCivilDTO _tipoEstadoCivil) {
		this._tipoEstadoCivil = _tipoEstadoCivil;
	}

	/**
	 * @return the _tipoConyuge
	 */
	public Integer get_tipoConyuge() {
		return _tipoConyuge;
	}

	/**
	 * @param _tipoConyuge the _tipoConyuge to set
	 */
	public void set_tipoConyuge(Integer _tipoConyuge) {
		this._tipoConyuge = _tipoConyuge;
	}

	/**
	 * @return the _numeroConyuge
	 */
	public String get_numeroConyuge() {
		return _numeroConyuge;
	}

	/**
	 * @param _numeroConyuge the _numeroConyuge to set
	 */
	public void set_numeroConyuge(String _numeroConyuge) {
		this._numeroConyuge = _numeroConyuge;
	}

	/**
	 * @return the _nombreConyuge
	 */
	public String get_nombreConyuge() {
		return _nombreConyuge;
	}

	/**
	 * @param _nombreConyuge the _nombreConyuge to set
	 */
	public void set_nombreConyuge(String _nombreConyuge) {
		this._nombreConyuge = _nombreConyuge;
	}

	/**
	 * @return the _primerApellidoConyuge
	 */
	public String get_primerApellidoConyuge() {
		return _primerApellidoConyuge;
	}

	/**
	 * @param _primerApellidoConyuge the _primerApellidoConyuge to set
	 */
	public void set_primerApellidoConyuge(String _primerApellidoConyuge) {
		this._primerApellidoConyuge = _primerApellidoConyuge;
	}

	/**
	 * @return the _segundoApellidoConyuge
	 */
	public String get_segundoApellidoConyuge() {
		return _segundoApellidoConyuge;
	}

	/**
	 * @param _segundoApellidoConyuge the _segundoApellidoConyuge to set
	 */
	public void set_segundoApellidoConyuge(String _segundoApellidoConyuge) {
		this._segundoApellidoConyuge = _segundoApellidoConyuge;
	}

	/**
	 * @return the _tipoApoderado
	 */
	public Integer get_tipoApoderado() {
		return _tipoApoderado;
	}

	/**
	 * @param _tipoApoderado the _tipoApoderado to set
	 */
	public void set_tipoApoderado(Integer _tipoApoderado) {
		this._tipoApoderado = _tipoApoderado;
	}

	/**
	 * @return the _numeroApoderado
	 */
	public String get_numeroApoderado() {
		return _numeroApoderado;
	}

	/**
	 * @param _numeroApoderado the _numeroApoderado to set
	 */
	public void set_numeroApoderado(String _numeroApoderado) {
		this._numeroApoderado = _numeroApoderado;
	}

	/**
	 * @return the _nombreApoderado
	 */
	public String get_nombreApoderado() {
		return _nombreApoderado;
	}

	/**
	 * @param _nombreApoderado the _nombreApoderado to set
	 */
	public void set_nombreApoderado(String _nombreApoderado) {
		this._nombreApoderado = _nombreApoderado;
	}

	/**
	 * @return the _primerApellidoApoderado
	 */
	public String get_primerApellidoApoderado() {
		return _primerApellidoApoderado;
	}

	/**
	 * @param _primerApellidoApoderado the _primerApellidoApoderado to set
	 */
	public void set_primerApellidoApoderado(String _primerApellidoApoderado) {
		this._primerApellidoApoderado = _primerApellidoApoderado;
	}

	/**
	 * @return the _segundoApellidoApoderado
	 */
	public String get_segundoApellidoApoderado() {
		return _segundoApellidoApoderado;
	}

	/**
	 * @param _segundoApellidoApoderado the _segundoApellidoApoderado to set
	 */
	public void set_segundoApellidoApoderado(String _segundoApellidoApoderado) {
		this._segundoApellidoApoderado = _segundoApellidoApoderado;
	}

	/**
	 * @return the _profesion
	 */
	public String get_profesion() {
		return _profesion;
	}

	/**
	 * @param _profesion the _profesion to set
	 */
	public void set_profesion(String _profesion) {
		this._profesion = _profesion;
	}

	/**
	 * @return the _estado
	 */
	public TipoEstadoPersonaDTO get_estado() {
		return _estado;
	}

	/**
	 * @param _estado the _estado to set
	 */
	public void set_estado(TipoEstadoPersonaDTO _estado) {
		this._estado = _estado;
	}

	/**
	 * @return the _tipoRelacion
	 */
	public TipoRelacionDTO get_tipoRelacion() {
		return _tipoRelacion;
	}

	/**
	 * @param _tipoRelacion the _tipoRelacion to set
	 */
	public void set_tipoRelacion(TipoRelacionDTO _tipoRelacion) {
		this._tipoRelacion = _tipoRelacion;
	}

	/**
	 * @return the _ciiu
	 */
	public TipoCiiuDTO get_ciiu() {
		return _ciiu;
	}

	/**
	 * @param _ciiu the _ciiu to set
	 */
	public void set_ciiu(TipoCiiuDTO _ciiu) {
		this._ciiu = _ciiu;
	}

	/**
	 * @return the _empresaLabora
	 */
	public String get_empresaLabora() {
		return _empresaLabora;
	}

	/**
	 * @param _empresaLabora the _empresaLabora to set
	 */
	public void set_empresaLabora(String _empresaLabora) {
		this._empresaLabora = _empresaLabora;
	}

	/**
	 * @return the _fechaIngresoEmpresa
	 */
	public Date get_fechaIngresoEmpresa() {
		return _fechaIngresoEmpresa;
	}

	/**
	 * @param _fechaIngresoEmpresa the _fechaIngresoEmpresa to set
	 */
	public void set_fechaIngresoEmpresa(Date _fechaIngresoEmpresa) {
		this._fechaIngresoEmpresa = _fechaIngresoEmpresa;
	}

	/**
	 * @return the _cargoActual
	 */
	public String get_cargoActual() {
		return _cargoActual;
	}

	/**
	 * @param _cargoActual the _cargoActual to set
	 */
	public void set_cargoActual(String _cargoActual) {
		this._cargoActual = _cargoActual;
	}

	/**
	 * @return the _declaracion
	 */
	public String get_declaracion() {
		return _declaracion;
	}

	/**
	 * @param _declaracion the _declaracion to set
	 */
	public void set_declaracion(String _declaracion) {
		this._declaracion = _declaracion;
	}

	/**
	 * @return the _ingresoPrincipal
	 */
	public Number get_ingresoPrincipal() {
		return _ingresoPrincipal;
	}

	/**
	 * @param _ingresoPrincipal the _ingresoPrincipal to set
	 */
	public void set_ingresoPrincipal(Number _ingresoPrincipal) {
		this._ingresoPrincipal = _ingresoPrincipal;
	}

	/**
	 * @return the _ingresoOtros
	 */
	public Number get_ingresoOtros() {
		return _ingresoOtros;
	}

	/**
	 * @param _ingresoOtros the _ingresoOtros to set
	 */
	public void set_ingresoOtros(Number _ingresoOtros) {
		this._ingresoOtros = _ingresoOtros;
	}

	/**
	 * @return the _ingresoConyuge
	 */
	public Number get_ingresoConyuge() {
		return _ingresoConyuge;
	}

	/**
	 * @param _ingresoConyuge the _ingresoConyuge to set
	 */
	public void set_ingresoConyuge(Number _ingresoConyuge) {
		this._ingresoConyuge = _ingresoConyuge;
	}

	/**
	 * @return the _ingresoConyugeOtros
	 */
	public Number get_ingresoConyugeOtros() {
		return _ingresoConyugeOtros;
	}

	/**
	 * @param _ingresoConyugeOtros the _ingresoConyugeOtros to set
	 */
	public void set_ingresoConyugeOtros(Number _ingresoConyugeOtros) {
		this._ingresoConyugeOtros = _ingresoConyugeOtros;
	}

	/**
	 * @return the _descripcionIngresosOtros
	 */
	public String get_descripcionIngresosOtros() {
		return _descripcionIngresosOtros;
	}

	/**
	 * @param _descripcionIngresosOtros the _descripcionIngresosOtros to set
	 */
	public void set_descripcionIngresosOtros(String _descripcionIngresosOtros) {
		this._descripcionIngresosOtros = _descripcionIngresosOtros;
	}

	/**
	 * @return the _egresosAlquiler
	 */
	public Number get_egresosAlquiler() {
		return _egresosAlquiler;
	}

	/**
	 * @param _egresosAlquiler the _egresosAlquiler to set
	 */
	public void set_egresosAlquiler(Number _egresosAlquiler) {
		this._egresosAlquiler = _egresosAlquiler;
	}

	/**
	 * @return the _egresosServicios
	 */
	public Number get_egresosServicios() {
		return _egresosServicios;
	}

	/**
	 * @param _egresosServicios the _egresosServicios to set
	 */
	public void set_egresosServicios(Number _egresosServicios) {
		this._egresosServicios = _egresosServicios;
	}

	/**
	 * @return the _egresosTransporte
	 */
	public Number get_egresosTransporte() {
		return _egresosTransporte;
	}

	/**
	 * @param _egresosTransporte the _egresosTransporte to set
	 */
	public void set_egresosTransporte(Number _egresosTransporte) {
		this._egresosTransporte = _egresosTransporte;
	}

	/**
	 * @return the _egresosAlimentacion
	 */
	public Number get_egresosAlimentacion() {
		return _egresosAlimentacion;
	}

	/**
	 * @param _egresosAlimentacion the _egresosAlimentacion to set
	 */
	public void set_egresosAlimentacion(Number _egresosAlimentacion) {
		this._egresosAlimentacion = _egresosAlimentacion;
	}

	/**
	 * @return the _egresosDeudas
	 */
	public Number get_egresosDeudas() {
		return _egresosDeudas;
	}

	/**
	 * @param _egresosDeudas the _egresosDeudas to set
	 */
	public void set_egresosDeudas(Number _egresosDeudas) {
		this._egresosDeudas = _egresosDeudas;
	}

	/**
	 * @return the _egresosOtros
	 */
	public Number get_egresosOtros() {
		return _egresosOtros;
	}

	/**
	 * @param _egresosOtros the _egresosOtros to set
	 */
	public void set_egresosOtros(Number _egresosOtros) {
		this._egresosOtros = _egresosOtros;
	}

	/**
	 * @return the _descripcionEgresosOtros
	 */
	public String get_descripcionEgresosOtros() {
		return _descripcionEgresosOtros;
	}

	/**
	 * @param _descripcionEgresosOtros the _descripcionEgresosOtros to set
	 */
	public void set_descripcionEgresosOtros(String _descripcionEgresosOtros) {
		this._descripcionEgresosOtros = _descripcionEgresosOtros;
	}

	/**
	 * @return the _egresosConyuge
	 */
	public Number get_egresosConyuge() {
		return _egresosConyuge;
	}

	/**
	 * @param _egresosConyuge the _egresosConyuge to set
	 */
	public void set_egresosConyuge(Number _egresosConyuge) {
		this._egresosConyuge = _egresosConyuge;
	}

	/**
	 * @return the _egresosOtrosConyuge
	 */
	public Number get_egresosOtrosConyuge() {
		return _egresosOtrosConyuge;
	}

	/**
	 * @param _egresosOtrosConyuge the _egresosOtrosConyuge to set
	 */
	public void set_egresosOtrosConyuge(Number _egresosOtrosConyuge) {
		this._egresosOtrosConyuge = _egresosOtrosConyuge;
	}

	/**
	 * @return the _totalActivos
	 */
	public Number get_totalActivos() {
		return _totalActivos;
	}

	/**
	 * @param _totalActivos the _totalActivos to set
	 */
	public void set_totalActivos(Number _totalActivos) {
		this._totalActivos = _totalActivos;
	}

	/**
	 * @return the _totalPasivos
	 */
	public Number get_totalPasivos() {
		return _totalPasivos;
	}

	/**
	 * @param _totalPasivos the _totalPasivos to set
	 */
	public void set_totalPasivos(Number _totalPasivos) {
		this._totalPasivos = _totalPasivos;
	}

	/**
	 * @return the _educacion
	 */
	public Boolean get_educacion() {
		return _educacion;
	}

	/**
	 * @param _educacion the _educacion to set
	 */
	public void set_educacion(Boolean _educacion) {
		this._educacion = _educacion;
	}

	/**
	 * @return the _retefuente
	 */
	public Boolean get_retefuente() {
		return _retefuente;
	}

	/**
	 * @param _retefuente the _retefuente to set
	 */
	public void set_retefuente(Boolean _retefuente) {
		this._retefuente = _retefuente;
	}

	/**
	 * @return the _acta
	 */
	public String get_acta() {
		return _acta;
	}

	/**
	 * @param _acta the _acta to set
	 */
	public void set_acta(String _acta) {
		this._acta = _acta;
	}

	/**
	 * @return the _fechaRegistro
	 */
	public Date get_fechaRegistro() {
		return _fechaRegistro;
	}

	/**
	 * @param _fechaRegistro the _fechaRegistro to set
	 */
	public void set_fechaRegistro(Date _fechaRegistro) {
		this._fechaRegistro = _fechaRegistro;
	}

	/**
	 * @return the _foto
	 */
	public byte[] get_foto() {
		return _foto;
	}

	/**
	 * @param _foto the _foto to set
	 */
	public void set_foto(byte[] _foto) {
		this._foto = _foto;
	}

	/**
	 * @return the _firma
	 */
	public byte[] get_firma() {
		return _firma;
	}

	/**
	 * @param _firma the _firma to set
	 */
	public void set_firma(byte[] _firma) {
		this._firma = _firma;
	}

	/**
	 * @return the _escrituraConstitucion
	 */
	public String get_escrituraConstitucion() {
		return _escrituraConstitucion;
	}

	/**
	 * @param _escrituraConstitucion the _escrituraConstitucion to set
	 */
	public void set_escrituraConstitucion(String _escrituraConstitucion) {
		this._escrituraConstitucion = _escrituraConstitucion;
	}

	/**
	 * @return the _duracionSociedad
	 */
	public Integer get_duracionSociedad() {
		return _duracionSociedad;
	}

	/**
	 * @param _duracionSociedad the _duracionSociedad to set
	 */
	public void set_duracionSociedad(Integer _duracionSociedad) {
		this._duracionSociedad = _duracionSociedad;
	}

	/**
	 * @return the _capitalSolcial
	 */
	public Number get_capitalSolcial() {
		return _capitalSolcial;
	}

	/**
	 * @param _capitalSolcial the _capitalSolcial to set
	 */
	public void set_capitalSolcial(Number _capitalSolcial) {
		this._capitalSolcial = _capitalSolcial;
	}

	/**
	 * @return the _matriculaMercantil
	 */
	public String get_matriculaMercantil() {
		return _matriculaMercantil;
	}

	/**
	 * @param _matriculaMercantil the _matriculaMercantil to set
	 */
	public void set_matriculaMercantil(String _matriculaMercantil) {
		this._matriculaMercantil = _matriculaMercantil;
	}

	/**
	 * @return the _fotoHuella
	 */
	public byte[] get_fotoHuella() {
		return _fotoHuella;
	}

	/**
	 * @param _fotoHuella the _fotoHuella to set
	 */
	public void set_fotoHuella(byte[] _fotoHuella) {
		this._fotoHuella = _fotoHuella;
	}

	/**
	 * @return the _datosHuella
	 */
	public byte[] get_datosHuella() {
		return _datosHuella;
	}

	/**
	 * @param _datosHuella the _datosHuella to set
	 */
	public void set_datosHuella(byte[] _datosHuella) {
		this._datosHuella = _datosHuella;
	}

	/**
	 * @return the _email
	 */
	public String get_email() {
		return _email;
	}

	/**
	 * @param _email the _email to set
	 */
	public void set_email(String _email) {
		this._email = _email;
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
	 * @return the _fechaActualizacion
	 */
	public Date get_fechaActualizacion() {
		return _fechaActualizacion;
	}

	/**
	 * @param _fechaActualizacion the _fechaActualizacion to set
	 */
	public void set_fechaActualizacion(Date _fechaActualizacion) {
		this._fechaActualizacion = _fechaActualizacion;
	}

	public Persona create() {
		Persona o = new Persona();
		o.set_acta(this.get_acta());
		o.set_capitalSolcial(this.get_capitalSolcial());
        o.set_cargoActual(this.get_cargoActual());
        if (this.get_ciiu() != null){
            o.set_ciiu(this.get_ciiu().create());
        }
		o.set_datosHuella(this.get_datosHuella());
		o.set_declaracion(this.get_declaracion());
		o.set_deptoNacimiento(this.get_deptoNacimiento());
		o.set_descripcionEgresosOtros(this.get_descripcionEgresosOtros());
		o.set_descripcionIngresosOtros(this.get_descripcionIngresosOtros());
		o.set_duracionSociedad(this.get_duracionSociedad());
		o.set_educacion(this.get_educacion());
		o.set_egresosAlimentacion(this.get_egresosAlimentacion());
		o.set_egresosAlquiler(this.get_egresosAlquiler());
		o.set_egresosConyuge(this.get_egresosConyuge());
		o.set_egresosDeudas(this.get_egresosDeudas());
		o.set_egresosOtros(this.get_egresosOtros());
		o.set_egresosOtrosConyuge(this.get_egresosOtrosConyuge());
		o.set_egresosServicios(this.get_egresosServicios());
		o.set_egresosTransporte(this.get_egresosTransporte());
        o.set_email(this.get_email());
        if (this.get_empleado() != null){
            o.set_empleado(this.get_empleado().create());
        }
		o.set_empresaLabora(this.get_empresaLabora());
        o.set_escrituraConstitucion(this.get_escrituraConstitucion());
        if (this.get_estado() != null){
            o.set_estado(this.get_estado().create());
        }
		o.set_fechaActualizacion(this.get_fechaActualizacion());
		o.set_fechaExpedicion(this.get_fechaExpedicion());
		o.set_fechaIngresoEmpresa(this.get_fechaIngresoEmpresa());
		o.set_fechaNacimiento(this.get_fechaNacimiento());
		o.set_fechaRegistro(this.get_fechaRegistro());
		o.set_firma(this.get_firma());
		o.set_foto(this.get_foto());
		o.set_fotoHuella(this.get_fotoHuella());
		o.set_ingresoConyuge(this.get_ingresoConyuge());
		o.set_ingresoConyugeOtros(this.get_ingresoConyugeOtros());
		o.set_ingresoOtros(this.get_ingresoOtros());
		o.set_ingresoPrincipal(this.get_ingresoPrincipal());
		o.set_lugarExpedicion(this.get_lugarExpedicion());
		o.set_lugarNacimiento(this.get_lugarNacimiento());
		o.set_matriculaMercantil(this.get_matriculaMercantil());
		o.set_nombre(this.get_nombre());
		o.set_nombreApoderado(this.get_nombreApoderado());
		o.set_nombreConyuge(this.get_nombreConyuge());
		o.set_numero(this.get_numero());
		o.set_numeroApoderado(this.get_numeroApoderado());
		o.set_numeroConyuge(this.get_numeroConyuge());
		o.set_paisNacimiento(this.get_paisNacimiento());
		o.set_primerApellido(this.get_primerApellido());
		o.set_primerApellidoApoderado(this.get_primerApellidoApoderado());
		o.set_primerApellidoConyuge(this.get_primerApellidoConyuge());
		o.set_profesion(this.get_profesion());
		o.set_provinciaNacimiento(this.get_provinciaNacimiento());
		o.set_retefuente(this.get_retefuente());
		o.set_segundoApellido(this.get_segundoApellido());
		o.set_segundoApellidoApoderado(this.get_segundoApellidoApoderado());
		o.set_segundoApellidoConyuge(this.get_segundoApellidoConyuge());
		o.set_sexo(this.get_sexo());
		o.set_tipo(this.get_tipo());
		o.set_tipoApoderado(this.get_tipoApoderado());
        o.set_tipoConyuge(this.get_tipoConyuge());
        if (this.get_tipoEstadoCivil() != null){
            o.set_tipoEstadoCivil(this.get_tipoEstadoCivil().create());
        }
        if (this.get_tipoPersona() != null){
            o.set_tipoPersona(this.get_tipoPersona().create());
        }
        if (this.get_tipoRelacion() != null){
            o.set_tipoRelacion(this.get_tipoRelacion().create());
        }
		o.set_totalActivos(this.get_totalActivos());
		o.set_totalPasivos(this.get_totalPasivos());
		return o;
	}

}