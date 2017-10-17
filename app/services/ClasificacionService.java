package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.ClasificacionDAO;
import dtos.ClasificacionDTO;
import models.Clasificacion;

public class ClasificacionService {

    private ClasificacionDAO dao;

    @Inject
    public ClasificacionService(ClasificacionDAO dao){
        this.dao = dao;
    }

    public List<ClasificacionDTO> getClasificacion(){
        List<ClasificacionDTO> _listData = new ArrayList<ClasificacionDTO>();
        for (Clasificacion td: dao.getClasificacion()){
            ClasificacionDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}