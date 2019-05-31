/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negoziop;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 72873486
 */
public class Parcheggiatore {
    
    private String nome;
    private int i = 5;
    boolean[] Macchine = new boolean[i];
    ArrayList<Macchina> places = new ArrayList<Macchina>(10);
    
    public Parcheggiatore(String nome){
        this.nome = nome;
        for (int k = 0; k < i; k++){
               Macchine[k] = true;
           }
    }
    
    public synchronized void parcheggio(Macchina m){
        for (int k = 1; k<i; k++){
           if (Macchine[k]){
               Macchine[k] = false;
               m.setPar(true);
               m.setnPar(k);
               System.out.println("sono la macchina "+ m.getColore()+ " e mi sono parchegggiata in "+k);
               break;
           }
        }
        
        
         if (m.isPar()==false){
            riprovaci(m);
        }   
        
        
        
            
        
        
        /*
        while (true){
          for (int k = 1; k<i && !places.isEmpty(); k++){
              
              System.out.println("sono la macchina "+ m.getColore()+ " e sono nel for ");
           if (Macchine[k]){
               Macchina c =places.get(1);
               System.out.println("sono la macchina "+ m.getColore()+ " me ne sono andata ");
               parcheggio(c);
              
                 }  
                */   
            
            
       
    }
    
    
    public synchronized void riprovaci(Macchina m)
    {
        places.add(m);
            System.out.println("sono la macchina "+ m.getColore()+ " e sono in coda ");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Parcheggiatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (places.indexOf(m) == 0)
            {
              parcheggio(m);
              places.remove(0);
            }
            else
                riprovaci(m);
    }
    
    public synchronized void esco(Macchina m){
            System.out.println("sono "+m.getColore()+"e sono uscito");
            Macchine[m.getnPar()] = true;
            m.setPar(false);
            notifyAll();
            
    }
    
    
    
}
