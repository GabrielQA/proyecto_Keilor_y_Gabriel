package NuevaNadadores;

import com.sun.javafx.iio.gif.GIFDescriptor;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class NadadoresHilos extends JFrame {

   

    public javax.swing.JButton Estadisticas;
    String Ganador = "";
    int A1;
    int Carreras = 0;
    int contCarr;
    int contarJugadores=0;
    JPanel[] paneles;
    String U = "";
    JLabel[] labels;
    //JosueQA\n2-FernandaSE\n3-RicardoRA\n4-StefanyFC\n5-LoganNA
    String[] nombres = {"JosueQA", "FernandaSE", "RicardoRA", "StefanyFC", "LoganNA"};
    JButton boton;
    JTextPane a;

    int ANCHO = 1100;

    public NadadoresHilos() {
        setLayout(new GridLayout(0, 1));

        paneles = new JPanel[5];
        labels = new JLabel[5];

        for (int n = 0; n < 5; n++) {
            paneles[n] = new JPanel();
            add(paneles[n]);

            labels[n] = new JLabel(nombres[n]);
            labels[n].setIcon(new ImageIcon(getClass().getResource(nombres[n] + ".gif")));
            paneles[n].add(labels[n]);
            paneles[n].setBackground(Color.blue);
            labels[n].setLocation(0, 0);

        }
        a = new JTextPane();
        Estadisticas = new JButton("Estadisticas");
        Estadisticas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                A1 = Integer.parseInt(JOptionPane.showInputDialog("<------------------------Estadisticas------------------------->"
                        + "\n1-Cantidad de veces que ha ganado cada competidor"
                        + "\n2-Cantidad de Carrearas efectuadas"
                        + "\n3-Competidor que ha ganado más veces"
                        + "\n4-Competidor que ha perdido más veces"
                        + "\n5-Cantidad de empates que se han registrado"
                        + "\n6-Limpiar Estadisticas"));

                if (A1 == 1) {

                }

                if (A1 == 2) {

                    JOptionPane.showMessageDialog(null, "Cantidad de carreras efectuadas " + Carreras, "Estadisticas", JOptionPane.INFORMATION_MESSAGE);

                }
                if (A1 == 3) {

                }

                if (A1 == 4) {

                }

                if (A1 == 5) {

                }

                if (A1 == 6) {
                    
                }
            }
        });
        add(Estadisticas);

        boton = new JButton("Iniciar");
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La competencia esta apunto de comenzar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                Nadadores JosueQA = new Nadadores("JosueQA", ANCHO - 3, labels[0]);
                Nadadores FernandaSE = new Nadadores("FernandaSE", ANCHO - 3, labels[1]);
                Nadadores RicardoRA = new Nadadores("RicardoRA", ANCHO - 3, labels[2]);
                Nadadores StefanyFC = new Nadadores("StefanyFC", ANCHO - 3, labels[3]);
                Nadadores LoganNA = new Nadadores("LoganNA", ANCHO - 3, labels[4]);
                //new RelojCom().setVisible(true);
                RelojCom nadadoresHilos3 = new RelojCom();
                nadadoresHilos3.Iniciar();
                nadadoresHilos3.setVisible(true);
                FernandaSE.start();
                LoganNA.start();
                JosueQA.start();
                StefanyFC.start();
                RicardoRA.start();
                Carreras += 1;
                System.out.println("Cantidad de Carreras efectuadas hasta el momentos " + Carreras);

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        add(boton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100, 0);
        setSize(ANCHO, 1000);

    }

    public static void main(String[] args) {

        NadadoresHilos nadadoresHilos = new NadadoresHilos();
        nadadoresHilos.setLocationRelativeTo(null);
        nadadoresHilos.setVisible(true);
    }
}
