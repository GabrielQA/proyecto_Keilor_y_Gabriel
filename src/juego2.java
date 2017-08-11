
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keilor
 */
public class juego2 extends javax.swing.JFrame {

    private int columnas = 8;
    private int filas = 5;
    private int personajecolumnas = 2;
    private int personajefilas = 1;
    public static final int tamañocuadro = 60;
    static String resultado= "";

    //Matriz logica
    private int[][] logica = new int[columnas][filas];
    // matriz grafica
    private JLabel[][] grafica = new JLabel[columnas][filas];

    /**
     * Creates new form juego2
     */
    public juego2() {

        initComponents();
        nuevamatriz();
        mostrarmatrizpanel();
        preguntas_juego2 abrir = new preguntas_juego2();
        abrir.setVisible(true);
    }

    private void nuevamatriz() {  // hacer la matriz temporal de modo aleatorio 
        int[][] temp = {{(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {3, (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},};
        logica = temp;

    }

    private void mostrarmatrizpanel() {
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                grafica[i][j] = new JLabel();//para motrar en la grafica
                grafica[i][j].setOpaque(true);// para poder motrar
                grafica[i][j].setBounds((i * tamañocuadro) + 30, (j * tamañocuadro) + 30, tamañocuadro, tamañocuadro);// definir tamaño del cuadro y la posicion 
                grafica[i][j].setVisible(true);
                grafica[i][j].setBackground(Color.red);//color del cuadro
                grafica[i][j].setIcon(imagenenmatriz(logica[i][j]));
                jppanelprincipal.add(grafica[i][j]);
                //
            }
        }
    }

    private ImageIcon imagenenmatriz(int tipo) {
        switch (tipo) {
            case objetos.pared:
                return new ImageIcon(getClass().getResource("/Imageneskeilor/pared.jpg"));
            case objetos.personaje:
                return new ImageIcon(getClass().getResource("/Imageneskeilor/6.png"));

            case objetos.piso:
                return new ImageIcon(getClass().getResource("/Imageneskeilor/03.jpg"));

        }
        return null;
    }

    private void Teclado() {
        jppanelprincipal.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println("Arriba");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    System.out.println("Abajo");
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println("derecha");
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println("Izquierda");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respuestas = new javax.swing.ButtonGroup();
        jppanelprincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jppanelprincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jppanelprincipalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jppanelprincipalLayout = new javax.swing.GroupLayout(jppanelprincipal);
        jppanelprincipal.setLayout(jppanelprincipalLayout);
        jppanelprincipalLayout.setHorizontalGroup(
            jppanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        jppanelprincipalLayout.setVerticalGroup(
            jppanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jppanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jppanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased


    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (resultado.equals("Correcto")) {
            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                System.out.println("Arriba");
            }
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                System.out.println("Abajo");
            }
            if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
                System.out.println("derecha");
            }
            if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                System.out.println("Izquierda");
            }
        }

    }//GEN-LAST:event_formKeyPressed

    private void jppanelprincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jppanelprincipalKeyPressed
        // TODO add your handling code here:
        System.out.println(evt.getExtendedKeyCode());
    }//GEN-LAST:event_jppanelprincipalKeyPressed

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
            java.util.logging.Logger.getLogger(juego2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jppanelprincipal;
    private javax.swing.ButtonGroup respuestas;
    // End of variables declaration//GEN-END:variables
}
