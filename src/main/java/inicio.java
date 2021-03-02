import java.sql.Connection;
import java.sql.SQLException;

public class inicio {
    public static void main(String[] args) throws SQLException {
        //Validaremos si en verdad nos podemos conectar a la base de datos
        //Creamos un objeto de tipo conexion

        Conexion conexion = new Conexion();

        try (Connection cnx = conexion.get_Connection()){

        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
