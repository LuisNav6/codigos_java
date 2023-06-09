
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.text.DecimalFormat;
public class FrameGrados extends javax.swing.JFrame {

    /**
     * Creates new form FrameGrados
     */
    public FrameGrados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        extraccion = new java.awt.TextField();
        BotonConversion = new javax.swing.JButton();
        LabelCentigrados = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        LabelFarenheit = new javax.swing.JLabel();
        BotonConversion2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        extraccion.setText("textField1");

        BotonConversion.setText("Convertir de centigrados a Farenheit");
        BotonConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConversionActionPerformed(evt);
            }
        });

        LabelCentigrados.setText("Grados Centigrados");

        resultado.setText("jTextField1");

        LabelFarenheit.setText("Grados Farenheit");

        BotonConversion2.setText("Convertir de Farenheit a Centigrados");
        BotonConversion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConversion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCentigrados, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(extraccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonConversion2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(BotonConversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelCentigrados)
                    .addComponent(extraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFarenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BotonConversion2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConversionActionPerformed
        // TODO add your handling code here:
        Double dato;
        try{
            dato = Double.parseDouble(extraccion.getText());//wrapper
            dato = dato * ( 9.0 / 5.0 ) + 32.0;
            DecimalFormat f = new DecimalFormat("#####.##ºF");
            resultado.setText(f.format(dato) );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Dato invalido");
        }finally{
            extraccion.setFocusable(true);
            extraccion.requestFocus();//regresa la atencion al text field anterior
            extraccion.selectAll();//borra texto antiguo
        }
    }//GEN-LAST:event_BotonConversionActionPerformed

    private void BotonConversion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConversion2ActionPerformed
        // TODO add your handling code here:
        Double dato;
        try{
            dato = Double.parseDouble(resultado.getText());//wrapper
            dato = ( dato - 32.0 ) * 0.5556;
            DecimalFormat f = new DecimalFormat("#####.##ºC");
            extraccion.setText(f.format(dato) );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Dato invalido");
        }finally{
            resultado.setFocusable(true);
            resultado.requestFocus();//regresa la atencion al text field anterior
            resultado.selectAll();//borra texto antiguo
        }
    }//GEN-LAST:event_BotonConversion2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameGrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConversion;
    private javax.swing.JButton BotonConversion2;
    private javax.swing.JLabel LabelCentigrados;
    private javax.swing.JLabel LabelFarenheit;
    private java.awt.TextField extraccion;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
