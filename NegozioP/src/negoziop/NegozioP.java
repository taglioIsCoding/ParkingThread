/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negoziop;

/**
 *
 * @author 72873486
 */
public class NegozioP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Parcheggiatore mario = new Parcheggiatore("Mario");
        
        Macchina m1 = new Macchina (false , "verde", mario);
        Macchina m2 = new Macchina (false , "blu", mario);
        Macchina m3 = new Macchina (false , "rosso", mario);
        Macchina m4 = new Macchina (false , "viola", mario);
        Macchina m5 = new Macchina (false , "gialla", mario);
        Macchina m6 = new Macchina (false , "azzurra", mario);
        
        Macchina m7 = new Macchina (false , "arancio", mario);
        Macchina m8 = new Macchina (false , "grigia", mario);
        Macchina m9 = new Macchina (false , "nera", mario);
        Macchina m10 = new Macchina (false , "bianca", mario);
        
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        Thread t4 = new Thread(m4);
        Thread t5 = new Thread(m5);
        Thread t6 = new Thread(m6);
        
        Thread t7 = new Thread(m7);
        Thread t8 = new Thread(m8);
        Thread t9 = new Thread(m9);
        Thread t10 = new Thread(m10);
        
        
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        
    }
    
}
