package consultas;

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
            ps.setString(5, trab.getTelefono());
            ps.setString(6, trab.getEstado());
            ps.setString(7, trab.getPuesto());
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

    public boolean modificarTrabajador(Trabajador trab) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update empleado set Nombre=?,Apellido=?,Telefono=?, Sexo=?, Estado=?, Puesto=? where Rut=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, trab.getNombre());
            ps.setString(2, trab.getApellido());
            ps.setString(3, trab.getTelefono());
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
                trab.setTelefono(rs.getString("Telefono"));
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
    private DefaultTableModel DTcu;

    private DefaultTableModel setTituloU() {
        DTcu = new DefaultTableModel();
        DTcu.addColumn("Id");
        DTcu.addColumn("Rut");
        DTcu.addColumn("Nombre");
        DTcu.addColumn("Apellido");
        DTcu.addColumn("Sexo");
        DTcu.addColumn("Telefono");
        DTcu.addColumn("Estado");
        DTcu.addColumn("Puesto");
        return DTcu;
    }

    public DefaultTableModel listar(Trabajador trab) {
        String campo = trab.getRut();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut_Cliente= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from empleado " + where;
        try {
            setTituloU();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[8];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getString(2);
                ob[2] = rs.getString(3);
                ob[3] = rs.getString(4);
                ob[4] = rs.getString(5);
                ob[5] = rs.getString(6);
                ob[6] = rs.getString(7);
                ob[7] = rs.getString(8);
                DTcu.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTcu;
    }
    private DefaultTableModel DT;

    private DefaultTableModel setTitulo() {
        DT = new DefaultTableModel();
        DT.addColumn("Id");
        DT.addColumn("Rut");
        DT.addColumn("Nombre");
        DT.addColumn("Apellido");
        DT.addColumn("Sexo");
        DT.addColumn("Telefono");
        DT.addColumn("Estado");
        DT.addColumn("Puesto");
        return DT;
    }

    public DefaultTableModel listarU(Trabajador trab) {
        String campo = trab.getRut();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut_Cliente= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from empleado " + where;
        try {
            setTitulo();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[8];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getString(2);
                ob[2] = rs.getString(3);
                ob[3] = rs.getString(4);
                ob[4] = rs.getString(5);
                ob[5] = rs.getString(6);
                ob[6] = rs.getString(7);
                ob[7] = rs.getString(8);
                DTcu.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTcu;
    }

}