package consultas;

import conexion.Conexion;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import modelo.Ruta;

public class ConsultasRutas extends Conexion {

    public boolean registrarRutas(Ruta ru) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into Rutas(kilometraje,nombre_ruta,foto) values (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ru.getKilometraje());
            ps.setString(2, ru.getNombre_ruta());
            ps.setBytes(3, ru.getFoto());
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

    public boolean buscarRutas(Ruta ru) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from rutas where id_ruta=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ru.getId_ruta());
            rs = ps.executeQuery();
            while (rs.next()) {
                ru.setKilometraje(rs.getInt("kilometraje"));
                ru.setNombre_ruta(rs.getString("nombre_ruta"));
                ru.setFoto(rs.getBytes("foto"));
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

    public boolean modificarRutas(Ruta ru) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update rutas set kilometraje=?,nombre_ruta=?,foto=? where id_ruta=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ru.getKilometraje());
            ps.setString(2, ru.getNombre_ruta());
            ps.setBytes(3, ru.getFoto());
            ps.setInt(4, ru.getId_ruta());
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

    public boolean visualizarRutas(Ruta ru) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from rutas where id_ruta=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ru.getId_ruta());
            rs = ps.executeQuery();
            while (rs.next()) {
                ru.setFoto(rs.getBytes("foto"));
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
        DTc.addColumn("Id");
        DTc.addColumn("Kilometraje");
        DTc.addColumn("Nombre");
        DTc.addColumn("Foto");
        return DTc;
    }

    public DefaultTableModel listar(Ruta ru) {
        String campo = ru.getNombre_ruta();
        String where = "";
        if (!"".equals(campo)) {
            where = "where nombre_ruta= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from rutas " + where;
        try {
            setTituloA();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[4];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getString(3);
                ob[3] = rs.getString(4);

                DTc.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTc;
    }
    private DefaultTableModel DTu;

    private DefaultTableModel setTituloU() {
        DTu = new DefaultTableModel();
        DTu.addColumn("Id");
        DTu.addColumn("Kilometraje");
        DTu.addColumn("Nombre");
        DTu.addColumn("Foto");
        return DTu;
    }

    public DefaultTableModel listarU(Ruta ru) {
        int campo = ru.getId_ruta();
        String where = "";
        if (!"".equals(campo)) {
            where = "where id_ruta= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from rutas " + where;
        try {
            setTituloA();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[4];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getInt(2);
                ob[2] = rs.getString(3);
                ob[3] = rs.getBytes(4);
                DTc.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTc;
    }
}
