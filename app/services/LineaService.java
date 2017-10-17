package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.LineaDAO;
import dtos.LineaDTO;
import models.Linea;

public class LineaService {

    private LineaDAO dao;

    @Inject
    public LineaService(LineaDAO dao){
        this.dao = dao;
    }

    public List<LineaDTO> getLinea(){
        List<LineaDTO> _listData = new ArrayList<LineaDTO>();
        for (Linea td: dao.getLinea()){
            LineaDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}