import java.sql.*;

public class DoctorDAO {
    public static void crearDoctor(Doctor2 docotor){
        Conexion dbConnect =  new Conexion();
        try(Connection conexion = dbConnect.getConnection())  {
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO `doctor` ( `nombre`, `codigo`, `identidad`) VALUES ( ?, ?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1,docotor.getNombre());
                ps.setInt(2, docotor.getCodigo());
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
    public static void leerDocotor(){
        Conexion dbConnect =  new Conexion();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = dbConnect.getConnection().createStatement();
            rs = stmt.executeQuery("SELECT * FROM doctor");

            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...

            if (stmt.execute("SELECT * FROM doctor")) {
                rs = stmt.getResultSet();
            }
            while (rs.next()){
                System.out.println("id:" + rs.getInt("id"));
                System.out.println("nombre:" + rs.getString("nombre"));
                System.out.println("identidad:" + rs.getString("identidad"));
                System.out.println("--------------------");
            }

            // Now do something with the ResultSet ....
        }
        catch (SQLException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
        }
    }
    public static void borrarDoctor(int id){
        Conexion dbConnect =  new Conexion();
        try(Connection conexion = dbConnect.getConnection())  {
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM doctor WHERE doctor.id = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("doctor eliminado");
            }catch (SQLException e){
                System.out.println(e);

            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

}
