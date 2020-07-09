package consultas;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.LoginM;

public class ConsultasLogin {

    public LoginM validarUsuarios(String user, String pass) {
        LoginM logim = new LoginM();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String SQL = "select * from usuario where usuario=? and password=?";
        try {
            ps = Conexion.Conectar().prepareStatement(SQL);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                logim.setId(rs.getInt(1));
                logim.setUser(rs.getString(2));
                logim.setPass(rs.getString(3));
            }
        } catch (Exception e) {
        }
        return logim;
    }

    public boolean buscarUserPass(LoginM lo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from usuario where codigo=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, lo.getClave());
            rs = ps.executeQuery();
            if (rs.next()) {
                lo.setUser(rs.getString("usuario"));
                lo.setPass(rs.getString("password"));
                ps.execute();
            }
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
