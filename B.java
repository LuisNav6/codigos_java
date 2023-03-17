/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author luisnavarrete
 */
public class B {
    A obj;
    
    public void metodo() {
       A obj = new A();
       obj.porDefecto = 4; // es accesible pues viven en el mismo paquete 
       obj.publico = 5;
       obj.privado = 6; // accesible dentro del paquete por objetos de A
       System.out.println("Desde la clase metodo:");
       System.out.println(obj.porDefecto+" "+obj.publico+" "+obj.privado);
    }
}
