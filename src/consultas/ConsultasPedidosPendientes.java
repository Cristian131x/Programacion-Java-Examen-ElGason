package consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleCompra;
import modelo.PedidoPendiente;
import modelo.StockGas;

public class ConsultasPedidosPendientes extends conexion.Conexion {

    private DefaultTableModel DTF;

    private DefaultTableModel setTituloF() {
        DTF = new DefaultTableModel();
        DTF.addColumn("Id");
        DTF.addColumn("Cliente_Id");
        DTF.addColumn("Monto_Total");
        DTF.addColumn("Pago");
        DTF.addColumn("Estado");
        DTF.addColumn("Fecha");
        return DTF;
    }

    public static java.sql.Date Fecha(java.util.Date date) {
        if (date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        }
        return null;
    }

    public DefaultTableModel listarPedidosF(PedidoPendiente ped) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from boleta where Estado=? and fecha BETWEEN ? and ?";
        try {
            setTituloF();
            ps = con.prepareStatement(sql);
            ps.setString(1, "VentaConfirmada");
            ps.setDate(2, (Fecha(ped.getFecha())));
            ps.setDate(3, (Fecha(ped.getFecha2())));
            rs = ps.executeQuery();
            Object ob[] = new Object[6];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getInt(3);
                ob[3] = rs.getString(4);
                ob[4] = rs.getString(5);
                ob[5] = rs.getString(6);
                DTF.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTF;
    }
    private DefaultTableModel DTcu;

    private DefaultTableModel setTituloU() {
        DTcu = new DefaultTableModel();
        DTcu.addColumn("Id");
        DTcu.addColumn("Cliente_Id");
        DTcu.addColumn("Monto_Total");
        DTcu.addColumn("Pago");
        DTcu.addColumn("Estado");
        DTcu.addColumn("Fecha");
        return DTcu;
    }

    public DefaultTableModel listarPedidos(PedidoPendiente ped) {
        String campo = ped.getEstado();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Estado= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from boleta " + where;
        try {
            setTituloU();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[6];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getInt(3);
                ob[3] = rs.getString(4);
                ob[4] = rs.getString(5);
                ob[5] = rs.getString(6);
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
        DT.addColumn("Id_DETALLE");
        DT.addColumn("BOLETA_ID");
        DT.addColumn("PRECIO");
        DT.addColumn("GAS_ID");
        DT.addColumn("TIPO_GAS");
        DT.addColumn("CAMION");
        return DT;
    }

    public DefaultTableModel listarDetalles(PedidoPendiente pe) {
        int campo = pe.getId();
        String where = "";
        if (!"".equals(campo)) {
            where = "where boleta_id= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from detalle_compra " + where;
        try {
            setTitulo();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[6];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getInt(3);
                ob[3] = rs.getInt(4);
                ob[4] = rs.getInt(5);
                ob[5] = rs.getString(6);
                DT.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DT;
    }

    public boolean gasVendidoC(PedidoPendiente ped) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update control_gas set EstadoGas=? where gas_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ped.getEstado());
            ps.setInt(2, ped.getGas_Id());
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

    public boolean gasVendido(PedidoPendiente ped) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update gas set estado=? where id_gas=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ped.getEstado());
            ps.setInt(2, ped.getGas_Id());
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

    public boolean gasNoVendido(PedidoPendiente ped) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update gas set estado=? where id_gas=?";
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, ped.getEstado());
            ps.setInt(2, ped.getGas_Id());
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

    public boolean actualizarBoleta(PedidoPendiente ped) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update boleta set Estado=? where id_ventas=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ped.getEstado());
            ps.setInt(2, ped.getId());
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

    public boolean agregarVacio45(PedidoPendiente ped) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into gas(precio,nombre,tipo_id,estado) values (?,?,?,?)";
        int Cantidad = ped.getCantidadV();
        try {
            for (int i = 0; i < Cantidad; i++) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, 0);
                ps.setString(2, "Gas 45 Vacio");
                ps.setInt(3, 450);
                ps.setString(4, "BodegaV");
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

    public boolean agregarVacio15(PedidoPendiente ped) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into gas(precio,nombre,tipo_id,estado) values (?,?,?,?)";
        int Cantidad = ped.getCantidadV();
        try {
            for (int i = 0; i < Cantidad; i++) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, 0);
                ps.setString(2, "Gas 15 Vacio");
                ps.setInt(3, 150);
                ps.setString(4, "BodegaV");
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

    public boolean agregarVacio11(PedidoPendiente ped) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into gas(precio,nombre,tipo_id,estado) values (?,?,?,?)";
        int Cantidad = ped.getCantidadV();
        try {
            for (int i = 0; i < Cantidad; i++) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, 0);
                ps.setString(2, "Gas 11 Vacio");
                ps.setInt(3, 110);
                ps.setString(4, "BodegaV");
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

    public boolean agregarVacio5(PedidoPendiente ped) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into gas(precio,nombre,tipo_id,estado) values (?,?,?,?)";
        int Cantidad = ped.getCantidadV();
        try {
            for (int i = 0; i < Cantidad; i++) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, 0);
                ps.setString(2, "Gas 5 Vacio");
                ps.setInt(3, 50);
                ps.setString(4, "BodegaV");
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

    public boolean borrarDetalle(DetalleCompra de) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "delete from detalle_compra where boleta_id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, de.getBoleta_numero());
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

    public boolean buscarCantidad11(DetalleCompra de) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select count(*) as Contar11 from  detalle_compra where boleta_id=? and id_tipo_gas=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, de.getBoleta_numero());
            ps.setInt(2, 11);
            rs = ps.executeQuery();
            while (rs.next()) {
                de.setCantidad(rs.getInt("Contar11"));
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

    public boolean buscarCantidad5(DetalleCompra de) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select count(*) as Contar5 from  detalle_compra where boleta_id=? and id_tipo_gas=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, de.getBoleta_numero());
            ps.setInt(2, 5);
            rs = ps.executeQuery();
            while (rs.next()) {
                de.setCantidad(rs.getInt("Contar5"));
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

    public boolean buscarCantidad15(DetalleCompra de) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select count(*) as Contar15 from  detalle_compra where boleta_id=? and id_tipo_gas=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, de.getBoleta_numero());
            ps.setInt(2, 15);
            rs = ps.executeQuery();
            while (rs.next()) {
                de.setCantidad(rs.getInt("Contar15"));
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

    public boolean buscarCantidad45(DetalleCompra de) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select count(*) as Contar45 from  detalle_compra where boleta_id=? and id_tipo_gas=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, de.getBoleta_numero());
            ps.setInt(2, 45);
            rs = ps.executeQuery();
            while (rs.next()) {
                de.setCantidad(rs.getInt("Contar45"));
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

    public boolean mas45(StockGas stk) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, 45);
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

    public boolean mas11(StockGas stk) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, 11);
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

    public boolean mas15(StockGas stk) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, 15);
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

    public boolean mas5(StockGas stk) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, 5);
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

    public boolean actualizarStockVacio45(StockGas stk) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, 450);
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

    public boolean actualizarStockVacio15(StockGas stk) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, 150);
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

    public boolean actualizarStockVacio11(StockGas stk) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, 110);
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

    public boolean actualizarStockVacio5(StockGas stk) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, 50);
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
}
