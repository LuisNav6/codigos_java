/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscanner;
import java.util.Scanner;
/**
 *
 * @author luisnavarrete
 */
public class EjercicioScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-----Cadenas con string-----");
        String cadena="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese cadena: ");
        cadena=sc.nextLine();
        System.out.println("La cadena ingresada es:"+cadena);
        System.out.println("-----flotantes-------");
        System.out.println("ingrese el primer numero: ");
        float valor=sc.nextFloat();
        System.out.println("ingrese el segundo valor numero: ");
        float valor2=sc.nextFloat();
        System.out.println("La suma de los 2 valores es: "+A.suma(valor,valor2));
        return;
        //float f= Integer.parseInt(cadena); ejemplo de un wrapper
    }
   class A{
       static float suma(float a,float b){
           return a+b;
       }
   }
}
