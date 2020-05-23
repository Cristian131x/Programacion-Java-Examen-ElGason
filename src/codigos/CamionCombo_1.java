/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class CamionCombo_1 {
    static Statement st;
    static ResultSet rs;
    static Connection conexion=null;
        
        public static ArrayList<String> llenar_combox(){
        ArrayList<String> lista = new ArrayList<String>();
        String q = "SELECT * FROM camiones";
        try {
            rs = st.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("Patente"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public static void conectar(){
        String ruta="jdbc:mysql://localhost/proyectogas";
        String user="root";
        String pass="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(ruta,user,pass); 
            st= conexion.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }
        
    
}
