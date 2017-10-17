package services;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import daos.EmpleadoDAO;
import dtos.EmpleadoDTO;
import models.Empleado;

public class EmpleadoService {

    private EmpleadoDAO dao;

    @Inject
    public EmpleadoService(EmpleadoDAO dao){
        this.dao = dao;
    }

    public List<EmpleadoDTO> getEmpleado(){
        List<EmpleadoDTO> _listData = new ArrayList<EmpleadoDTO>();
        for (Empleado td: dao.getEmpleado()){
            EmpleadoDTO o = td.create();
            _listData.add(o);
        }
        return _listData;
    }

    public EmpleadoDTO getUser(String _user){
        Empleado _e = dao.getEmpleado(_user);
        EmpleadoDTO dto = null;
        if (_e != null ){
            dto = _e.create();
        }
        return dto;
    }

    public Boolean doLogin(String _user, String _password){
        Boolean result = dao.passwordCheck(_user, _password);
        return result;
    }



}