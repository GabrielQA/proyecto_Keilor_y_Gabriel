/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NuevaNadadores;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author GABRIEL-PC
 */
//This class what it does is that it appears the menu of the 
//beginning and that there are 3 options to start, instructions, and list of competitors once touched the option to start
//Will unfold what would be the question of how many competitors will compete,
//Once this question is answered, select which of the competitors will compete,
//once said this option is called the class with the names selected by the user.
public class QA extends javax.swing.JFrame {

    ArrayList<String> Lista = new ArrayList();

    int AA;

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

        jButton24 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton24.setText("Competidores");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 140, 30));

        jButton1.setText("Instrucciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
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
        int Insertar1 = Integer.parseInt(JOptionPane.showInputDialog("¡Cantidad de competidores!"));
        /*int cont = 0;
        String REq = "";
        if (Insertar1 == 2) {
            int AA = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int AAA = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));

            if (AA == 1 && AAA == 2 || AA == 2 && AAA == 1 ) {
                NadadoresHilos4 nadadoresHilos3 = new NadadoresHilos4();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            }else if(AA==1|| AA==3 && AAA==1 || AAA==3){
                
            }
        } else if (Insertar1 == 3) {
            int AA = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int AAA = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int AAAA = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            if(AA == 1 || AA == 2 || AA == 3 || AAA == 1 || AAA==2 ||  AAA==3|| AAAA==1 ||AAAA==2||AAAA==3 ){
            NadadoresHilos3 nadadoresHilos3 = new NadadoresHilos3();
            nadadoresHilos3.setLocationRelativeTo(null);
            nadadoresHilos3.setVisible(true);
            }
        }*/
            if(Insertar1==1){
                  JOptionPane.showMessageDialog(null,"Cantidad minima 2","MM", JOptionPane.INFORMATION_MESSAGE);
            }else if(Insertar1 == 2) {
            int A1 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int A2 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            if (A1 == 1 && A2 == 2 || A1 == 2 && A2 == 1) {
                NadadoresHilos4 nadadoresHilos3 = new NadadoresHilos4();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 1 && A2 == 3 || A1 == 3 && A2 == 1) {
                NadadoresHilos4p2 nadadoresHilos3 = new NadadoresHilos4p2();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 1 && A2 == 4 || A1 == 4 && A2 == 1) {
                NadadoresHilos4p3 nadadoresHilos3 = new NadadoresHilos4p3();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 1 && A2 == 5 || A1 == 5 && A2 == 1) {
                NadadoresHilos4p4 nadadoresHilosqwe = new NadadoresHilos4p4();
                nadadoresHilosqwe.setLocationRelativeTo(null);
                nadadoresHilosqwe.setVisible(true);
            } else if (A1 == 2 && A2 == 3 || A1 == 3 && A2 == 2) {
                NadadoresHilos4F1 nadadoresHilos3 = new NadadoresHilos4F1();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 2 && A2 == 4 || A1 == 4 && A2 == 2) {
                NadadoresHilos4F2 nadadoresHilos3 = new NadadoresHilos4F2();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 2 && A2 == 5 || A1 == 5 && A2 == 2) {
                NadadoresHilos4F3 nadadoresHilos3 = new NadadoresHilos4F3();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 3 && A2 == 4 || A1 == 4 && A2 == 2) {
                NadadoresHilos4R1 nadadoresHilos3 = new NadadoresHilos4R1();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 3 && A2 == 5 || A1 == 5 && A2 == 2) {
                NadadoresHilos4R2 nadadoresHilos3 = new NadadoresHilos4R2();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 4 && A2 == 5 || A1 == 5 && A2 == 4) {
                NadadoresHilos4L1 nadadoresHilos3 = new NadadoresHilos4L1();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            }

        } else if (Insertar1 == 3) {
            /*
            String A=JOptionPane.showInputDialog("Lista de Competidores"+Lista+"\nA-Agregar\nB-Eliminar\nC-Continuar");
            if(A==A){
            String ABC=JOptionPane.showInputDialog(Lista);
            String V=JOptionPane.showInputDialog("Agregar competidor");
            Lista.add(V);
            
                System.out.println(Lista);
            }else if(A=="B"){
            String ABC=JOptionPane.showInputDialog(Lista);
            String V=JOptionPane.showInputDialog("Eliminar competidor");
            Lista.remove(V);
            System.out.println(Lista);
             */
            int A1 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int A2 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int A3 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));

            if (A1 == 1 && A2 == 2 && A3 == 3 ||A1 == 1 && A2 == 3 && A3 ==2  || A1 == 2 && A2 == 3 && A3 == 1 || A1 == 2 && A2 == 1 && A3 == 3 || A1 == 3 && A2 == 1 && A3 == 2 || A1 == 3 && A2 == 2 && A3 == 1) {
                NadadoresHilos3 nadadoresHilos3 = new NadadoresHilos3();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 1 && A2 == 2 && A3 == 4 || A1 == 1 && A2 == 4 && A3 == 2 || A1 == 2 && A2 == 4 && A3 == 1 || A1 == 2 && A2 == 1 && A3 == 4 || A1 == 4 && A2 == 1 && A3 == 2|| A1 == 4 && A2 == 2 && A3 == 1) {
                NadadoresHilos3p2 nadadoresHilos3 = new NadadoresHilos3p2();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 1 && A2 == 2 && A3 == 5 || A1 == 1 && A2 == 5 && A3 == 2|| A1 == 2 && A2 == 5 && A3 == 1 || A1 == 2 && A2 == 1 && A3 == 5|| A1 == 5 && A2 == 1 && A3 == 2|| A1 == 5 && A2 == 2 && A3 == 1) {
                NadadoresHilos3p3 nadadoresHilos3 = new NadadoresHilos3p3();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 1 && A2 == 3 && A3 == 4  || A1 == 1 && A2 == 4 && A3 == 3|| A1 == 3 && A2 == 4 && A3 == 1|| A1 == 3 && A2 == 1 && A3 == 4 || A1 == 4 && A2 == 1 && A3 == 3|| A1 == 4 && A2 == 3 && A3 == 1) {
                NadadoresHilos3p4 nadadoresHilos3 = new NadadoresHilos3p4();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 1 && A2 == 3 && A3 == 5 ||A1 == 1 && A2 == 5 && A3 == 3|| A1 == 3 && A2 == 5 && A3 == 1|| A1 == 3 && A2 == 1 && A3 == 5 || A1 == 5 && A2 == 1 && A3 == 3|| A1 == 5 && A2 == 3 && A3 == 1) {
                NadadoresHilos3p5 nadadoresHilos3 = new NadadoresHilos3p5();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 1 && A2 == 5 && A3 == 4 ||A1 == 1 && A2 == 4 && A3 == 5|| A1 == 5 && A2 == 4 && A3 == 1 ||A1 == 5 && A2 == 1 && A3 == 4 || A1 == 4 && A2 == 1 && A3 == 5|| A1 == 4 && A2 == 5 && A3 == 1) {
                NadadoresHilos3p6 nadadoresHilos3 = new NadadoresHilos3p6();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 2 && A2 == 3 && A3 == 4||A1 == 2 && A2 == 4 && A3 == 3 || A1 == 3 && A2 == 4 && A3 == 2 || A1 == 3 && A2 == 2 && A3 == 4 || A1 == 4 && A2 == 2 && A3 == 3|| A1 == 4 && A2 == 3 && A3 == 2) {
                NadadoresHilos3F1 nadadoresHilos3 = new NadadoresHilos3F1();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 2 && A2 == 3 && A3 == 5||A1 == 2 && A2 == 5 && A3 == 3 || A1 == 3 && A2 == 5 && A3 == 2|| A1 == 3 && A2 == 2 && A3 == 5 || A1 == 5 && A2 == 2 && A3 == 3|| A1 == 5 && A2 == 3 && A3 == 2) {
                NadadoresHilos3F2 nadadoresHilos3 = new NadadoresHilos3F2();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 2 && A2 == 4 && A3 == 5||A1 == 2 && A2 == 5 && A3 == 4 || A1 == 4 && A2 == 5 && A3 == 2 ||A3 == 4 || A1 == 4 && A2 == 2 && A3 == 5|| A1 == 5 && A2 == 2 && A3 == 4||A1 == 5 && A2 == 4 && A3 == 2) {
                NadadoresHilos3F3 nadadoresHilos3 = new NadadoresHilos3F3();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (A1 == 3 && A2 == 4 && A3 == 5 ||A1 == 3 && A2 == 5 && A3 == 4 || A1 == 5 && A2 == 3 && A3 == 4|| A1 == 5 && A2 == 4 && A3 == 3 || A1 == 4 && A2 == 5 && A3 == 3|| A1 == 4 && A2 == 3 && A3 == 5) {
                NadadoresHilos3R1 nadadoresHilos3 = new NadadoresHilos3R1();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            }
        } else if (Insertar1 == 4) {
            int A1 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int A2 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int A3 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
            int A4 = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));

            if (A1 == 1 && A2 == 2 && A3 == 3 && A4 == 4 ||A1 == 1 && A2 == 2 && A3 == 4 && A4 == 3 || A1 == 2 && A2 == 1 && A3 == 4 && A4 == 3|| A1 == 2 && A2 == 1 && A3 == 3 && A4 == 4 || A1 == 4 && A2 == 3 && A3 == 1 && A4 == 2 || A1 == 4 && A2 == 3 && A3 == 2 && A4 == 1 || A1 == 3 && A2 == 4 && A3 == 2 && A4 == 1|| A1 == 3 && A2 == 4 && A3 == 1 && A4 == 2) {
                NadadoresHilos2 nadadoresHilos2 = new NadadoresHilos2();
                nadadoresHilos2.setLocationRelativeTo(null);
                nadadoresHilos2.setVisible(true);
                
            }else if (A1 == 1 &&  A2 == 2 &&  A3 == 3 &&  A4 == 5 ||A1 == 1 &&  A2 == 2 &&  A3 == 5 &&  A4 == 3 || A1 == 2 && A2 == 1 && A3 == 5 && A4 == 3|| A1 == 2 && A2 == 1 && A3 == 3 && A4 == 5 || A1 == 5 && A2 == 3 && A3 == 1 && A4 == 2|| A1 == 5 && A2 == 3 && A3 == 2 && A4 == 1 || A1 == 3 && A2 == 5 && A3 == 2 && A4 == 1|| A1 == 3 && A2 == 5 && A3 == 1 && A4 == 2) {
                NadadoresHilos2p2 nadadoresHilos0 = new NadadoresHilos2p2();
                nadadoresHilos0.setLocationRelativeTo(null);
                nadadoresHilos0.setVisible(true);
            }else if (A1 == 1 && A2 == 2 && A3 == 4 && A4 == 5||A1 == 1 && A2 == 2 && A3 == 5 && A4 == 4 || A1 == 5 && A2 == 1 && A3 == 2 && A4 == 4|| A1 == 5 && A2 == 1 && A3 == 4 && A4 == 2 || A1 == 4 && A2 == 5 && A3 == 1 && A4 == 2 || A1 == 4 && A2 == 5 && A3 == 2 && A4 == 1|| A1 == 2 && A2 == 1 && A3 == 5 && A4 == 4||A1 == 2 && A2 == 1 && A3 == 4 && A4 == 5) {
                NadadoresHilos2p3 nadadoresHilos2 = new NadadoresHilos2p3();
                nadadoresHilos2.setLocationRelativeTo(null);
                nadadoresHilos2.setVisible(true);
            }else if (A1 == 1 && A2 == 3 && A3 == 5 && A4 == 4||A1 == 1 && A2 == 3 && A3 == 4 && A4 == 5 || A1 == 3 && A2 == 1 && A3 == 4 && A4 == 5 || A1 == 3 && A2 == 1 && A3 == 5 && A4 == 4|| A1 == 4 && A2 == 5 && A3 == 1 && A4 == 3 || A1 == 4 && A2 == 5 && A3 == 3 && A4 == 1|| A1 == 5 && A2 == 4 && A3 == 3 && A4 == 1||A1 == 5 && A2 == 4 && A3 == 3 && A4 == 1) {
                NadadoresHilos2p4 nadadoresHilos2 = new NadadoresHilos2p4();
                nadadoresHilos2.setLocationRelativeTo(null);
                nadadoresHilos2.setVisible(true);
            }else if (A1 == 2 && A2 == 3 && A3 == 5 && A4 == 4 ||A1 == 2 && A2 == 3 && A3 == 4 && A4 == 5 || A1 == 3 && A2 == 2 && A3 == 4 && A4 == 5|| A1 == 3 && A2 == 2 && A3 == 5 && A4 == 4 || A1 == 4 && A2 == 5 && A3 == 2 && A4 == 3 || A1 == 4 && A2 == 5 && A3 == 3 && A4 == 2 || A1 == 5 && A2 == 4 && A3 == 3 && A4 == 2|| A1 == 5 && A2 == 4 && A3 == 2 && A4 == 3) {
                NadadoresHilos2p5 nadadoresHilos2 = new NadadoresHilos2p5();
                nadadoresHilos2.setLocationRelativeTo(null);
                nadadoresHilos2.setVisible(true);
            }

        } else if (Insertar1 == 5) {
            NadadoresHilos nadadoresHilos = new NadadoresHilos();
            nadadoresHilos.setLocationRelativeTo(null);
            nadadoresHilos.setVisible(true);
        }
        /*while(cont<=Insertar1-1){
             AA = Integer.parseInt(JOptionPane.showInputDialog("Lista de Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA\nIngrese el numero del competidor que va a participar."));
             cont+=1;
             REq+=AA;
        }*/
 /*if (Insertar1 == 5) {
            NadadoresHilos nadadoresHilos = new NadadoresHilos();
            nadadoresHilos.setLocationRelativeTo(null);
            nadadoresHilos.setVisible(true);
        } else if (Insertar1 == 4) {
            NadadoresHilos2 nadadoresHilos2 = new NadadoresHilos2();
            nadadoresHilos2.setLocationRelativeTo(null);
            nadadoresHilos2.setVisible(true);
        } else if (Insertar1 == 3) {
            NadadoresHilos3 nadadoresHilos3 = new NadadoresHilos3();
            nadadoresHilos3.setLocationRelativeTo(null);
            nadadoresHilos3.setVisible(true);
        } else if (Insertar1 == 2) {
            if (AA == 1 && AA == 2) {
                NadadoresHilos4 nadadoresHilos3 = new NadadoresHilos4();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            } else if (AA == 1 && AA == 3) {
                NadadoresHilos4p2 nadadoresHilos3 = new NadadoresHilos4p2();
                nadadoresHilos3.setLocationRelativeTo(null);
                nadadoresHilos3.setVisible(true);
            }

        } else if (Insertar1 > 5) {
            JOptionPane.showMessageDialog(null, "Competidores maxima 5", "Mm", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Competidores minimos 2", "Mm", JOptionPane.INFORMATION_MESSAGE);

        }*/

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "AL presionar el boton iniciar, se desplegara una pregunta de cuantos competidores van a establecerse en la carrera\nLa posicion de cada competidor ira al azar.\n"
                + "\nCantidad Maxima de competidores 5\nCantidad Minima de competidores 2\nUna vez haya visto la lista debe seleccionar "
                + "los copetidores de acuerdo al numero indicado.\n Una vez ya hayas seleccioando los competidores, se desplegará el inicio del juego para empezar a competir."
                + "\nAl darle iniciar al juego la competencia iniciara, una vez que todos haigan llegado a la meta, volveran a su posicion original ahi desides si volver a jugar otra\n"
                + "oh ver las estadisticas.", "Mm", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        JOptionPane.showMessageDialog(null, "Competidores\n1-JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA", "Mm", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton24ActionPerformed

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
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel jLabel77;
    // End of variables declaration//GEN-END:variables
}
