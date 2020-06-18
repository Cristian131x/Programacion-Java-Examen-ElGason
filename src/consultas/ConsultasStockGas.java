package consultas;

import conexion.Conexion;
import java.sql.PreparedStatement;
import modelo.StockGas;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ConsultasStockGas{

    public boolean agregarGas(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "insert into gas(precio,nombre,tipo_id,estado) values (?,?,?,?)";
        int Cantidad = stk.getCantidad();
        try {
            for (int i = 0; i < Cantidad; i++) {
                ps = Conexion.Conectar().prepareStatement(sql);
                ps.setInt(1, stk.getPrecio());
                ps.setString(2, stk.getNombre());
                ps.setInt(3, stk.getTipo_id());
                ps.setString(4, stk.getEstado());
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

    public boolean actualizarStockGas(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update tipo set stock = stock + ? where id_tipo = ?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
            ps.setInt(2, stk.getTipo_id());
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

    public boolean actualizarStockGasVenta5(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update tipo set stock = stock - ? where id_tipo = 5";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
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

    public boolean actualizarStockGasVenta11(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update tipo set stock = stock - ? where id_tipo = 11";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
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

    public boolean actualizarStockGasVenta15(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update tipo set stock = stock - ? where id_tipo = 15";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
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

    public boolean actualizarStockGasVenta45(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update tipo set stock = stock - ? where id_tipo = 45";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getCantidad());
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

    public boolean actualizarEstadoGases(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update gas set estado =? where id_gas=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, "Pendiente");
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

    public boolean buscarStocks(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from tipo where id_tipo= ?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getTipo_id());
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setStock(rs.getInt("stock"));
                stk.setPrecio(rs.getInt("precio"));
                stk.setNombre(rs.getString("nombre"));
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

    public boolean verStock5(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = ("select * from tipo where id_tipo=5");
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setX5(Integer.parseInt(rs.getString("stock")));;
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

    public boolean verStock15(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = ("select * from tipo where id_tipo=15");
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setX15(Integer.parseInt(rs.getString("stock")));;
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

    public boolean verStock11(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = ("select * from tipo where id_tipo=11");
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setX11(Integer.parseInt(rs.getString("stock")));;
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

    public boolean verStock45(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = ("select * from tipo where id_tipo=45");
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setX45(Integer.parseInt(rs.getString("stock")));;
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

    public boolean verStock5v(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = ("select * from tipo where id_tipo=50");
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setX5v(Integer.parseInt(rs.getString("stock")));;
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

    public boolean verStock15v(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = ("select * from tipo where id_tipo=150");
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setX15v(Integer.parseInt(rs.getString("stock")));;
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

    public boolean verStock11v(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = ("select * from tipo where id_tipo=110");
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setX11v(Integer.parseInt(rs.getString("stock")));;
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

    public boolean verStock45v(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = ("select * from tipo where id_tipo=450");
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setX45v(Integer.parseInt(rs.getString("stock")));;
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
    private DefaultTableModel DT;

    private DefaultTableModel setTituloA() {
        DT = new DefaultTableModel();
        DT.addColumn("Id_Gas");
        DT.addColumn("Nombre");
        DT.addColumn("Precio");
        DT.addColumn("Tipo_Id");
        DT.addColumn("Estado");
        return DT;
    }

    public DefaultTableModel listar(StockGas stk) {
        String campo = stk.getNombre();
        String where = "";
        if (!"".equals(campo)) {
            where = "where tipo_id= '" + campo + "'";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from gas " + where;
        try {
            setTituloA();
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[5];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getString(2);
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

    public boolean buscarGas(StockGas stk) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from tipo where id_tipo=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getTipo_id());
            rs = ps.executeQuery();
            if (rs.next()) {
                stk.setPrecio(Integer.parseInt((rs.getString("Precio"))));
                stk.setNombre(rs.getString("nombre"));
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

    public boolean modificarPrecioG(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update tipo set Precio=? where id_tipo=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getPrecio());
            ps.setInt(2, stk.getTipo_id());
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

    public boolean modificarPrecioGases(StockGas stk) {
        PreparedStatement ps = null;
        String sql = "update gas set precio=? where tipo_id=? and estado=? or estado=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setInt(1, stk.getPrecio());
            ps.setInt(2, stk.getTipo_id());
            ps.setString(3, "Camion");
            ps.setString(4, "Bodega");
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
    private DefaultTableModel DTGA;

    private DefaultTableModel setTituloGA() {
        DTGA = new DefaultTableModel();
        DTGA.addColumn("Id_Gas");
        DTGA.addColumn("Nombre");
        DTGA.addColumn("Tipo_Id");
        return DTGA;
    }

    public DefaultTableModel listarGA(StockGas stk) {
        String campo = "Bodega";
        String where = "";
        if (!"".equals(campo)) {
            where = "where estado= '" + campo + "' ";
        } else {
        }
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select id_gas,nombre,tipo_id from gas " + where;
        try {
            setTituloGA();
            ps = Conexion.Conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            Object ob[] = new Object[5];
            while (rs.next()) {
                ob[0] = rs.getInt(1);
                ob[1] = rs.getString(2);
                ob[2] = rs.getInt(3);
                DTGA.addRow(ob);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return DTGA;
    }

}
