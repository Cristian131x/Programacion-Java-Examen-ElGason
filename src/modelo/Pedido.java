
package modelo;


public class Pedido {
    public int Id_Pedido;
    public String Estado;
    public int Boleta_numero;

    public int getId_Pedido() {
        return Id_Pedido;
    }

    public void setId_Pedido(int Id_Pedido) {
        this.Id_Pedido = Id_Pedido;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getBoleta_numero() {
        return Boleta_numero;
    }

    public void setBoleta_numero(int Boleta_numero) {
        this.Boleta_numero = Boleta_numero;
    }
    
    
}
