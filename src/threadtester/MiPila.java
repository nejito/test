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
public class MiPila {

    int idx = 0;
    char[] data = new char[6];

    public void push(char c) {
        //synchronized(this){
            data[idx] = c;
            idx++;
        //}    
    }

    public char pop() {
        //synchronized(this){
            idx--;
            return data[idx];
        //}    
    }
}
