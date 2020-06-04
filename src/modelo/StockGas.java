package modelo;

public class StockGas {

    private int Stock;
    private int Id_gas;
    private String Nombre;
    private int Precio;
    private int Tipo_id;
    private String Estado;
    private int Cantidad;
    private int X5;
    private int X15;
    private int X11;
    private int X45;
    private int X5v;
    private int X15v;
    private int X11v;
    private int X45v;

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getId_gas() {
        return Id_gas;
    }

    public void setId_gas(int Id_gas) {
        this.Id_gas = Id_gas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) throws Exception {
        if (Precio <=0) {
            throw new Exception("El Precio debe ser mayor a 0");      
        }
        this.Precio = Precio;
    }

    public int getTipo_id() {
        return Tipo_id;
    }

    public void setTipo_id(int Tipo_id) {
        this.Tipo_id = Tipo_id;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) throws Exception {
        if (Cantidad <= 0) {
            throw new Exception("Seleccione una cantidad mayor a 0");
        }
        this.Cantidad = Cantidad;
    }

    public int getX5() {
        return X5;
    }

    public void setX5(int X5) {
        this.X5 = X5;
    }

    public int getX15() {
        return X15;
    }

    public void setX15(int X15) {
        this.X15 = X15;
    }

    public int getX11() {
        return X11;
    }

    public void setX11(int X11) {
        this.X11 = X11;
    }

    public int getX45() {
        return X45;
    }

    public void setX45(int X45) {
        this.X45 = X45;
    }

    public int getX5v() {
        return X5v;
    }

    public void setX5v(int X5v) {
        this.X5v = X5v;
    }

    public int getX15v() {
        return X15v;
    }

    public void setX15v(int X15v) {
        this.X15v = X15v;
    }

    public int getX11v() {
        return X11v;
    }

    public void setX11v(int X11v) {
        this.X11v = X11v;
    }

    public int getX45v() {
        return X45v;
    }

    public void setX45v(int X45v) {
        this.X45v = X45v;
    }

}
