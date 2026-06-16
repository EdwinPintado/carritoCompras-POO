/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.carrito.views;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class ActualizarProductoView extends javax.swing.JInternalFrame {
    public ActualizarProductoView() {
        initComponents();
    }

    public JButton getAceptarAct() {
        return AceptarAct;
    }

    public void setAceptarAct(JButton AceptarAct) {
        this.AceptarAct = AceptarAct;
    }

    public JButton getCancelarAct() {
        return CancelarAct;
    }

    public void setCancelarAct(JButton CancelarAct) {
        this.CancelarAct = CancelarAct;
    }

    public JTextField getTextFieldCodigoActualizar() {
        return TextFieldCodigoActualizar;
    }

    public void setTextFieldCodigoActualizar(JTextField TextFieldCodigoActualizar) {
        this.TextFieldCodigoActualizar = TextFieldCodigoActualizar;
    }

    public JTextField getTextFieldNuevoNombre() {
        return TextFieldNuevoNombre;
    }

    public void setTextFieldNuevoNombre(JTextField TextFieldNuevoNombre) {
        this.TextFieldNuevoNombre = TextFieldNuevoNombre;
    }

    public JTextField getTextFieldNuevoPrecio() {
        return TextFieldNuevoPrecio;
    }

    public void setTextFieldNuevoPrecio(JTextField TextFieldNuevoPrecio) {
        this.TextFieldNuevoPrecio = TextFieldNuevoPrecio;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldNuevoNombre = new javax.swing.JTextField();
        TextFieldNuevoPrecio = new javax.swing.JTextField();
        CancelarAct = new javax.swing.JButton();
        TextFieldCodigoActualizar = new javax.swing.JTextField();
        AceptarAct = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualize un producto");
        setPreferredSize(new java.awt.Dimension(401, 310));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("ActualizarProducto");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Codigo a actualizar: ");
        jLabel2.setToolTipText("");

        jLabel3.setText("   Nuevo nombre: ");

        jLabel4.setText("   Nuevo precio: ");

        TextFieldNuevoPrecio.addActionListener(this::TextFieldNuevoPrecioActionPerformed);

        CancelarAct.setText("Cancelar");
        CancelarAct.addActionListener(this::CancelarActActionPerformed);

        TextFieldCodigoActualizar.addActionListener(this::TextFieldCodigoActualizarActionPerformed);

        AceptarAct.setText("Aceptar");
        AceptarAct.addActionListener(this::AceptarActActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldCodigoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AceptarAct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CancelarAct)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldCodigoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarAct)
                    .addComponent(AceptarAct))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        TextFieldNuevoNombre.getAccessibleContext().setAccessibleName("TextFieldNuevoNombre");
        TextFieldNuevoPrecio.getAccessibleContext().setAccessibleName("TextFieldNuevoPrecio");
        CancelarAct.getAccessibleContext().setAccessibleName("CancelarAct");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNuevoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNuevoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNuevoPrecioActionPerformed

    private void CancelarActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActActionPerformed

    private void TextFieldCodigoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoActualizarActionPerformed

    private void AceptarActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActActionPerformed
        
    }//GEN-LAST:event_AceptarActActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarAct;
    private javax.swing.JButton CancelarAct;
    private javax.swing.JTextField TextFieldCodigoActualizar;
    private javax.swing.JTextField TextFieldNuevoNombre;
    private javax.swing.JTextField TextFieldNuevoPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
