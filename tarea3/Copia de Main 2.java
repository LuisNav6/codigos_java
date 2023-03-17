/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import javax.xml.catalog.Catalog;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculos v [] = new Vehiculos [4];
        v[0] = new Coche(250,8,"Negro",4);
        v[1] = new Bici("urbana","Blanco",2);
        v[2] = new Camioneta(1200,"Azul",8);
        v[3] = new Moto(120,2,"Rojo",2);
        
        System.out.println("------GARAGE-------");
        
        for(int i =0; i < v.length; i++){
            v[i].mostrar();
            System.out.println(); 
        }
        
        catalogar(v,0);
        System.out.println();
        catalogar(v,2);
        System.out.println();
        catalogar(v,4);
    }
    
     public static void catalogar(Vehiculos x[], int ruedas){
        int aux = 0;
        for(int i = 0; i < x.length; i++){
            if(ruedas == x[i].ruedas)
                aux ++;
        }
        System.out.println("Se han encontrado [ " + aux + 
                " ] vehiculos con [ " + ruedas + 
                " ] ruedas" );
    }
}
