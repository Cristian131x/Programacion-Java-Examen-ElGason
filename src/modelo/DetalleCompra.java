package modelo;

public class DetalleCompra {

    public int Codigo_detalle;
    public int Boleta_numero;
    public int Cantidad;
    public int Precio;
    public int Gas_id;
    public int Tipo;
    public String Camion;


    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public int getCodigo_detalle() {
        return Codigo_detalle;
    }

    public void setCodigo_detalle(int Codigo_detalle) {
        this.Codigo_detalle = Codigo_detalle;
    }

    public int getBoleta_numero() {
        return Boleta_numero;
    }

    public void setBoleta_numero(int Boleta_numero) {
        this.Boleta_numero = Boleta_numero;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getGas_id() {
        return Gas_id;
    }

    public void setGas_id(int Gas_id) {
        this.Gas_id = Gas_id;
    }

    public String getCamion() {
        return Camion;
    }

    public void setCamion(String Camion) {
        this.Camion = Camion;
    }

}
