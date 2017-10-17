package services;

import java.util.List;
import daos.TipoRelacionDAO;
import dtos.TipoRelacionDTO;
import java.util.ArrayList;
import javax.inject.Inject;
import models.TipoRelacion;

public class TipoRelacionService {

    private TipoRelacionDAO dao;

    @Inject
    public TipoRelacionService(TipoRelacionDAO dao){
        this.dao = dao;
    }

    public List<TipoRelacionDTO> getTiposRelacion(){
        List<TipoRelacionDTO> _listData = new ArrayList<TipoRelacionDTO>();
        for (TipoRelacion tp: dao.getTipoRelacion()){
            TipoRelacionDTO o = tp.create();
            _listData.add(o);
        }
        return _listData;
    }

}