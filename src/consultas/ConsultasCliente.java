/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author crist
 */
public class ConsultasCliente extends conexion.Conexion{
    public boolean registrarCliente(Cliente clie) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into cliente(Rut_Cliente,nombre,numero_telefono,direccion,comuna_id) values (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, clie.getRut_Cliente());
            ps.setString(2, clie.getNombre());
            ps.setString(3, clie.getNumero_Telefono());
            ps.setString(4, clie.getDireccion());
            ps.setInt(5, clie.getComuna_id());
            ps.execute();
            return true;          
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean modificarCliente(Cliente clie) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update cliente set nombre=?,numero_telefono=?,direccion=?,comuna_id=? where Rut_Cliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, clie.getNombre());
            ps.setString(2, clie.getNumero_Telefono());
            ps.setString(3, clie.getDireccion());
            ps.setInt(4, clie.getComuna_id());
            ps.setString(5, clie.getRut_Cliente());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean buscarCliente(Cliente clie) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from cliente where Rut_Cliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, clie.getRut_Cliente());
            rs = ps.executeQuery();
            if (rs.next()) {
                clie.setNombre(rs.getString("nombre"));
                clie.setNumero_Telefono(rs.getString("numero_telefono"));
                clie.setDireccion(rs.getString("direccion"));
                clie.setComuna_id(Integer.parseInt(rs.getString("comuna_id")));
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void listarCliente() {
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

    public static void buscarListaGestion() {
        String campo = vistas.GestionClientes.xbuscar1.getSelectedItem().toString();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut_Cliente= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.GestionClientes.jTable3.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion.coneccion();
            String sql = "select Rut_Cliente,nombre,numero_telefono,direccion,comuna_id from cliente "
                    + where;
            System.out.println(sql);
            ps = Conexion.coneccion().prepareStatement(sql);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Rut_Cliente");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("Direccion");
            modelo.addColumn("Comuna");

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
