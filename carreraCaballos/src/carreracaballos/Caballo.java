/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;

import java.awt.event.ActionEvent;
import static java.lang.Math.max;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Caballo implements Runnable {

    private final String nombre;

    private int contador = 0;

//    private final Condition myTurn;
//    private Condition nextTurn;
//
//    private Caballo nextCaballo;
//
//    private volatile boolean play = false;
//    
    public Caballo(String nombre) {
        this.nombre = nombre;

    }

//    public Caballo(String text,
//                  Lock lock) {
//        this.text = text;
//        this.lock = lock;
//        this.myTurn = lock.newCondition();
//    }
    @Override

    public void run() {

//        while (!Thread.interrupted()) {
//    Timer timer = new Timer (tiempoEnMilisegundos, new ActionListener () 
        // Aquí el código que queramos ejecutar.
        try {

//            long inicial = System.currentTimeMillis();
            while (contador < 100) {

                Thread.sleep((int) (Math.random() * 41 + 10));

                contador++;
//                    

                if (contador == 100) {

                    System.out.println("Soy " + this.nombre + "  he terminado y he tardado  " /*+ this.timepoTranscurrido(inicial) + " ms"*/);
                }

            }

        } catch (InterruptedException e) {
            System.out.println("No he podido terminar");

        }
    }

    @Override
    public String toString() {
        return "Caballo " + nombre + ", contador=" + this.timepoTranscurrido(contador) + '}';
    }

    public long timepoTranscurrido(long inicial) {

        long total = System.currentTimeMillis() - inicial;

        return total;
    }

//    @Override
//    public void run() {
//        while(!Thread.interrupted()) {
//            lock.lock();
//
//            try {
//                while (!play)
//                    myTurn.awaitUninterruptibly();
//
//                System.out.println(text);
//
//                this.play = false;
//                nextCaballo.play = true;
//
//                nextTurn.signal();
//            } finally {
//                lock.unlock();
//            }
//        }
//    }
//    public void setNextCaballo(Caballo nextCaballo) {
//        this.nextCaballo = nextCaballo;
//        this.nextTurn = nextCaballo.myTurn;
//    }
//
//    public void setPlay(boolean play) {
//        this.play = play;
//    }
}
