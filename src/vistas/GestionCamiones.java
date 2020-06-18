package vistas;

import consultas.ConsultasControlGestiones;
import consultas.ConsultasRutas;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Camion;
import modelo.ControlGestiones;
import modelo.Ruta;

public class GestionCamiones extends javax.swing.JInternalFrame {

    Ruta ru = new Ruta();
    ConsultasControlGestiones ccg = new ConsultasControlGestiones();
    ConsultasRutas cru = new ConsultasRutas();
    Camion cam = new Camion();
    ControlGestiones cg = new ControlGestiones();

    public GestionCamiones() {
        initComponents();
        listarR();
        listarCamiones();
        tablaRutas.getTableHeader().setReorderingAllowed(false);
        xlista.getTableHeader().setReorderingAllowed(false);
        tablaGRC.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGRC = new javax.swing.JTable();
        idCG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRutas = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        xfotito = new javax.swing.JLabel();
        idCam = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idRuta = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        xlista = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton6.setText("<- QUITAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("GESTION Y CONTROL CAMIONES");

        tablaGRC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaGRC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Ruta", "ID Camion"
            }
        ));
        (tablaGRC).setFocusable(false);
        (tablaGRC) = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaGRC.getTableHeader().setResizingAllowed(false);
        tablaGRC.getTableHeader().setReorderingAllowed(false);
        tablaGRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGRCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGRC);

        idCG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Camion Seleccionado");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("REFRESCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("REFRESCAR");

        tablaRutas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Kilometraje", "Nombre"
            }
        ));
        (tablaRutas).setFocusable(false);
        (tablaRutas) = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaRutas.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tablaRutas.setFocusable(false);
        tablaRutas.setMaximumSize(new java.awt.Dimension(2147483647, 64));
        tablaRutas.setMinimumSize(new java.awt.Dimension(60, 64));
        tablaRutas.setRowHeight(50);
        tablaRutas.getTableHeader().setResizingAllowed(false);
        tablaRutas.getTableHeader().setReorderingAllowed(false);
        tablaRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRutasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaRutas);

        jButton4.setText("REFRESCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        xfotito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        xfotito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        idCam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID RUTA SELECCIONADA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Camion Seleccionado");

        idRuta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton5.setText("INGRESAR ->");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        xlista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        xlista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patente", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        (xlista).setFocusable(false);
        (xlista) = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        xlista.setFocusable(false);
        xlista.setRowHeight(30);
        xlista.getTableHeader().setResizingAllowed(false);
        xlista.getTableHeader().setReorderingAllowed(false);
        xlista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xlistaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(xlista);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("LISTADO DE LOS CAMIONES");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CAMIONES EN RUTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 110, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xfotito, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idCam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idCG, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(68, 68, 68)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xfotito, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(idRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(idCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(idCG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(50, 50, 50)
                        .addComponent(jButton6)
                        .addGap(107, 107, 107))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        borrarGestionCamion();
    }//GEN-LAST:event_jButton6ActionPerformed
    void borrarGestionCamion() {
        int IdCam = Integer.parseInt(idCG.getText().toString());
        cg.setCamion_Id(IdCam);
        if (ccg.borrarRutaCamion(cg)) {
            estadoNoAsignado();
            listarCamiones();
            listarCamionesRu();
            idCG.setText("");

        }
    }

    void estadoNoAsignado() {
        int IdCam = Integer.parseInt(idCG.getText().toString());
        cam.setId_camion(IdCam);
        if (ccg.estadoNoAsignado(cam)) {

        }
    }

    void estadoEnRuta() {
        int Camion = Integer.parseInt(idCam.getText().toString());
        cam.setId_camion(Camion);
        if (ccg.estadoEnRuta(cam)) {
        }

    }

    void listarCamiones() {

        xlista.setModel(ccg.listarCamiones(cam));

    }
    private void tablaGRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGRCMouseClicked
        int seleccion = tablaGRC.rowAtPoint(evt.getPoint());
        idCG.setText(String.valueOf(tablaGRC.getValueAt(seleccion, 2)));
    }//GEN-LAST:event_tablaGRCMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listarCamiones();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaRutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRutasMouseClicked
        int seleccion = tablaRutas.rowAtPoint(evt.getPoint());
        idRuta.setText(String.valueOf(tablaRutas.getValueAt(seleccion, 0)));
        ru.setId_ruta(Integer.parseInt(idRuta.getText().toString()));
        listarCamionesRu();
        if (cru.visualizarRutas(ru)) {
            try {
                byte[] bi = ru.getFoto();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(314, 233, 0));
                xfotito.setIcon(imgi);
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_tablaRutasMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        listarR();
    }//GEN-LAST:event_jButton4ActionPerformed
    void listarR() {
        ru.setNombre_rutaL("");
        tablaRutas.setModel(ccg.listarRutas(ru));
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int Camion = Integer.parseInt(idCam.getText().toString());
        int Ruta = Integer.parseInt(idRuta.getText().toString());
        cg.setCamion_Id(Camion);
        cg.setId_Ruta(Ruta);
        if (ccg.ingresarRutaCamion(cg)) {
            estadoEnRuta();
            listarCamiones();
            listarCamionesRu();
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    void listarCamionesRu() {
        ru.setId_ruta(Integer.parseInt(idRuta.getText().toString()));
        tablaGRC.setModel(ccg.listarCamionesRu(ru));
    }
    private void xlistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xlistaMouseClicked
        int seleccion = xlista.rowAtPoint(evt.getPoint());
        idCam.setText(String.valueOf(xlista.getValueAt(seleccion, 0)));
    }//GEN-LAST:event_xlistaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idCG;
    private javax.swing.JTextField idCam;
    private javax.swing.JTextField idRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaGRC;
    private javax.swing.JTable tablaRutas;
    private javax.swing.JLabel xfotito;
    public static javax.swing.JTable xlista;
    // End of variables declaration//GEN-END:variables
}
