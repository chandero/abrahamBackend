package models;

import dtos.AgenciaDTO;

public class Agencia {
    private Integer _id;
    private String _descripcion;
    private String _direccion;
    private String _codigo;
    private Municipio _municipio;
    private String _host;
    private String _puerto;
    private String _ip;
    private Boolean _activo;
    private String _ciudad;
	/**
	 * @return the _id
	 */
	public Integer get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(Integer _id) {
		this._id = _id;
	}
	/**
	 * @return the _descripcion
	 */
	public String get_descripcion() {
		return _descripcion;
	}
	/**
	 * @param _descripcion the _descripcion to set
	 */
	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}
	/**
	 * @return the _direccion
	 */
	public String get_direccion() {
		return _direccion;
	}
	/**
	 * @param _direccion the _direccion to set
	 */
	public void set_direccion(String _direccion) {
		this._direccion = _direccion;
	}
	/**
	 * @return the _codigo
	 */
	public String get_codigo() {
		return _codigo;
	}
	/**
	 * @param _codigo the _codigo to set
	 */
	public void set_codigo(String _codigo) {
		this._codigo = _codigo;
	}
	/**
	 * @return the _municipio
	 */
	public Municipio get_municipio() {
		return _municipio;
	}
	/**
	 * @param _municipio the _municipio to set
	 */
	public void set_municipio(Municipio _municipio) {
		this._municipio = _municipio;
	}
	/**
	 * @return the _host
	 */
	public String get_host() {
		return _host;
	}
	/**
	 * @param _host the _host to set
	 */
	public void set_host(String _host) {
		this._host = _host;
	}
	/**
	 * @return the _puerto
	 */
	public String get_puerto() {
		return _puerto;
	}
	/**
	 * @param _puerto the _puerto to set
	 */
	public void set_puerto(String _puerto) {
		this._puerto = _puerto;
	}
	/**
	 * @return the _ip
	 */
	public String get_ip() {
		return _ip;
	}
	/**
	 * @param _ip the _ip to set
	 */
	public void set_ip(String _ip) {
		this._ip = _ip;
	}
	/**
	 * @return the _activo
	 */
	public Boolean get_activo() {
		return _activo;
	}
	/**
	 * @param _activo the _activo to set
	 */
	public void set_activo(Boolean _activo) {
		this._activo = _activo;
	}
	/**
	 * @return the _ciudad
	 */
	public String get_ciudad() {
		return _ciudad;
	}
	/**
	 * @param _ciudad the _ciudad to set
	 */
	public void set_ciudad(String _ciudad) {
		this._ciudad = _ciudad;
    }
    
    public AgenciaDTO create(){
        AgenciaDTO o = new AgenciaDTO();
        o.set_activo(this.get_activo());
        o.set_ciudad(this.get_ciudad());
        o.set_codigo(this.get_codigo());
        o.set_descripcion(this.get_descripcion());
        o.set_direccion(this.get_direccion());
        o.set_host(this.get_host());
        o.set_id(this.get_id());
		o.set_ip(this.get_ip());
		if (this.get_municipio() != null){
			o.set_municipio(this.get_municipio().create());
		} else {
			o.set_municipio(null);
		}
        o.set_puerto(this.get_puerto());
        return o;
    }
}