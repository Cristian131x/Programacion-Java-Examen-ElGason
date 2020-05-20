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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static vistas.Camiones.xbuscar1;
import static vistas.Camiones.xmarca;
import static vistas.Camiones.xmarca1;
import static vistas.Camiones.xmodelo;
import static vistas.Camiones.xmodelo1;
import static vistas.Camiones.xpatente;
import static vistas.Camiones.xpatente1;
import static vistas.Camiones.xprevision;
import static vistas.Camiones.xprevision1;
import static vistas.Camiones.xrevision;
import static vistas.Camiones.xrevision1;

/**
 *
 * @author crist
 */
public class CamionesM {

    public static void insertarCamion() throws SQLException {
        PreparedStatement ps = null;
        Conexion.coneccion();
        String sql = "insert into camiones(Patente,Modelo,Marca,Revision_Tecnica,Proxima_Revision) values(?,?,?,?,?)";
        try {
            ps = Conexion.coneccion().prepareStatement(sql);
            ps.setString(1, vistas.Camiones.xpatente.getText());
            ps.setString(2, vistas.Camiones.xmodelo.getText());
            ps.setString(3, vistas.Camiones.xmarca.getText());
            ps.setString(4, ((JTextField) vistas.Camiones.xrevision.getDateEditor().getUiComponent()).getText());
            ps.setString(5, ((JTextField) vistas.Camiones.xprevision.getDateEditor().getUiComponent()).getText());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
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
            where = "where id_camion= '" + campo + "'";
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

    public static void buscarNormal() {
        try {
            Conexion.coneccion();
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = Conexion.coneccion().prepareStatement("select * from camiones where id_camion= ?");
            ps.setString(1, xbuscar1.getSelectedItem().toString());

            rs = ps.executeQuery();
            if (rs.next()) {
                vistas.Camiones.xpatente1.setText(rs.getString("Patente"));
                vistas.Camiones.xmodelo1.setText(rs.getString("Modelo"));
                vistas.Camiones.xmarca1.setText(rs.getString("Marca"));
                vistas.Camiones.xrevision1.setDate(rs.getDate("Revision_Tecnica"));
                vistas.Camiones.xprevision1.setDate(rs.getDate("Proxima_Revision"));

            } else {
                JOptionPane.showMessageDialog(null, "Camion no encontrada");
            }
        } catch (SQLException ex) {
        }
    }

    public static void limpiarA() {
        xpatente.setText("");
        xmodelo.setText("");
        xmarca.setText("");
        xrevision.setDateFormatString("");
        xprevision.setDateFormatString("");
    }

    public static void limpiarU() {
        xpatente1.setText("");
        xmodelo1.setText("");
        xmarca1.setText("");
        xrevision1.setDateFormatString("");
        xprevision1.setDateFormatString("");
    }

    public static void modificarCamion() {
        try {
            Conexion.coneccion();
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = Conexion.coneccion().prepareStatement("update camiones set Patente=?,Modelo=?,Marca=?,Revision_Tecnica=?,Proxima_Revision=? where id_camion=?");
            ps.setString(1, xpatente1.getText());
            ps.setString(2, xmodelo1.getText());
            ps.setString(3, xmarca1.getText());
            ps.setString(4, ((JTextField) xrevision1.getDateEditor().getUiComponent()).getText());
            ps.setString(5, ((JTextField) xprevision1.getDateEditor().getUiComponent()).getText());
            ps.setString(6, xbuscar1.getSelectedItem().toString());
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Camion actualizado correctamente :D");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR UwU ");
        }
    }
}
