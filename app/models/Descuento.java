package models;

import dtos.DescuentoDTO;

public class Descuento {
    private Integer _id;
    private String _descripcion;
    private String _codigo;
    private Number _valor;
    private Number _porcentajeColocacion;
    private Number _porcentajeCuota;
    private Number _porcentajeSaldo;
    private Boolean _enDesembolso;
    private Boolean _enCuota;
    private Boolean _esDistribuido;
    private Boolean _esActivo;
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
	 * @return the _porcentajeColocacion
	 */
	public Number get_porcentajeColocacion() {
		return _porcentajeColocacion;
	}
	/**
	 * @param _porcentajeColocacion the _porcentajeColocacion to set
	 */
	public void set_porcentajeColocacion(Number _porcentajeColocacion) {
		this._porcentajeColocacion = _porcentajeColocacion;
	}
	/**
	 * @return the _porcentajeCuota
	 */
	public Number get_porcentajeCuota() {
		return _porcentajeCuota;
	}
	/**
	 * @param _porcentajeCuota the _porcentajeCuota to set
	 */
	public void set_porcentajeCuota(Number _porcentajeCuota) {
		this._porcentajeCuota = _porcentajeCuota;
	}
	/**
	 * @return the _porcentajeSaldo
	 */
	public Number get_porcentajeSaldo() {
		return _porcentajeSaldo;
	}
	/**
	 * @param _porcentajeSaldo the _porcentajeSaldo to set
	 */
	public void set_porcentajeSaldo(Number _porcentajeSaldo) {
		this._porcentajeSaldo = _porcentajeSaldo;
	}
	/**
	 * @return the _enDesembolso
	 */
	public Boolean get_enDesembolso() {
		return _enDesembolso;
	}
	/**
	 * @param _enDesembolso the _enDesembolso to set
	 */
	public void set_enDesembolso(Boolean _enDesembolso) {
		this._enDesembolso = _enDesembolso;
	}
	/**
	 * @return the _enCuota
	 */
	public Boolean get_enCuota() {
		return _enCuota;
	}
	/**
	 * @param _enCuota the _enCuota to set
	 */
	public void set_enCuota(Boolean _enCuota) {
		this._enCuota = _enCuota;
	}
	/**
	 * @return the _esDistribuido
	 */
	public Boolean get_esDistribuido() {
		return _esDistribuido;
	}
	/**
	 * @param _esDistribuido the _esDistribuido to set
	 */
	public void set_esDistribuido(Boolean _esDistribuido) {
		this._esDistribuido = _esDistribuido;
	}
	/**
	 * @return the _esActivo
	 */
	public Boolean get_esActivo() {
		return _esActivo;
	}
	/**
	 * @param _esActivo the _esActivo to set
	 */
	public void set_esActivo(Boolean _esActivo) {
		this._esActivo = _esActivo;
    }
    
    public DescuentoDTO create(){
        DescuentoDTO o = new DescuentoDTO();
        o.set_codigo(this.get_codigo());
        o.set_descripcion(this.get_descripcion());
        o.set_enCuota(this.get_enCuota());
        o.set_enDesembolso(this.get_enDesembolso());
        o.set_esActivo(this.get_esActivo());
        o.set_esDistribuido(this.get_esDistribuido());
        o.set_id(this.get_id());
        o.set_porcentajeColocacion(this.get_porcentajeColocacion());
        o.set_porcentajeCuota(this.get_porcentajeCuota());
        o.set_porcentajeSaldo(this.get_porcentajeSaldo());
        o.set_valor(this.get_valor());
        return o;
    }
}