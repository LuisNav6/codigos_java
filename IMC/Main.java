/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s =  new Scanner(System.in);
    s.useDelimiter("\n");//para poner por defecto el salto de linea 
    
    System.out.println("Introduce el nombre: ");
    String nombre = s.next();
    
    System.out.println("Introduce la edad: ");
    int edad = s.nextInt();
 
    System.out.println("Introduce el sexo: ");
    char sexo = s.next().charAt(0);
 
    System.out.println("Introduce el peso: ");
    double peso = s.nextDouble();
    
    System.out.println("Introduce la altura: ");
    double altura = s.nextDouble();
    
    Persona obj = new Persona(nombre,edad,sexo,peso,altura);
    Persona obj2 = new Persona("JUANA",24,'M',54.2,1.46);
    Persona obj3 = new Persona("MANUEL",67,sexo,89.9,1.68);
    
    System.out.println("-----Persona 1-----");
    muestraPeso(obj);
    muestraEdad(obj);
    System.out.println(obj.toString());
 
    System.out.println("-----Persona 2-----");
    muestraPeso(obj2);
    muestraEdad(obj2);
    System.out.println(obj2.toString());
 
    System.out.println("-----Persona 3-----");
    muestraPeso(obj3);
    muestraEdad(obj3);
    System.out.println(obj3.toString());
    
    }
    
   public static void muestraPeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.IDEAL:
                System.out.println("El peso de la persona " + p.getNombre() + " es ideal!");
                break;
            case Persona.INFRA:
                System.out.println("El peso de la persona " + p.getNombre() + " esta por debajo"
                        + " de su peso ideal!");
                break;
            case Persona.SOBRE:
                System.out.println("El peso de la persona " + p.getNombre() + " esta por encima"
                        + " de su peso ideal");
                break;
        }
    }
 
    public static void muestraEdad(Persona p) {
        if (p.MayorDeEdad()) {
            System.out.println("La persona " + p.getNombre() + " es mayor de edad");
        } else {
            System.out.println("La persona " + p.getNombre()+ " no es mayor de edad");
        }
    } 
}
