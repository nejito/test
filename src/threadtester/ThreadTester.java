/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtester;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pablo
 */
public class ThreadTester {

    public static void main(String args[]) {
        /*HelloRunner r = new HelloRunner();
        HelloRunner r2 = new HelloRunner();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r2);
         
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
        }
        t2.start();
        */

        Reloj r = new Reloj();
        r.start();
        
        
        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Date fh = null;
                while (true) {
                    try {
                        fh = new Date();
                        SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                        String cReloj = sd.format(fh);

                        System.out.println("Tiempo: " + cReloj);
                       

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
        });
        
        t.start();*/
    }
}

class HelloRunner implements Runnable {

    int i;

    public void run() {
        i = 0;
        while (true) {
            System.out.println("Hola " + i++ + " Hilo " + Thread.currentThread().getName());
            if (i == 5) {
                break;
            }
        }
        ///Finaliza el hilo
    }
}

class Reloj extends Thread {
    @Override
    public void run() {
        Date fh = null;
        while (true) {
            try {
                fh = new Date();
                SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                String cReloj = sd.format(fh);

                System.out.println("Tiempo: " + cReloj);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
        ///Finaliza el hilo
    }

}
