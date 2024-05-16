package dao;

import model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements iDao<Odontologo>{

    private static final Logger logger = Logger.getLogger(OdontologoDAOH2.class);
    private static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS VALUES (?,?,?,?)";
    private static final String SQL_SEARCH = "SELECT * FROM ODONTOLOGOS";
    @Override
    public Odontologo guardar(Odontologo odontologo) {

        Connection connection = null;
        try{
            connection = BD.getConnection();
            logger.info("Conexion establecida para guardar odontologos");
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1,odontologo.getId());
            psInsert.setInt(2,odontologo.getNumeroMatricula());
            psInsert.setString(3,odontologo.getNombre());
            psInsert.setString(4,odontologo.getApellido());
            psInsert.execute();
            logger.info("Odontologo guardado");

        }catch (Exception e){
            logger.warn(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Odontologo> buscarTodos() {

        Connection connection = null;
        Odontologo odontologo = null;
        List<Odontologo> odontologos = new ArrayList<>();
        try{
            connection = BD.getConnection();
            logger.info("Conexion establecida para listar todos los odontologos");
            Statement psSearch = connection.createStatement();
            ResultSet rs = psSearch.executeQuery(SQL_SEARCH);
            while (rs.next()){
                odontologo = new Odontologo(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4));
                odontologos.add(odontologo);
            }

        }catch (Exception e){
            logger.warn(e.getMessage());
        }
        return odontologos;
    }


}
