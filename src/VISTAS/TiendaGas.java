/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author crist
 */
public class TiendaGas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/proyectogas","root","");
        if(!con.isClosed()){
            System.out.println("Conectado a la base de datos");
        }else{
            System.out.println("No se pudo conectar");}
        }
        catch (ClassNotFoundException e) 
        {
            System.out.println("Clase no encontrada" + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Exception" + e.getMessage());
        }
    }
    
    
}
