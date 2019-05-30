/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negoziop;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author 72873486
 */
public class Macchina implements Runnable{
    
    private boolean par = false;
    private String colore;
    private Parcheggiatore p;
    private int nPar;

    
    
    public Macchina(boolean par, String colore, Parcheggiatore p){
        this.colore = colore;
        this.par = par;
        this.p = p;
    }

    public void setPar(boolean par) {
        this.par = par;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isPar() {
        return par;
    }

    public String getColore() {
        return colore;
    }

    public void setP(Parcheggiatore p) {
        this.p = p;
    }

    public Parcheggiatore getP() {
        return p;
    }

    public int getnPar() {
        return nPar;
    }

    public void setnPar(int nPar) {
        this.nPar = nPar;
    }
    
    
    @Override
    public void run() {
       p.parcheggio(this);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Macchina.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println("sono "+this.getColore()+"e sto uscendo");
       p.esco(this);
    }
    
    
    
}
