/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.Camion;

/**
 *
 * @author crist
 */
public class ConsultasCamion extends Conexion{
    public boolean registrarCamion(Camion cam) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into camiones(Patente,Modelo,Marca,Revision_Tecnica,Proxima_Revision) values(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cam.getPatente());
            ps.setString(2, cam.getModelo());
            ps.setString(3, cam.getMarca());
            ps.setDate(4, (Date) cam.getRevicion_Tecnica());
            ps.setDate(5, (Date) cam.getProxima_Revision());
            ps.execute();
            return true;
            //INSERTAR LIMPIAR           
        } catch (Exception e) {
            System.out.println(e);
            return false;
            //INSERTAR LIMPIAR
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean modificarCamion(Camion cam) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update camiones set Patente=?,Modelo=?,Marca=?,Revision_Tecnica=?,Proxima_Revision=? where id_camion=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cam.getPatente());
            ps.setString(2, cam.getModelo());
            ps.setString(3, cam.getMarca());
            ps.setDate(4, (Date) cam.getRevicion_Tecnica());
            ps.setDate(5, (Date) cam.getProxima_Revision());
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

    public boolean buscarCamion(Camion cam) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from camiones where Patente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cam.getPatente());
            rs = ps.executeQuery();
            if (rs.next()) {
                cam.setPatente(rs.getString("Patente"));
                cam.setModelo(rs.getString("Modelo"));
                cam.setMarca(rs.getString("Marca"));
                cam.setRevicion_Tecnica(rs.getDate("Revision_Tecnica"));
                cam.setProxima_Revision(rs.getDate("Proxima_Revision"));
                ps.execute();
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
      public static void listarCamiones() {
        String campo = vistas.Camiones.xbuscar.getText().toString();
        String where = "";
        if (!"".equals(campo)) {
            where = "where id_camion= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.Camiones.jTable2.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion.coneccion();
            String sql = "select id_camion,Patente,Modelo,Marca,Revision_Tecnica,Proxima_Revision from camiones "
                    + where;
            System.out.println(sql);
            ps = Conexion.coneccion().prepareStatement(sql);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Patente");
            modelo.addColumn("Modelo");
            modelo.addColumn("Marca");
            modelo.addColumn("Revision Tec.");
            modelo.addColumn("Prox. Revi.");

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

    public static void buscaLista() {
        String campo = vistas.Camiones.xbuscar1.getSelectedItem().toString();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Patente= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.Camiones.jTable3.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion.coneccion();
            String sql = "select Patente,Modelo,Marca,Revision_Tecnica,Proxima_Revision from camiones "
                    + where;
            System.out.println(sql);
            ps = Conexion.coneccion().prepareStatement(sql);
            rs = ps.executeQuery();
            java.sql.ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Patente");
            modelo.addColumn("Modelo");
            modelo.addColumn("Marca");
            modelo.addColumn("Revision Tec.");
            modelo.addColumn("Prox. Revi.");

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