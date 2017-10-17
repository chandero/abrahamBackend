package dtos;

import java.util.Date;
import models.Empleado;

public class EmpleadoDTO {
    private String _id;
    private String _documento;
    private String _primerApellido;
    private String _segundoApellido;
    private String _nombre;
    private String _cuenta;
    private Date _ultimoCambioPasabordo;
    private AgenciaDTO _agencia;
    private String _contrasena;
    private Integer _tipo;
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
	 * @return the _documento
	 */
	public String get_documento() {
		return _documento;
	}
	/**
	 * @param _documento the _documento to set
	 */
	public void set_documento(String _documento) {
		this._documento = _documento;
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
	 * @return the _cuenta
	 */
	public String get_cuenta() {
		return _cuenta;
	}
	/**
	 * @param _cuenta the _cuenta to set
	 */
	public void set_cuenta(String _cuenta) {
		this._cuenta = _cuenta;
	}
	/**
	 * @return the _ultimoCambioPasabordo
	 */
	public Date get_ultimoCambioPasabordo() {
		return _ultimoCambioPasabordo;
	}
	/**
	 * @param _ultimoCambioPasabordo the _ultimoCambioPasabordo to set
	 */
	public void set_ultimoCambioPasabordo(Date _ultimoCambioPasabordo) {
		this._ultimoCambioPasabordo = _ultimoCambioPasabordo;
	}
	/**
	 * @return the _agencia
	 */
	public AgenciaDTO get_agencia() {
		return _agencia;
	}
	/**
	 * @param _agencia the _agencia to set
	 */
	public void set_agencia(AgenciaDTO _agencia) {
		this._agencia = _agencia;
	}
	/**
	 * @return the _contrasena
	 */
	public String get_contrasena() {
		return _contrasena;
	}
	/**
	 * @param _contrasena the _contrasena to set
	 */
	public void set_contrasena(String _contrasena) {
		this._contrasena = _contrasena;
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
    
    public Empleado create() {
        Empleado o = new Empleado();
        o.set_agencia(this.get_agencia().create());
        o.set_contrasena(this.get_contrasena());
        o.set_cuenta(this.get_cuenta());
        o.set_documento(this.get_documento());
        o.set_id(this.get_id());
        o.set_nombre(this.get_nombre());
        o.set_primerApellido(this.get_primerApellido());
        o.set_segundoApellido(this.get_segundoApellido());
        o.set_tipo(this.get_tipo());
        o.set_ultimoCambioPasabordo(this.get_ultimoCambioPasabordo());
        return o;
    }    
}