package consultas;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Boleta;
import modelo.DetalleCompra;
import modelo.Pedido;

public class ConsultasVender{

    int r = 0;
    PreparedStatement ps = null;

    public String IdVentas() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String idB = "";
        String sql = "select max(id_ventas) from boleta";
        try {

            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idB = rs.getString(1);

            }
        } catch (Exception e) {
        }
        return idB;

    }

    public boolean GuardarBoleta(Boleta bo) {
        PreparedStatement ps = null;
        String sql = "insert into boleta (id_ventas,cliente_id,monto_total,codigo_pago,Estado,fecha)values(?,?,?,?,?,?)";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, bo.getId_ventas());
            ps.setString(2, bo.getCliente_id());
            ps.setString(3, bo.getMonto_total());
            ps.setString(4, bo.getCodigo_pago());
            ps.setString(5, bo.getEstado());
            ps.setString(6, bo.getFecha());
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

    public boolean GuardarDetalleCompra(DetalleCompra de) {
        PreparedStatement ps = null;
        String sql = "insert into detalle_compra (boleta_id,precio,gas_id,id_tipo_gas,Camion)values(?,?,?,?,?)";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, de.getBoleta_numero());
            ps.setInt(2, de.getPrecio());
            ps.setInt(3, de.getGas_id());
            ps.setInt(4, de.getTipo());
            ps.setString(5, de.getCamion());
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
    public boolean GuardarPedido(Pedido pe) {
        PreparedStatement ps = null;
        String sql = "insert into pedidos(Id_Pedido,boleta_id,Estado)values(?,?,?)";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, pe.getId_Pedido());
            ps.setInt(2, pe.getBoleta_numero());
            ps.setString(3, pe.getEstado());
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
