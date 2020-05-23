/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author crist
 */
public class Cliente {
    private int Id_cliente;
    private String Rut_Cliente;
    private String Nombre;
    private String Numero_Telefono;
    private String Direccion;
    private int Comuna_id;

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getRut_Cliente() {
        return Rut_Cliente;
    }

    public void setRut_Cliente(String Rut_Cliente) {
        this.Rut_Cliente = Rut_Cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumero_Telefono() {
        return Numero_Telefono;
    }

    public void setNumero_Telefono(String Numero_Telefono) {
        this.Numero_Telefono = Numero_Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getComuna_id() {
        return Comuna_id;
    }

    public void setComuna_id(int Comuna_id) {
        this.Comuna_id = Comuna_id;
    }
    
    
    
}
