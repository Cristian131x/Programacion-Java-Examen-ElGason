
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private final String base = "proyectogas";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url,this.user,this.password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return con;
    }
    public static Connection coneccion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/proyectogas";
        String user = "root";
        String pass = "";

        Connection con = DriverManager.getConnection(url, user, pass);
        try {
            System.out.println("Si se pudo conectar a la base de datos");
            return con;
        } catch (Exception e) {
            System.out.println("No se pudo conectar a la base de datos: " + e.toString());
            return con;
        }
    }
}
