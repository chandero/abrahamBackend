package dtos;

import models.TipoReferencia;

public class TipoReferenciaDTO {
    private Integer _id;
    private String _descripcion;
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
    
    public TipoReferencia create(){
        TipoReferencia o = new TipoReferencia();
        o.set_id(this.get_id());
        o.set_descripcion(this.get_descripcion());
        return o;
    }
    
}