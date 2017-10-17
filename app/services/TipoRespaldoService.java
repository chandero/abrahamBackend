package services;

import java.util.List;
import daos.TipoRespaldoDAO;
import dtos.TipoRespaldoDTO;
import java.util.ArrayList;
import javax.inject.Inject;
import models.TipoRespaldo;

public class TipoRespaldoService {

    private TipoRespaldoDAO dao;

    @Inject
    public TipoRespaldoService(TipoRespaldoDAO dao){
        this.dao = dao;
    }

    public List<TipoRespaldoDTO> getTiposRespaldo(){
        List<TipoRespaldoDTO> _listData = new ArrayList<TipoRespaldoDTO>();
        for (TipoRespaldo tp: dao.getTipoRespaldo()){
            TipoRespaldoDTO o = tp.create();
            _listData.add(o);
        }
        return _listData;
    }

}