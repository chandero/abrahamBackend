package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.TipoDireccionDAO;
import dtos.TipoDireccionDTO;
import models.TipoDireccion;

public class TipoDireccionService {

    private TipoDireccionDAO dao;

    @Inject
    public TipoDireccionService(TipoDireccionDAO dao){
        this.dao = dao;
    }

    public List<TipoDireccionDTO> getTiposDireccion(){
        List<TipoDireccionDTO> _listData = new ArrayList<TipoDireccionDTO>();
        for (TipoDireccion td: dao.getTipoDireccion()){
            TipoDireccionDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}