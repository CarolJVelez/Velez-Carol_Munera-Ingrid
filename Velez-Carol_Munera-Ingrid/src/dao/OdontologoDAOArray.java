package dao;

import model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOArray implements iDao<Odontologo>{
    private List<Odontologo> odontologos;
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> buscarTodos() {
        return new ArrayList<>(odontologos);
    }

    public OdontologoDAOArray() {
        this.odontologos = new ArrayList<>();
    }

}
