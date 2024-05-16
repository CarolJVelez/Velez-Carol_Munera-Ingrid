import dao.BD;
import dao.OdontologoDAOArray;
import dao.OdontologoDAOH2;
import model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.List;

public class OdontologoTestService {

    @Test
    public void buscarTodosOdontologos(){
        BD.crearTablas();
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());
        List<Odontologo> odontologos = odontologoService.buscarTodosOdontologos();
        Assertions.assertTrue(odontologos.size()==2);



    }

}
