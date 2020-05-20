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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistas.Trabajadores.xapellido;
import static vistas.Trabajadores.xapellido1;
import static vistas.Trabajadores.xbuscar1;
import static vistas.Trabajadores.xestado;
import static vistas.Trabajadores.xestado1;
import static vistas.Trabajadores.xnombre;
import static vistas.Trabajadores.xnombre1;
import static vistas.Trabajadores.xnumero;
import static vistas.Trabajadores.xnumero1;
import static vistas.Trabajadores.xpuesto;
import static vistas.Trabajadores.xpuesto1;
import static vistas.Trabajadores.xrut;
import static vistas.Trabajadores.xrut1;
import static vistas.Trabajadores.xsexo;
import static vistas.Trabajadores.xsexo1;

/**
 *
 * @author crist
 */
public class TrabajadoresM {

    public static void limpiarA() {
        xrut.setText("");
        xnombre.setText("");
        xapellido.setText("");
        xnumero.setText("");
        xsexo.setSelectedIndex(0);
        xestado.setSelectedIndex(0);
        xpuesto.setSelectedIndex(0);
    }

    public static void limpiarU() {
        xrut1.setText("");
        xnombre1.setText("");
        xapellido1.setText("");
        xnumero1.setText("");
        xsexo1.setSelectedIndex(0);
        xestado1.setSelectedIndex(0);
        xpuesto1.setSelectedIndex(0);
    }

    public static void insertarTrabajdor() throws SQLException {
        PreparedStatement ps = null;
        Conexion.coneccion();
        String sql = "insert into empleado(Rut,Nombre,Apellido,Sexo,Telefono,Estado,Puesto) values (?,?,?,?,?,?,?)";
        try {
            ps = Conexion.coneccion().prepareStatement(sql);
            ps.setString(1, vistas.Trabajadores.xrut.getText());
            ps.setString(2, vistas.Trabajadores.xnombre.getText());
            ps.setString(3, vistas.Trabajadores.xapellido.getText());
            ps.setString(4, vistas.Trabajadores.xsexo.getSelectedItem().toString());
            ps.setString(5, vistas.Trabajadores.xnumero.getText());
            ps.setString(6, vistas.Trabajadores.xestado.getSelectedItem().toString());
            ps.setString(7, vistas.Trabajadores.xpuesto.getSelectedItem().toString());
            ps.execute();
            limpiarA();
            JOptionPane.showMessageDialog(null, "Trabajador ingresado correctamente");
        } catch (Exception e) {
            System.out.println(e);
            limpiarA();
            JOptionPane.showMessageDialog(null, "Error al agregar");
        }
    }

    public static void listarTrabajadores() {
        String campo = vistas.Trabajadores.xbuscar.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.Trabajadores.jTable2.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion.coneccion();
            String sql = "select Id,Rut,Nombre,Apellido,Sexo,Telefono,Estado,Puesto from empleado "
                    + where;
            System.out.println(sql);
            ps = Conexion.coneccion().prepareStatement(sql);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Id");
            modelo.addColumn("Rut");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Sexo");
            modelo.addColumn("Telefono");
            modelo.addColumn("Estado");
            modelo.addColumn("Puesto");

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

    public static void buscarLista() {
        String campo = vistas.Trabajadores.xbuscar1.getSelectedItem().toString();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Id= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.Trabajadores.jTable3.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion.coneccion();
            String sql = "select Id,Rut,Nombre,Apellido,Sexo,Telefono,Estado,Puesto from empleado "
                    + where;
            System.out.println(sql);
            ps = Conexion.coneccion().prepareStatement(sql);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Id");
            modelo.addColumn("Rut");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Sexo");
            modelo.addColumn("Telefono");
            modelo.addColumn("Estado");
            modelo.addColumn("Puesto");

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

    public static void buscarNormal() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select * from empleado where Id= ?");
            ps.setString(1, xbuscar1.getSelectedItem().toString());

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.Trabajadores.xrut1.setText(rs.getString("Rut"));
                vistas.Trabajadores.xnombre1.setText(rs.getString("Nombre"));
                vistas.Trabajadores.xapellido1.setText(rs.getString("Apellido"));
                vistas.Trabajadores.xnumero1.setText(rs.getString("Telefono"));
                vistas.Trabajadores.xsexo1.setSelectedItem(rs.getString("Sexo"));
                vistas.Trabajadores.xestado1.setSelectedItem(rs.getString("Estado"));
                vistas.Trabajadores.xpuesto1.setSelectedItem(rs.getString("Puesto"));

            } else {
                JOptionPane.showMessageDialog(null, "Empleado encontrado");
            }
        } catch (SQLException ex) {
        }
    }

    public static void modificarTrabajador() {
        PreparedStatement ps = null;
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("update empleado set Rut=?,Nombre=?,Apellido=?,Telefono=?, Sexo=?, Estado=?, Puesto=? where Id=?");
            ps.setString(1, xrut1.getText());
            ps.setString(2, xnombre1.getText());
            ps.setString(3, xapellido1.getText());
            ps.setString(4, xnumero1.getText());
            ps.setString(5, xsexo1.getSelectedItem().toString());
            ps.setString(6, xestado1.getSelectedItem().toString());
            ps.setString(7, xpuesto1.getSelectedItem().toString());
            ps.setString(8, xbuscar1.getSelectedItem().toString());
            limpiarU();
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Empleado actualizado correctamente :D");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR UwU");
            limpiarU();
        }
    }
}
