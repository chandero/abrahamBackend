package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.TipoEstadoCivilDAO;
import dtos.TipoEstadoCivilDTO;
import models.TipoEstadoCivil;

public class TipoEstadoCivilService {

    private TipoEstadoCivilDAO dao;

    @Inject
    public TipoEstadoCivilService(TipoEstadoCivilDAO dao){
        this.dao = dao;
    }

    public List<TipoEstadoCivilDTO> getTiposEstadoCivil(){
        List<TipoEstadoCivilDTO> _listData = new ArrayList<TipoEstadoCivilDTO>();
        for (TipoEstadoCivil td: dao.getTipoEstadoCivil()){
            TipoEstadoCivilDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}