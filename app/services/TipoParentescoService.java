package services;

import java.util.List;
import daos.TipoParentescoDAO;
import dtos.TipoParentescoDTO;
import java.util.ArrayList;
import javax.inject.Inject;
import models.TipoParentesco;

public class TipoParentescoService {

    private TipoParentescoDAO dao;

    @Inject
    public TipoParentescoService(TipoParentescoDAO dao){
        this.dao = dao;
    }

    public List<TipoParentescoDTO> getTiposParentesco(){
        List<TipoParentescoDTO> _listData = new ArrayList<TipoParentescoDTO>();
        for (TipoParentesco tp: dao.getTipoParentesco()){
            TipoParentescoDTO o = tp.create();
            _listData.add(o);
        }
        return _listData;
    }

}