import dao.OdontologoDAOArray;
import model.Odontologo;
import service.OdontologoService;

import java.util.List;

public class OdontologoArray {
    public static void main(String[] args) {
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOArray());

        // Ejemplo de uso: guardar un odontólogo
        Odontologo odontologo1 = new Odontologo(3, 98745, "Juan", "Fernandez");
        odontologoService.guardarOdontologo(odontologo1);

        // Ejemplo de uso: listar todos los odontólogos
        List<Odontologo> odontologos = odontologoService.buscarTodosOdontologos();
        for (Odontologo odontologo : odontologos) {
            System.out.println(odontologo);
        }


    }
}
