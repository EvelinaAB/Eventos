package carreracaballos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * @author ewelina
 */
public class CarreraCaballos {

    public static void main(String[] args) throws InterruptedException {
        JFrame ventana = new JFrame("Empezar carrera de caballos");
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

        final JLabel etiqueta = new JLabel("¡¡Empezar carrera!!");
        JButton botón = new JButton("¡Pulsa INTRO!");
        ventana.add(etiqueta);
        ventana.add(botón);

        System.out.println("Introduzca el número de caballos:");
        int entradaTeclado = 0;
        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner

        int length = entradaTeclado;
        Caballo[] caballos = new Caballo[length];

        for (int i = 0;
                i < length;
                i++) {
            Caballo c = new Caballo("Caballo " + i);
            caballos[i] = c;
        }
        ventana.setSize(300, 100);
        ventana.setVisible(true);
        ventana.setAlwaysOnTop(true); //ventana en primer plano
        ventana.setLocationRelativeTo(null); //centrar ventana
        int tiempoEnMilisegundos = 0;
        Timer timer = new Timer(tiempoEnMilisegundos, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Empieza la carrera");
            }
        });

        timer.start();
        timer.stop();;
        
        timer.toString();
        botón.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent d) {

            }

            @Override
            public void keyPressed(KeyEvent d) {
                if (d.getKeyCode() == KeyEvent.VK_ENTER) {

                    Thread[] threads = new Thread[length];
                    for (int i = 0;
                            i < length;
                            i++) {
                        Thread thread = new Thread(caballos[i]);
                        threads[i] = thread;
                        thread.start();

                    }

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    for (Thread thread : threads) {
                        thread.interrupt();
                    }

                    try {
                        for (Thread thread : threads) {
                            thread.join();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }

                }
                for (Caballo c : caballos) {
                    System.out.println(c.toString());

                }

                System.exit(0);
            }

            @Override
            public void keyReleased(KeyEvent e
            ) {

            }

        });

    }
//        System.out.println(
//                "Por favor introduzca el número de caballos:");
//        int entradaTeclado = 0;
//        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
//        entradaTeclado = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
//        Lock lock = new ReentrantLock();
//        int length = entradaTeclado;
//
//        Caballo[] caballos = new Caballo[length];
//
//        for (int i = 0;
//                i < length;
//                i++) {
//            Caballo c = new Caballo("Caballo " + i);
//            caballos[i] = c;
//        }
////        Thread c1 = new Thread(new Caballo("Luki"));
////        Thread c2 = new Thread(new Caballo("Moly"));
//        Thread[] threads = new Thread[length];
//        for (int i = 0;
//                i < length;
//                i++) {
//            Thread thread = new Thread(caballos[i]);
//            threads[i] = thread;
//            thread.start();
//        }
//
////        Let the players play!
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //Tell the players to stop
//        for (Thread thread : threads) {
//            thread.interrupt();
//        }
//
//        //Don't progress main thread until all players have finished
//        try {
//            for (Thread thread : threads) {
//                thread.join();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        c1.start();
//        c2.start();
//        //Let the players play!
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        //Tell the players to stop
//        c1.interrupt();
//
//        c2.interrupt();
//        //se asegura que los hilos no van a ser interrumpidos
//        try {
//            c1.join();
//            c2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        //Tell the players to stop
////        for (Thread thread : threads) {
//        caballo.interrupt();
//
////        }
//        //Don't progress main thread until all players have finished
//        try {
////            for (Thread thread : threads) {
//            caballo.join();
////            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(
//                "Game finished!");
//    }
//        Caballo[] caballos = new Caballo[length];
//
//        for (int i = 0; i < length; i++) {
//            Caballo caballo = new Caballo("caballo" + i);
//            caballos[i] = caballo;
//        }
//        for (int i = 0; i < length - 1; i++) {
//            caballos[i].setNextCaballo(caballos[i + 1]);
//        }
//        caballos[length - 1].setNextCaballo(caballos[0]);
//        System.out.println("Presionar INTRO para empezar la carrera: ");
////        caballos[0].setPlay(true);
//                //Threads creation
//                Thread[] threads = new Thread[length];
//        for (int i = 0;
//                i < length;
//                i++) {
//            Thread thread = new Thread(caballos[i]);
//            threads[i] = thread;
//            thread.start();
//
//        }
    //Let the players play!
//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        //Tell the players to stop
//        for (Thread thread : threads) {
//            thread.interrupt();
//
//        }
//
//        //Don't progress main thread until all players have finished
//        try {
//            for (Thread thread : threads) {
//                thread.join();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(
//                "Game finished!");
//    }
}
