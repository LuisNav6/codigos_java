/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import Pilas.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila p = new Pila();
        //vemos que la pila esta vacia
        p.Mostrar();
        //le damos valores 
        p.push(10);
        p.push(4);
        p.push(16);
        p.push(20);
        //mostramos el contenido
        p.Mostrar();
        //extra
        System.out.println("El tamaño de la pila es: " + p.getTam());//damos el tamaño de la pila
        //retiramos un elemento
        //las pilas se rigen por la ley de LIFO
        p.Pop();
        //volvemos a mostrar el contenido
        p.Mostrar();
        //extra
        System.out.println("El tamaño de la pila es: " + p.getTam());//damos el tamaño de la pila
    }
    
}
