/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GABRIEL-PC
 */
public class Test extends javax.swing.JFrame {

   int i=0;
    public Test() throws InterruptedException {
        initComponents();
        
        Primero();
        Segundo();
        Tercero();
        Cuarto();
        Quinto();
        
       
        
    }
      public void OcultarPrimero() {
      PrimeroA.setVisible(false);
      SegundoA.setVisible(false);
      TerceroA.setVisible(false);
      CuartoA.setVisible(false);
      QuintoA.setVisible(false);
      SextoA.setVisible(false);
      SeptimoA.setVisible(false);
      OctavoA.setVisible(false);
      NovenoA.setVisible(false);
      DecimoA.setVisible(false);
      UndecimoA.setVisible(false);
      DoceaboA.setVisible(false);
      TerceroA.setVisible(false);
    }
    
    
    public void OcultarPrimeroNadado() {
        if(i==0){
       PrimeroA.setVisible(true);
      SegundoA.setVisible(false);
      TerceroA.setVisible(false);
      CuartoA.setVisible(false);
      QuintoA.setVisible(false);
      SextoA.setVisible(false);
      SeptimoA.setVisible(false);
      OctavoA.setVisible(false);
      NovenoA.setVisible(false);
      DecimoA.setVisible(false);
      UndecimoA.setVisible(false);
      DoceaboA.setVisible(false);
      TerceavoA.setVisible(false);
       }
        else if(i==1){
            PrimeroA.setVisible(false);
      SegundoA.setVisible(true);
      TerceroA.setVisible(false);
      CuartoA.setVisible(false);
      QuintoA.setVisible(false);
      SextoA.setVisible(false);
      SeptimoA.setVisible(false);
      OctavoA.setVisible(false);
      NovenoA.setVisible(false);
      DecimoA.setVisible(false);
      UndecimoA.setVisible(false);
      DoceaboA.setVisible(false);
      TerceavoA.setVisible(false);
      i++;
        }
        else if(i==2){
            PrimeroA.setVisible(false);
      SegundoA.setVisible(false);
      TerceroA.setVisible(true);
      CuartoA.setVisible(false);
      QuintoA.setVisible(false);
      SextoA.setVisible(false);
      SeptimoA.setVisible(false);
      OctavoA.setVisible(false);
      NovenoA.setVisible(false);
      DecimoA.setVisible(false);
      UndecimoA.setVisible(false);
      DoceaboA.setVisible(false);
      TerceavoA.setVisible(false);
        }
        else if(i==3){
            PrimeroA.setVisible(false);
      SegundoA.setVisible(false);
      TerceroA.setVisible(false);
      CuartoA.setVisible(true);
      QuintoA.setVisible(false);
      SextoA.setVisible(false);
      SeptimoA.setVisible(false);
      OctavoA.setVisible(false);
      NovenoA.setVisible(false);
      DecimoA.setVisible(false);
      UndecimoA.setVisible(false);
      DoceaboA.setVisible(false);
      TerceavoA.setVisible(false);
        }
        else if(i==4){
            PrimeroA.setVisible(false);
      SegundoA.setVisible(false);
      TerceroA.setVisible(false);
      CuartoA.setVisible(false);
      QuintoA.setVisible(true);
      SextoA.setVisible(false);
      SeptimoA.setVisible(false);
      OctavoA.setVisible(false);
      NovenoA.setVisible(false);
      DecimoA.setVisible(false);
      UndecimoA.setVisible(false);
      DoceaboA.setVisible(false);
      TerceavoA.setVisible(false);
      
    }
    }
    public void Movimiento1() throws InterruptedException {
        OcultarPrimero();
        int cont=0;
        while(cont <= 4){
            //OcultarPrimeroNadado(cont);
            Thread.sleep(5000);
           cont++;
        }
    }
    public void Primero() {
        PrimeroA.setVisible(false);
       
            
        
    }
    public  void Segundo() {
        PrimeroB.setVisible(false);
    }
     public  void Tercero() {
        PrimeroC.setVisible(false);
    }
     public  void Cuarto() {
        PrimeroD.setVisible(false);
    }
     public  void Quinto() {
        PrimeroE.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        TercerNadador = new javax.swing.JButton();
        CuartoNadador = new javax.swing.JButton();
        QuintoNadador = new javax.swing.JButton();
        SegundoNadador = new javax.swing.JButton();
        PrimerJugador = new javax.swing.JButton();
        SegundoB = new javax.swing.JLabel();
        CuartoB = new javax.swing.JLabel();
        QuintoB = new javax.swing.JLabel();
        UndecimoB = new javax.swing.JLabel();
        OctavoB = new javax.swing.JLabel();
        TerceroB = new javax.swing.JLabel();
        DecimoB = new javax.swing.JLabel();
        SextoB = new javax.swing.JLabel();
        PrimeroE = new javax.swing.JLabel();
        SeptimoB = new javax.swing.JLabel();
        NovenoB = new javax.swing.JLabel();
        DoceaboB = new javax.swing.JLabel();
        TerceavoB = new javax.swing.JLabel();
        PrimeroA = new javax.swing.JLabel();
        SegundoA = new javax.swing.JLabel();
        TerceroA = new javax.swing.JLabel();
        CuartoA = new javax.swing.JLabel();
        QuintoA = new javax.swing.JLabel();
        SextoA = new javax.swing.JLabel();
        SeptimoA = new javax.swing.JLabel();
        OctavoA = new javax.swing.JLabel();
        NovenoA = new javax.swing.JLabel();
        DecimoA = new javax.swing.JLabel();
        UndecimoA = new javax.swing.JLabel();
        DoceaboA = new javax.swing.JLabel();
        TerceavoA = new javax.swing.JLabel();
        PrimeroB = new javax.swing.JLabel();
        PrimeroC = new javax.swing.JLabel();
        PrimeroD = new javax.swing.JLabel();
        SegundoB1 = new javax.swing.JLabel();
        SegundoB2 = new javax.swing.JLabel();
        SegundoB3 = new javax.swing.JLabel();
        TerceroB1 = new javax.swing.JLabel();
        TerceroB2 = new javax.swing.JLabel();
        TerceroB3 = new javax.swing.JLabel();
        CuartoB1 = new javax.swing.JLabel();
        CuartoB2 = new javax.swing.JLabel();
        CuartoB3 = new javax.swing.JLabel();
        QuintoB1 = new javax.swing.JLabel();
        QuintoB2 = new javax.swing.JLabel();
        QuintoB3 = new javax.swing.JLabel();
        SextoB1 = new javax.swing.JLabel();
        SextoB2 = new javax.swing.JLabel();
        SextoB3 = new javax.swing.JLabel();
        SeptimoB1 = new javax.swing.JLabel();
        SeptimoB2 = new javax.swing.JLabel();
        SeptimoB3 = new javax.swing.JLabel();
        OctavoB1 = new javax.swing.JLabel();
        OctavoB2 = new javax.swing.JLabel();
        OctavoB3 = new javax.swing.JLabel();
        NovenoB1 = new javax.swing.JLabel();
        NovenoB2 = new javax.swing.JLabel();
        NovenoB3 = new javax.swing.JLabel();
        DecimoB1 = new javax.swing.JLabel();
        DecimoB2 = new javax.swing.JLabel();
        DecimoB3 = new javax.swing.JLabel();
        UndecimoB1 = new javax.swing.JLabel();
        UndecimoB2 = new javax.swing.JLabel();
        UndecimoB3 = new javax.swing.JLabel();
        DoceaboB2 = new javax.swing.JLabel();
        DoceaboB3 = new javax.swing.JLabel();
        DoceaboB4 = new javax.swing.JLabel();
        TerceavoB1 = new javax.swing.JLabel();
        TerceavoB2 = new javax.swing.JLabel();
        TerceavoB3 = new javax.swing.JLabel();
        FOndo = new javax.swing.JLabel();
        Boton = new javax.swing.JButton();

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosandPersonas/jasjdasjdaksd.png"))); // NOI18N

        jLabel6.setText("jLabel2");

        jLabel5.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 51, 0));
        panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelKeyPressed(evt);
            }
        });
        panel.setLayout(null);

        TercerNadador.setBackground(new java.awt.Color(0, 153, 255));
        TercerNadador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosandPersonas/2pvvmuliq533q_normal_face.png"))); // NOI18N
        TercerNadador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TercerNadadorActionPerformed(evt);
            }
        });
        panel.add(TercerNadador);
        TercerNadador.setBounds(180, 80, 70, 105);

        CuartoNadador.setBackground(new java.awt.Color(0, 153, 255));
        CuartoNadador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosandPersonas/23yqs5ns6d83v_normal_face.png"))); // NOI18N
        CuartoNadador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuartoNadadorActionPerformed(evt);
            }
        });
        panel.add(CuartoNadador);
        CuartoNadador.setBounds(20, 200, 60, 105);

        QuintoNadador.setBackground(new java.awt.Color(0, 153, 255));
        QuintoNadador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosandPersonas/22jw86m97nt1q_normal_face.png"))); // NOI18N
        QuintoNadador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuintoNadadorActionPerformed(evt);
            }
        });
        panel.add(QuintoNadador);
        QuintoNadador.setBounds(110, 200, 60, 105);

        SegundoNadador.setBackground(new java.awt.Color(51, 153, 255));
        SegundoNadador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosandPersonas/asas.png"))); // NOI18N
        SegundoNadador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SegundoNadador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegundoNadadorActionPerformed(evt);
            }
        });
        panel.add(SegundoNadador);
        SegundoNadador.setBounds(100, 80, 70, 105);

        PrimerJugador.setBackground(new java.awt.Color(51, 153, 255));
        PrimerJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosandPersonas/3s1gd20o1l4tm_normal_face.png"))); // NOI18N
        PrimerJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PrimerJugador.setDefaultCapable(false);
        PrimerJugador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PrimerJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimerJugadorActionPerformed(evt);
            }
        });
        panel.add(PrimerJugador);
        PrimerJugador.setBounds(20, 80, 70, 105);

        SegundoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        panel.add(SegundoB);
        SegundoB.setBounds(840, 40, 80, 30);

        CuartoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        CuartoB.setText("jLabel2");
        panel.add(CuartoB);
        CuartoB.setBounds(850, 120, 60, 70);

        QuintoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(QuintoB);
        QuintoB.setBounds(850, 170, 50, 60);

        UndecimoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        UndecimoB.setText("jLabel1");
        panel.add(UndecimoB);
        UndecimoB.setBounds(840, 400, 80, 40);

        OctavoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        OctavoB.setText("jLabel4");
        panel.add(OctavoB);
        OctavoB.setBounds(850, 260, 70, 90);

        TerceroB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(TerceroB);
        TerceroB.setBounds(740, 70, 70, 63);

        DecimoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(DecimoB);
        DecimoB.setBounds(860, 370, 53, 36);

        SextoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(SextoB);
        SextoB.setBounds(850, 200, 80, 50);

        PrimeroE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(PrimeroE);
        PrimeroE.setBounds(850, 10, 50, 30);

        SeptimoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        SeptimoB.setText("jLabel4");
        panel.add(SeptimoB);
        SeptimoB.setBounds(840, 220, 80, 80);

        NovenoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        NovenoB.setText("jLabel13");
        panel.add(NovenoB);
        NovenoB.setBounds(850, 320, 70, 60);

        DoceaboB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(DoceaboB);
        DoceaboB.setBounds(850, 440, 70, 70);

        TerceavoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(TerceavoB);
        TerceavoB.setBounds(850, 500, 50, 40);

        PrimeroA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(PrimeroA);
        PrimeroA.setBounds(440, 10, 50, 30);

        SegundoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        panel.add(SegundoA);
        SegundoA.setBounds(430, 20, 90, 70);

        TerceroA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(TerceroA);
        TerceroA.setBounds(440, 70, 70, 63);

        CuartoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        CuartoA.setText("jLabel2");
        panel.add(CuartoA);
        CuartoA.setBounds(440, 130, 60, 60);

        QuintoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(QuintoA);
        QuintoA.setBounds(450, 170, 50, 60);

        SextoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(SextoA);
        SextoA.setBounds(440, 200, 80, 50);

        SeptimoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        SeptimoA.setText("jLabel4");
        panel.add(SeptimoA);
        SeptimoA.setBounds(430, 210, 80, 90);

        OctavoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        OctavoA.setText("jLabel4");
        panel.add(OctavoA);
        OctavoA.setBounds(440, 250, 70, 90);

        NovenoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        NovenoA.setText("jLabel13");
        panel.add(NovenoA);
        NovenoA.setBounds(440, 310, 70, 60);

        DecimoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(DecimoA);
        DecimoA.setBounds(450, 370, 53, 36);

        UndecimoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        UndecimoA.setText("jLabel1");
        panel.add(UndecimoA);
        UndecimoA.setBounds(430, 400, 80, 40);

        DoceaboA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(DoceaboA);
        DoceaboA.setBounds(430, 440, 70, 70);

        TerceavoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(TerceavoA);
        TerceavoA.setBounds(440, 510, 50, 40);

        PrimeroB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(PrimeroB);
        PrimeroB.setBounds(540, 0, 50, 40);

        PrimeroC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(PrimeroC);
        PrimeroC.setBounds(640, 0, 50, 40);

        PrimeroD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(PrimeroD);
        PrimeroD.setBounds(750, 0, 50, 40);

        SegundoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        panel.add(SegundoB1);
        SegundoB1.setBounds(530, 20, 90, 70);

        SegundoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        panel.add(SegundoB2);
        SegundoB2.setBounds(630, 30, 90, 40);

        SegundoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        panel.add(SegundoB3);
        SegundoB3.setBounds(740, 40, 80, 30);

        TerceroB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(TerceroB1);
        TerceroB1.setBounds(540, 70, 70, 63);

        TerceroB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(TerceroB2);
        TerceroB2.setBounds(640, 70, 70, 63);

        TerceroB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(TerceroB3);
        TerceroB3.setBounds(850, 70, 70, 63);

        CuartoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        CuartoB1.setText("jLabel2");
        panel.add(CuartoB1);
        CuartoB1.setBounds(540, 130, 60, 60);

        CuartoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        CuartoB2.setText("jLabel2");
        panel.add(CuartoB2);
        CuartoB2.setBounds(640, 130, 60, 60);

        CuartoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        CuartoB3.setText("jLabel2");
        panel.add(CuartoB3);
        CuartoB3.setBounds(750, 130, 60, 60);

        QuintoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(QuintoB1);
        QuintoB1.setBounds(550, 170, 50, 60);

        QuintoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(QuintoB2);
        QuintoB2.setBounds(640, 170, 50, 60);

        QuintoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(QuintoB3);
        QuintoB3.setBounds(750, 170, 50, 60);

        SextoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(SextoB1);
        SextoB1.setBounds(540, 200, 80, 50);

        SextoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(SextoB2);
        SextoB2.setBounds(640, 210, 80, 50);

        SextoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(SextoB3);
        SextoB3.setBounds(750, 200, 80, 50);

        SeptimoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        SeptimoB1.setText("jLabel4");
        panel.add(SeptimoB1);
        SeptimoB1.setBounds(530, 220, 80, 90);

        SeptimoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        SeptimoB2.setText("jLabel4");
        panel.add(SeptimoB2);
        SeptimoB2.setBounds(630, 220, 80, 90);

        SeptimoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        SeptimoB3.setText("jLabel4");
        panel.add(SeptimoB3);
        SeptimoB3.setBounds(740, 220, 80, 70);

        OctavoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        OctavoB1.setText("jLabel4");
        panel.add(OctavoB1);
        OctavoB1.setBounds(540, 260, 70, 90);

        OctavoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        OctavoB2.setText("jLabel4");
        panel.add(OctavoB2);
        OctavoB2.setBounds(640, 260, 70, 90);

        OctavoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        OctavoB3.setText("jLabel4");
        panel.add(OctavoB3);
        OctavoB3.setBounds(750, 260, 70, 90);

        NovenoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        NovenoB1.setText("jLabel13");
        panel.add(NovenoB1);
        NovenoB1.setBounds(540, 320, 70, 60);

        NovenoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        NovenoB2.setText("jLabel13");
        panel.add(NovenoB2);
        NovenoB2.setBounds(640, 320, 70, 60);

        NovenoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk4.png"))); // NOI18N
        NovenoB3.setText("jLabel13");
        panel.add(NovenoB3);
        NovenoB3.setBounds(750, 320, 70, 60);

        DecimoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(DecimoB1);
        DecimoB1.setBounds(540, 370, 53, 36);

        DecimoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(DecimoB2);
        DecimoB2.setBounds(650, 370, 53, 36);

        DecimoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/Sin título.png"))); // NOI18N
        panel.add(DecimoB3);
        DecimoB3.setBounds(750, 370, 53, 36);

        UndecimoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        UndecimoB1.setText("jLabel1");
        panel.add(UndecimoB1);
        UndecimoB1.setBounds(530, 400, 80, 40);

        UndecimoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        UndecimoB2.setText("jLabel1");
        panel.add(UndecimoB2);
        UndecimoB2.setBounds(630, 400, 80, 40);

        UndecimoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imgaenkk5.png"))); // NOI18N
        UndecimoB3.setText("jLabel1");
        panel.add(UndecimoB3);
        UndecimoB3.setBounds(730, 400, 80, 40);

        DoceaboB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(DoceaboB2);
        DoceaboB2.setBounds(530, 440, 70, 70);

        DoceaboB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(DoceaboB3);
        DoceaboB3.setBounds(640, 440, 70, 70);

        DoceaboB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk1.png"))); // NOI18N
        panel.add(DoceaboB4);
        DoceaboB4.setBounds(750, 440, 70, 70);

        TerceavoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(TerceavoB1);
        TerceavoB1.setBounds(750, 500, 50, 40);

        TerceavoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(TerceavoB2);
        TerceavoB2.setBounds(540, 510, 50, 40);

        TerceavoB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nadadores/imagenkk3_1.png"))); // NOI18N
        panel.add(TerceavoB3);
        TerceavoB3.setBounds(650, 510, 50, 40);

        FOndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosandPersonas/jasjdasjdaksd.png"))); // NOI18N
        panel.add(FOndo);
        FOndo.setBounds(410, -20, 530, 610);

        Boton.setBackground(new java.awt.Color(51, 153, 255));
        Boton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton.setText("Iniciar");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });
        panel.add(Boton);
        Boton.setBounds(280, 80, 100, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SegundoNadadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegundoNadadorActionPerformed
        PrimeroB.setVisible(true);
       
    }//GEN-LAST:event_SegundoNadadorActionPerformed

    private void PrimerJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimerJugadorActionPerformed

        PrimeroA.setVisible(true);
    }//GEN-LAST:event_PrimerJugadorActionPerformed

    private void TercerNadadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TercerNadadorActionPerformed
      PrimeroC.setVisible(true);
    }//GEN-LAST:event_TercerNadadorActionPerformed

    private void CuartoNadadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuartoNadadorActionPerformed
       PrimeroD.setVisible(true);
    }//GEN-LAST:event_CuartoNadadorActionPerformed

    private void QuintoNadadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuintoNadadorActionPerformed
        PrimeroE.setVisible(true);
    }//GEN-LAST:event_QuintoNadadorActionPerformed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        try {
            Movimiento1();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Apart.mover();
        ArrayList ListRandom=new ArrayList();
       
        for (int x=0; x>ListRandom.size(); x++ ){
             int X=(int)(Math.random()*5);
              ListRandom.add(X);
            
        }
    }//GEN-LAST:event_BotonActionPerformed

    private void panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelKeyPressed
        if(evt.getKeyCode() == 40){
            OcultarPrimeroNadado();
        }
    }//GEN-LAST:event_panelKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
         if(evt.getKeyCode() == 40){
            OcultarPrimeroNadado();
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Test().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JLabel CuartoA;
    private javax.swing.JLabel CuartoB;
    private javax.swing.JLabel CuartoB1;
    private javax.swing.JLabel CuartoB2;
    private javax.swing.JLabel CuartoB3;
    private javax.swing.JButton CuartoNadador;
    private javax.swing.JLabel DecimoA;
    private javax.swing.JLabel DecimoB;
    private javax.swing.JLabel DecimoB1;
    private javax.swing.JLabel DecimoB2;
    private javax.swing.JLabel DecimoB3;
    private javax.swing.JLabel DoceaboA;
    private javax.swing.JLabel DoceaboB;
    private javax.swing.JLabel DoceaboB2;
    private javax.swing.JLabel DoceaboB3;
    private javax.swing.JLabel DoceaboB4;
    private javax.swing.JLabel FOndo;
    private javax.swing.JLabel NovenoA;
    private javax.swing.JLabel NovenoB;
    private javax.swing.JLabel NovenoB1;
    private javax.swing.JLabel NovenoB2;
    private javax.swing.JLabel NovenoB3;
    private javax.swing.JLabel OctavoA;
    private javax.swing.JLabel OctavoB;
    private javax.swing.JLabel OctavoB1;
    private javax.swing.JLabel OctavoB2;
    private javax.swing.JLabel OctavoB3;
    private javax.swing.JButton PrimerJugador;
    private javax.swing.JLabel PrimeroA;
    private javax.swing.JLabel PrimeroB;
    private javax.swing.JLabel PrimeroC;
    private javax.swing.JLabel PrimeroD;
    private javax.swing.JLabel PrimeroE;
    private javax.swing.JLabel QuintoA;
    private javax.swing.JLabel QuintoB;
    private javax.swing.JLabel QuintoB1;
    private javax.swing.JLabel QuintoB2;
    private javax.swing.JLabel QuintoB3;
    private javax.swing.JButton QuintoNadador;
    private javax.swing.JLabel SegundoA;
    private javax.swing.JLabel SegundoB;
    private javax.swing.JLabel SegundoB1;
    private javax.swing.JLabel SegundoB2;
    private javax.swing.JLabel SegundoB3;
    private javax.swing.JButton SegundoNadador;
    private javax.swing.JLabel SeptimoA;
    private javax.swing.JLabel SeptimoB;
    private javax.swing.JLabel SeptimoB1;
    private javax.swing.JLabel SeptimoB2;
    private javax.swing.JLabel SeptimoB3;
    private javax.swing.JLabel SextoA;
    private javax.swing.JLabel SextoB;
    private javax.swing.JLabel SextoB1;
    private javax.swing.JLabel SextoB2;
    private javax.swing.JLabel SextoB3;
    private javax.swing.JLabel TerceavoA;
    private javax.swing.JLabel TerceavoB;
    private javax.swing.JLabel TerceavoB1;
    private javax.swing.JLabel TerceavoB2;
    private javax.swing.JLabel TerceavoB3;
    private javax.swing.JButton TercerNadador;
    private javax.swing.JLabel TerceroA;
    private javax.swing.JLabel TerceroB;
    private javax.swing.JLabel TerceroB1;
    private javax.swing.JLabel TerceroB2;
    private javax.swing.JLabel TerceroB3;
    private javax.swing.JLabel UndecimoA;
    private javax.swing.JLabel UndecimoB;
    private javax.swing.JLabel UndecimoB1;
    private javax.swing.JLabel UndecimoB2;
    private javax.swing.JLabel UndecimoB3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
