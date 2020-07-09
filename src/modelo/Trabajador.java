
package modelo;


public class Trabajador {

    private int id;
    private String Rut;
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private String Telefono;
    private String Estado;
    private String Puesto;
    private String RutL;
    private int Puesto2;

    public String getRutL() {
        return RutL;
    }

    public void setRutL(String RutL) {
        this.RutL = RutL;
    }
    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) throws Exception {
        if (Rut.length() <= 7 || Rut.length() >= 10) {
            throw new Exception("El rut debe ser de 8 o 9 caractares");
        }
        this.Rut = Rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) throws Exception {
        if (Nombre.trim().length() == 0) {
            throw new Exception("El nombre no puede estar vacio");
        }
        if (Nombre.trim().length() > 15) {
            throw new Exception("El nombre debe ser menor a 15 caracteres");
        }
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) throws Exception {
        if (Apellido.trim().length() == 0) {
            throw new Exception("El apellido no puede estar vacio");
        }
        if (Apellido.trim().length() > 15) {
            throw new Exception("El apellido debe ser menor a 15 caracteres");
        }
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) throws Exception {
        if(!(Sexo.contains("Masculino") || Sexo.contains("Femenino"))) {
            throw new Exception("Selecione un sexo porfavor");
        }
        this.Sexo = Sexo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) throws Exception {
        if (Telefono.trim().length() <= 8 || Telefono.trim().length() >= 12) {
            throw new Exception("El numero de telefono debe ser de 9 o 10 si es fijo");
        }
        this.Telefono = Telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) throws Exception {
        if(!(Estado.contains("Contratado") || Estado.contains("Despedido"))) {
            throw new Exception("Selecione un estado porfavor");
        }     
        this.Estado = Estado;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) throws Exception {
        if(!(Puesto.contains("Conductor") || Puesto.contains("Paleta"))) {
            throw new Exception("Selecione un puesto porfavor");
        }
        this.Puesto = Puesto;
    }

    public int getPuesto2() {
        return Puesto2;
    }

    public void setPuesto2(int Puesto2) {
        this.Puesto2 = Puesto2;
    }
    

}
