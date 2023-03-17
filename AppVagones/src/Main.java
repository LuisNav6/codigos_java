/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vagon v = new vagonCaja(5.2,2.3,10.0);
        
        Vagon v2 = new vagonTanque(6.5,10.0);
        
        Tren t = new Tren (0,0.0);
        
        t.añadir(v);
        t.añadir(v2);
        
        System.out.println("El volumen total transportado por el tren es de : " + t.Volt());
        
    }
}
