/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1primeraparte;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author ewelina
 */
public class Ejercicio1PrimeraParte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Empezar carrera de caballos");
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1024, 800);
        ventana.setVisible(true);
    }

}