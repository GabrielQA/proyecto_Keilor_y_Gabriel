/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaNadadores;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author GABRIEL-PC
 */
public class QA extends javax.swing.JFrame {

    /**
     * Creates new form QA
     */
    public QA() {
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

        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setText("J A");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        jButton22.setText("J B");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 60, 30));

        jButton23.setText("J D");
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 60, 30));

        jButton24.setText("J E");
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 60, 30));

        jButton25.setText("J C");
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 60, 30));

        jButton1.setText("Agregar Jugador");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevaNadadores/9292_original.gif"))); // NOI18N
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 290));

        jButton20.setText("Iniciar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 90, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int a= Integer.parseInt(JOptionPane.showInputDialog("¡Cantidad de competidores!"));
        JOptionPane.showMessageDialog(null,"Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA","Competidores",JOptionPane.INFORMATION_MESSAGE);
        
        if(a==5){
        NadadoresHilos nadadoresHilos = new NadadoresHilos();
        nadadoresHilos.setLocationRelativeTo(null);
        nadadoresHilos.setVisible(true);
    }else if(a==4){
        NadadoresHilos2 nadadoresHilos2 = new NadadoresHilos2();
        nadadoresHilos2.setLocationRelativeTo(null);
        nadadoresHilos2.setVisible(true);
    }else if(a==3){
        NadadoresHilos3 nadadoresHilos3 = new NadadoresHilos3();
        nadadoresHilos3.setLocationRelativeTo(null);
        nadadoresHilos3.setVisible(true);
    }else if(a == 2){
         NadadoresHilos4 nadadoresHilos3 = new NadadoresHilos4();
        nadadoresHilos3.setLocationRelativeTo(null);
        nadadoresHilos3.setVisible(true);
    } else if(a>5){
         JOptionPane.showMessageDialog(null,"Competidores maxima 5","Mm",JOptionPane.INFORMATION_MESSAGE);
    }else{
        JOptionPane.showMessageDialog(null,"Competidores minimos 2","Mm",JOptionPane.INFORMATION_MESSAGE);
        QA AS = new QA();
        AS.setVisible(true);
        AS.setLocationRelativeTo(null);
    }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

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
            java.util.logging.Logger.getLogger(QA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new QA().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JLabel jLabel77;
    // End of variables declaration//GEN-END:variables
}
