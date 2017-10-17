package dtos;

import models.Linea;

public class LineaDTO {
    private Integer _id;
    private String _descripcion;
    private Number _vecesAportes;
    private Number _vecesAhorros;
    private Number _porcentajeCredito;
    private Number _porcentajeAportes;
    private Number _porcentajeAhorros;
    private Number _minimoCapitalizar;
    private Boolean _capitalizacionAcumulada;
    private Boolean _esVivienda;
    private Boolean _esOrdinaria;
    private Number _tasa;
    private Number _puntosAdicionales;
    private Boolean _estado;
    private Boolean _cfRedondeo;
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
	 * @return the _vecesAportes
	 */
	public Number get_vecesAportes() {
		return _vecesAportes;
	}
	/**
	 * @param _vecesAportes the _vecesAportes to set
	 */
	public void set_vecesAportes(Number _vecesAportes) {
		this._vecesAportes = _vecesAportes;
	}
	/**
	 * @return the _vecesAhorros
	 */
	public Number get_vecesAhorros() {
		return _vecesAhorros;
	}
	/**
	 * @param _vecesAhorros the _vecesAhorros to set
	 */
	public void set_vecesAhorros(Number _vecesAhorros) {
		this._vecesAhorros = _vecesAhorros;
	}
	/**
	 * @return the _porcentajeCredito
	 */
	public Number get_porcentajeCredito() {
		return _porcentajeCredito;
	}
	/**
	 * @param _porcentajeCredito the _porcentajeCredito to set
	 */
	public void set_porcentajeCredito(Number _porcentajeCredito) {
		this._porcentajeCredito = _porcentajeCredito;
	}
	/**
	 * @return the _porcentajeAportes
	 */
	public Number get_porcentajeAportes() {
		return _porcentajeAportes;
	}
	/**
	 * @param _porcentajeAportes the _porcentajeAportes to set
	 */
	public void set_porcentajeAportes(Number _porcentajeAportes) {
		this._porcentajeAportes = _porcentajeAportes;
	}
	/**
	 * @return the _porcentajeAhorros
	 */
	public Number get_porcentajeAhorros() {
		return _porcentajeAhorros;
	}
	/**
	 * @param _porcentajeAhorros the _porcentajeAhorros to set
	 */
	public void set_porcentajeAhorros(Number _porcentajeAhorros) {
		this._porcentajeAhorros = _porcentajeAhorros;
	}
	/**
	 * @return the _minimoCapitalizar
	 */
	public Number get_minimoCapitalizar() {
		return _minimoCapitalizar;
	}
	/**
	 * @param _minimoCapitalizar the _minimoCapitalizar to set
	 */
	public void set_minimoCapitalizar(Number _minimoCapitalizar) {
		this._minimoCapitalizar = _minimoCapitalizar;
	}
	/**
	 * @return the _capitalizacionAcumulada
	 */
	public Boolean get_capitalizacionAcumulada() {
		return _capitalizacionAcumulada;
	}
	/**
	 * @param _capitalizacionAcumulada the _capitalizacionAcumulada to set
	 */
	public void set_capitalizacionAcumulada(Boolean _capitalizacionAcumulada) {
		this._capitalizacionAcumulada = _capitalizacionAcumulada;
	}
	/**
	 * @return the _esVivienda
	 */
	public Boolean get_esVivienda() {
		return _esVivienda;
	}
	/**
	 * @param _esVivienda the _esVivienda to set
	 */
	public void set_esVivienda(Boolean _esVivienda) {
		this._esVivienda = _esVivienda;
	}
	/**
	 * @return the _esOrdinaria
	 */
	public Boolean get_esOrdinaria() {
		return _esOrdinaria;
	}
	/**
	 * @param _esOrdinaria the _esOrdinaria to set
	 */
	public void set_esOrdinaria(Boolean _esOrdinaria) {
		this._esOrdinaria = _esOrdinaria;
	}
	/**
	 * @return the _tasa
	 */
	public Number get_tasa() {
		return _tasa;
	}
	/**
	 * @param _tasa the _tasa to set
	 */
	public void set_tasa(Number _tasa) {
		this._tasa = _tasa;
	}
	/**
	 * @return the _puntosAdicionales
	 */
	public Number get_puntosAdicionales() {
		return _puntosAdicionales;
	}
	/**
	 * @param _puntosAdicionales the _puntosAdicionales to set
	 */
	public void set_puntosAdicionales(Number _puntosAdicionales) {
		this._puntosAdicionales = _puntosAdicionales;
	}
	/**
	 * @return the _estado
	 */
	public Boolean get_estado() {
		return _estado;
	}
	/**
	 * @param _estado the _estado to set
	 */
	public void set_estado(Boolean _estado) {
		this._estado = _estado;
	}
	/**
	 * @return the _cfRedondeo
	 */
	public Boolean get_cfRedondeo() {
		return _cfRedondeo;
	}
	/**
	 * @param _cfRedondeo the _cfRedondeo to set
	 */
	public void set_cfRedondeo(Boolean _cfRedondeo) {
		this._cfRedondeo = _cfRedondeo;
    } 
    
    public Linea create(){
        Linea o = new Linea();
        o.set_capitalizacionAcumulada(this.get_capitalizacionAcumulada());
        o.set_cfRedondeo(this.get_cfRedondeo());
        o.set_descripcion(this.get_descripcion());
        o.set_esOrdinaria(this.get_esOrdinaria());
        o.set_estado(this.get_estado());
        o.set_esVivienda(this.get_esVivienda());
        o.set_id(this.get_id());
        o.set_minimoCapitalizar(this.get_minimoCapitalizar());
        o.set_porcentajeAhorros(this.get_porcentajeAhorros());
        o.set_porcentajeAportes(this.get_porcentajeAportes());
        o.set_porcentajeCredito(this.get_porcentajeCredito());
        o.set_puntosAdicionales(this.get_puntosAdicionales());
        o.set_tasa(this.get_tasa());
        o.set_vecesAhorros(this.get_vecesAhorros());
        o.set_vecesAportes(this.get_vecesAportes());
        return o;
    }
}