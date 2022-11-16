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
public class ThreadController {

    private Runner r = new Runner();
    private Thread t = new Thread(r);

    public void startThread() {
        t.start();
    }

    public void stopThread() {
        // usar una instancia específica de Runner
        r.stopRunning();
    }
}
