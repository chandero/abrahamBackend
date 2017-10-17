package dtos;

import models.TipoCiiu;

public class TipoCiiuDTO {
    private String _id;
    private TipoClaseCiiuDTO _clase;
    private String _descripcion;
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
    }
    
    /**
     * @return the TipoClaseCiiu
     */
    public TipoClaseCiiuDTO get_clase(){
        return _clase;
    }

    /**
     * param _clase the tipo clase ciiu set
     */
    public void set_clase(TipoClaseCiiuDTO _clase){
        this._clase = _clase;
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

    public TipoCiiu create() {
        TipoCiiu o = new TipoCiiu();
        o.set_id(this.get_id());
        o.set_descripcion(this.get_descripcion());
        o.set_clase(this.get_clase().create());
        return o;
    }

}