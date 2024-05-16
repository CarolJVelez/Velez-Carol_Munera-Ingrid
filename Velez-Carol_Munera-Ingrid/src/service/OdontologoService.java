package service;

import dao.OdontologoDAOArray;
import dao.OdontologoDAOH2;
import dao.iDao;
import model.Odontologo;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService(OdontologoDAOArray odontologoDAOArray) {
        odontologoiDao = new OdontologoDAOH2();
    }

    public Odontologo guardarOdontologo (Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }

    public List<Odontologo> buscarTodosOdontologos(){
        return odontologoiDao.buscarTodos();
    }


}
