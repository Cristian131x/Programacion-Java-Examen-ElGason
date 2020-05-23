/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import consultas.ConsultasCamion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Camion;
import vistas.Camiones;

/**
 *
 * @author crist
 */
public class ControladorCamion implements ActionListener {
    private Camion mod;
    private ConsultasCamion modC;
    private Camiones frm;

    public ControladorCamion(Camion mod, ConsultasCamion modC, Camiones frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.agregarC.addActionListener(this);
        this.frm.xbuscarC.addActionListener(this);
        this.frm.modificarC.addActionListener(this);
    }

    public void iniciar() {
        frm.setTitle("Camion");
        frm.setLocationRelativeTo(null);
    }


    public void limpiarA() {
        frm.xpatente.setText("");
        frm.xmodelo.setText("");
        frm.xmarca.setText("");
        frm.xrevision.setDateFormatString("");
        frm.xprevision.setDateFormatString("");
    }

    public void limpiarU() {
        frm.xpatente1.setText("");
        frm.xmodelo1.setText("");
        frm.xmarca1.setText("");
        frm.xrevision1.setDateFormatString("");
        frm.xprevision1.setDateFormatString("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == frm.agregarC) {
            mod.setPatente(frm.xpatente.getText());
            mod.setModelo(frm.xmodelo.getText());
            mod.setMarca(frm.xmarca.getText());
            mod.setRevicion_Tecnica(frm.xrevision.getDate());
            mod.setProxima_Revision(frm.xprevision.getDate());

            if (modC.registrarCamion(mod)) {
                JOptionPane.showMessageDialog(null, "Nuevo Camionr");
                limpiarA();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiarA();
            }
        }
        if (ae.getSource() == frm.modificarC) {
            mod.setPatente(frm.xpatente.getText());
            mod.setModelo(frm.xmodelo.getText());
            mod.setMarca(frm.xmarca.getText());
            mod.setRevicion_Tecnica(frm.xrevision.getDate());
            mod.setProxima_Revision(frm.xprevision.getDate());

            if (modC.modificarCamion(mod)) {
                JOptionPane.showMessageDialog(null, "Camion Modificado");
                limpiarU();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiarU();
            }
        }
        if (ae.getSource() == frm.xbuscarC) {
            mod.setPatente(frm.xbuscar1.getSelectedItem().toString());

            if (modC.buscarCamion(mod)) {
                frm.xpatente1.setText(String.valueOf(mod.getPatente()));
                frm.xmodelo1.setText(String.valueOf(mod.getModelo()));
                frm.xmarca1.setText(String.valueOf(mod.getMarca()));
                frm.xrevision1.setDateFormatString(String.valueOf(mod.getRevicion_Tecnica()));
                frm.xprevision1.setDateFormatString(String.valueOf(mod.getProxima_Revision()));
                JOptionPane.showMessageDialog(null, "Camion Encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Trabajador no encontrado");
                limpiarA();
            }
        }
    }
    
}
