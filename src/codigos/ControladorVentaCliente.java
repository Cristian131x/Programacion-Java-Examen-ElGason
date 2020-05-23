/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import modelo.VentaClientes;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ControladorVentaCliente {

    private List<VentaClientes> listaVenta = new ArrayList<VentaClientes>();
    private int total45;
    private int total15;
    private int total11;
    private int total5;

    public ControladorVentaCliente() {
        this.setTotal45(0);
        this.setTotal15(0);
        this.setTotal11(0);
        this.setTotal5(0);

    }

    //metodo custom
    public boolean agregarGas(int id_cliente, String nombre, int tipo_id, int precio) {
        VentaClientes ventaTemporal = new VentaClientes();
        ventaTemporal.setId_cliente(id_cliente);
        ventaTemporal.setId_gas(precio);
        ventaTemporal.setId_tipo(precio);
        ventaTemporal.setNombre(nombre);
        ventaTemporal.setPrecio(precio);
        if (tipo_id == 45) {
            this.setTotal45(this.getTotal45() + precio);

        } else if (tipo_id == 15) {
            this.setTotal15(this.getTotal15() + precio);

        } else if (tipo_id == 11) {
            this.setTotal11(this.getTotal11() + precio);

        } else if (tipo_id == 5) {
            this.setTotal5(this.getTotal5() + precio);

        }
        return listaVenta.add(ventaTemporal);
        

    }
    public int sumarTotal(){
        return getTotal45() + getTotal11() + getTotal5() + getTotal5();
    }
    public List<VentaClientes> getListaVenta() {
        return listaVenta;
    }

    private void setListaVenta(List<VentaClientes> listaVenta) {
        this.listaVenta = listaVenta;
    }

    public int getTotal45() {
        return total45;
    }

    private void setTotal45(int total45) {
        this.total45 = total45;
    }

    public int getTotal15() {
        return total15;
    }

    private void setTotal15(int total15) {
        this.total15 = total15;
    }

    public int getTotal11() {
        return total11;
    }

    private void setTotal11(int total11) {
        this.total11 = total11;
    }

    public int getTotal5() {
        return total5;
    }

    private void setTotal5(int total5) {
        this.total5 = total5;
    }

}
