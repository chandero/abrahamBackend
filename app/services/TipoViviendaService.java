package services;

import java.util.List;
import daos.TipoViviendaDAO;
import dtos.TipoViviendaDTO;
import java.util.ArrayList;
import javax.inject.Inject;
import models.TipoVivienda;

public class TipoViviendaService {

    private TipoViviendaDAO dao;

    @Inject
    public TipoViviendaService(TipoViviendaDAO dao){
        this.dao = dao;
    }

    public List<TipoViviendaDTO> getTiposVivienda(){
        List<TipoViviendaDTO> _listData = new ArrayList<TipoViviendaDTO>();
        for (TipoVivienda tp: dao.getTipoVivienda()){
            TipoViviendaDTO o = tp.create();
            _listData.add(o);
        }
        return _listData;
    }

}