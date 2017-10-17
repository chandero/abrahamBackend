package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.DescuentoDAO;
import dtos.DescuentoDTO;
import models.Descuento;

public class DescuentoService {

    private DescuentoDAO dao;

    @Inject
    public DescuentoService(DescuentoDAO dao){
        this.dao = dao;
    }

    public List<DescuentoDTO> getDescuento(){
        List<DescuentoDTO> _listData = new ArrayList<DescuentoDTO>();
        for (Descuento td: dao.getDescuento()){
            DescuentoDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}