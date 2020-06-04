package consultas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Boleta;
import modelo.DetalleCompra;

public class ConsultasVender extends Conexion {

    int r = 0;
    PreparedStatement ps = null;
    Connection con = getConexion();

    public String IdVentas() {
        PreparedStatement ps = null;
        Connection con = getConexion();;
        ResultSet rs = null;
        String idB = "";
        String sql = "select max(id_ventas) from boleta";
        try {

            ps = con.prepareStatement(sql);
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
        Connection con = getConexion();
        String sql = "insert into boleta (id_ventas,cliente_id,monto_total,codigo_pago,Estado,fecha)values(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
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
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean GuardarDetalleCompra(DetalleCompra de) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into detalle_compra (boleta_id,precio,gas_id,id_tipo_gas)values(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, de.getBoleta_numero());
            ps.setInt(2, de.getPrecio());
            ps.setInt(3, de.getGas_id());
            ps.setInt(4, de.getTipo());
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
