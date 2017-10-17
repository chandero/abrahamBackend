package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.SolicitudDAO;
import dtos.SolicitudDTO;
import models.Solicitud;

public class SolicitudService {

    private SolicitudDAO dao;

    @Inject
    public SolicitudService(SolicitudDAO dao){
        this.dao = dao;
    }

    public List<SolicitudDTO> getSolicitud(){
        List<SolicitudDTO> _listData = new ArrayList<SolicitudDTO>();
        for (Solicitud td: dao.getSolicitud()){
            SolicitudDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

    public SolicitudDTO getSolicitud(String _id){
        Solicitud solicitud = dao.getSolicitud( _id );
        SolicitudDTO dto = null;
        if (solicitud != null){
            dto = solicitud.create();
        }
        return dto;
    }

    public SolicitudDTO addSolicitud(SolicitudDTO dto) {
        Solicitud _solicitud = dao.addSolicitud(dto.create());
        if (_solicitud != null){
            dto = _solicitud.create();
        }
        return dto;
    }

    public SolicitudDTO updateSolicitud(SolicitudDTO dto) {
        Solicitud _solicitud = dao.updateSolicitud(dto.create());
        if (_solicitud != null){
            dto = _solicitud.create();
        }
        return dto;
    }


}