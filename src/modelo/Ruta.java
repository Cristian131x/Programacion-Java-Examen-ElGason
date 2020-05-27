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
public class Ruta {
    private int Id_ruta;
    private int Kilometraje;
    private String nombre_ruta;
    byte[] Foto;

    public int getId_ruta() {
        return Id_ruta;
    }

    public void setId_ruta(int Id_ruta) {
        this.Id_ruta = Id_ruta;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getNombre_ruta() {
        return nombre_ruta;
    }

    public void setNombre_ruta(String nombre_ruta) {
        this.nombre_ruta = nombre_ruta;
    }

    public byte[] getFoto() {
        return Foto;
    }

    public void setFoto(byte[] Foto) {
        this.Foto = Foto;
    }
    
    
    
    
}
