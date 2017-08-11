/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaNadadores;

import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author GABRIEL-PC
 */
public class Nadadores4 extends Thread{
     
    int Lo = (int) (Math.random() * 5);
    String nombre;
    int limite;
    JLabel label;
    
    
    public Nadadores4(String nombre, int limite,JLabel label) {
        this.nombre = nombre;
        this.limite = limite;
        this.label= label;
    }
    @Override
    public void run() {
        for (int n = 0; n < limite; n++) {
            try {
                System.out.println(nombre + "Avanza");
                
                label.setLocation(n,0);
                Thread.sleep(Lo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Nadadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("El jugador " + nombre + "Ha llegado a la meta");
        //JOptionPane.showMessageDialog(null,"El jugador "+nombre + "Ha llegado a la meta","MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        yield();
    }
   
}