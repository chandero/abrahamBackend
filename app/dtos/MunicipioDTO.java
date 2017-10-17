package dtos;

import models.Municipio;

public class MunicipioDTO {
    private Integer _id;
    private String _descripcion;
    private String _departamento;
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
	 * @return the _departamento
	 */
	public String get_departamento() {
		return _departamento;
	}
	/**
	 * @param _departamento the _departamento to set
	 */
	public void set_departamento(String _departamento) {
		this._departamento = _departamento;
    }
    
    public Municipio create(){
        Municipio o = new Municipio();
        o.set_id(this.get_id());
        o.set_descripcion(this.get_descripcion());
        o.set_departamento(this.get_departamento());
        return o;
    }
}