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
public class Runner implements Runnable {

    private boolean timeToQuit = false;

    @Override
    public void run() {
        
        int tarea = 1;
        while (!timeToQuit) {
            // seguir trabajando hasta recibir la orden de salir
            System.out.println("Tarea Nro " + tarea);
            tarea++;
        }
        // dejar todo en orden antes de que termine run()
        System.out.println("Ultimo Nro de tarea " + tarea);
    }

    public void stopRunning() {
        timeToQuit = true;
    }
}
