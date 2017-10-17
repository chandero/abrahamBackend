package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.GarantiaDAO;
import dtos.GarantiaDTO;
import models.Garantia;

public class GarantiaService {

    private GarantiaDAO dao;

    @Inject
    public GarantiaService(GarantiaDAO dao){
        this.dao = dao;
    }

    public List<GarantiaDTO> getGarantia(){
        List<GarantiaDTO> _listData = new ArrayList<GarantiaDTO>();
        for (Garantia td: dao.getGarantia()){
            GarantiaDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}