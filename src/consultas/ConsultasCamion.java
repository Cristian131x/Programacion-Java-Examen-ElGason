package consultas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.Camion;

public class ConsultasCamion extends Conexion {

    public static java.sql.Date Fecha(java.util.Date date) {
        if (date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        }
        return null;
    }

    public boolean registrarCamion(Camion cam) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into camiones(Patente,Modelo,Marca,Revision_Tecnica,Proxima_Revision,Estado) values(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cam.getPatente());
            ps.setString(2, cam.getModelo());
            ps.setString(3, cam.getMarca());
            ps.setDate(4, (Fecha(cam.getRevicion_Tecnica())));
            ps.setDate(5, (Fecha(cam.getProxima_Revision())));
            ps.setString(6, "NoAsignado");
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

    public boolean modificarCamion(Camion cam) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update camiones set Patente=?,Modelo=?,Marca=?,Revision_Tecnica=?,Proxima_Revision=? where id_camion=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cam.getPatente());
            ps.setString(2, cam.getModelo());
            ps.setString(3, cam.getMarca());
            ps.setDate(4, (Fecha(cam.getRevicion_Tecnica())));
            ps.setDate(5, (Fecha(cam.getProxima_Revision())));
            ps.setInt(6, cam.getId_camion());
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

    public boolean buscarCamion(Camion cam) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from camiones where id_camion=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cam.getId_camion());
            rs = ps.executeQuery();
            if (rs.next()) {
                cam.setPatente(rs.getString("Patente"));
                cam.setModelo(rs.getString("Modelo"));
                cam.setMarca(rs.getString("Marca"));
                cam.setRevicion_Tecnica(Fecha(rs.getDate("Revision_Tecnica")));
                cam.setProxima_Revision(Fecha(rs.getDate("Proxima_Revision")));
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
    private DefaultTableModel DTc;

    private DefaultTableModel setTituloA() {
        DTc = new DefaultTableModel();
        DTc.addColumn("Id_Camion");
        DTc.addColumn("Patente");
        DTc.addColumn("Modelo");
        DTc.addColumn("Marca");
        DTc.addColumn("Revision Tec.");
        DTc.addColumn("Proxi Rev.");
        return DTc;
    }

    public DefaultTableModel listar(Camion cam) {
        String campo = cam.getPatenteL();
        String where = "";
        if (!"".equals(campo)) {
            where = "where Patente= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from camiones " + where;
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
                ob[4] = rs.getDate(5);
                ob[5] = rs.getDate(6);
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
        DTu.addColumn("Id_Camion");
        DTu.addColumn("Patente");
        DTu.addColumn("Modelo");
        DTu.addColumn("Marca");
        DTu.addColumn("Revision Tec.");
        DTu.addColumn("Proxi Rev.");
        return DTu;
    }

    public DefaultTableModel listarU(Camion cam) {
        int campo = cam.getId_camion();
        String where = "";
        if (!"".equals(campo)) {
            where = "where id_camion= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from camiones " + where;
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
                ob[4] = rs.getDate(5);
                ob[5] = rs.getDate(6);
                DTu.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTu;
    }

}
