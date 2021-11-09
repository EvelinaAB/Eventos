/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_primeraparte;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ewelina
 */
public class Ejercicio1_PrimeraParte extends JFrame implements ActionListener {

    /* Declaro variables */
    private JButton boton1;
    private JButton boton2;
    private JLabel e1;
    private JLabel e2;
    private JLabel e3;

    /* Constructor */
    public Ejercicio1_PrimeraParte() {
//Layout absoluto
        setLayout(null);
//Tamaño de la ventana
        setBounds(10, 10, 1024, 800);
//Título
        setTitle("Ejercicio1_Primera_Parte");
//No redimensionable
        setResizable(false);
//Cerrar proceso al cerrar la ventana
        setDefaultCloseOperation(HIDE_ON_CLOSE);
//Etiqueta
        e1 = new JLabel("Ana");
        e2 = new JLabel("Jose");
        e3 = new JLabel("Alberto");

        e1.setBounds(
                15, 50, 195, 50);
        e2.setBounds(
                15, 80, 195, 50);
        e3.setBounds(
                15, 110, 195, 50);

        add(e1);
        add(e2);
        add(e3);
//Botón
        boton1 = new JButton("carne");

        boton1.setBounds(
                15, 150, 195, 50);

        boton2 = new JButton("pescado");

        boton2.setBounds(
                15, 200, 195, 50);

        add(boton1);

        add(boton2);
        /* Inicializo escuchador del botón */
        boton1.addActionListener(this);
        boton2.addActionListener(this);
//Muestro JFrame (lo último para que lo pinte todo correctamanete)
        setVisible(true);
    }

    /* Método que implementa la acción del botón */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            /* Inicializo y muestro la segunda pantalla con los argumentos this (JFrame) y true (modal) */
            SegundaVentanaCarne secundaria = new SegundaVentanaCarne(this, true);
            secundaria.setVisible(true);
        }
        if (e.getSource() == boton2) {
            /* Inicializo y muestro la segunda pantalla con los argumentos this (JFrame) y true (modal) */
            SegundaVentanaPescado secundaria = new SegundaVentanaPescado(this, true);
            secundaria.setVisible(true);
        }
    }
 

    public static void main(String[] args) {
        new Ejercicio1_PrimeraParte();
    }
}

//
//    
//
//    /* Método que implementa la acción del botón */
//    boton1.addActionListener ( 
//        new ActionListener() {
//           
//
//            @Override
//        public void actionPerformed
//        (ActionEvent e
//        
//            ) {
//                SegundaVentanaCarne secundaria = new SegundaVentanaCarne(this, true);
//            secundaria.setVisible(true);
//        }
//    }
//
//);
//        
//
//
//    @Override
//        public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

