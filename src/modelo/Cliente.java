package modelo;

public class Cliente {

    private int Id_cliente;
    private String Rut_Cliente;
    private String Nombre;
    private String Numero_Telefono;
    private String Direccion;
    private int Comuna_id;
    private String Rut_ClienteL;

    public String getRut_ClienteL() {
        return Rut_ClienteL;
    }

    public void setRut_ClienteL(String Rut_ClienteL) {
        this.Rut_ClienteL = Rut_ClienteL;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getRut_Cliente() {
        return Rut_Cliente;
    }

    public void setRut_Cliente(String Rut_Cliente) throws Exception {
        if (Rut_Cliente.length() <= 6 || Rut_Cliente.length() >= 10) {
            throw new Exception("El rut debe ser de 7 o 8 caractares");
        }
        this.Rut_Cliente = Rut_Cliente;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) throws Exception {
        /*ANTES*/
 /*if (Nombre.length() <= 0 ) {
            if (Nombre.length() < 10) {
                this.Nombre = Nombre;
                return;
            }
            throw new Exception("El nombre debe ser menor a 10 caracteres");
        }
        throw new Exception("El nombre no puede estar vacio");*/
 /*DESPUES*/
        if (Nombre.trim().length() == 0) {
            throw new Exception("El nombre no puede estar vacio");
        }
        if (Nombre.trim().length() > 30) {
            throw new Exception("El nombre debe ser menor a 30 caracteres");
        }
        this.Nombre = Nombre;
    }

    public String getNumero_Telefono() {
        return Numero_Telefono;
    }

    public void setNumero_Telefono(String Numero_Telefono) throws Exception {
        if (Numero_Telefono.trim().length() <= 8 || Numero_Telefono.trim().length() >= 12) {
            throw new Exception("El numero de telefono debe ser de 9 o 10 si es fijo");
        }
        this.Numero_Telefono = Numero_Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) throws Exception {
        if (Direccion.trim().length() == 0) {
            throw new Exception("La direccion no puede estar vacia");
        }
        this.Direccion = Direccion;
    }

    public int getComuna_id() {
        return Comuna_id;
    }

    public void setComuna_id(int Comuna_id){
        this.Comuna_id = Comuna_id;
    }
}
