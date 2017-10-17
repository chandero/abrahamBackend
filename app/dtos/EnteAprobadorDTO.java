package dtos;

import models.EnteAprobador;

public class EnteAprobadorDTO {
    private Integer _id;
    private String _descripcion;
    private Number _monto;
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
	 * @return the _monto
	 */
	public Number get_monto() {
		return _monto;
	}
	/**
	 * @param _monto the _monto to set
	 */
	public void set_monto(Number _monto) {
		this._monto = _monto;
    }
    
    public EnteAprobador create() {
        EnteAprobador o = new EnteAprobador();
        o.set_descripcion(this.get_descripcion());
        o.set_id(this.get_id());
        o.set_monto(this.get_monto());
        return o;
    }

}