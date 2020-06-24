package consultas;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.ControlGestiones;
import modelo.Trabajador;

public class ConsultasGestionEmpleado {

    public boolean borrarTrabCamion(ControlGestiones cge) {
        PreparedStatement ps = null;
        String sql = "delete from control_empleado_camion where id_empleado=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, cge.getId_Empleado());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                Conexion.Desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean lugarNada(Trabajador trab) {
        PreparedStatement ps = null;
        String sql = "update empleado set Lugar=? where Id=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, "Nada");
            ps.setInt(2, trab.getId());

            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                Conexion.Desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean ingresarTrabajadorCamion(ControlGestiones cge) {
        PreparedStatement ps = null;
        String sql = "insert into control_empleado_camion(id_camion,id_empleado,Puesto) values (?,?,?)";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, cge.getCamion_Id());
            ps.setInt(2, cge.getId_Empleado());
            ps.setString(3, cge.getPuesto());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                Conexion.Desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean lugarEmpleado(Trabajador trab) {
        PreparedStatement ps = null;
        String sql = "update empleado set Lugar=? where Id=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, "Camion");
            ps.setInt(2, trab.getId());

            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                Conexion.Desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    private DefaultTableModel DTT;

    private DefaultTableModel setTituloT() {
        DTT = new DefaultTableModel();
        DTT.addColumn("ID");
        DTT.addColumn("ID Camion");
        DTT.addColumn("ID Empleado");
        DTT.addColumn("Puesto");
        return DTT;
    }

    public DefaultTableModel listarGestionTrab(ControlGestiones cge) {
        int campo = cge.getCamion_Id();
        String where = "";
        if (!"".equals(campo)) {
            where = "where id_camion= '" + campo + "' ";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from control_empleado_camion " + where;
        try {
            setTituloT();
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[5];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getInt(3);
                ob[3] = rs.getString(4);
                DTT.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTT;
    }
    private DefaultTableModel DTcu;

    private DefaultTableModel setTituloU() {
        DTcu = new DefaultTableModel();
        DTcu.addColumn("Id");
        DTcu.addColumn("Nombre");
        DTcu.addColumn("Lugar");
        DTcu.addColumn("Puesto");
        return DTcu;
    }

    public DefaultTableModel listarT(Trabajador trab) {
        String campo = trab.getPuesto();
        String campo2 = "Nada";
        String where = "";
        if (!"".equals(campo)) {
            where = "where Puesto= '" + campo + "' and Lugar= '" + campo2 + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select Id,Nombre,Lugar,Puesto from empleado " + where;
        try {
            setTituloU();
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[8];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getString(2);
                ob[2] = rs.getString(3);
                ob[3] = rs.getString(4);
                DTcu.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTcu;
    }

}
