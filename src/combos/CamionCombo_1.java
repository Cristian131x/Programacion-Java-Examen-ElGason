
package combos;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CamionCombo_1 {
    static ResultSet rs;
    static PreparedStatement ps;
        
        public ArrayList<String> llenar_combox(){
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps = Conexion.Conectar().prepareStatement("SELECT * FROM camiones");
            rs = ps.executeQuery();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(rs.next()){
                lista.add(rs.getString("id_camion"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
