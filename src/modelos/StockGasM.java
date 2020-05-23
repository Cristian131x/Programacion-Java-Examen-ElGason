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
import javax.swing.table.DefaultTableModel;
import static vistas.StockGas.xestado;
import static vistas.StockGas.xnombre;
import static vistas.StockGas.xprecio;
import static vistas.StockGas.xtipo;
import static vistas.StockGas.xcantidad;

/**
 *
 * @author crist
 */
public class StockGasM {

    public static void verstocks() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select stock from tipo where id_tipo = 5");

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.x5.setText(rs.getString("stock"));
            } else {
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select stock from tipo where id_tipo = 11");

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.x11.setText(rs.getString("stock"));
            } else {
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select stock from tipo where id_tipo = 15");

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.x15.setText(rs.getString("stock"));
            } else {
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select stock from tipo where id_tipo = 45");

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.x45.setText(rs.getString("stock"));
            } else {
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select stock from tipo where id_tipo = 50");

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.x5v.setText(rs.getString("stock"));
            } else {
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select stock from tipo where id_tipo = 110");

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.x11v.setText(rs.getString("stock"));
            } else {
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select stock from tipo where id_tipo = 150");

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.x15v.setText(rs.getString("stock"));
            } else {
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select stock from tipo where id_tipo = 450");

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.x45v.setText(rs.getString("stock"));
            } else {
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void listarStock() {
        String campo = vistas.StockGas.xbuscar.getSelectedItem().toString();
        String where = "";
        if (!"".equals(campo)) {
            where = "where tipo_id= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.StockGas.jTable2.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion.coneccion();
            String sql = "select id_gas,nombre,precio from gas "
                    + where;
            System.out.println(sql);
            ps = Conexion.coneccion().prepareStatement(sql);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (Exception e) {
        }
    }

    public static void comboGas() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select * from tipo where id_tipo= ?");
            ps.setString(1, vistas.StockGas.xtipo.getSelectedItem().toString());

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.StockGas.xprecio.setText(rs.getString("Precio"));
                vistas.StockGas.xnombre.setText(rs.getString("nombre"));
            } else {
            }
        } catch (SQLException ex) {
        }
    }

    public static void agregarGas() {
        PreparedStatement ps = null;
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("insert into gas(precio,nombre,tipo_id,estado) values (?,?,?,?)");
            int Cantidad = Integer.parseInt(xcantidad.getValue().toString());
            for (int i = 0; i < Cantidad; i++) {
                ps.setString(1, xprecio.getText());
                ps.setString(2, xnombre.getText());
                ps.setString(3, xtipo.getSelectedItem().toString());
                ps.setString(4, xestado.getText());
                ps.execute();
            }
            JOptionPane.showMessageDialog(null, "Gas agregado exitosamente");
            limpiarGas();
        } catch (SQLException | NumberFormatException ex) {
            System.out.println(ex);
            limpiarGas();
        }
    }

    public static void limpiarGas() {
        xprecio.setText("");
        xnombre.setText("");
        xtipo.setSelectedIndex(0);
        xcantidad.setValue(0);
    }

    public static void actualizarStock() {
        PreparedStatement ps = null;
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("update tipo set stock = stock + ? where id_tipo = ?");
            ps.setString(1, xcantidad.getValue().toString());
            ps.setString(2, xtipo.getSelectedItem().toString());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Stock aumentado");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
