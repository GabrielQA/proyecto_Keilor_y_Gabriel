
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keilor
 */
public class preguntas_juego2 extends javax.swing.JFrame {

    static List preguntas = new ArrayList();
    static List respuestas = new ArrayList();
    static int contador = 0;

    /**
     * Creates new form preguntas_juego2
     */
    public preguntas_juego2() {
        initComponents();
        inicio();
      
    }
    public void inicio(){
        llenar_listas();
        imprimir_pregunta();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jbrverdadero = new javax.swing.JRadioButton();
        jbrfalso = new javax.swing.JRadioButton();
        jbaceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(jbrverdadero);
        jbrverdadero.setText("Verdadero");

        buttonGroup1.add(jbrfalso);
        jbrfalso.setText("Falso");

        jbaceptar.setText("Aceptar");
        jbaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jbaceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbrverdadero)
                                .addGap(18, 18, 18)
                                .addComponent(jbrfalso)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbrverdadero)
                    .addComponent(jbrfalso))
                .addGap(18, 18, 18)
                .addComponent(jbaceptar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaceptarActionPerformed
        if (jbrverdadero.isSelected()) {
            if (respuestas.get(contador - 1) == "Verdadero") {
                JOptionPane.showMessageDialog(rootPane, "Correcto");
                juego2.resultado = "Correcto";
               inicio();
                
            }

        }
        if (jbrfalso.isSelected()) {
            if (respuestas.get(contador - 1) == "Verdadero") {
                JOptionPane.showMessageDialog(rootPane, "Incorrecto");
            }
        }
        
    }//GEN-LAST:event_jbaceptarActionPerformed

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
            java.util.logging.Logger.getLogger(preguntas_juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(preguntas_juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(preguntas_juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(preguntas_juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new preguntas_juego2().setVisible(true);
            }
        });
    }

    public void llenar_listas() {
        preguntas.add("Me llamo keilor");
        preguntas.add("Me apellido es rr");
        respuestas.add("Verdadero");
        respuestas.add("Falso");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbaceptar;
    private javax.swing.JRadioButton jbrfalso;
    private javax.swing.JRadioButton jbrverdadero;
    // End of variables declaration//GEN-END:variables

    private void imprimir_pregunta() {
        String strCadena = "hola mundo";
        jLabel1.setText((String) preguntas.get(contador));
        contador++;
    }
}
