/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.carrito.views;

import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JButton;

/**
 *
 * @author Usuario
 */
public class BuscarProductoView extends javax.swing.JInternalFrame {

    public BuscarProductoView() {
        initComponents();
    }

    public JButton getAceptarBusc() {
        return AceptarBusc;
    }

    public void setAceptarBusc(JButton AceptarBusc) {
        this.AceptarBusc = AceptarBusc;
    }

    public JButton getCancelarBusc() {
        return CancelarBusc;
    }

    public void setCancelarBusc(JButton CancelarBusc) {
        this.CancelarBusc = CancelarBusc;
    }

    public TextArea getTextAreaBusc() {
        return TextAreaBusc;
    }

    public void setTextAreaBusc(TextArea TextAreaBusc) {
        this.TextAreaBusc = TextAreaBusc;
    }

    public TextField getTextFieldBuscarCodigo() {
        return TextFieldBuscarCodigo;
    }

    public void setTextFieldBuscarCodigo(TextField TextFieldBuscarCodigo) {
        this.TextFieldBuscarCodigo = TextFieldBuscarCodigo;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        TextFieldBuscarCodigo = new java.awt.TextField();
        TextAreaBusc = new java.awt.TextArea();
        AceptarBusc = new javax.swing.JButton();
        CancelarBusc = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Busque un producto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(401, 310));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("BuscarProducto");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("Codigo: ");

        TextFieldBuscarCodigo.addActionListener(this::TextFieldBuscarCodigoActionPerformed);

        AceptarBusc.setText("Aceptar");
        AceptarBusc.addActionListener(this::AceptarBuscActionPerformed);

        CancelarBusc.setText("Cancelar ");
        CancelarBusc.addActionListener(this::CancelarBuscActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(AceptarBusc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelarBusc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldBuscarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TextAreaBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarBusc)
                    .addComponent(CancelarBusc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextAreaBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TextFieldBuscarCodigo.getAccessibleContext().setAccessibleName("TextFieldBuscarCodigo");
        TextFieldBuscarCodigo.getAccessibleContext().setAccessibleDescription("");
        TextAreaBusc.getAccessibleContext().setAccessibleName("TextAreaBusc");
        AceptarBusc.getAccessibleContext().setAccessibleName("AceptarBusc");
        CancelarBusc.getAccessibleContext().setAccessibleName("CancelarBusc");

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

    private void TextFieldBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldBuscarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldBuscarCodigoActionPerformed

    private void AceptarBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBuscActionPerformed
        
    }//GEN-LAST:event_AceptarBuscActionPerformed

    private void CancelarBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBuscActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarBuscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBusc;
    private javax.swing.JButton CancelarBusc;
    private java.awt.TextArea TextAreaBusc;
    private java.awt.TextField TextFieldBuscarCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
