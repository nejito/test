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
public class ClaseAnonima {

    public static void main(String args[]) {
        
        
        Thread t = new Thread(new Runnable() {
            int i;
            @Override
            public void run() {
                i = 1;
                while (true) {
                    System.out.println("Hola " + i++);
                    if (i == 11) {
                        break;
                    }
                }
            }
        });
        t.start();
    }
    
    //comentariooooo
}
