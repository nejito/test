/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtester;

/**
 *
 * @author pablo
 */
public class Synchronized {

    public static void main(String args[]) {

        MiPila mp = new MiPila();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(mp){
                    for (int index = 0; index < 5; index++) {
                        char c = 'P';
                        mp.push(c);
                        System.out.println(Thread.currentThread().getName());
                    }
                }    
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(mp){
                    for (int index = 0; index < 5; index++) {
                        System.out.println(mp.pop());
                        System.out.println(Thread.currentThread().getName());
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }

}
