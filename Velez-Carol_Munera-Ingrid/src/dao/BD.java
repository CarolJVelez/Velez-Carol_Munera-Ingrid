package dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
    private static final String SQL_DROP_CREATE=" DROP TABLE IF EXISTS ODONTOLOGOS; " +
            "CREATE TABLE ODONTOLOGOS (ID INT PRIMARY KEY NOT NULL, NUMERO_MATRICULA INT NOT NULL, NOMBRE VARCHAR(100) NOT NULL, " +
            "APELLIDO VARCHAR(100) NOT NULL)";

    private static final String SQL_PRUEBA="INSERT INTO ODONTOLOGOS VALUES (1, 1234, 'Ingrid', 'Munera'), (2, 5678, 'Carol', 'Velez')";
    private static final Logger logger= Logger.getLogger(BD.class);
    public static void crearTablas(){
        Connection connection= null;
        try{
            connection= getConnection();
            Statement statement= connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            statement.execute(SQL_PRUEBA);
            logger.info("tabla creada con exito");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/velezmunera","sa","sa");
    }
}
