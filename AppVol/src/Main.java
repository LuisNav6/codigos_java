/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import Volumenes.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l = new Libro ("Luis Humberto Navarrete","el chuy","123-456-789","the life", 3);
        Revista r = new Revista (2020,500,"987-123-456", "Aviones",5);
        Biblioteca b = new Biblioteca(0," "," ",0);
        b.añadir(l);
        b.añadir(r);
        b.MostrarDatos();
    }
    
}
