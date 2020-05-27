
package modelo;


public class VentaClientes {
    private int id_cliente;
    private int id_gas;
    private String nombre;
    private int precio;
    private int id_tipo;
    
    public VentaClientes(){

    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_gas() {
        return id_gas;
    }

    public void setId_gas(int id_gas) {
        this.id_gas = id_gas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
    
}
