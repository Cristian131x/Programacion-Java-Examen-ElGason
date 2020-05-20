/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crist
 */
public class Conexion {
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
