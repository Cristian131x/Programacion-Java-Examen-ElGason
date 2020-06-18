
package combos;


import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class RutaCombo_1 {
    static ResultSet rs;
    static PreparedStatement ps;
        
        public static ArrayList<String> llenar_combox(){
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps = Conexion.Conectar().prepareStatement("SELECT * FROM rutas");
            rs = ps.executeQuery();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("id_ruta"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
