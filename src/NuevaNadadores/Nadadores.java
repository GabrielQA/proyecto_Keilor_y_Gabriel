/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//<----------------------------------------------------Class Explication---------------------------------------------------------------->
//This class is the one we first create is the one that manages and creates some counters that are responsible
//for carrying the process of an image moving every so often and the width of them and labels.
//Throughout the labels.
//Besides adding a control that if each selected player reaches the goal stops
package NuevaNadadores;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author GABRIEL-PC
 */
public class Nadadores extends Thread {
    int cont=0;
    String Cont="";
    RelojCom Detenerch = new RelojCom();
    int Lo = (int) (Math.random() * 5);
    int Lo2 = (int) (Math.random() * 10);
    String nombre;
    int limite;
    JLabel label;

    public Nadadores(String nombre, int limite, JLabel label) {
        
        this.nombre = nombre;
        this.limite = limite;
        this.label = label;
    }

    @Override
    public void run() {
        ArrayList<String> Lista = new ArrayList();

        String Ganador = "";
        Lista.add(Ganador);
        for (int n = 0; n < limite; n++) {

            try {
                System.out.println(nombre + "Avanza");

                label.setLocation(n, 0);

                Thread.sleep(Lo2);

            } catch (InterruptedException ex) {
                Logger.getLogger(Nadadores.class.getName()).log(Level.SEVERE, null, ex);
                //Aqui 
                //JOptionPane.showMessageDialog(null,"El ganador de la commpetencia es"+nombre,"MENSAJE", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        
        System.out.println("El jugador " + nombre + "Ha llegado a la meta");

        //RelojCom nadadoresHilos3 = new RelojCom();               
        // nadadoresHilos3.setVisible(true);
        //System.out.println("El jugador " + nombre + "Ha llegado a la meta");
        //JOptionPane.showMessageDialog(null,"El jugador " + nombre + " ha llegado a la meta","MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        //Aqui 
        //JOptionPane.showMessageDialog(null,"El jugador "+nombre + "Ha llegado a la meta","MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        yield();
       /* RelojCom Dete = new RelojCom();
        Dete.Detener();
        Dete.setVisible(true);
        */
       
       
        
    }

}
