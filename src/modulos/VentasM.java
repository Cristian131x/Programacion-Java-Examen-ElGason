/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author crist
 */
public class VentasM {

    public String IdVentas() throws SQLException {
        Conexion.coneccion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String idV = "";
        String sql = "select max(id_ventas) from boleta";
        try {
            ps = Conexion.coneccion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idV = rs.getString(1);

            }
        } catch (Exception e) {
        }
        return idV;

    }

}
