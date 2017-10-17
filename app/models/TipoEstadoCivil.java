package models;

import dtos.TipoEstadoCivilDTO;

public class TipoEstadoCivil {
    private Integer _id;
    private String _descripcion;
    private Boolean _conyuge;
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
	 * @return the _conyuge
	 */
	public Boolean get_conyuge() {
		return _conyuge;
	}
	/**
	 * @param _conyuge the _conyuge to set
	 */
	public void set_conyuge(Boolean _conyuge) {
		this._conyuge = _conyuge;
    }
    

    public TipoEstadoCivilDTO create() {
        TipoEstadoCivilDTO o = new TipoEstadoCivilDTO();
        o.set_id(this.get_id());
        o.set_descripcion(this.get_descripcion());
        o.set_conyuge(this.get_conyuge());
        return o;
    }

}