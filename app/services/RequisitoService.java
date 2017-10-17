package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.RequisitoDAO;
import dtos.RequisitoDTO;
import models.Requisito;

public class RequisitoService {

    private RequisitoDAO dao;

    @Inject
    public RequisitoService(RequisitoDAO dao){
        this.dao = dao;
    }

    public List<RequisitoDTO> getRequisito(){
        List<RequisitoDTO> _listData = new ArrayList<RequisitoDTO>();
        for (Requisito td: dao.getRequisito()){
            RequisitoDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}