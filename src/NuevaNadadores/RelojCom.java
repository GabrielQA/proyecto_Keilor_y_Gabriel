/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaNadadores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class RelojCom extends javax.swing.JFrame {

    public RelojCom() {
        initComponents();
        t = new Timer(10, acciones);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        EtiquetaTiempo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        ASA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setText("Iniciar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        btnPausar.setText("Reanudar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 80, -1));

        EtiquetaTiempo.setBackground(new java.awt.Color(51, 0, 51));
        EtiquetaTiempo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(EtiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 228, 40));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Tiempo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnStop.setText("Detener");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 80, -1));

        ASA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevaNadadores/RelojIma2.gif"))); // NOI18N
        ASA.setText("jLabel2");
        getContentPane().add(ASA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 130));

        pack();
    }// </editor-fold>                        

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {
        t.start();
        btnStart.setText("Iniciar");
        btnPausar.setVisible(true);
        btnStop.setVisible(true);
        btnPausar.setEnabled(true);
        btnStop.setEnabled(true);

    }

    public void Detener() {
        t.stop();
        btnStart.setEnabled(true);
        btnPausar.setEnabled(true);

    }

    public void Iniciar() {
        t.start();
        btnStart.setText("Reanudar");
        btnPausar.setVisible(true);
        btnStop.setVisible(true);
        btnPausar.setEnabled(true);
        btnStop.setEnabled(true);

    }

    public void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {
        t.stop();
        btnStart.setEnabled(true);
        btnPausar.setEnabled(true);
    }

    public void btnStopActionPerformed(java.awt.event.ActionEvent evt) {
        if (t.isRunning()) {
            t.stop();
            btnStart.setEnabled(true);
        }
        btnStart.setText("Iniciar");
        btnPausar.setEnabled(true);
        btnStop.setEnabled(true);
        m = 0;
        s = 0;
        cs = 0;
        actualizarLabel();
    }
    public Timer t;
    public int m, s, cs;
    public ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs++;
            if (cs == 100) {
                cs = 0;
                ++s;

            }
            if (s == 60) {
                s = 0;
                ++m;
            }
            if (m == 60) {
                m = 0;

            }
            actualizarLabel();

        }
    };

    public void actualizarLabel() {
        String tiempo = (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs;
        EtiquetaTiempo.setText(tiempo);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelojCom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JLabel ASA;
    public javax.swing.JLabel EtiquetaTiempo;
    public javax.swing.JButton btnPausar;
    public javax.swing.JButton btnStart;
    public javax.swing.JButton btnStop;
    public javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
