import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoctorDAO {
    public static void crearDoctor(Doctor2 docotor){
        Conexion dbConnect =  new Conexion();
        try(Connection conexion = dbConnect.getConnection())  {
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO `doctor` ( `nombre`, `codigo`, `identidad`) VALUES ( ?, ?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1,docotor.getNombre());
                ps.setString(2, String.valueOf(docotor.getCodigo()));
                ps.setString(3,docotor.getIdentidad());
                ps.executeUpdate();
                System.out.println("doctor creado");
            }catch (SQLException e){
                System.out.println(e);

            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerDOcotor(){}
    public static void borrarDOcotor(int id){}

}
