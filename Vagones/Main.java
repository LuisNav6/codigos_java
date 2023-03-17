/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import transportes.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inciso a
        Vagon v = new Vagon(false);
        v.ocupar();
        System.out.println("Total de asientos ocupados: "+v.asientosocupados());
        //inciso b
        Tren a = new Tren("Patito", "Aguascalientes", "calvillo", 1, 1, 100, 200);
        System.out.println();
        System.out.println("El tren " + a.getNombre() + " que va de " + a.getSalida() + " a " + a.getDestino());
        a.llenar();
        System.out.println("Total de ventas del tren: " + a.totalVentas());
    }
}
