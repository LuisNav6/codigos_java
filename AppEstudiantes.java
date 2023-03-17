 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appestudiantes;
import java.util.Scanner;
/**
 *
 * @author luisnavarrete
 */
public class AppEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Cuantos alumnos son :"); 
        Scanner in = new Scanner(System.in);
        int tamano = in.nextInt();
        Manejo_alumno objeto = new Manejo_alumno(tamano); 
        objeto.capturar();
        objeto.mostrar();
        objeto.ordenar();
        System.out.println("*** ORDENADO ***"); 
        objeto.mostrar();
    }
    
}
