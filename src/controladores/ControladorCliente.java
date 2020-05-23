/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import consultas.ConsultasCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Cliente;
import vistas.Clientes;
import vistas.GestionClientes;

/**
 *
 * @author crist
 */
public class ControladorCliente implements ActionListener {
    private Cliente mod;
    private ConsultasCliente modC;
    private Clientes frm;
    private GestionClientes frms;

    public ControladorCliente(Cliente mod, ConsultasCliente modC, GestionClientes frms, Clientes frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frms = frms;
        this.frm.agregarCli.addActionListener(this);
        this.frms.buscarCli.addActionListener(this);
        this.frms.modificarCli.addActionListener(this);
    }

    public void iniciar() {
        frms.setTitle("Cliente");
        frms.setLocationRelativeTo(null);
        frm.setTitle("Cliente");
        frm.setLocationRelativeTo(null);
    }
    void limpiarG() {
        frms.xnombre.setText("");
        frms.xtelefono.setText("");
        frms.xdirecion.setText("");
        frms.xcomuna.setSelectedItem(1);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == frm.agregarCli) {
            mod.setRut_Cliente(frm.xrutC.getText());
            mod.setNombre(frm.xnombreC.getText());
            mod.setNumero_Telefono(frm.xnumeroC.getText());
            mod.setComuna_id(Integer.parseInt(frm.xcomunaC.getSelectedItem().toString()));
            mod.setDireccion(frm.xdireccionC.getText());

            if (modC.registrarCliente(mod)) {
                JOptionPane.showMessageDialog(null, "Nuevo Cliente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
        }
        if (ae.getSource() == frms.modificarCli) {
            mod.setNombre(frms.xnombre.getText());
            mod.setNumero_Telefono(frms.xtelefono.getText());
            mod.setComuna_id(Integer.parseInt(frms.xcomuna.getSelectedItem().toString()));
            mod.setDireccion(frms.xdirecion.getText());

            if (modC.modificarCliente(mod)) {
                JOptionPane.showMessageDialog(null, "Cliente Modificado");
                limpiarG();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiarG();
            }
        }
        if (ae.getSource() == frms.buscarCli) {
            mod.setRut_Cliente(frms.xbuscar1.getSelectedItem().toString());

            if (modC.buscarCliente(mod)) {
                frms.xnombre.setText(String.valueOf(mod.getNombre()));
                frms.xtelefono.setText(String.valueOf(mod.getNumero_Telefono()));
                frms.xdirecion.setText(String.valueOf(mod.getDireccion()));
                frms.xcomuna.setSelectedItem(String.valueOf(mod.getComuna_id()));
                JOptionPane.showMessageDialog(null, "Clente Encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        }
    }
}
