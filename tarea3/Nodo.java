/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author luisnavarrete
 */
public class Nodo {
    private int val;
    private Nodo sig;

     public void Nodo(){//constructor inicializado
        this.val = 0;
        this.sig = null;
    }
    
    public int getValor() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }   
}
