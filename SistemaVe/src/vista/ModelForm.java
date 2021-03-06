package vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelsCRUD;

/**
 *
 * @author https://github.com/Brian-54
 * @author https://github.com/LuisFlahan4051
 */
public class ModelForm extends javax.swing.JFrame {

    public ModelForm() {
        initComponents();
        setTitle("Modelos");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    ModelsCRUD modelsCRUD = new ModelsCRUD();
    
    
    
    
    
    
    
    
    
    public void clearInputs(){
        txtIdModelo.setText("");
        txtModelo.setText("");
        txtTipoCalzado.setText("");
        txtTalla.setText("");
    }
    
    
    
    
    public void drawTable(){
        DefaultTableModel NewModel = new DefaultTableModel();
        ResultSet resultSet; 
        
        try {
            resultSet = modelsCRUD.executeSimpleQuery("SELECT * FROM models");
            if (resultSet == null){
                JOptionPane.showMessageDialog(null, "No se pudo hacer la consulta!");
            }
            try {
                NewModel.setColumnIdentifiers(new Object[]{"ID","MODELO","TIPO","TALLA"});
                while(resultSet.next()){
                    NewModel.addRow(new Object[]{
                        resultSet.getInt("id_model"),
                        resultSet.getString("model_model"),
                        resultSet.getString("type_model"),
                        resultSet.getString("talla_model")})
                    ;
                }
                TablaModelo.setModel(NewModel);
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
        TablaModelo = new javax.swing.JTable();
        btnMostrarCaptura = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipoCalzado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        btnCapturarModelo = new javax.swing.JButton();
        btnEliminarModelo = new javax.swing.JButton();
        Id = new javax.swing.JLabel();
        txtIdModelo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MODELO", "TIPO", "TALLA"
            }
        ));
        TablaModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaModeloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaModelo);
        if (TablaModelo.getColumnModel().getColumnCount() > 0) {
            TablaModelo.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 200));

        btnMostrarCaptura.setBackground(new java.awt.Color(0, 0, 204));
        btnMostrarCaptura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMostrarCaptura.setText("MOSTRAR CAPTURAS");
        btnMostrarCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCapturaActionPerformed(evt);
            }
        });
        jPanel4.add(btnMostrarCaptura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zapatillas-de-deporte.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 240));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 530, 440));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("REGISTRO MODELOS");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("MODELO:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TIPO DE CALZADO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtTipoCalzado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTipoCalzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCalzadoActionPerformed(evt);
            }
        });
        jPanel3.add(txtTipoCalzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TALLA:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtTalla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, 30));

        btnCapturarModelo.setBackground(new java.awt.Color(255, 0, 51));
        btnCapturarModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapturarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarTodo.png"))); // NOI18N
        btnCapturarModelo.setText("CAPTURAR");
        btnCapturarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarModeloActionPerformed(evt);
            }
        });
        jPanel3.add(btnCapturarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 40));

        btnEliminarModelo.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminarModelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarModelo.setText("ELIMINAR");
        btnEliminarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarModeloActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, 40));

        Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Id.setText("Id:");
        jPanel3.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtIdModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtIdModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 170, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 400, 290));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Marcas.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 420, 480));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 440));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoCalzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCalzadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoCalzadoActionPerformed

    private void btnCapturarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarModeloActionPerformed
        String model = txtModelo.getText();
        String type = txtTipoCalzado.getText();
        String talla = txtTalla.getText();
        boolean result;
        try{
            result = modelsCRUD.saveModel(model, type, talla);
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
    }//GEN-LAST:event_btnCapturarModeloActionPerformed

    private void btnMostrarCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCapturaActionPerformed
        drawTable();
    }//GEN-LAST:event_btnMostrarCapturaActionPerformed

    private void btnEliminarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarModeloActionPerformed
        if("".equals(txtIdModelo.getText())){
            JOptionPane.showMessageDialog(null,"Especifique un ID por favor.");
        }else{
            int id = Integer.parseInt(txtIdModelo.getText());
            boolean result;
            try{
                result = modelsCRUD.deleteModelById(id);
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
    }//GEN-LAST:event_btnEliminarModeloActionPerformed

    private void TablaModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaModeloMouseClicked
        txtIdModelo.setText(TablaModelo.getValueAt(TablaModelo.getSelectedRow(), 0).toString());
        txtModelo.setText(TablaModelo.getValueAt(TablaModelo.getSelectedRow(), 1).toString());
        txtTipoCalzado.setText(TablaModelo.getValueAt(TablaModelo.getSelectedRow(), 2).toString());
        txtTalla.setText(TablaModelo.getValueAt(TablaModelo.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_TablaModeloMouseClicked

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
            java.util.logging.Logger.getLogger(ModelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModelForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JTable TablaModelo;
    private javax.swing.JButton btnCapturarModelo;
    private javax.swing.JButton btnEliminarModelo;
    private javax.swing.JButton btnMostrarCaptura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIdModelo;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTipoCalzado;
    // End of variables declaration//GEN-END:variables
}
