package consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class ConsultasCliente extends conexion.Conexion {

    public boolean registrarCliente(Cliente clie) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into cliente(Rut_Cliente,nombre,numero_telefono,direccion,comuna_id) values (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, clie.getRut_Cliente());
            ps.setString(2, clie.getNombre());
            ps.setString(3, clie.getNumero_Telefono());
            ps.setString(4, clie.getDireccion());
            ps.setInt(5, clie.getComuna_id());
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
    public boolean modificarCliente(Cliente clie) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update cliente set nombre=?,numero_telefono=?,direccion=?,comuna_id=? where Rut_Cliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, clie.getNombre());
            ps.setString(2, clie.getNumero_Telefono());
            ps.setString(3, clie.getDireccion());
            ps.setInt(4, clie.getComuna_id());
            ps.setString(5, clie.getRut_Cliente());
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

    public boolean buscarCliente(Cliente clie) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from cliente where Rut_Cliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, clie.getRut_Cliente());
            rs = ps.executeQuery();
            while (rs.next()) {
                clie.setId_cliente(rs.getInt("id_cliente"));
                clie.setNombre(rs.getString("nombre"));
                clie.setNumero_Telefono(rs.getString("numero_telefono"));
                clie.setDireccion(rs.getString("direccion"));
                clie.setComuna_id(rs.getInt("comuna_id"));
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
    private DefaultTableModel DTc;
    private DefaultTableModel setTituloA() {
        DTc = new DefaultTableModel();
        DTc.addColumn("ID");
        DTc.addColumn("RUT");
        DTc.addColumn("NOMBRE");
        DTc.addColumn("TELEFONO");
        DTc.addColumn("DIRECCION");
        DTc.addColumn("COMUNA_ID");
        return DTc;
    }
    public DefaultTableModel listar(Cliente clie) {
        String campo = clie.getRut_ClienteL();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut_Cliente= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from cliente " + where;
        try {
            setTituloA();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[6];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getString(2);
                ob[2] = rs.getString(3);
                ob[3] = rs.getString(4);
                ob[4] = rs.getString(5);
                ob[5] = rs.getInt(6);
                DTc.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTc;
    }
    private DefaultTableModel DTcu;

    private DefaultTableModel setTituloU() {
        DTcu = new DefaultTableModel();
        DTcu.addColumn("ID");
        DTcu.addColumn("Rut_Cliente");
        DTcu.addColumn("Nombre");
        DTcu.addColumn("Telefono");
        DTcu.addColumn("Direccion");
        DTcu.addColumn("Comuna");
        return DTcu;
    }

    public DefaultTableModel listarU(Cliente clie) {
        String campo = clie.getRut_ClienteL();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Rut_Cliente= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from cliente " + where;
        try {
            setTituloU();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[6];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getString(2);
                ob[2] = rs.getString(3);
                ob[3] = rs.getString(4);
                ob[4] = rs.getString(5);
                ob[5] = rs.getInt(6);
                DTcu.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTcu;
    }
}
