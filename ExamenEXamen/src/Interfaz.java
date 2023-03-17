/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame 
{
    String seleccionado="";
    public int puntosExamen=0;
    public int puntostotal=0;
    public int a=0;
    String info[] = new String[80];
    public String respuestabien="";
    int p=0;
    int op1=1;
    int op2=2;
    int op3=3;
    int op4=4;
    int r=5;
    int puntos1=6;
    int n=0;
    
    public Interfaz() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCargar = new javax.swing.JButton();
        jSiguiente = new javax.swing.JButton();
        JReiniciar = new javax.swing.JButton();
        jEmpezar = new javax.swing.JButton();
        jPreguntas = new javax.swing.JLabel();
        jComboRespuestas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCargar.setText("Cargar preguntas");
        jCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargarActionPerformed(evt);
            }
        });
        jPanel1.add(jCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        jSiguiente.setText("Siguiente Pregunta");
        jSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(jSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        JReiniciar.setText("Reiniciar Test");
        JReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(JReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jEmpezar.setText("Realizar test");
        jEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpezarActionPerformed(evt);
            }
        });
        jPanel1.add(jEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));
        jPanel1.add(jPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 600, 70));

        jComboRespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRespuestasActionPerformed(evt);
            }
        });
        jPanel1.add(jComboRespuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargarActionPerformed
        String linea="";
        File f = new File("examen.txt");
        try
        {
            FileReader leer = new FileReader("src/examen.txt");
            BufferedReader bufferLeer = new BufferedReader(leer);

            while((linea=bufferLeer.readLine())!=null)
            {
                info[n] = linea;
                n = n + 1;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jCargarActionPerformed

    private void jEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpezarActionPerformed
        jCargar.setEnabled(false);
        jEmpezar.setEnabled(false);
        
        jComboRespuestas.removeAllItems();
        jPreguntas.setText("");
        
        String pregunta[] = info[p].split(":p;");        
        jPreguntas.setText(pregunta[1]);
        
        String respuesta[] = info[op1].split(":op1;");
        String respuesta2[] = info[op2].split(":op2;");
        String respuesta3[] = info[op3].split(":op3;");
        String respuesta4[] = info[op4].split(":op4;");
        String resBien[] = info[r].split(":r;");
        String puntos = info[puntos1];
        a = Integer.parseInt(puntos);
        respuestabien  = resBien[1];
        puntostotal = puntostotal + a;
        
        jComboRespuestas.addItem(respuesta[1]);
        jComboRespuestas.addItem(respuesta2[1]);
        jComboRespuestas.addItem(respuesta3[1]);
        jComboRespuestas.addItem(respuesta4[1]);
        jComboRespuestas.setSelectedIndex(-1);
        
        p = p + 7;
        op1 = op1 + 7;
        op2 = op2 + 7;
        op3 = op3 + 7;
        op4 = op4 +7 ;
        r = r + 7;
        puntos1 = puntos1 + 7;
    }//GEN-LAST:event_jEmpezarActionPerformed

    private void JReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JReiniciarActionPerformed
        jCargar.setEnabled(true);
        jEmpezar.setEnabled(true);
        puntosExamen=0;
        puntostotal=0;
        a=0;
        p=0;
        op1=1;
        op2=2;
        op3=3;
        op4=4;
        r=5;
        puntos1=6;
        n = 0;
        jComboRespuestas.removeAllItems();
        jPreguntas.setText("");
        
    }//GEN-LAST:event_JReiniciarActionPerformed

    private void jSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSiguienteActionPerformed
        if(info[p]==null)
        {
            if(seleccionado.equals(respuestabien))
            {
                puntosExamen = puntosExamen + a;
            }
            JOptionPane.showMessageDialog(null,puntosExamen+" de "+puntostotal);
            JReiniciar.doClick();
        }
        else
        {
            
            if(seleccionado.equals(respuestabien))
            {
                puntosExamen = puntosExamen + a;
            }
            
            jPreguntas.setText("");

            String pregunta[] = info[p].split(":p;");

            jPreguntas.setText(pregunta[1]);

            String respuesta[] = info[op1].split(":op1;");
            String respuesta2[] = info[op2].split(":op2;");
            String respuesta3[] = info[op3].split(":op3;");
            String respuesta4[] = info[op4].split(":op4;");
            String resBien[] = info[r].split(":r;");
            String puntos = info[puntos1];
            jComboRespuestas.removeAllItems();
            a = Integer.parseInt(puntos);
            respuestabien  = resBien[1];
            puntostotal = puntostotal + a;
            
            jComboRespuestas.addItem(respuesta[1]);
            jComboRespuestas.addItem(respuesta2[1]);
            jComboRespuestas.addItem(respuesta3[1]);
            jComboRespuestas.addItem(respuesta4[1]);
            jComboRespuestas.setSelectedIndex(-1);

            p = p + 7;
            op1 = op1 + 7;
            op2 = op2 + 7;
            op3 = op3 + 7;
            op4 = op4 +7 ;
            r = r + 7;
            puntos1 = puntos1 + 7;
        }
    }//GEN-LAST:event_jSiguienteActionPerformed

    private void jComboRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRespuestasActionPerformed
        if(jComboRespuestas.getSelectedIndex()!=-1)
        {
            seleccionado = jComboRespuestas.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jComboRespuestasActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JReiniciar;
    private javax.swing.JButton jCargar;
    private javax.swing.JComboBox<String> jComboRespuestas;
    private javax.swing.JButton jEmpezar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPreguntas;
    private javax.swing.JButton jSiguiente;
    // End of variables declaration//GEN-END:variables
}
