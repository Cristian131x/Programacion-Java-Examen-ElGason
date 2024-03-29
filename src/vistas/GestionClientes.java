package vistas;

import combos.ClienteCombo_1;
import conexion.Conexion;
import consultas.ConsultasCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class GestionClientes extends javax.swing.JInternalFrame {

    Cliente cli = new Cliente();
    ConsultasCliente clv = new ConsultasCliente();
    DefaultTableModel modelo = new DefaultTableModel();
    ClienteCombo_1 clie1 = new ClienteCombo_1();

    public GestionClientes() {
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        actualizarCombo();
        lista();
    }

    void actualizarCombo() {
        xbuscar1.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = clie1.llenar_combox();
        for (int i = 0; i < lista.size(); i++) {
            xbuscar1.addItem(lista.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        xlista = new javax.swing.JTable();
        xbuscarC = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        xlistaU = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xnombre = new javax.swing.JTextField();
        xtelefono = new javax.swing.JTextField();
        xdirecion = new javax.swing.JTextField();
        xcomuna = new javax.swing.JComboBox<>();
        xbuscar1 = new javax.swing.JComboBox<>();
        buscarCli = new javax.swing.JButton();
        modificarCli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        setInheritsPopupMenu(true);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel16.setText("Cliente");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        xlista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xlista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "NOMBRE", "TELEFONO", "DIRECCION", "COMUNA"
            }
        ));
        (xlista).setFocusable(false);
        (xlista) = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        xlista.setRowHeight(30);
        xlista.getTableHeader().setResizingAllowed(false);
        xlista.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(xlista);

        xbuscarC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("RUT:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        xlistaU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xlistaU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Rut_Cliente", "Nombre", "Telefono", "Direccion", "Comuna"
            }
        ));
        (xlistaU).setFocusable(false);
        (xlistaU) = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        xlistaU.setRowHeight(30);
        xlistaU.getTableHeader().setResizingAllowed(false);
        xlistaU.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(xlistaU);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Teléfono:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Comuna:");

        xnombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        xtelefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        xdirecion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        xcomuna.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xcomuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "La Granja", "La Cisterna", "La Pintana" }));

        xbuscar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xbuscar1ActionPerformed(evt);
            }
        });

        buscarCli.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buscarCli.setText("BUSCAR");
        buscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCliActionPerformed(evt);
            }
        });

        modificarCli.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        modificarCli.setText("ACEPTAR");
        modificarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(xdirecion, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(xtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(xcomuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(429, 557, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarCli, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(buscarCli)
                                .addGap(18, 18, 18)
                                .addComponent(xbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarCli)
                    .addComponent(xbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(xnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(xtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(xdirecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(xcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(modificarCli)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CLIENTE.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel16)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lista();
    }//GEN-LAST:event_jButton2ActionPerformed
    void lista() {
        cli.setRut_ClienteL(xbuscarC.getText().trim());
        xlista.setModel(clv.listar(cli));
    }
    private void xbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xbuscar1ActionPerformed

    private void buscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCliActionPerformed
        listarU();
        buscarCliente();
    }//GEN-LAST:event_buscarCliActionPerformed
    void listarU() {
        cli.setRut_ClienteL(xbuscar1.getSelectedItem().toString());
        xlistaU.setModel(clv.listarU(cli));
    }

    void buscarCliente() {
        try {
            cli.setRut_Cliente(xbuscar1.getSelectedItem().toString());
            if (clv.buscarCliente(cli)) {
                xnombre.setText(cli.getNombre());
                xcomuna.setSelectedItem("" + cli.getComuna_id());
                xtelefono.setText(cli.getNumero_Telefono());
                xdirecion.setText(cli.getDireccion());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

    public int IdComuna() {
        ResultSet rs = null;
        PreparedStatement ps = null;
        int ID = 0;
        String sql = "SELECT id_comuna FROM comuna WHERE nombre=?";
        try {
            ps = Conexion.Conectar().prepareStatement(sql);
            ps.setString(1, xcomuna.getSelectedItem().toString());
            rs = ps.executeQuery();
            while (rs.next()) {
                ID = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("me mori");
        }
        return ID;
    }
    private void modificarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCliActionPerformed
        modificarCliente();
    }//GEN-LAST:event_modificarCliActionPerformed
    void modificarCliente() {
        try {
            String Rut = xbuscar1.getSelectedItem().toString();
            String Nombre = xnombre.getText();
            String Numero_Telfono = xtelefono.getText();
            int Comuna = IdComuna();
            String Direcion = xdirecion.getText();
            cli.setNombre(Nombre);
            cli.setRut_Cliente(Rut);
            cli.setNumero_Telefono(Numero_Telfono);
            cli.setComuna_id(Comuna);
            cli.setDireccion(Direcion);
            clv.modificarCliente(cli);
            limpiar();
            actualizarCombo();
            listarU();
            JOptionPane.showMessageDialog(null, "SE MODIFICO EL CLIENTE CON EXITO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

    void limpiar() {
        xnombre.setText(null);
        xtelefono.setText(null);
        xdirecion.setText(null);
        xcomuna.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buscarCli;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton modificarCli;
    public static javax.swing.JComboBox<String> xbuscar1;
    public static javax.swing.JTextField xbuscarC;
    public static javax.swing.JComboBox<String> xcomuna;
    public static javax.swing.JTextField xdirecion;
    public static javax.swing.JTable xlista;
    public static javax.swing.JTable xlistaU;
    public static javax.swing.JTextField xnombre;
    public static javax.swing.JTextField xtelefono;
    // End of variables declaration//GEN-END:variables
}
