/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_primeraparte;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ewelina
 */
public class Ejercicio1_PrimeraParte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de manejo de eventos");
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(
                1024, 800);
        ventana.setVisible(
                true);
        ventana.setResizable(false);

        JLabel e1 = new JLabel("Ana");
        e1.setBounds(400, 20, 200, 70);
        ventana.add(e1);
        JLabel e2 = new JLabel("Jose");
        e2.setBounds(400, 40, 400, 100);
        ventana.add(e2);
        JLabel e3 = new JLabel("Alberto");
        e3.setBounds(400, 60, 600, 130);
        ventana.add(e3);

    }

}
