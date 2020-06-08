package combos;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VenderCombo_1 {
    static ResultSet rs;
    static PreparedStatement ps;

    public static ArrayList<String> llenar_comboxs(Conexion con) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps = con.getConexion().prepareStatement("select * from gas where tipo_id=? and estado=?");
            ps.setString(1, vistas.Vender.xtipogasG.getSelectedItem().toString());
            ps.setString(2, vistas.Vender.xdespacho.getSelectedItem().toString());
            rs = ps.executeQuery();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while (rs.next()) {
                lista.add(rs.getString("id_gas"));
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public static ArrayList<String> llenar_comboCamion(Conexion con) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps = con.getConexion().prepareStatement("select * from camiones");
            rs = ps.executeQuery();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while (rs.next()) {
                lista.add(rs.getString("Patente"));
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public static ArrayList<String> llenar_comboCamionGases(Conexion con) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps = con.getConexion().prepareStatement("select * from control_gas where Patente=? and TipoGas=?");
            ps.setString(1, vistas.Vender.xcamiones.getSelectedItem().toString());
            ps.setString(2, vistas.Vender.xtipogasG.getSelectedItem().toString());
            rs = ps.executeQuery();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while (rs.next()) {
                lista.add(rs.getString("gas_id"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
