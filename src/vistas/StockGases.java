package vistas;

import consultas.ConsultasStockGas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.StockGas;

public class StockGases extends javax.swing.JInternalFrame {

    StockGas stk = new StockGas();
    ConsultasStockGas cstk = new ConsultasStockGas();

    public StockGases() {
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        verStock5();
        verStock11();
        verStock15();
        verStock45();
        verStock5v();
        verStock11v();
        verStock15v();
        verStock45v();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        x5v = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        x11v = new javax.swing.JTextField();
        x15v = new javax.swing.JTextField();
        x45v = new javax.swing.JTextField();
        x11 = new javax.swing.JTextField();
        x15 = new javax.swing.JTextField();
        x45 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        x5 = new javax.swing.JTextField();
        buscarG = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        xlistar = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        xbuscar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        xprecio1 = new javax.swing.JTextField();
        xtipo1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        xprecio = new javax.swing.JTextField();
        xtipo = new javax.swing.JComboBox<>();
        agregarG = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        xnombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        xcantidad = new javax.swing.JSpinner();
        vacios = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        xtipo2 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        xcantidad2 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        setPreferredSize(new java.awt.Dimension(938, 744));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("STOCK GAS");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTabbedPane1.setInheritsPopupMenu(true);
        jTabbedPane1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTabbedPane1CaretPositionChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 153, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("5KG Vacio");

        x5v.setEditable(false);
        x5v.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("11KG Vacio");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("15KG Vacio");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("45KG Vacio");

        x11v.setEditable(false);
        x11v.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        x15v.setEditable(false);
        x15v.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        x45v.setEditable(false);
        x45v.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        x45v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x45vActionPerformed(evt);
            }
        });

        x11.setEditable(false);
        x11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x11ActionPerformed(evt);
            }
        });

        x15.setEditable(false);
        x15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x15ActionPerformed(evt);
            }
        });

        x45.setEditable(false);
        x45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("5KG");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("11KG");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("15KG");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("45KG");

        x5.setEditable(false);
        x5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x5ActionPerformed(evt);
            }
        });

        buscarG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarG.setText("REFRESCAR");
        buscarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(770, Short.MAX_VALUE)
                .addComponent(buscarG)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(x45, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(x15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(x11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x15v, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x45v, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(x5v, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(x11v, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(x5v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(x11v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(x11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(x15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(x15v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(x45v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(buscarG)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Cantidad", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        xlistar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xlistar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Tipo_ID", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        (xlistar).setFocusable(false);
        (xlistar) = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        xlistar.setEnabled(false);
        xlistar.setMinimumSize(new java.awt.Dimension(75, 16));
        xlistar.setRowHeight(30);
        xlistar.getTableHeader().setResizingAllowed(false);
        xlistar.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(xlistar);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Nombre");

        xbuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(xbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(xbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Precio");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel14.setText("Tipo");

        xprecio1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        xprecio1.setText("0");

        xtipo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        xtipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "5", "11", "15", "45" }));
        xtipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtipo1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton3.setText("ACEPTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xtipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xtipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(xprecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(jButton3)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ModificarPrecios", jPanel5);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Tipo");

        xprecio.setEditable(false);
        xprecio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        xtipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "5", "11", "15", "45" }));
        xtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtipoActionPerformed(evt);
            }
        });

        agregarG.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        agregarG.setText("ACEPTAR");
        agregarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarGActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Nombre");

        xnombre.setEditable(false);
        xnombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Cantidad");

        xcantidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        vacios.setEditable(false);
        vacios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Vacios Totales");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(xtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarG)
                            .addComponent(xcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vacios, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(xtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(xprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(agregarG)
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("AgregarNuevos", jPanel4);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Tipo");

        xtipo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xtipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "5", "11", "15", "45" }));
        xtipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtipo2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Cantidad");

        xcantidad2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xtipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xcantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jButton1)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(xtipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(xcantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jButton1)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AgregarVacios", jPanel3);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GAS_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void x45vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x45vActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x45vActionPerformed

    private void x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x11ActionPerformed

    private void x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x15ActionPerformed

    private void x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x5ActionPerformed

    private void buscarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarGActionPerformed
        verStock5();
        verStock11();
        verStock15();
        verStock45();
        verStock5v();
        verStock11v();
        verStock15v();
        verStock45v();
    }//GEN-LAST:event_buscarGActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void xtipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtipo1ActionPerformed
        buscarGasU();
    }//GEN-LAST:event_xtipo1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modificarPrecioG();
        modificarPrecioGases();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void xtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtipoActionPerformed
        if (xtipo.getSelectedItem().toString() == "5") {
            if (cstk.verStock5v(stk)) {
                vacios.setText("" + stk.getX5v());
            }
        }
        if (xtipo.getSelectedItem().toString() == "11") {
            if (cstk.verStock11v(stk)) {
                vacios.setText("" + stk.getX11v());
            }
        }
        if (xtipo.getSelectedItem().toString() == "15") {
            if (cstk.verStock15v(stk)) {
                vacios.setText("" + stk.getX15v());
            }
        }
        if (xtipo.getSelectedItem().toString() == "45") {
            if (cstk.verStock45v(stk)) {
                vacios.setText("" + stk.getX45v());
            }
        }
        buscarGas();
    }//GEN-LAST:event_xtipoActionPerformed
    void buscarGas() {
        try {
            stk.setTipo_id(Integer.parseInt((xtipo.getSelectedItem().toString())));
            if (cstk.buscarGas(stk)) {
                xprecio.setText("" + stk.getPrecio());
                xnombre.setText(stk.getNombre());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void agregarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarGActionPerformed
        if (Integer.parseInt(vacios.getText()) < Integer.parseInt(xcantidad.getValue().toString())) {
            JOptionPane.showMessageDialog(null, "NO PUEDES EXCEDER LA CANTIDAD DE GASES VACIOS");
        } else {
            try {
                restarVacios();
                agregarGas();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_agregarGActionPerformed

    private void jTabbedPane1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTabbedPane1CaretPositionChanged

    }//GEN-LAST:event_jTabbedPane1CaretPositionChanged

    private void xtipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtipo2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            masVacios();
        } catch (Exception ex) {
            Logger.getLogger(StockGases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    void masVacios() throws Exception {
        if (xtipo2.getSelectedItem().toString() == "5") {
            int IDg = 50;
            stk.setTipo_id(IDg);
            int Cantidad = (Integer.parseInt(xcantidad2.getValue().toString()));
            stk.setCantidad(Cantidad);
            cstk.actualizarStockGas(stk);
            JOptionPane.showMessageDialog(null, "Nuevos gases vacios registrados");
            limpiarAV();
        }
        if (xtipo2.getSelectedItem().toString() == "11") {
            int IDg = 110;
            stk.setTipo_id(IDg);
            int Cantidad = (Integer.parseInt(xcantidad2.getValue().toString()));
            stk.setCantidad(Cantidad);
            cstk.actualizarStockGas(stk);
            JOptionPane.showMessageDialog(null, "Nuevos gases vacios registrados");
            limpiarAV();
        }
        if (xtipo2.getSelectedItem().toString() == "15") {
            int IDg = 150;
            stk.setTipo_id(IDg);
            int Cantidad = (Integer.parseInt(xcantidad2.getValue().toString()));
            stk.setCantidad(Cantidad);
            cstk.actualizarStockGas(stk);
            JOptionPane.showMessageDialog(null, "Nuevos gases vacios registrados");
            limpiarAV();
        }
        if (xtipo2.getSelectedItem().toString() == "45") {
            int IDg = 450;
            stk.setTipo_id(IDg);
            int Cantidad = (Integer.parseInt(xcantidad2.getValue().toString()));
            stk.setCantidad(Cantidad);
            cstk.actualizarStockGas(stk);
            JOptionPane.showMessageDialog(null, "Nuevos gases vacios registrados");
            limpiarAV();
        }
    }
    void limpiarAV(){
        xtipo2.setSelectedIndex(0);
        xcantidad2.setValue(0);
    }
    void restarVacios() throws Exception {
        if (xtipo.getSelectedItem().toString() == "5") {
            int IDg = 50;
            stk.setTipo_id(IDg);
            int Cantidad = (Integer.parseInt(xcantidad.getValue().toString()));
            stk.setCantidad(Cantidad);
            cstk.actualizarStockGasVentaVacios(stk);
        }
        if (xtipo.getSelectedItem().toString() == "11") {
            int IDg = 110;
            stk.setTipo_id(IDg);
            int Cantidad = (Integer.parseInt(xcantidad.getValue().toString()));
            stk.setCantidad(Cantidad);
            cstk.actualizarStockGasVentaVacios(stk);
        }
        if (xtipo.getSelectedItem().toString() == "15") {
            int IDg = 150;
            stk.setTipo_id(IDg);
            int Cantidad = (Integer.parseInt(xcantidad.getValue().toString()));
            stk.setCantidad(Cantidad);
            cstk.actualizarStockGasVentaVacios(stk);
        }
        if (xtipo.getSelectedItem().toString() == "45") {
            int IDg = 450;
            stk.setTipo_id(IDg);
            int Cantidad = (Integer.parseInt(xcantidad.getValue().toString()));
            stk.setCantidad(Cantidad);
            cstk.actualizarStockGasVentaVacios(stk);
            
        }
    }

    void modificarPrecioG() {
        try {
            int TipoID = Integer.parseInt(xtipo1.getSelectedItem().toString());
            int Precio = Integer.parseInt(xprecio1.getText().toString());
            stk.setTipo_id(TipoID);
            stk.setPrecio(Precio);
            if (cstk.modificarPrecioG(stk)) {
                JOptionPane.showMessageDialog(null, "PRECIO ACTUALIZADO CON EXITO");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

    void modificarPrecioGases() {
        try {
            int TipoID = Integer.parseInt(xtipo1.getSelectedItem().toString());
            int Precio = Integer.parseInt(xprecio1.getText().toString());
            stk.setTipo_id(TipoID);
            stk.setPrecio(Precio);
            if (cstk.modificarPrecioGases(stk)) {
                limpiarUP();
            }
        } catch (Exception e) {
        }
    }

    void limpiarUP() {
        xtipo1.setSelectedIndex(0);
        xprecio1.setText("");
    }

    void buscarGasU() {
        try {
            stk.setTipo_id(Integer.parseInt((xtipo1.getSelectedItem().toString())));
            if (cstk.buscarGas(stk)) {
                xprecio1.setText("" + stk.getPrecio());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void verStock5() {
        if (cstk.verStock5(stk)) {
            x5.setText("" + stk.getX5());
        }
    }

    void verStock11() {
        if (cstk.verStock11(stk)) {
            x11.setText("" + stk.getX11());
        }
    }

    void verStock15() {
        if (cstk.verStock15(stk)) {
            x15.setText("" + stk.getX15());
        }
    }

    void verStock45() {
        if (cstk.verStock45(stk)) {
            x45.setText("" + stk.getX45());
        }
    }

    void verStock5v() {
        if (cstk.verStock5v(stk)) {
            x5v.setText("" + stk.getX5v());
        }
    }

    void verStock11v() {
        if (cstk.verStock11v(stk)) {
            x11v.setText("" + stk.getX11v());
        }
    }

    void verStock15v() {
        if (cstk.verStock15v(stk)) {
            x15v.setText("" + stk.getX15v());
        }
    }

    void verStock45v() {
        if (cstk.verStock45v(stk)) {
            x45v.setText("" + stk.getX45v());
        }
    }

    void listar() {
        stk.setNombre(xbuscar.getText().toString());
        xlistar.setModel(cstk.listar(stk));
    }

    void agregarGas() {
        try {
            int Tipo = (Integer.parseInt(xtipo.getSelectedItem().toString()));
            int Precio = (Integer.parseInt(xprecio.getText()));
            String Nombre = xnombre.getText();
            String Estado = "Bodega";
            int Cantidad = (Integer.parseInt(xcantidad.getValue().toString()));
            stk.setTipo_id(Tipo);
            stk.setPrecio(Precio);
            stk.setNombre(Nombre);
            stk.setEstado(Estado);
            stk.setCantidad(Cantidad);
            if (cstk.agregarGas(stk)) {
                JOptionPane.showMessageDialog(null, "Nuevos gases registrados");
                actualizarStockGas();
                limpiarGas();
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

    void limpiarGas() {
        xprecio.setText("");
        xnombre.setText("");
        vacios.setText("");
        xtipo.setSelectedIndex(0);
        xcantidad.setValue(0);
    }

    void actualizarStockGas() {
        try {
            int Tipo = (Integer.parseInt(xtipo.getSelectedItem().toString()));
            int Cantidad = (Integer.parseInt(xcantidad.getValue().toString()));
            stk.setTipo_id(Tipo);
            stk.setCantidad(Cantidad);
            if (cstk.actualizarStockGas(stk)) {
            }
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregarG;
    public javax.swing.JButton buscarG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField vacios;
    public static javax.swing.JTextField x11;
    public static javax.swing.JTextField x11v;
    public static javax.swing.JTextField x15;
    public static javax.swing.JTextField x15v;
    public static javax.swing.JTextField x45;
    public static javax.swing.JTextField x45v;
    public static javax.swing.JTextField x5;
    public static javax.swing.JTextField x5v;
    private javax.swing.JTextField xbuscar;
    public static javax.swing.JSpinner xcantidad;
    public static javax.swing.JSpinner xcantidad2;
    public static javax.swing.JTable xlistar;
    public static javax.swing.JTextField xnombre;
    public static javax.swing.JTextField xprecio;
    public static javax.swing.JTextField xprecio1;
    public static javax.swing.JComboBox<String> xtipo;
    public static javax.swing.JComboBox<String> xtipo1;
    public static javax.swing.JComboBox<String> xtipo2;
    // End of variables declaration//GEN-END:variables
}
