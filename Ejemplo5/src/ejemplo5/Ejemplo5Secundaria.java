/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5;

/* Importo las clases necesarias */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/* Nuevo JDialog que implementa el interface ActionListener */
public class Ejemplo5Secundaria extends JDialog implements ActionListener {

    /* Declaro variables */
    private JButton boton2;
    private JLabel label1;

    /* Constructor que recibe el JFrame Ejemplo5Principal como parent y el modal */
    public Ejemplo5Secundaria(Ejemplo5Principal parent, boolean modal) {
        /* Invoco al constructor de la clase superior */
        super(parent, modal);
        /* Layout absoluto y límites*/
        setLayout(null);
        setBounds(440, 10, 410, 210);
//Etiqueta
        label1 = new JLabel("Esta es la ventana secundaria");
        label1.setBounds(115, 60, 200, 30);
        add(label1);
//Botón
        boton2 = new JButton("Volver");
        boton2.setBounds(105, 110, 200, 40);
        add(boton2);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        /* Inicializo escuchador del botón */
        boton2.addActionListener(this);
    }

//    Ejemplo5Secundaria(Ejemplo5Principal aThis, boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /* Método que implementa la acción del botón */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {
//Cierro la pantalla
            setVisible(false);
        }
    }
}
