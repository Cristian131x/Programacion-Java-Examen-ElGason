
package vistas;

import combos.TrabajadorCombo_1;
import conexion.Conexion;
import consultas.ConsultasTrabajador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Trabajador;

public class Trabajadores extends javax.swing.JInternalFrame {

    Trabajador trab = new Trabajador();
    ConsultasTrabajador ctrab = new ConsultasTrabajador();
    Conexion cone = new Conexion();
    TrabajadorCombo_1 trab1 = new TrabajadorCombo_1();
    
    public Trabajadores() {
        initComponents();
        actualizarCombo();
        listarT();
    }


    public void limpiar() {
        xrut.setText(null);
        xnombre.setText(null);
        xapellido.setText(null);
        xtelefono.setText(null);
        xsexo.setSelectedIndex(0);
        xestado.setSelectedIndex(0);
        xpuesto.setSelectedIndex(0);
    }

    public void limpiar1() {
        xnombre1.setText(null);
        xapellido1.setText(null);
        xtelefono1.setText(null);
        xsexo1.setSelectedIndex(0);
        xestado1.setSelectedIndex(0);
        xpuesto1.setSelectedIndex(0);
    }

    void actualizarCombo() {
        cone.getConexion();
        xbuscar1.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = trab1.llenar_combox(cone);
        for (int i = 0; i < lista.size(); i++) {
            xbuscar1.addItem(lista.get(i));
        }
    }

    PreparedStatement ps;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        xrut = new javax.swing.JTextField();
        xnombre = new javax.swing.JTextField();
        xapellido = new javax.swing.JTextField();
        xtelefono = new javax.swing.JTextField();
        xsexo = new javax.swing.JComboBox<>();
        xpuesto = new javax.swing.JComboBox<>();
        agregarT = new javax.swing.JButton();
        xestado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaT = new javax.swing.JTable();
        xbuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaModificar = new javax.swing.JTable();
        xbuscar1 = new javax.swing.JComboBox<>();
        buscarT = new javax.swing.JButton();
        modificarT = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        xnombre1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        xapellido1 = new javax.swing.JTextField();
        xsexo1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        xtelefono1 = new javax.swing.JTextField();
        xestado1 = new javax.swing.JComboBox<>();
        xpuesto1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("TRABAJADORES");

        jPanel1.setForeground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Rut:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Contacto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Sexo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Puesto:");

