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
        Libro l = new Libro ("Alfas", "123-456-789", "El principito", 125);
        Cds c = new Cds ("Rock", "Metal", 250);
        System.out.println(l.Mostrar());
        System.out.println(c.Mostrar());
        Peculiares p = new Peculiares("Pop","Slime",189);
        System.out.println("La promocion de esta semana es:");
        System.out.println(p.Mostrar());
    }
}
