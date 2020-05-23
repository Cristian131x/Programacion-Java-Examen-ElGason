package controladores;

import consultas.ConsultasTrabajador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Trabajador;
import vistas.Trabajadores;

public class ControladorTrabajadores implements ActionListener {

    private Trabajador mod;
    private ConsultasTrabajador modC;
    private Trabajadores frm;

    public ControladorTrabajadores(Trabajador mod, ConsultasTrabajador modC, Trabajadores frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.agregarT.addActionListener(this);
        this.frm.buscarT.addActionListener(this);
        this.frm.modificarT.addActionListener(this);
    }

    public void iniciar() {
        frm.setTitle("Trabajador");
        frm.setLocationRelativeTo(null);
    }

    public void limpiar() {
        frm.xrut.setText(null);
        frm.xnombre.setText(null);
        frm.xapellido.setText(null);
        frm.xtelefono.setText(null);
        frm.xsexo.setSelectedIndex(0);
        frm.xestado.setSelectedIndex(0);
        frm.xpuesto.setSelectedIndex(0);
    }
    public void limpiar1() {
        frm.xrut1.setText(null);
        frm.xnombre1.setText(null);
        frm.xapellido1.setText(null);
        frm.xtelefono1.setText(null);
        frm.xsexo1.setSelectedIndex(0);
        frm.xestado1.setSelectedIndex(0);
        frm.xpuesto1.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == frm.agregarT) {
            mod.setRut(frm.xrut.getText());
            mod.setNombre(frm.xnombre.getText());
            mod.setApellido(frm.xapellido.getText());
            mod.setSexo(frm.xsexo.getSelectedItem().toString());
            mod.setTelefono(Integer.parseInt(frm.xrut.getText()));
            mod.setEstado(frm.xestado.getSelectedItem().toString());
            mod.setPuesto(frm.xpuesto.getSelectedItem().toString());

            if (modC.registrarTrabajador(mod)) {
                JOptionPane.showMessageDialog(null, "Nuevo Trabajador");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }
        if (ae.getSource() == frm.modificarT) {
            mod.setRut(frm.xrut1.getText());
            mod.setNombre(frm.xnombre1.getText());
            mod.setApellido(frm.xapellido1.getText());
            mod.setTelefono(Integer.parseInt(frm.xrut1.getText()));
            mod.setSexo(frm.xsexo1.getSelectedItem().toString());
            mod.setEstado(frm.xestado1.getSelectedItem().toString());
            mod.setPuesto(frm.xpuesto1.getSelectedItem().toString());

            if (modC.modificarTrabajador(mod)) {
                JOptionPane.showMessageDialog(null, "Trabajador Modificado");
                limpiar1();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar1();
            }
        }
        if (ae.getSource() == frm.buscarT) {
            mod.setRut(frm.xbuscar1.getSelectedItem().toString());

            if (modC.buscarTrabajador(mod)) {
                frm.xrut1.setText(String.valueOf(mod.getRut()));
                frm.xnombre1.setText(String.valueOf(mod.getNombre()));
                frm.xapellido1.setText(String.valueOf(mod.getApellido()));
                frm.xtelefono1.setText(String.valueOf(mod.getTelefono()));
                frm.xsexo1.setSelectedItem(String.valueOf(mod.getSexo()));
                frm.xestado1.setSelectedItem(String.valueOf(mod.getEstado()));
                frm.xpuesto1.setSelectedItem(String.valueOf(mod.getPuesto()));
                JOptionPane.showMessageDialog(null, "Trabajador Encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Trabajador no encontrado");
                limpiar();
            }
        }
    }
}
