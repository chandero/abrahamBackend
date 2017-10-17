package models;

import dtos.TipoCuotaDTO;

public class TipoCuota {
    private Integer _id;
    private String _descripcion;
    private String _capital;
    private String _interes;
    private String _tipoCuota;
    private Boolean _esVariable;
    private Boolean _esFija;
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
	 * @return the _capital
	 */
	public String get_capital() {
		return _capital;
	}
	/**
	 * @param _capital the _capital to set
	 */
	public void set_capital(String _capital) {
		this._capital = _capital;
	}
	/**
	 * @return the _interes
	 */
	public String get_interes() {
		return _interes;
	}
	/**
	 * @param _interes the _interes to set
	 */
	public void set_interes(String _interes) {
		this._interes = _interes;
	}
	/**
	 * @return the _tipoCuota
	 */
	public String get_tipoCuota() {
		return _tipoCuota;
	}
	/**
	 * @param _tipoCuota the _tipoCuota to set
	 */
	public void set_tipoCuota(String _tipoCuota) {
		this._tipoCuota = _tipoCuota;
	}
	/**
	 * @return the _esVariable
	 */
	public Boolean get_esVariable() {
		return _esVariable;
	}
	/**
	 * @param _esVariable the _esVariable to set
	 */
	public void set_esVariable(Boolean _esVariable) {
		this._esVariable = _esVariable;
	}
	/**
	 * @return the _esFija
	 */
	public Boolean get_esFija() {
		return _esFija;
	}
	/**
	 * @param _esFija the _esFija to set
	 */
	public void set_esFija(Boolean _esFija) {
		this._esFija = _esFija;
    }
    
    public TipoCuotaDTO create() {
        TipoCuotaDTO o = new TipoCuotaDTO();
        o.set_capital(this.get_capital());
        o.set_descripcion(this.get_descripcion());
        o.set_esFija(this.get_esFija());
        o.set_esVariable(this.get_esVariable());
        o.set_id(this.get_id());
        o.set_interes(this.get_interes());
        o.set_tipoCuota(this.get_tipoCuota());
        return o;
    }
}