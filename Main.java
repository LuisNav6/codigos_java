/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import datos.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A obj = new A();
         System.out.println("Desde el main:");
        obj.porDefecto = 1; // error valor accesible únicamente por paquete 
        obj.publico = 2; // accedido desde cualquier lado
        obj.privado = 3; // error valor accesible únicamente por paquete
         System.out.println(obj.porDefecto+" "+obj.publico+" "+obj.privado);
        B obj2 = new B();
        obj2.metodo();
    }
    
}
