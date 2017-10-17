package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.InversionDAO;
import dtos.InversionDTO;
import models.Inversion;

public class InversionService {

    private InversionDAO dao;

    @Inject
    public InversionService(InversionDAO dao){
        this.dao = dao;
    }

    public List<InversionDTO> getInversion(){
        List<InversionDTO> _listData = new ArrayList<InversionDTO>();
        for (Inversion td: dao.getInversion()){
            InversionDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}