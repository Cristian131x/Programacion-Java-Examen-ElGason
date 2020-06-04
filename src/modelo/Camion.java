package modelo;

import java.util.Date;

public class Camion {
    private int Id_camion;
    private String Patente;
    private String Modelo;
    private String Marca;
    private Date Revicion_Tecnica;
    private Date Proxima_Revision;
    private String PatenteL;

    public String getPatenteL() {
        return PatenteL;
    }

    public void setPatenteL(String PatenteL) {
        this.PatenteL = PatenteL;
    }
    public int getId_camion() {
        return Id_camion;
    }

    public void setId_camion(int Id_camion) {
        this.Id_camion = Id_camion;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) throws Exception {
        if (Patente.trim().length() <= 5 || Patente.trim().length() >= 7) {
            throw new Exception("Ingrese una patente de 6 caracteres");         
        }
        this.Patente = Patente;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) throws Exception {
        if (Modelo.trim().length() == 0) {
            throw new Exception("El modelo no puede estar vacio");         
        }
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) throws Exception {
        if (Marca.trim().length() == 0) {
            throw new Exception("La marca no puede estar vacia");         
        }
        this.Marca = Marca;
    }

    public Date getRevicion_Tecnica() {
        return Revicion_Tecnica;
    }

    public void setRevicion_Tecnica(Date Revicion_Tecnica) throws Exception {
        if (Revicion_Tecnica == null) {
            throw new Exception("Ingrese una fecha de la revision tecnica");     
        }
        this.Revicion_Tecnica = Revicion_Tecnica;
    }

    public Date getProxima_Revision() {
        return Proxima_Revision;
    }

    public void setProxima_Revision(Date Proxima_Revision) throws Exception {
        if (Proxima_Revision == null) {
            throw new Exception("Ingrese la fecha de la proxima revicion tecnica porfavor");     
        }
        this.Proxima_Revision = Proxima_Revision;
    }
    

    
}
