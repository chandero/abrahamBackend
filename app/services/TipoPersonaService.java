package services;

import java.util.List;
import daos.TipoPersonaDAO;
import dtos.TipoPersonaDTO;
import java.util.ArrayList;
import javax.inject.Inject;
import models.TipoPersona;

public class TipoPersonaService {

    private TipoPersonaDAO dao;

    @Inject
    public TipoPersonaService(TipoPersonaDAO dao){
        this.dao = dao;
    }

    public List<TipoPersonaDTO> getTiposPersona(){
        List<TipoPersonaDTO> _listData = new ArrayList<TipoPersonaDTO>();
        for (TipoPersona tp: dao.getTipoPersona()){
            TipoPersonaDTO o = tp.create();
            _listData.add(o);
        }
        return _listData;
    }

}