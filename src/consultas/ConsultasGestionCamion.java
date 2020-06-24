package consultas;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.Camion;
import modelo.ControlGestiones;
import modelo.Ruta;

public class ConsultasGestionCamion {

    private DefaultTableModel D;

    private DefaultTableModel setTituloC() {
        D = new DefaultTableModel();
        D.addColumn("ID");
        D.addColumn("Patente");
        D.addColumn("Modelo");
        return D;
    }

    public DefaultTableModel listarCamiones(Camion cam) {
        String campo = "NoAsignado";
        String where = "";
        if (!"".equals(campo)) {
            where = "where Estado= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select id_camion,Patente,Modelo from camiones " + where;
        try {
            setTituloC();
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[3];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getString(2);
                ob[2] = rs.getString(3);
                D.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return D;
    }

    public boolean borrarRutaCamion(ControlGestiones cge) {
        PreparedStatement ps = null;
        String sql = "delete from control_rutas where camion_id=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, cge.getCamion_Id());
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

    public boolean estadoNoAsignado(Camion cam) {
        PreparedStatement ps = null;
        String sql = "update camiones set Estado=? where id_camion=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, "NoAsignado");
            ps.setInt(2, cam.getId_camion());

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

    public boolean estadoEnRuta(Camion cam) {
        PreparedStatement ps = null;
        String sql = "update camiones set Estado=? where id_camion=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, "Asignado");
            ps.setInt(2, cam.getId_camion());

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

    private DefaultTableModel DTc;

    private DefaultTableModel setTituloA() {
        DTc = new DefaultTableModel();
        DTc.addColumn("Id");
        DTc.addColumn("Kilometraje");
        DTc.addColumn("Nombre");
        return DTc;
    }

    public DefaultTableModel listarRutas(Ruta ru) {
        String campo = ru.getNombre_rutaL();
        String where = "";
        if (!"".equals(campo)) {
            where = "where nombre_ruta= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select id_ruta,kilometraje,nombre_ruta from rutas " + where;
        try {
            setTituloA();
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[4];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getString(3);
                DTc.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTc;
    }
    private DefaultTableModel DL;

    private DefaultTableModel setTituloRC() {
        DL = new DefaultTableModel();
        DL.addColumn("ID");
        DL.addColumn("ID Ruta");
        DL.addColumn("ID Camion");
        return DL;
    }

    public DefaultTableModel listarCamionesRu(Ruta ru) {
        int campo = ru.getId_ruta();
        String where = "";
        if (!"".equals(campo)) {
            where = "where ruta_id= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from control_rutas " + where;
        try {
            setTituloRC();
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[3];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getInt(3);
                DL.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DL;
    }

    public boolean ingresarRutaCamion(ControlGestiones cge) {
        PreparedStatement ps = null;
        String sql = "insert into control_rutas (ruta_id,camion_id) values (?,?)";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, cge.getId_Ruta());
            ps.setInt(2, cge.getCamion_Id());
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

}
