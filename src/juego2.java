
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    private int personajecolumnas = 0;//Character position
    private int personajefilas = 0;//Character position 
    public static final int tamañocuadro = 60;
    static String resultado = "";
    static List preguntas = new ArrayList();// list question
    static List listarespuestas = new ArrayList();// list Answer
    static int contador = 0;
    static int variabledelcomodin = 0;// Wildcard variable
    static int puntos = 0; // sistem point
    static int variableelecccion = 0;// Wildcard variable
    static int comodin2 = 0;// Wildcard variable

    //Matriz logica
    private int[][] logica = new int[columnas][filas]; //Logical matrix
    // matriz grafica
    private JLabel[][] grafica = new JLabel[columnas][filas];//Matrix graph

    /**
     * Creates new form juego2
     */
    public juego2() {
        setIconImage(new ImageIcon(getClass().getResource("/Imageneskeilor/Controller-1.png")).getImage());// icon interface 
        initComponents();
        nuevamatriz(2);
        mostrarmatrizpanel();
        iniciopreguntas();
        String puntos1 = String.valueOf(puntos);
        jLabel2.setText(puntos1);

    }

    private void nuevamatriz(int num) {  // Make the temporal matrix randomly
        int[][] temp = {{3, 1, (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {1, (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), 4, (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1)},
        {(int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), (int) (Math.random() * 2 + 1), 1}};
        logica = temp;

    }

    private void iniciopreguntas() {// Order of questions
        resultado = "";
        jPanel1.setVisible(true);
        llenar_listas();
        imprimir_pregunta();

    }

    private void mostrarmatrizpanel() {//Methodology to perform the graphical representation antravez of leables
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                grafica[i][j] = new JLabel();//To show in the graph
                grafica[i][j].setOpaque(true);// To be able to drive
                grafica[i][j].setBounds((i * tamañocuadro) + 30, (j * tamañocuadro) + 30, tamañocuadro, tamañocuadro);// definir tamaño del cuadro y la posicion 
                grafica[i][j].setVisible(true);
                grafica[i][j].setBackground(Color.red);//Picture color
                grafica[i][j].setIcon(imagenenmatriz(logica[i][j]));
                jppanelprincipal.add(grafica[i][j]);
                //
            }
        }
    }

    private ImageIcon imagenenmatriz(int tipo) {// add tahe immage matrizx   grafic
        switch (tipo) {
            case objetos.pared:
                return new ImageIcon(getClass().getResource("/Imageneskeilor/pared.jpg"));
            case objetos.personaje:
                return new ImageIcon(getClass().getResource("/Imageneskeilor/6.png"));

            case objetos.piso:
                return new ImageIcon(getClass().getResource("/Imageneskeilor/03.jpg"));
            case objetos.comodin:
                return new ImageIcon(getClass().getResource("/Imageneskeilor/4.jpg"));

        }
        return null;
    }

    public void eliminarcomodin() {//delete comodin
        int fila = 3;
        int columna = 2;
        logica[fila][columna] = 1;
        grafica[fila][columna].setIcon(imagenenmatriz(logica[fila][columna]));
        jppanelprincipal.add(grafica[fila][columna]);
    }

    /**
     *
     */
    public void ganaroperder() {//Method that decides that verifiva if it wins or loses
        if (logica[7][4] == 3) {
            if (puntos > 3) {
                JOptionPane.showMessageDialog(rootPane, "FELICITACIONES HAS GANADO EL JUEGO\n"
                        + "GRACIAS POR PARTICIPAR");
                interface_main jFrame = new interface_main();
                jFrame.setVisible(true);
                System.exit(0);
            }
            if (puntos < 3) {
                JOptionPane.showMessageDialog(rootPane, "GAMER OVER\n"
                        + "SUS PUNTOS NO SON SUFICIENTES");
                interface_main jFrame = new interface_main();
                jFrame.setVisible(true);
                System.exit(0);
            }

        }
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
        jbrverdadero = new javax.swing.JRadioButton();
        jbrfalso = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel1.setColumns(20);
        jLabel1.setRows(5);
        jScrollPane1.setViewportView(jLabel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jbrverdadero))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jbrfalso)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbrverdadero)
                .addGap(18, 18, 18)
                .addComponent(jbrfalso)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel2.setText("jLabel2");

        jLabel3.setText("PUNTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jppanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jppanelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased


    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (resultado.equals("Correcto") & comodin2 == 1) {//For the movement

            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                if (logica[personajecolumnas][personajefilas - 1] != objetos.pared & logica[personajecolumnas][personajefilas - 1] != objetos.comodin) {
                    logica[personajecolumnas][personajefilas - 1] = objetos.personaje;
                    logica[personajecolumnas][personajefilas] = objetos.piso;
                    grafica[personajecolumnas][personajefilas - 1].setIcon(imagenenmatriz(objetos.personaje));
                    grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                    personajefilas--;
                    ganaroperder();
                    iniciopreguntas();
                    return;
                    
                }
                if (logica[personajecolumnas][personajefilas - 1] == objetos.comodin) {
                    if (logica[personajecolumnas][personajefilas - 1] != objetos.pared) {
                        logica[personajecolumnas][personajefilas - 1] = objetos.personaje;
                        logica[personajecolumnas][personajefilas] = objetos.piso;
                        grafica[personajecolumnas][personajefilas - 1].setIcon(imagenenmatriz(objetos.personaje));
                        grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                        personajefilas--;
                        ganaroperder();
                        comodin2 = 0;
                        comodin jFrame = new comodin();
                        jFrame.setVisible(true);
                    }
                }

            }

            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {

                if (logica[personajecolumnas][personajefilas + 1] != objetos.pared & logica[personajecolumnas][personajefilas + 1] != objetos.comodin) {
                    logica[personajecolumnas][personajefilas + 1] = objetos.personaje;
                    logica[personajecolumnas][personajefilas] = objetos.piso;
                    grafica[personajecolumnas][personajefilas + 1].setIcon(imagenenmatriz(objetos.personaje));
                    grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                    personajefilas++;
                    ganaroperder();
                    iniciopreguntas();
                    return;

                }

                if (logica[personajecolumnas][personajefilas + 1] == objetos.comodin) {
                    if (logica[personajecolumnas][personajefilas + 1] != objetos.pared) {
                        logica[personajecolumnas][personajefilas + 1] = objetos.personaje;
                        logica[personajecolumnas][personajefilas] = objetos.piso;
                        grafica[personajecolumnas][personajefilas + 1].setIcon(imagenenmatriz(objetos.personaje));
                        grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                        personajefilas++;
                        ganaroperder();
                        comodin2 = 0;
                        comodin jFrame = new comodin();
                        jFrame.setVisible(true);

                    }

                }
            }

            if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
                if (logica[personajecolumnas - 1][personajefilas] != objetos.pared & logica[personajecolumnas - 1][personajefilas] != objetos.comodin) {
                    logica[personajecolumnas - 1][personajefilas] = objetos.personaje;
                    logica[personajecolumnas][personajefilas] = objetos.piso;
                    grafica[personajecolumnas - 1][personajefilas].setIcon(imagenenmatriz(objetos.personaje));
                    grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                    personajecolumnas--;
                    ganaroperder();
                    iniciopreguntas();
                    return;

                }
                if (logica[personajecolumnas - 1][personajefilas] == objetos.comodin) {
                    if (logica[personajecolumnas - 1][personajefilas] != objetos.pared) {
                        logica[personajecolumnas - 1][personajefilas] = objetos.personaje;
                        logica[personajecolumnas][personajefilas] = objetos.piso;
                        grafica[personajecolumnas - 1][personajefilas].setIcon(imagenenmatriz(objetos.personaje));
                        grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                        personajecolumnas--;
                        ganaroperder();
                        comodin2 = 0;
                        comodin jFrame = new comodin();
                        jFrame.setVisible(true);
                    }
                }

            }
            if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                if (logica[personajecolumnas + 1][personajefilas] != objetos.pared & logica[personajecolumnas + 1][personajefilas] != objetos.comodin) {
                    logica[personajecolumnas + 1][personajefilas] = objetos.personaje;
                    logica[personajecolumnas][personajefilas] = objetos.piso;
                    grafica[personajecolumnas + 1][personajefilas].setIcon(imagenenmatriz(objetos.personaje));
                    grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                    personajecolumnas++;
                    ganaroperder();
                    iniciopreguntas();
                    return;
                }
                if (logica[personajecolumnas + 1][personajefilas] == objetos.comodin) {
                    if (logica[personajecolumnas + 1][personajefilas] != objetos.pared) {
                        logica[personajecolumnas + 1][personajefilas] = objetos.personaje;
                        logica[personajecolumnas][personajefilas] = objetos.piso;
                        grafica[personajecolumnas + 1][personajefilas].setIcon(imagenenmatriz(objetos.personaje));
                        grafica[personajecolumnas][personajefilas].setIcon(imagenenmatriz(objetos.piso));
                        personajecolumnas++;
                        ganaroperder();
                        comodin2 = 0;
                        comodin jFrame = new comodin();
                        jFrame.setVisible(true);
                    }
                }

            }

        }
    }//GEN-LAST:event_formKeyPressed

    private void jppanelprincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jppanelprincipalKeyPressed

    }//GEN-LAST:event_jppanelprincipalKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jbrverdadero.isSelected()) {//Button radio system to see whether or not you hit the question
            if (listarespuestas.get(contador - 1) == "Verdadero") {
                JOptionPane.showMessageDialog(rootPane, "Correcto");
                juego2.resultado = "Correcto";
                jPanel1.setVisible(false);
                if (primeraeleccion() == false) {

                    eliminarmuros();
                    puntosmas();
                } else {

                }

            }

        }
        if (jbrfalso.isSelected()) {
            if (listarespuestas.get(contador - 1) == "Falso") {
                JOptionPane.showMessageDialog(rootPane, "Correcto");
                juego2.resultado = "Correcto";
                jPanel1.setVisible(false);
                if (primeraeleccion() == false) {

                    eliminarmuros();
                    puntosmas();
                } else {

                }

            }
        }

        if (jbrverdadero.isSelected()) {
            if (listarespuestas.get(contador - 1) == "Falso") {
                JOptionPane.showMessageDialog(rootPane, "Incorrecto");
                puntosmenos();

                agregarmuro();
                iniciopreguntas();
            }

        }
        if (jbrfalso.isSelected()) {
            if (listarespuestas.get(contador - 1) == "Verdadero") {
                JOptionPane.showMessageDialog(rootPane, "Incorrecto");
                puntosmenos();
                agregarmuro();
                iniciopreguntas();

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked


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

    public void cerrar() {
        this.setVisible(false);
    }

    public void llenar_listas() {// add question a list
        preguntas.add("¿Java es un lenguaje orientado\n"
                + " a objetos?");
        preguntas.add("¿Java fue el primer lenguaje de,\n"
                + " programacion de alto nivel?");
        preguntas.add("¿int, char, float, string, boolean\n"
                + " son tipos de datos?");
        preguntas.add("¿if, else, for y while son\n"
                + " estructuras de control?");
        preguntas.add("universidad = 'UTN';\n"
                + "¿Es correcta esta declaracion?");
        preguntas.add("¿Java fue creado por Sun\n"
                + " Microsystems?");
        preguntas.add("¿Java fue creado en 1996?");
        preguntas.add("¿Las listas son lo mismo\n"
                + " que un arreglo?");
        preguntas.add("¿Un String es lo mismo que\n"
                + " un Char?");
        preguntas.add("Una clase es un modelo que \n"
                + "nos permite inicializar objetos\n"
                + " ¿Verdadero o falso?");
        preguntas.add("¿La palabra Swing en Java hace\n"
                + " referencia al cambio de valores?");
        preguntas.add("For, while, do/while\n"
                + " ¿Se consideran bucles?");
        preguntas.add("¿Las clases deben llevar su \n"
                + "nombre en miniscula?");
        preguntas.add("La clase Scanner se utiliza para\n"
                + " obtener datos por medio de la consola\n"
                + "¿Verdadero o Falso?");
        preguntas.add("String[][] matriz = new [2][2]\n"
                + "¿La declaración es correcta?");
        preguntas.add("If/else, switch\n"
                + "¿Son sentencias de salto?");
        preguntas.add("A<B\nSegún la sentencia anterior\n"
                + " ¿A es mayor que B?");
        preguntas.add("La sintaxis de Java deriva de C y C++\n"
                + "¿Verdadero o Falso?");
        preguntas.add("¿Los operadores boleanos hacen\n"
                + " referencia a datos númericos?");
        preguntas.add("Las operaciones de lectura y escritura\n"
                + " pertenecen a java.net\n"
                + "¿Verdadero o Falso?");
        preguntas.add("¿NetBeans es un entorno de desarrollo libre?");
        preguntas.add("¿Los operadores lógicos permiten\n"
                + " establecer relaciones entre dos valores?");
        preguntas.add("Java no cuenta con gran cantidad\n"
                + " de librerias para trabajar\n"
                + "¿Verdadero o Falso?");
        preguntas.add("¿IDE es multiplataforma?");
        preguntas.add("Los atributos representan un conjunto\n"
                + " de objetos con un comportamientos\n"
                + "regido por variables\n"
                + "¿Verdadero o False?");
        preguntas.add("ArrayList\n"
                + " ¿Ese metodo sirve para crear una lista?");
        preguntas.add("¿JLabel es un botón?");
        preguntas.add("¿Las matrices pueden ser unidimensionales\n"
                + " y multidimensionales?");
        preguntas.add("nextInt \n "
                + "¿es para que el usuario digite un String?");
        preguntas.add("¿Un break, sirve para crear cadenas?");

        listarespuestas.add("Verdadero");//add answer a list
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Falso");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Verdadero");
        listarespuestas.add("Falso");
        listarespuestas.add("Falso");

    }

    private void imprimir_pregunta() {

        jLabel1.setText((String) preguntas.get(contador));
        contador++;
    }

    public void close() {
        System.exit(0);
    }

    public void eliminarmuros() {// delete slow the matix 
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la columna:"));
        while (fila > 7 || fila < 0) {
            JOptionPane.showMessageDialog(rootPane, "Dato incorrecto, vuelva a digitar\n"
                    + "las culumnas van del 0 al 7");
            fila = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la columna:"));
        }
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la fila:"));
        while (columna > 4 || columna < 0) {
            JOptionPane.showMessageDialog(rootPane, "Dato incorrecto, vuelva a digitar\n"
                    + "las filas van del 0 al 4");
            columna = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la columna:"));
        }
        if (2 == logica[fila][columna]) {
            System.out.println("es pared");
            logica[fila][columna] = 1;
            grafica[fila][columna].setIcon(imagenenmatriz(logica[fila][columna]));
            jppanelprincipal.add(grafica[fila][columna]);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Aqui no hay muro");
            eliminarmuros();
        }
    }

    public boolean primeraeleccion() {// system the fisrt quiestion
        if (variableelecccion == 0) {
            int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Como es la primera pregunta le vamos a dar 2 opcion:\n"
                    + "1-Comodin\n"
                    + "2-Eliminar muro"));
            if (eleccion == 1) {
                variableelecccion = 1;
                comodin jFrame = new comodin();
                jFrame.setVisible(true);
                eliminarcomodin();
                return true;

            } else {
                variableelecccion = 2;
                comodin2 = 1;
                return false;
            }

        }
        return false;

    }

    public void agregarmuro() {// add slow a matrix
        int conttt = 0;
        while (conttt == 0) {
            int filas1 = numeroaleatoriofilas();
            int columnas1 = numeroaleatoriocolumas();
            if (1 == logica[filas1][columnas1]) {
                logica[filas1][columnas1] = 2;
                grafica[filas1][columnas1].setIcon(imagenenmatriz(logica[filas1][columnas1]));
                jppanelprincipal.add(grafica[filas1][columnas1]);
                conttt++;
            }
        }
    }

    public int numeroaleatoriofilas() {
        return (int) (Math.random() * 7);
    }

    public int numeroaleatoriocolumas() {
        return (int) (Math.random() * 4);
    }

    public void puntosmas() {// add point 
        if (puntos >= 0) {
            puntos++;
            String puntos1 = String.valueOf(puntos);
            jLabel2.setText(puntos1);
        }

    }

    public void puntosmenos() {// delete  point
        if (puntos > 0) {
            puntos--;
            String puntos1 = String.valueOf(puntos);
            jLabel2.setText(puntos1);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextArea jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jbrfalso;
    private javax.swing.JRadioButton jbrverdadero;
    private javax.swing.JPanel jppanelprincipal;
    private javax.swing.ButtonGroup respuestas;
    // End of variables declaration//GEN-END:variables
}
