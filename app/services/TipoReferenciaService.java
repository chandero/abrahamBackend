package services;

import java.util.List;
import daos.TipoReferenciaDAO;
import dtos.TipoReferenciaDTO;
import java.util.ArrayList;
import javax.inject.Inject;
import models.TipoReferencia;

public class TipoReferenciaService {

    private TipoReferenciaDAO dao;

    @Inject
    public TipoReferenciaService(TipoReferenciaDAO dao){
        this.dao = dao;
    }

    public List<TipoReferenciaDTO> getTiposReferencia(){
        List<TipoReferenciaDTO> _listData = new ArrayList<TipoReferenciaDTO>();
        for (TipoReferencia tp: dao.getTipoReferencia()){
            TipoReferenciaDTO o = tp.create();
            _listData.add(o);
        }
        return _listData;
    }

}