
package combos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class VenderCombo_1 {
    static Statement st;
    static PreparedStatement ps;
    static ResultSet rs;
    static Connection conexion=null;
        
    public static ArrayList<String> llenar_comboxs(){
        ArrayList<String> lista = new ArrayList<String>();
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select * from gas where tipo_id=? and estado=?");
            ps.setString(1, vistas.Vender.xtipogasG.getSelectedItem().toString());
            ps.setString(2, vistas.Vender.xdespacho.getSelectedItem().toString());
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
    public static ArrayList<String> llenar_comboCamion(){
        ArrayList<String> lista = new ArrayList<String>();
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select * from camiones");
            rs = ps.executeQuery();
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
    public static ArrayList<String> llenar_comboCamionGases(){
        ArrayList<String> lista = new ArrayList<String>();
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select * from control_gas where Patente=? and TipoGas=?");
            ps.setString(1, vistas.Vender.xcamiones.getSelectedItem().toString());
            ps.setString(2, vistas.Vender.xtipogasG.getSelectedItem().toString());
            rs = ps.executeQuery();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("gas_id"));
    
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
