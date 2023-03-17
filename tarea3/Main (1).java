/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import Aviones.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       AvionPas ap = new AvionPas("AZ19B2", "Londres", 2400, 270.5F); 
       AvionHid ah = new AvionHid("BT3533P8", "Bariloche", 500); 
       System.out.println(ap.Mostrar());
       //avion hidrante lleno
       System.out.println(ah.Mostrar());
      //le quitamos los litros que queramos
       ah.Descarga(300); 
       System.out.println(ah.Mostrar());
       //lo vaciamos
       ah.Descarga(); 
       System.out.println(ah.Mostrar());
       Avion[] vuelos = new Avion[2]; 
       vuelos[0] = ap;
       vuelos[1] = ah; 
       for(Avion x : vuelos)
       if (x instanceof AvionHid)
       System.out.println("el vuelo " + x.getNomVuelo() + " es un Hidrante");
    }
    
}
