package consultas;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.ControlGestiones;
import modelo.StockGas;

public class ConsultasGestionGas {

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

}
