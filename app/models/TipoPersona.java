package models;

import dtos.TipoPersonaDTO;

public class TipoPersona {

    private Integer _id;
    private String _descripcion;
    private Boolean _sexo;
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
	 * @return the _sexo
	 */
	public Boolean get_sexo() {
		return _sexo;
	}
	/**
	 * @param _sexo the _sexo to set
	 */
	public void set_sexo(Boolean _sexo) {
		this._sexo = _sexo;
	}

	public TipoPersonaDTO create(){
		TipoPersonaDTO o = new TipoPersonaDTO();
		o.set_id(this.get_id());
		o.set_descripcion(this.get_descripcion());
		o.set_sexo(this.get_sexo());
		return o;
	}

}