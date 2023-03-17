/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import Animales.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal [] zoo = new Animal [2]; 
        zoo[0] = new Perro(10,"Chucho");
        zoo[1] = new Canario(2,"Piolin"); 
        for( Animal i : zoo ) {
        i.habla();
        i.seDesplaza();
        nombre(i);
        vuela(i);
       }
    }
    static void nombre(Animal tem){
      System.out.println(tem); 
    }
    static void vuela(Animal tem){ 
       if ( tem instanceof Canario )
           ((Canario)tem).planea();
    }
}
