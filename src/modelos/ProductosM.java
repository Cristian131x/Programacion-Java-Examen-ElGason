/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class ProductosM {
    public static void buscarNormal() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select * from tipo where id_tipo= ?");
            ps.setString(1, vistas.Vender.xtipogasG.getSelectedItem().toString());

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.Vender.xstockG.setText(rs.getString("stock"));
                vistas.Vender.xprecioG.setText(rs.getString("precio"));
                vistas.Vender.xnombreG.setText(rs.getString("nombre"));
               
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (SQLException ex) {
        }
    } 
}
