/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaNadadores;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author GABRIEL-PC
 */
public class NadadoresHilos4F1 extends JFrame {
 QA variable = new QA();
 int nueva = variable.AA;
  
    int cont=0;
       
        int Carreras= 0;
     private javax.swing.JButton Estadisticas;
        
    JPanel[] Panelp;
    
    JPanel[] paneles;
    
    JLabel[] labels;
    
    String[] nombres = {"FernandaSE","RicardoRA"};
    JButton boton;
    JTextPane a;
    

    int ANCHO = 1100;

    public NadadoresHilos4F1() {
      

        setLayout(new GridLayout(0, 1));
       
        
        paneles = new JPanel[2];
        labels = new JLabel[2];
        
        for (int n = 0; n < 2; n++) {
            paneles[n] = new JPanel();
            add(paneles[n]);
            
            labels[n] = new JLabel(nombres[n]);
            labels[n].setIcon(new ImageIcon(getClass().getResource(nombres[n] + ".gif")));
            paneles[n].add(labels[n]);
             paneles[n].setBackground(Color.blue);
            labels[n].setLocation(0, 0);
           
        }
        a = new JTextPane();
         Estadisticas=new JButton("Estadisticas");
        Estadisticas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                int A1 = Integer.parseInt(JOptionPane.showInputDialog("<------------------------Estadisticas------------------------->"
                        + "\n1-Cantidad de veces que ha ganado cada competidor"
                        + "\n2-Cantidad de Carrearas efectuadas"
                        + "\n3-Competidor que ha ganado más veces"
                        + "\n4-Competidor que ha perdido más veces"
                        + "\n5-Cantidad de empates que se han registrado"));
                
                        switch(A1){
                            case 1:
                                
                            case 2:
                                JOptionPane.showMessageDialog(null,"Cantidad de carreras efectuadas "+Carreras,"Estadisticas",JOptionPane.INFORMATION_MESSAGE);
                
                            case 3:
                                
                            case 4:
                                
                            case 5:
                                
                            case 6:
                     
                        }
            }
        });
        add(Estadisticas);
        boton = new JButton("Iniciar");
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"La competencia esta apunto de comenzar","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                int Lo = (int) (Math.random() * 7);
                
                Nadadores QuintoJugador = new Nadadores("QuintoJugador", ANCHO - 3, labels[0]);
                Nadadores CuartoJugador = new Nadadores("CuartoJugador", ANCHO - 3, labels[1]);
               
               
               

                System.out.println(Lo);
              Reloj nadadoresHilos3 = new Reloj();
                
                nadadoresHilos3.setVisible(true);
                Reloj btnPausar= new Reloj();
                
                QuintoJugador.start();
                CuartoJugador.start();
               Carreras+=1;
                 

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(boton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100, 0);
        setSize(ANCHO, 1000);
        setVisible(true);
    }
    
            
    

    public static void main(String[] args) {
        NadadoresHilos4F1 nadadoresHilos = new NadadoresHilos4F1();
    }
}
