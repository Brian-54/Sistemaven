package vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ClientsCRUD;

/**
 *
 * @author https://github.com/Brian-54
 * @author https://github.com/LuisFlahan4051
 */

public class ClientesForm extends javax.swing.JFrame {
    
    public ClientesForm() {
        initComponents();
        setTitle("Clientes");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    ClientsCRUD clientsCRUD = new ClientsCRUD();
    
    
    
    
    
    
    public void clearInputs(){
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtCorreoCliente.setText("");
    }
    
    
    
    
    public void drawTable(){
        DefaultTableModel NewModel = new DefaultTableModel();
        ResultSet resultSet; 
        
        try {
            resultSet = clientsCRUD.executeSimpleQuery("SELECT * FROM clients");
            if (resultSet == null){
                JOptionPane.showMessageDialog(null, "No se pudo hacer la consulta!");
            }
            try {
                NewModel.setColumnIdentifiers(new Object[]{"ID","NOMBRE","CORREO"});
                while(resultSet.next()){
                    NewModel.addRow(new Object[]{
                        resultSet.getInt("id_client"),
                        resultSet.getString("name_client"),
                        resultSet.getString("email_client")})
                    ;
                }
                Tablacliente.setModel(NewModel);
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        clearInputs();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablacliente = new javax.swing.JTable();
        btnMostrarClientes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        btnCapturarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CORREO"
            }
        ));
        Tablacliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablacliente);
        if (Tablacliente.getColumnModel().getColumnCount() > 0) {
            Tablacliente.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tablacliente.getColumnModel().getColumn(1).setPreferredWidth(60);
            Tablacliente.getColumnModel().getColumn(2).setPreferredWidth(70);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 200));

        btnMostrarClientes.setBackground(new java.awt.Color(0, 0, 204));
        btnMostrarClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMostrarClientes.setText("MOSTRAR CLIENTES");
        btnMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClientesActionPerformed(evt);
            }
        });
        jPanel4.add(btnMostrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 530, 440));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("REGISTRO CLIENTES");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("NOMBRE:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtIdCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CORREO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ID:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        txtCorreoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 170, 30));

        btnCapturarCliente.setBackground(new java.awt.Color(51, 255, 51));
        btnCapturarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapturarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarTodo.png"))); // NOI18N
        btnCapturarCliente.setText("CAPTURAR");
        btnCapturarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnCapturarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 40));

        btnEliminarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarCliente.setText("ELIMINAR");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 400, 290));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Marcas.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 440));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnCapturarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarClienteActionPerformed
        String name = txtNombreCliente.getText();
        String email = txtCorreoCliente.getText();
        boolean result;
        try{
            result = clientsCRUD.saveClient(name, email);
            if(!result){
                JOptionPane.showMessageDialog(null,"Datos guardados correctamente");
                clearInputs();
            }else{
                JOptionPane.showMessageDialog(null,"Error al guardar");
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        drawTable();
    }//GEN-LAST:event_btnCapturarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if("".equals(txtIdCliente.getText())){
            JOptionPane.showMessageDialog(null,"Especifique un ID por favor.");
        }else{
            int id = Integer.parseInt(txtIdCliente.getText());
            boolean result;
            try{
                result = clientsCRUD.deleteClientById(id);
                if(!result){
                    JOptionPane.showMessageDialog(null,"Datos eliminados correctamente");
                }else{
                    JOptionPane.showMessageDialog(null,"Error al eliminar");
                }
            }catch (SQLException e){
                System.out.println(e.toString());
            }
            drawTable();
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClientesActionPerformed
        drawTable();
    }//GEN-LAST:event_btnMostrarClientesActionPerformed

    private void TablaclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaclienteMouseClicked
        txtIdCliente.setText(Tablacliente.getValueAt(Tablacliente.getSelectedRow(), 0).toString());
        txtNombreCliente.setText(Tablacliente.getValueAt(Tablacliente.getSelectedRow(), 1).toString());
        txtCorreoCliente.setText(Tablacliente.getValueAt(Tablacliente.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_TablaclienteMouseClicked

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
            java.util.logging.Logger.getLogger(ClientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesForm().setVisible(true);
            }
        });
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablacliente;
    private javax.swing.JButton btnCapturarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnMostrarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
