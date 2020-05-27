package modelo;

import java.util.Date;

public class Camion {
    private int Id_camion;
    private String Patente;
    private String Modelo;
    private String Marca;
    private Date Revicion_Tecnica;
    private Date Proxima_Revision;


    public int getId_camion() {
        return Id_camion;
    }

    public void setId_camion(int Id_camion) {
        this.Id_camion = Id_camion;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Date getRevicion_Tecnica() {
        return Revicion_Tecnica;
    }

    public void setRevicion_Tecnica(Date Revicion_Tecnica) {
        this.Revicion_Tecnica = Revicion_Tecnica;
    }

    public Date getProxima_Revision() {
        return Proxima_Revision;
    }

    public void setProxima_Revision(Date Proxima_Revision) {
        this.Proxima_Revision = Proxima_Revision;
    }
    

    
}
