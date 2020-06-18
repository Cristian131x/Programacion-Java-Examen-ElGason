package consultas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.Camion;
import modelo.ControlGestiones;
import modelo.Ruta;
import modelo.StockGas;
import modelo.Trabajador;

public class ConsultasControlGestiones {

    public boolean ingresarGasCamion(ControlGestiones cge) {
        PreparedStatement ps = null;
        String sql = "insert into control_gas(gas_id,TipoGas,camion_id,Patente,EstadoGas) values (?,?,?,?,?)";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, cge.getGas_Id());
            ps.setInt(2, cge.getTipo());
            ps.setInt(3, cge.getCamion_Id());
            ps.setString(4, cge.getPatente());
            ps.setString(5, cge.getEstado());
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

    public boolean borrarGasCamion(ControlGestiones cge) {
        PreparedStatement ps = null;
        String sql = "delete from control_gas where gas_id=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, cge.getGas_Id());
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
    private DefaultTableModel DT;

    private DefaultTableModel setTituloGA() {
        DT = new DefaultTableModel();
        DT.addColumn("ID");
        DT.addColumn("ID Gas");
        DT.addColumn("TipoGas");
        DT.addColumn("ID Camion");
        DT.addColumn("Patente");
        return DT;
    }

    public DefaultTableModel listarGestionGas(ControlGestiones cge) {
        int campo = cge.getCamion_Id();
        String campo2 = cge.getEstado();
        String where = "";
        if (!"".equals(campo)) {
            where = "where camion_id= '" + campo + "' and EstadoGas= '" + campo2 + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from control_gas " + where;
        try {
            setTituloGA();
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[5];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getInt(3);
                ob[3] = rs.getInt(4);
                ob[4] = rs.getString(5);
                DT.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DT;
    }

    public boolean estadoEnCamion(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update gas set estado=? where id_gas=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, "Camion");
            ps.setInt(2, stk.getId_gas());

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

    public boolean estadoBodega(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update gas set estado=? where id_gas=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, "Bodega");
            ps.setInt(2, stk.getId_gas());

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
    /*------------------------------------------------------------------------*/
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

}
