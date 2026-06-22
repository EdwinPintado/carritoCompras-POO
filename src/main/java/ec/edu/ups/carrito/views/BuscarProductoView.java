
package ec.edu.ups.carrito.views;

import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
    
    public TextField getTextFieldBuscarCodigo() {
        return TextFieldBuscarCodigo;
    }

    public void setTextFieldBuscarCodigo(TextField TextFieldBuscarCodigo) {
        this.TextFieldBuscarCodigo = TextFieldBuscarCodigo;
    }

    public TextField getTextFieldNombreBus() {
        return TextFieldNombreBus;
    }

    public void setTextFieldNombreBus(TextField TextFieldNombreBus) {
        this.TextFieldNombreBus = TextFieldNombreBus;
    }

    public TextField getTextFieldPrecioBus() {
        return TextFieldPrecioBus;
    }

    public void setTextFieldPrecioBus(TextField TextFieldPrecioBus) {
        this.TextFieldPrecioBus = TextFieldPrecioBus;
    }
    
    
    
    public void mostrarInformacion (String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
        dispose(); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        TextFieldBuscarCodigo = new java.awt.TextField();
        AceptarBusc = new javax.swing.JButton();
        CancelarBusc = new javax.swing.JButton();
        label2 = new java.awt.Label();
        TextFieldNombreBus = new java.awt.TextField();
        label3 = new java.awt.Label();
        TextFieldPrecioBus = new java.awt.TextField();

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

        AceptarBusc.setText("Buscar");
        AceptarBusc.addActionListener(this::AceptarBuscActionPerformed);

        CancelarBusc.setText("Cancelar ");
        CancelarBusc.addActionListener(this::CancelarBuscActionPerformed);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setText("Nombre: ");

        TextFieldNombreBus.addActionListener(this::TextFieldNombreBusActionPerformed);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setText("Precio: ");

        TextFieldPrecioBus.addActionListener(this::TextFieldPrecioBusActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(AceptarBusc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelarBusc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldNombreBus, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldPrecioBus, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldNombreBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPrecioBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarBusc)
                    .addComponent(CancelarBusc))
                .addGap(34, 34, 34))
        );

        TextFieldBuscarCodigo.getAccessibleContext().setAccessibleName("TextFieldBuscarCodigo");
        TextFieldBuscarCodigo.getAccessibleContext().setAccessibleDescription("");
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
        TextFieldBuscarCodigo.setText("");
        dispose();
    }//GEN-LAST:event_CancelarBuscActionPerformed

    private void TextFieldNombreBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreBusActionPerformed

    private void TextFieldPrecioBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPrecioBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPrecioBusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBusc;
    private javax.swing.JButton CancelarBusc;
    private java.awt.TextField TextFieldBuscarCodigo;
    private java.awt.TextField TextFieldNombreBus;
    private java.awt.TextField TextFieldPrecioBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
