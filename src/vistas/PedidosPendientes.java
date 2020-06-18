package vistas;

import consultas.ConsultasPedidosPendientes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.xml.transform.Source;
import modelo.DetalleCompra;
import modelo.PedidoPendiente;
import modelo.StockGas;

public class PedidosPendientes extends javax.swing.JFrame {

    ConsultasPedidosPendientes cped = new ConsultasPedidosPendientes();
    PedidoPendiente ped = new PedidoPendiente();
    StockGas stk = new StockGas();
    DetalleCompra de = new DetalleCompra();

    public PedidosPendientes() {
        initComponents();
        listarPedidos();
    }

    void limpiarDetalle() {
        xdetalles.setModel(new DefaultTableModel());
        c5.setText("0");
        c15.setText("0");
        c11.setText("0");
        c45.setText("0");
        idbo.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        xlistar = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        xdetalles = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        c11 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idbo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        c5 = new javax.swing.JTextField();
        c15 = new javax.swing.JTextField();
        c45 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        xlistar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        (xlistar).setFocusable(false);
        (xlistar) = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        xlistar.setEnabled(false);
        xlistar.setFocusable(false);
        xlistar.setRowHeight(60);
        xlistar.getTableHeader().setResizingAllowed(false);
        xlistar.getTableHeader().setReorderingAllowed(false);
        xlistar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xlistarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(xlistar);

        jButton2.setText("REFRESCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        xdetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        xdetalles.setRowHeight(32);
        jScrollPane2.setViewportView(xdetalles);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("LISTA DE PEDIDOS PENDIENTES");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c11.setEditable(false);

        jLabel3.setText("CANTIDAD 15");

        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("CANTIDAD 11");

        jLabel5.setText("CANTIDAD 5");

        idbo.setEditable(false);

        jLabel1.setText("ID BOLETA");

        jButton1.setText("CONFIRMAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("CANTIDAD 45");

        c5.setEditable(false);

        c15.setEditable(false);

        c45.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(c5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idbo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(idbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(c45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setText("CERRAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(138, 138, 138))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(50, 50, 50)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listarPedidos();
    }//GEN-LAST:event_jButton2ActionPerformed
    void listarPedidos() {
        ped.setEstado("PROCESO");
        xlistar.setModel(cped.listarPedidos(ped));
    }
    private void xlistarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xlistarMouseClicked
        int seleccion = xlistar.rowAtPoint(evt.getPoint());
        ped.setId(Integer.parseInt(String.valueOf(xlistar.getValueAt(seleccion, 0))));
        idbo.setText(String.valueOf(xlistar.getValueAt(seleccion, 0)));
        xdetalles.setModel(cped.listarDetalles(ped));
        /*CANTIDADES DE CADA TIPO DE GAS*/
        de.setBoleta_numero(Integer.parseInt(idbo.getText().toString()));;
        if (cped.buscarCantidad11(de)) {
            c11.setText("" + de.getCantidad());
        }
        if (cped.buscarCantidad5(de)) {
            c5.setText("" + de.getCantidad());
        }
        if (cped.buscarCantidad15(de)) {
            c15.setText("" + de.getCantidad());
        }
        if (cped.buscarCantidad45(de)) {
            c45.setText("" + de.getCantidad());
        }
    }//GEN-LAST:event_xlistarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gasVendido();
        gasVendidoC();
        agregarVacio5();
        agregarVacio11();
        agregarVacio15();
        agregarVacio45();
        actualizarBoleta();
    }//GEN-LAST:event_jButton1ActionPerformed
    void gasVendidoC() {
        for (int i = 0; i < xdetalles.getRowCount(); i++) {
            String estado = "VENDIDO";
            int IdG = Integer.parseInt(xdetalles.getValueAt(i, 3).toString());
            ped.setEstado(estado);
            ped.setGas_Id(IdG);
            cped.gasVendidoC(ped);
        }
    }

    void agregarVacio45() {
        int Cantidad = (Integer.parseInt(c45.getText()));
        ped.setCantidadV(Cantidad);
        if (cped.agregarVacio45(ped)) {
            actualizarStockVacio45();
        }
    }

    void agregarVacio15() {
        int Cantidad = (Integer.parseInt(c15.getText()));
        ped.setCantidadV(Cantidad);
        if (cped.agregarVacio15(ped)) {
            actualizarStockVacio15();
        }
    }

    void agregarVacio11() {
        int Cantidad = (Integer.parseInt(c11.getText()));
        ped.setCantidadV(Cantidad);
        if (cped.agregarVacio11(ped)) {
            actualizarStockVacio11();
        }
    }

    void agregarVacio5() {
        int Cantidad = (Integer.parseInt(c5.getText()));
        ped.setCantidadV(Cantidad);
        if (cped.agregarVacio5(ped)) {
            actualizarStockVacio5();
        }
    }

    void buscarCantidad() {
        de.setBoleta_numero(Integer.parseInt(idbo.getText().toString()));;
        if (cped.buscarCantidad11(de)) {
            c11.setText("" + de.getCantidad());
        }
    }

    void gasVendido() {
        for (int i = 0; i < xdetalles.getRowCount(); i++) {
            String estado = "VENDIDO";
            int IdG = Integer.parseInt(xdetalles.getValueAt(i, 3).toString());
            ped.setEstado(estado);
            ped.setGas_Id(IdG);
            cped.gasVendido(ped);
        }
    }

    void actualizarBoleta() {
        String estado = "VentaConfirmada";
        ped.setId(Integer.parseInt(idbo.getText().toString()));
        ped.setEstado(estado);
        if (cped.actualizarBoleta(ped)) {
            listarPedidos();
            limpiarDetalle();
            JOptionPane.showMessageDialog(null, "PEDIDO CONFIRMADO CON EXITO");
        }
    }

    void actualizarStockVacio5() {
        try {
            int Cantidad = Integer.parseInt(c5.getText().toString());
            stk.setCantidad(Cantidad);
            if (cped.actualizarStockVacio5(stk)) {
            }
        } catch (Exception E) {
        }
    }

    void actualizarStockVacio11() {
        try {
            int Cantidad = Integer.parseInt(c11.getText().toString());
            stk.setCantidad(Cantidad);
            if (cped.actualizarStockVacio11(stk)) {
            }
        } catch (Exception E) {
        }
    }

    void actualizarStockVacio15() {
        try {
            int Cantidad = Integer.parseInt(c15.getText().toString());
            stk.setCantidad(Cantidad);
            if (cped.actualizarStockVacio15(stk)) {
            }
        } catch (Exception E) {
        }
    }

    void actualizarStockVacio45() {
        try {
            int Cantidad = Integer.parseInt(c45.getText().toString());
            stk.setCantidad(Cantidad);
            if (cped.actualizarStockVacio45(stk)) {
            }
        } catch (Exception E) {
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        borrarDetalle();
        gasNoVendido();
        mas5();
        mas11();
        mas15();
        mas45();
        actualizarBoletaCancelada();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    void mas5() {
        try {
            int Cantidad = Integer.parseInt(c5.getText().toString());
            stk.setCantidad(Cantidad);
            if (cped.mas5(stk)) {
            }
        } catch (Exception E) {
        }
    }

    void mas11() {
        try {
            int Cantidad = Integer.parseInt(c11.getText().toString());
            stk.setCantidad(Cantidad);
            if (cped.mas11(stk)) {
            }
        } catch (Exception E) {
        }
    }

    void mas15() {
        try {
            int Cantidad = Integer.parseInt(c15.getText().toString());
            stk.setCantidad(Cantidad);
            if (cped.mas15(stk)) {
            }
        } catch (Exception E) {
        }
    }

    void mas45() {
        try {
            int Cantidad = Integer.parseInt(c45.getText().toString());
            stk.setCantidad(Cantidad);
            if (cped.mas45(stk)) {
            }
        } catch (Exception E) {
        }
    }

    void borrarDetalle() {
        de.setBoleta_numero(Integer.parseInt(idbo.getText().toString()));
        if (cped.borrarDetalle(de)) {
        }
    }

    void gasNoVendido() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) xdetalles.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);

        for (int i = 0; i < xdetalles.getRowCount(); i++) {
            String Lugar = xdetalles.getValueAt(i, 5).toString();
            if ("Nulo".equals(Lugar)) {
                String estado = "Bodega";
                int IdG = Integer.parseInt(xdetalles.getValueAt(i, 3).toString());
                ped.setEstado(estado);
                ped.setGas_Id(IdG);
                cped.gasVendido(ped);
                System.out.println("Bodega");
            } else {
                String estado = "Camion";
                int IdG = Integer.parseInt(xdetalles.getValueAt(i, 3).toString());
                ped.setEstado(estado);
                ped.setGas_Id(IdG);
                cped.gasVendido(ped);
                System.out.println("Camion");
            }

        }
    }

    void actualizarBoletaCancelada() {
        String estado = "Cancelada";
        ped.setId(Integer.parseInt(idbo.getText().toString()));
        ped.setEstado(estado);
        cped.actualizarBoleta(ped);
        limpiarDetalle();
        listarPedidos();
        JOptionPane.showMessageDialog(null, "PEDIDO CANCELADO CON EXITO");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedidosPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosPendientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c15;
    private javax.swing.JTextField c45;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField idbo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable xdetalles;
    private javax.swing.JTable xlistar;
    // End of variables declaration//GEN-END:variables
}
