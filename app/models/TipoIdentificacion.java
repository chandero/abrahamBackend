package models;

import dtos.TipoIdentificacionDTO;

public class TipoIdentificacion{

    private Integer _id;
    private String _descripcion;
    private String _inicial;
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
	 * @return the _inicial
	 */
	public String get_inicial() {
		return _inicial;
	}
	/**
	 * @param _inicial the _inicial to set
	 */
	public void set_inicial(String _inicial) {
		this._inicial = _inicial;
    }
    
    public TipoIdentificacionDTO create(){
        TipoIdentificacionDTO o = new TipoIdentificacionDTO();
        o.set_id(this.get_id());
        o.set_descripcion(this.get_descripcion());
        o.set_inicial(this.get_inicial());
        return o;
    }

    
}