
package combos;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ClienteCombo_1 {
    static ResultSet rs;
    static PreparedStatement ps;
        
        public static ArrayList<String> llenar_combox(Conexion con){
        ArrayList<String> lista = new ArrayList<String>();
       
        try {
            ps = con.getConexion().prepareStatement("SELECT * FROM cliente");
            rs = ps.executeQuery();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("Rut_Cliente"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
