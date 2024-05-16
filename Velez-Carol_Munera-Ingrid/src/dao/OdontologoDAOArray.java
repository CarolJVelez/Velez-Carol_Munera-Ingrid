package dao;

import model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOArray implements iDao<Odontologo>{
    private List<Odontologo> odontologos;
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        return null;
    }

    @Override
    public List<Odontologo> buscarTodos() {
        return new ArrayList<>(odontologos);
    }

    public OdontologoDAOArray() {
        this.odontologos = new ArrayList<>();
    }

    @Override
    public void guardarOdontologo(Odontologo odontologo) {
        odontologos.add(odontologo);
    }
}
