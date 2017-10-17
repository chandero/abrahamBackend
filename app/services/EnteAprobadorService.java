package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.EnteAprobadorDAO;
import dtos.EnteAprobadorDTO;
import models.EnteAprobador;

public class EnteAprobadorService {

    private EnteAprobadorDAO dao;

    @Inject
    public EnteAprobadorService(EnteAprobadorDAO dao){
        this.dao = dao;
    }

    public List<EnteAprobadorDTO> getEnteAprobador(){
        List<EnteAprobadorDTO> _listData = new ArrayList<EnteAprobadorDTO>();
        for (EnteAprobador td: dao.getEnteAprobador()){
            EnteAprobadorDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}