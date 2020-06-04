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
    private String ruta;
    private String nombre_rutaL;

    public int getId_ruta() {
        return Id_ruta;
    }

    public void setId_ruta(int Id_ruta) {
        this.Id_ruta = Id_ruta;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) throws Exception {
        if (String.valueOf(Kilometraje).trim().length() == 0) {
            throw new Exception("Ingrese un Kilometraje Porfavor");     
        }
        if (Kilometraje <= 0) {
            throw new Exception("El Kilometraje debe ser mayor a 0");
        }        
        this.Kilometraje = Kilometraje;
    }

    public String getNombre_ruta() {
        return nombre_ruta;
    }

    public void setNombre_ruta(String nombre_ruta) throws Exception {
        if (nombre_ruta.trim().length() == 0) {
            throw new Exception("El nombre no puede estar vacio");
        }
        if (nombre_ruta.isEmpty()) {
            throw new Exception("El nombre no puede estar vacio");
            
        }
        this.nombre_ruta = nombre_ruta;
    }

    public byte[] getFoto() {
        return Foto;
    }

    public void setFoto(byte[] Foto) {
        this.Foto = Foto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) throws Exception {
        if (ruta.trim().length() == 0) {
            throw new Exception("La ruta no puede estar vacia");
        }
        this.ruta = ruta;
    }

    public String getNombre_rutaL() {
        return nombre_rutaL;
    }

    public void setNombre_rutaL(String nombre_rutaL) {
        this.nombre_rutaL = nombre_rutaL;
    }
    

}
