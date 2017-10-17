package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.TipoCiiuDAO;
import dtos.TipoCiiuDTO;
import models.TipoCiiu;

public class TipoCiiuService {

    private TipoCiiuDAO dao;

    @Inject
    public TipoCiiuService(TipoCiiuDAO dao){
        this.dao = dao;
    }

    public List<TipoCiiuDTO> getTiposCiiu(){
        List<TipoCiiuDTO> _listData = new ArrayList<TipoCiiuDTO>();
        for (TipoCiiu td: dao.getTipoCiiu()){
            TipoCiiuDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}