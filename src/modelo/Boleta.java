
package modelo;


public class Boleta {
    public int Id_ventas;
    public String Cliente_id;
    public String Monto_total;
    public String Estado;
    public String Fecha;
    public String Codigo_pago;

    public String getCodigo_pago() {
        return Codigo_pago;
    }

    public void setCodigo_pago(String Codigo_pago) {
        this.Codigo_pago = Codigo_pago;
    }
    

    public int getId_ventas() {
        return Id_ventas;
    }

    public void setId_ventas(int Id_ventas) {
        this.Id_ventas = Id_ventas;
    }

    public String getCliente_id() {
        return Cliente_id;
    }

    public void setCliente_id(String Cliente_id) {
        this.Cliente_id = Cliente_id;
    }

    public String getMonto_total() {
        return Monto_total;
    }

    public void setMonto_total(String Monto_total) {
        this.Monto_total = Monto_total;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

   
    
}
