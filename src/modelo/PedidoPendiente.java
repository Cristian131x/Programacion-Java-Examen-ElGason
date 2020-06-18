
package modelo;

import java.util.Date;


public class PedidoPendiente {
    private int Id;
    private int Id_Cliente;
    private int Monto;
    private String Pago;
    private String Estado;
    private Date Fecha;
    private Date Fecha2;
    private int Id_detalle;
    private int Precio;
    private int Gas_Id;
    private int CantidadV;
    
    

    public int getId_detalle() {
        return Id_detalle;
    }

    public void setId_detalle(int Id_detalle) {
        this.Id_detalle = Id_detalle;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getGas_Id() {
        return Gas_Id;
    }

    public void setGas_Id(int Gas_Id) {
        this.Gas_Id = Gas_Id;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    
    public int getCantidadV() {
        return CantidadV;
    }

    public void setCantidadV(int CantidadV) {
        this.CantidadV = CantidadV;
    }

    public Date getFecha2() {
        return Fecha2;
    }

    public void setFecha2(Date Fecha2) {
        this.Fecha2 = Fecha2;
    }
    
    
    
    
    
}