        xrut.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xrutActionPerformed(evt);
            }
        });

        xnombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        xapellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        xtelefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtelefonoActionPerformed(evt);
            }
        });

        xsexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Masculino", "Femenino" }));

        xpuesto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Operador", "Conductor", "Paleta" }));

        agregarT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarT.setText("Aceptar");
        agregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTActionPerformed(evt);
            }
        });

        xestado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratado" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Estado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(739, Short.MAX_VALUE)
                .addComponent(agregarT)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xnombre)
                            .addComponent(xrut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xestado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(xrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(xnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(xapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(xtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(xsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(agregarT)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registrar", jPanel1);

        tablaT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tablaT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Rut", "Nombre", "Apellido", "Contacto", "Sexo", "Estado", "Puesto"
            }
        ));
        tablaT.setRowHeight(30);
        jScrollPane2.setViewportView(tablaT);

        xbuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("RUT:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xbuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        tablaModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tablaModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Rut", "Nombre", "Apellido", "Contacto", "Sexo", "Estado", "Puesto"
            }
        ));
        tablaModificar.setColumnSelectionAllowed(true);
        tablaModificar.setEnabled(false);
        tablaModificar.setRowHeight(30);
        jScrollPane3.setViewportView(tablaModificar);
        tablaModificar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        xbuscar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xbuscar1ActionPerformed(evt);
            }
        });

        buscarT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarT.setText("BUSCAR");
        buscarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTActionPerformed(evt);
            }
        });

        modificarT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modificarT.setText("ACEPTAR");
        modificarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Nombre:");

        xnombre1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Apellido:");

        xapellido1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xapellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xapellido1ActionPerformed(evt);
            }
        });

        xsexo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xsexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Masculino", "Femenino" }));
        xsexo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xsexo1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Sexo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Contacto:");

        xtelefono1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        xestado1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xestado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Contratado", "Despedido" }));

        xpuesto1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xpuesto1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Conductor", "Paleta" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Estado:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Puesto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(123, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(xestado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(xnombre1)
                                        .addComponent(xtelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(xpuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xsexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(buscarT)
                                .addGap(39, 39, 39)))
                        .addGap(112, 112, 112))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modificarT, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(xbuscar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarT))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(xapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(xtelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(xsexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xestado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xpuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(modificarT)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xrutActionPerformed

    private void xtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtelefonoActionPerformed

    private void agregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTActionPerformed
        registrarTrabajador();
        if (xpuesto.getSelectedItem() == "Paleta") {
            registrarPaleta();
        }
    }//GEN-LAST:event_agregarTActionPerformed
    void registrarTrabajador() {
        try {
            String Rut = xrut.getText();
            String Nombre = xnombre.getText();
            String Apellido = xapellido.getText();
            String Contacto = xtelefono.getText();
            String Sexo = xsexo.getSelectedItem().toString();
            String Estado = xestado.getSelectedItem().toString();
            String Puesto = xpuesto.getSelectedItem().toString();
            trab.setRut(Rut);
            trab.setNombre(Nombre);
            trab.setApellido(Apellido);
            trab.setTelefono(Contacto);
            trab.setSexo(Sexo);
            trab.setEstado(Estado);
            trab.setPuesto(Puesto);
            if (ctrab.registrarTrabajador(trab)) {
                JOptionPane.showMessageDialog(null, "Nuevo Trabajador");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

    void registrarPaleta() {
        try {
            int IdPa = Integer.parseInt(ctrab.IdEmpleado());
            String Rut = xrut.getText();
            String Nombre = xnombre.getText();
            trab.setId(IdPa);
            trab.setRut(Rut);
            trab.setNombre(Nombre);
            if (ctrab.registrarPaleta(trab)) {
                limpiar();
                actualizarCombo();
            }
        } catch (Exception e) {

        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listarT();
    }//GEN-LAST:event_jButton2ActionPerformed
    void listarT() {
        trab.setRutL(xbuscar.getText());
        tablaT.setModel(ctrab.listar(trab));
    }
    private void xapellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xapellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xapellido1ActionPerformed

    private void xsexo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xsexo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xsexo1ActionPerformed

    private void buscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTActionPerformed
        buscarTrabajador();
        listarU();
    }//GEN-LAST:event_buscarTActionPerformed
     void listarU() {
        try {
            trab.setRut(xbuscar1.getSelectedItem().toString());
            tablaModificar.setModel(ctrab.listarU(trab));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

    void buscarTrabajador() {
        try {
            trab.setRut(xbuscar1.getSelectedItem().toString());
            if (ctrab.buscarTrabajador(trab)) {
                xnombre1.setText(trab.getNombre());
                xapellido1.setText(trab.getApellido());
                xtelefono1.setText(trab.getTelefono());
                xsexo1.setSelectedItem("" + trab.getSexo());
                xestado1.setSelectedItem("" + trab.getEstado());
                xpuesto1.setSelectedItem("" + trab.getPuesto());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    private void modificarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTActionPerformed
        listarU();
        modificarTrabajador();
    }//GEN-LAST:event_modificarTActionPerformed
    void modificarTrabajador() {
        try {
            String Rut = xbuscar1.getSelectedItem().toString();
            String Nombre = xnombre1.getText();
            String Apellido = xapellido1.getText();
            String Contacto = xtelefono1.getText();
            String Sexo = xsexo1.getSelectedItem().toString();
            String Estado = xestado1.getSelectedItem().toString();
            String Puesto = xpuesto1.getSelectedItem().toString();
            trab.setRut(Rut);
            trab.setNombre(Nombre);
            trab.setApellido(Apellido);
            trab.setTelefono(Contacto);
            trab.setSexo(Sexo);
            trab.setEstado(Estado);
            trab.setPuesto(Puesto);
            if (ctrab.registrarTrabajador(trab)) {
                JOptionPane.showMessageDialog(null, "Trabajador Modificado con Exito");
                limpiar1();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    private void xbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xbuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregarT;
    public javax.swing.JButton buscarT;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton modificarT;
    public static javax.swing.JTable tablaModificar;
    public static javax.swing.JTable tablaT;
    public static javax.swing.JTextField xapellido;
    public static javax.swing.JTextField xapellido1;
    public static javax.swing.JTextField xbuscar;
    public static javax.swing.JComboBox<String> xbuscar1;
    public static javax.swing.JComboBox<String> xestado;
    public static javax.swing.JComboBox<String> xestado1;
    public static javax.swing.JTextField xnombre;
    public static javax.swing.JTextField xnombre1;
    public static javax.swing.JComboBox<String> xpuesto;
    public static javax.swing.JComboBox<String> xpuesto1;
    public static javax.swing.JTextField xrut;
    public static javax.swing.JComboBox<String> xsexo;
    public static javax.swing.JComboBox<String> xsexo1;
    public static javax.swing.JTextField xtelefono;
    public static javax.swing.JTextField xtelefono1;
    // End of variables declaration//GEN-END:variables
}
