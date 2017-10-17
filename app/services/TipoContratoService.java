package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.TipoContratoDAO;
import dtos.TipoContratoDTO;
import models.TipoContrato;

public class TipoContratoService {

    private TipoContratoDAO dao;

    @Inject
    public TipoContratoService(TipoContratoDAO dao){
        this.dao = dao;
    }

    public List<TipoContratoDTO> getTiposContrato(){
        List<TipoContratoDTO> _listData = new ArrayList<TipoContratoDTO>();
        for (TipoContrato td: dao.getTipoContrato()){
            TipoContratoDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}