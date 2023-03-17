/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author luisnavarrete
 */
public class Pila {
    private Nodo inicio;
    private int tam;
    
    public void Pila(){
        inicio = null;
        tam = 0;
    }
    
    public boolean Vacia(){
        return inicio == null;
    }

    public int getTam() {
        return tam;
    }
    
    public void push(int valor){
        Nodo p = new Nodo();
        p.setVal(valor);
        if(Vacia()){
            inicio = p;
        }else{
            p.setSig(inicio);
            inicio = p;
        }
        tam++;
    }
    
    public void Pop(){
        if(!Vacia()){
            inicio = inicio.getSig();
            tam--;
        }
    }
    
    public void Mostrar(){
        Nodo aux = inicio;
        if(aux == null){
            System.out.println("Pila vacia!");
        }else{
           while(aux != null){
            System.out.print("[" + aux.getValor() + "]\t");
            aux = aux.getSig();
        }
        System.out.println(); 
        }
    }
}
