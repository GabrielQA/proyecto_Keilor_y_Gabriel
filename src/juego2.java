
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
public class juego2 extends javax.swing.JFrame {

    private int columnas = 8;
    private int filas = 5;
    private int personajecolumnas = 0;
    private int personajefilas = 0;
    public static final int tamañocuadro = 60;
    static String resultado = "";
    static List preguntas = new ArrayList();
    static List listarespuestas = new ArrayList();
    static int contador = 0;

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
        iniciopreguntas();

    }

    private void nuevamatriz() {  // hacer la matriz temporal de modo aleatorio 
        int[][] temp = {{3, (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},};
        logica = temp;

    }

    private void iniciopreguntas() {
        resultado = "";
        jPanel1.setVisible(true);
        llenar_listas();
        imprimir_pregunta();

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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jppanelprincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbrverdadero = new javax.swing.JRadioButton();
        jbrfalso = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("jLabel1");

        buttonGroup1.add(jbrverdadero);
        jbrverdadero.setText("Verdadero");

        buttonGroup1.add(jbrfalso);
        jbrfalso.setText("Falso");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jbrverdadero))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jbrfalso)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbrverdadero)
                .addGap(18, 18, 18)
                .addComponent(jbrfalso)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jppanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jppanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased


    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (resultado.equals("Correcto")) {
            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                if (logica[personajecolumnas][personajefilas - 1] != objetos.pared) {
                    logica[personajecolumnas][personajefilas - 1] = objetos.personaje;
                    logica[personajecolumnas][personajefilas] = objetos.piso;
                    grafica[personajecolumnas][personajefilas - 1].setIcon(imagenenmatriz(objetos.personaje));
                    grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                    personajefilas--;
                    iniciopreguntas();
                }
            }

            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                if (logica[personajecolumnas][personajefilas + 1] != objetos.pared) {
                    logica[personajecolumnas][personajefilas + 1] = objetos.personaje;
                    logica[personajecolumnas][personajefilas] = objetos.piso;
                    grafica[personajecolumnas][personajefilas + 1].setIcon(imagenenmatriz(objetos.personaje));
                    grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                    personajefilas++;
                    iniciopreguntas();

                }
            }
            if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
                if (logica[personajecolumnas - 1][personajefilas] != objetos.pared) {
                    logica[personajecolumnas - 1][personajefilas] = objetos.personaje;
                    logica[personajecolumnas][personajefilas] = objetos.piso;
                    grafica[personajecolumnas - 1][personajefilas].setIcon(imagenenmatriz(objetos.personaje));
                    grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                    personajecolumnas--;
                    iniciopreguntas();

                }
            }
            if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                if (logica[personajecolumnas + 1][personajefilas] != objetos.pared) {
                    logica[personajecolumnas + 1][personajefilas] = objetos.personaje;
                    logica[personajecolumnas][personajefilas] = objetos.piso;
                    grafica[personajecolumnas + 1][personajefilas].setIcon(imagenenmatriz(objetos.personaje));
                    grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                    personajecolumnas++;
                    iniciopreguntas();
                }
            }

        }
    }//GEN-LAST:event_formKeyPressed

    private void jppanelprincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jppanelprincipalKeyPressed
  
    }//GEN-LAST:event_jppanelprincipalKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jbrverdadero.isSelected()) {
            if (listarespuestas.get(contador - 1) == "Verdadero") {
                JOptionPane.showMessageDialog(rootPane, "Correcto");
                juego2.resultado = "Correcto";
                jPanel1.setVisible(false);

            }

        }
        if (jbrfalso.isSelected()) {
            if (listarespuestas.get(contador - 1) == "Falso") {
                JOptionPane.showMessageDialog(rootPane, "Correcto");
                juego2.resultado = "Correcto";
                jPanel1.setVisible(false);

            }

        }
        if (jbrverdadero.isSelected()) {
            if (listarespuestas.get(contador - 1) == "Falso") {
                JOptionPane.showMessageDialog(rootPane, "Incorrecto");

            }

        }
        if (jbrfalso.isSelected()) {
            if (listarespuestas.get(contador - 1) == "Incorrecto") {
                JOptionPane.showMessageDialog(rootPane, "Incorrecto");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        if(evt.getSource()==jButton1){
         System.out.println("2342");
    }
     
    }//GEN-LAST:event_formMouseClicked

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

    public void llenar_listas() {
        preguntas.add("Me llamo keilor");
        preguntas.add("Me apellido es rr");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
    }

    private void imprimir_pregunta() {
        String strCadena = "hola mundo";
        jLabel1.setText((String) preguntas.get(contador));
        contador++;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jbrfalso;
    private javax.swing.JRadioButton jbrverdadero;
    private javax.swing.JPanel jppanelprincipal;
    private javax.swing.ButtonGroup respuestas;
    // End of variables declaration//GEN-END:variables
}
