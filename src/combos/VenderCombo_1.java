package combos;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.ControlGestiones;
import modelo.StockGas;

public class VenderCombo_1 {

    static ResultSet rs;
    static PreparedStatement ps;

    public static ArrayList<String> llenar_comboxs(StockGas stk) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps = Conexion.Conectar().prepareStatement("select * from gas where tipo_id=? and estado=?");
            ps.setInt(1, stk.getTipo_id());
            ps.setString(2, stk.getEstado());
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

    public static ArrayList<String> llenar_comboCamion() {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps = Conexion.Conectar().prepareStatement("select * from camiones");
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

    public static ArrayList<String> llenar_comboCamionGases(ControlGestiones cg) {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            ps = Conexion.Conectar().prepareStatement("select * from control_gas where Patente=? and TipoGas=? and EstadoGas=?");
            ps.setString(1, cg.getPatente());
            ps.setInt(2, cg.getTipo());
            ps.setString(3, "Camion");
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
