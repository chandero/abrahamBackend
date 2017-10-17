package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.AgenciaDAO;
import dtos.AgenciaDTO;
import models.Agencia;

public class AgenciaService {

    private AgenciaDAO dao;

    @Inject
    public AgenciaService(AgenciaDAO dao){
        this.dao = dao;
    }

    public List<AgenciaDTO> getAgencia(){
        List<AgenciaDTO> _listData = new ArrayList<AgenciaDTO>();
        for (Agencia td: dao.getAgencia()){
            AgenciaDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}