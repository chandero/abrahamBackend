package models;

import dtos.EstadoSolicitudDTO;

public class EstadoSolicitud {
    private Integer _id;
    private String _descripcion;
    private Boolean _actualizaInformacion;
    private Boolean _desembolso;
    private Integer _vigencia;
    private Integer _estadoProximo;
    private Integer _orden;
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
	 * @return the _actualizaInformacion
	 */
	public Boolean get_actualizaInformacion() {
		return _actualizaInformacion;
	}
	/**
	 * @param _actualizaInformacion the _actualizaInformacion to set
	 */
	public void set_actualizaInformacion(Boolean _actualizaInformacion) {
		this._actualizaInformacion = _actualizaInformacion;
	}
	/**
	 * @return the _desembolso
	 */
	public Boolean get_desembolso() {
		return _desembolso;
	}
	/**
	 * @param _desembolso the _desembolso to set
	 */
	public void set_desembolso(Boolean _desembolso) {
		this._desembolso = _desembolso;
	}
	/**
	 * @return the _vigencia
	 */
	public Integer get_vigencia() {
		return _vigencia;
	}
	/**
	 * @param _vigencia the _vigencia to set
	 */
	public void set_vigencia(Integer _vigencia) {
		this._vigencia = _vigencia;
	}
	/**
	 * @return the _estadoProximo
	 */
	public Integer get_estadoProximo() {
		return _estadoProximo;
	}
	/**
	 * @param _estadoProximo the _estadoProximo to set
	 */
	public void set_estadoProximo(Integer _estadoProximo) {
		this._estadoProximo = _estadoProximo;
	}
	/**
	 * @return the _orden
	 */
	public Integer get_orden() {
		return _orden;
	}
	/**
	 * @param _orden the _orden to set
	 */
	public void set_orden(Integer _orden) {
		this._orden = _orden;
	}

    public EstadoSolicitudDTO create(){
        EstadoSolicitudDTO o = new EstadoSolicitudDTO();
        o.set_actualizaInformacion(this.get_actualizaInformacion());
        o.set_descripcion(this.get_descripcion());
        o.set_desembolso(this.get_desembolso());
        o.set_estadoProximo(this.get_estadoProximo());
        o.set_id(this.get_id());
        o.set_orden(this.get_orden());
        o.set_vigencia(this.get_vigencia());
        return o;
    }

}