/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_primeraparte;

import java.awt.FlowLayout;
import javax.swing.JButton;
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
        e1.setBounds(400, 20, 70, 50);
        ventana.add(e1);
        JLabel e2 = new JLabel("Jose");
        e2.setBounds(400, 40, 70, 50);
        ventana.add(e2);
        JLabel e3 = new JLabel("Alberto");
        e3.setBounds(400, 60, 70, 50);
        ventana.add(e3);
        JButton boton1, boton2;
        boton1 = new JButton("carne");

        ventana.add(boton1);
        boton1.setBounds(15, 90, 70, 50);

        boton2 = new JButton("pescado");
        boton2.setBounds(15, 155, 70, 50);
        ventana.add(boton2);;

        ventana.add(boton1);
        ventana.add(boton2);

    }

}
