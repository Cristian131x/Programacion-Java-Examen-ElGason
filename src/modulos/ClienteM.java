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

/**
 *
 * @author crist
 */
public class ClienteM {
    public static void insertarCliente() {
        PreparedStatement ps = null;
        String sql = "insert into cliente(Rut_Cliente,nombre,numero_telefono,direccion,comun_id) values (?,?,?,?,?)";
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement(sql);
            ps.setString(1, vistas.Cliente.xrutC.getText());
            ps.setString(2, vistas.Cliente.xnombreC.getText());
            ps.setString(3, vistas.Cliente.xnumeroC.getText());
            ps.setString(4, vistas.Cliente.xdireccionC.getText());
            ps.setString(5, vistas.Cliente.xcomunaC.getSelectedItem().toString());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Nuevo Cliente Agregado");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al agregar");
        }
    }
     public static void buscarNormal() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion.coneccion();
            ps = Conexion.coneccion().prepareStatement("select * from cliente where Rut_Cliente= ?");
            ps.setString(1, vistas.Vender.xrunG.getSelectedItem().toString());

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.Vender.xnombreclienteG.setText(rs.getString("nombre"));
                vistas.Vender.xcomunaC.setText(rs.getString("comun_id"));
                vistas.Vender.xnumeroC.setText(rs.getString("numero_telefono"));
                vistas.Vender.xdirecionC.setText(rs.getString("direccion"));
                JOptionPane.showMessageDialog(null, "Cliente encontrado");
               
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        } catch (SQLException ex) {
        }
    }
    public static void listarCliente(){
    String campo = vistas.GestionClientes.xbuscarC.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut_Cliente= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.GestionClientes.jTable2.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion.coneccion();
            String sql = "select id_cliente,Rut_Cliente,nombre,numero_telefono,direccion,comun_id from cliente "
                    + where;
            System.out.println(sql);
            ps = Conexion.coneccion().prepareStatement(sql);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("RUT");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("DIRECCION");
            modelo.addColumn("COMUNA_ID");

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
   
}
