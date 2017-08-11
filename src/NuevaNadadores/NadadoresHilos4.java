/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaNadadores;

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
public class NadadoresHilos4 extends JFrame {
     JPanel[] Panelp;
    
    JPanel[] paneles;
    JLabel[] labels;
    String[] nombres = {"QuintoJugador", "CuartoJugador"};
    JButton boton;
    JTextPane a;
    

    int ANCHO = 1100;

    public NadadoresHilos4() {
        setLayout(new GridLayout(0, 1));
       
        
        paneles = new JPanel[2];
        labels = new JLabel[2];
        
        for (int n = 0; n < 2; n++) {
            paneles[n] = new JPanel();
            add(paneles[n]);
            
            labels[n] = new JLabel(nombres[n]);
            labels[n].setIcon(new ImageIcon(getClass().getResource(nombres[n] + ".gif")));
            paneles[n].add(labels[n]);
            labels[n].setLocation(0, 0);
           
        }
        a = new JTextPane();
        
        boton = new JButton("Iniciar");
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"La competencia esta apunto de comenzar","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                int Lo = (int) (Math.random() * 7);
                
                Nadadores QuintoJugador = new Nadadores("QuintoJugador", ANCHO - 3, labels[0]);
                Nadadores CuartoJugador = new Nadadores("CuartoJugador", ANCHO - 3, labels[1]);
               
               
               

                System.out.println(Lo);
              
                
                QuintoJugador.start();
                CuartoJugador.start();
              
                 

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
        NadadoresHilos4 nadadoresHilos = new NadadoresHilos4();
    }
}
