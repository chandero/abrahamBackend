package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.MunicipioDAO;
import dtos.MunicipioDTO;
import models.Municipio;

public class MunicipioService {

    private MunicipioDAO dao;

    @Inject
    public MunicipioService(MunicipioDAO dao){
        this.dao = dao;
    }

    public List<MunicipioDTO> getMunicipio(){
        List<MunicipioDTO> _listData = new ArrayList<MunicipioDTO>();
        for (Municipio td: dao.getMunicipio()){
            MunicipioDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}