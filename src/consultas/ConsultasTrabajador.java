package consultas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.Trabajador;

public class ConsultasTrabajador extends conexion.Conexion {

    public boolean registrarTrabajador(Trabajador trab) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into empleado(Rut,Nombre,Apellido,Sexo,Telefono,Estado,Puesto) values (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trab.getRut());
            ps.setString(2, trab.getNombre());
            ps.setString(3, trab.getApellido());
            ps.setString(4, trab.getSexo());
            ps.setInt(5, trab.getTelefono());
            ps.setString(6, trab.getEstado());
            ps.setString(7, trab.getPuesto());
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

    public boolean modificarTrabajador(Trabajador trab) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update empleado set Nombre=?,Apellido=?,Telefono=?, Sexo=?, Estado=?, Puesto=? where Rut=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trab.getNombre());
            ps.setString(2, trab.getApellido());
            ps.setInt(3, trab.getTelefono());
            ps.setString(4, trab.getSexo());
            ps.setString(5, trab.getEstado());
            ps.setString(6, trab.getPuesto());
            ps.setString(7, trab.getRut());
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

    public boolean buscarTrabajador(Trabajador trab) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from empleado where Rut=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trab.getRut());
            rs = ps.executeQuery();
            if (rs.next()) {
                trab.setRut(rs.getString("Rut"));
                trab.setNombre(rs.getString("Nombre"));
                trab.setApellido(rs.getString("Apellido"));
                trab.setSexo(rs.getString("Sexo"));
                trab.setTelefono(Integer.parseInt(rs.getString("Telefono")));
                trab.setEstado(rs.getString("Estado"));
                trab.setPuesto(rs.getString("Puesto"));
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
    public static void listarTrabajadores() {
        String campo = vistas.Trabajadores.xbuscar.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.Trabajadores.tablaT.setModel(modelo);
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

    public static void listarModificarTrabajadores() {
        String campo = vistas.Trabajadores.xbuscar1.getSelectedItem().toString();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut= '" + campo + "'";
        } else {
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            vistas.Trabajadores.tablaModificar.setModel(modelo);
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
}
