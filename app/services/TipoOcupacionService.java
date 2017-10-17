package services;

import java.util.List;
import daos.TipoOcupacionDAO;
import dtos.TipoOcupacionDTO;
import java.util.ArrayList;
import javax.inject.Inject;
import models.TipoOcupacion;

public class TipoOcupacionService {

    private TipoOcupacionDAO dao;

    @Inject
    public TipoOcupacionService(TipoOcupacionDAO dao){
        this.dao = dao;
    }

    public List<TipoOcupacionDTO> getTiposOcupacion(){
        List<TipoOcupacionDTO> _listData = new ArrayList<TipoOcupacionDTO>();
        for (TipoOcupacion tp: dao.getTipoOcupacion()){
            TipoOcupacionDTO o = tp.create();
            _listData.add(o);
        }
        return _listData;
    }

}