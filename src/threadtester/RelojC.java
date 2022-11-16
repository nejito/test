/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtester;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author pablo
 */
public class RelojC extends Thread{

    private JLabel hora;
    public RelojC(JLabel lbl){
        this.hora = lbl;
    }
    
    @Override
    public void run(){
        Date fh = null;
        while (true) {
            try {
                fh = new Date();
                SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                String cReloj = sd.format(fh);

                System.out.println("Tiempo: " + cReloj);
                hora.setText(cReloj);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
    
    
}
