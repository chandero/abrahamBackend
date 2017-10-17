package services;

import java.util.List;
import daos.TipoNivelEstudioDAO;
import dtos.TipoNivelEstudioDTO;
import java.util.ArrayList;
import javax.inject.Inject;
import models.TipoNivelEstudio;

public class TipoNivelEstudioService {

    private TipoNivelEstudioDAO dao;

    @Inject
    public TipoNivelEstudioService(TipoNivelEstudioDAO dao){
        this.dao = dao;
    }

    public List<TipoNivelEstudioDTO> getTiposNivelEstudio(){
        List<TipoNivelEstudioDTO> _listData = new ArrayList<TipoNivelEstudioDTO>();
        for (TipoNivelEstudio tp: dao.getTipoNivelEstudio()){
            TipoNivelEstudioDTO o = tp.create();
            _listData.add(o);
        }
        return _listData;
    }

}