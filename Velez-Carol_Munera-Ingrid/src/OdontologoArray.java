import dao.OdontologoDAOArray;
import dao.OdontologoDAOH2;
import model.Odontologo;
import org.apache.log4j.Logger;
import service.OdontologoService;

import java.util.List;

public class OdontologoArray {
    private static final Logger logger = Logger.getLogger(OdontologoArray.class);
    public static void main(String[] args) {


        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOArray());

        // Ejemplo de uso: guardar un odontólogo
        Odontologo odontologo1 = new Odontologo(1, 98745, "Juan", "Fernandez");
        odontologoService.guardarOdontologo(odontologo1);


        // Ejemplo de uso: listar todos los odontólogos
        List<Odontologo> odontologos = odontologoService.buscarTodosOdontologos();
        for (Odontologo odontologo : odontologos) {
            logger.info(odontologo);
        }


    }
}
