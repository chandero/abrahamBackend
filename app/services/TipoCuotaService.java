package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.TipoCuotaDAO;
import dtos.TipoCuotaDTO;
import models.TipoCuota;

public class TipoCuotaService {

    private TipoCuotaDAO dao;

    @Inject
    public TipoCuotaService(TipoCuotaDAO dao){
        this.dao = dao;
    }

    public List<TipoCuotaDTO> getTiposCuota(){
        List<TipoCuotaDTO> _listData = new ArrayList<TipoCuotaDTO>();
        for (TipoCuota td: dao.getTipoCuota()){
            TipoCuotaDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

}