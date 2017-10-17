package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.TipoIdentificacionDAO;
import dtos.TipoIdentificacionDTO;
import models.TipoIdentificacion;

public class TipoIdentificacionService {

    private TipoIdentificacionDAO dao;

    @Inject
    public TipoIdentificacionService(TipoIdentificacionDAO dao){
        this.dao = dao;
    }

    public List<TipoIdentificacionDTO> getTiposIdentificacion(){
        List<TipoIdentificacionDTO> _listData = new ArrayList<TipoIdentificacionDTO>();
        for (TipoIdentificacion ti: dao.getTipoIdentificacion()){
            TipoIdentificacionDTO o = ti.create();
            _listData.add(o);
        }
        return _listData;
    }

}