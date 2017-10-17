package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.TipoEstratoDAO;
import dtos.TipoEstratoDTO;
import models.TipoEstrato;

public class TipoEstratoService {

    private TipoEstratoDAO dao;

    @Inject
    public TipoEstratoService(TipoEstratoDAO dao){
        this.dao = dao;
    }

    public List<TipoEstratoDTO> getTiposEstrato(){
        List<TipoEstratoDTO> _listData = new ArrayList<TipoEstratoDTO>();
        for (TipoEstrato ti: dao.getTipoEstrato()){
            TipoEstratoDTO o = ti.create();
            _listData.add(o);
        }
        return _listData;
    }

}