/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static vistas.Vender.xtipogasG;

/**
 *
 * @author crist
 */
public class VenderCombo_1 {
    static Statement st;
    static PreparedStatement ps;
    static ResultSet rs;
    static Connection conexion=null;
        
        public static ArrayList<String> llenar_comboxs(){
        ArrayList<String> lista = new ArrayList<String>();
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select * from gas where tipo_id= ?");
            ps.setString(1, vistas.Vender.xtipogasG.getSelectedItem().toString());
            rs = ps.executeQuery();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("id_gas"));
    
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
