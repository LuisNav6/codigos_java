/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Lista<T>{
    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int size;
    public Lista() {
        inicio = null;
        fin = null;
        size = 0;
    }
    
    public boolean empty(){
        return inicio == null;
    }
    
    public int getSize(){
        return size;
    }
    
    public void pushFront(T data) {
        Nodo q = new Nodo();
        q.setDato(data);
        
        if(empty()){
            inicio = q;
            fin = q;
            fin.setSig(inicio);
        }else{
            q.setSig(inicio);
            inicio = q;
            fin.setSig(inicio);
        }
        size++;
    }
    
    public void pushBack(T data) {
        Nodo q = new Nodo();
        q.setDato(data);
        
        if(empty()){
            inicio = q;
            fin = q;
            fin.setSig(inicio);
        }else{
            fin.setSig(q);
            q.setSig(inicio);
            fin = q;
        }
        size++;
    }
    
    public T front() {
        return inicio.getDato();
    }
    
    public T back() {
        return fin.getDato();
    }
    
    public void popFront() {
        inicio = inicio.getSig();
        fin.setSig(inicio);
        size--;
    }
    
    public void popBack() {
        Nodo aux = inicio;
         for (int i = 0; i < size-1; i++) {
                aux = aux.getSig();
               if (aux.getSig() == fin) {
                 aux.setSig(inicio);
                 inicio = aux;
                }
            }  
            size--;
    }
    
    public boolean find(T data) {
        Nodo aux = inicio;
        boolean band = false;
    //aux = (data)Nodo;
        do{
            if(data  == aux.getDato()){
                band = true;
                
            }else{
                aux = aux.getSig();
            }
        }while(aux != inicio && band != true);
        return band;
    }
    
    public void toShow() {
        if(!empty()){
            Nodo aux = inicio;
            int i = 0;
            System.out.println("->");
            do{
                System.out.print(i + ".[ " + aux.getDato() + " ]" + " ->  ");
                aux = aux.getSig();
                i++;
            }while(aux != inicio);
        }
    }
}
