import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Creamos un metodo que va retornar un metodo contendra las funcionalidades para
    //Conectarnos a la base de datos
    public Connection get_Connection (){
        Connection conection = null;

        //Cremos el bloque try, catch para intentar hacer la coneccion
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","root123");

            //Condicional para
            if (conection != null){
                System.out.println("conexion exitosa");
            }

        }catch (SQLException e){ //Nos permitira mostrar cuando la conexion no se pueda ralizar

            System.out.println(e);
        }

        //Retornaremos el obejto de la base de datos
        return  conection;

    }
}
