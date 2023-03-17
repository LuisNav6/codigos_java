/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Pila <T>{
    private Nodo<T> tope;
    class Nodo<T>{
        public T dato;
        public Nodo<T> sig;
        
        Nodo(T dato) {
            this.dato = dato;
            this.sig = null;
        }
    }

    public Pila() {
        tope = null;
    }
    
    public Pila(T dato){
        Nodo<T> n = new Nodo<T>(dato);
        n.sig = tope;
        tope = n;
    }
    
    public T Tope(){
          if ( !empty())
            return tope.dato;
        else
            return null;
    }
    
    public boolean empty(){
        return (tope == null);
    }

    public void push(T date){
        Nodo <T> n = new Nodo<T>(date);
        n.sig = tope;
        tope = n;
    }
    
    public void pop(){
        if(!empty()){
            Nodo<T> n = tope;
            tope = tope.sig;
            return;
        }else{
            return;
        }
    }
}
