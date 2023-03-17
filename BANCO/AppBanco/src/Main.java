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
        Scanner s = new Scanner(System.in);
        
       //Persona
       String nombre,apellido;
       int tel;
       
       Persona p1 = new Persona("Luis", "Navarrete", 440786234);
       Persona p2 = new Persona();
       
       System.out.println("----Agregando persona----");
       System.out.println("Dame el nombre: ");
       nombre = s.nextLine();
       System.out.println("Dame el apellido: ");
       apellido = s.nextLine();
       System.out.println("Dame el telefono: ");
       tel = s.nextInt();
       
       p2.setNombre(nombre);
       p2.setApellido(apellido);
       p2.setTelefono(tel);
       
       System.out.println("Validando el numero de telefono de persona 1...");
       p1.añadirP(p1.getNombre(), p1.getApellido(), p1.getTelefono());
       System.out.println();
       System.out.println("Validando el numero de telefono de persona 2...");
       p2.añadirP(nombre,apellido,tel);
       System.out.println();
       
       //Cuenta
      int nCuenta,saldo;
      String propietario;
      Cuenta c1 = new Cuenta(12345,12000,p1.getNombre());
      Cuenta c2 = new Cuenta();
      
       System.out.println("----Agregando cuenta----");
       System.out.println("Dame el numero de cuenta: ");
       nCuenta = s.nextInt();
       System.out.println("Dame el saldo: ");
       saldo = s.nextInt();
       propietario = p2.getNombre();
       
       c2.setNumeroCuenta(nCuenta);
       c2.setSaldo(saldo);
       c2.setPropietario(propietario);
       
       System.out.println("Validando el saldo de la cuenta 1...");
       c1.agregar(c1.getNumeroCuenta(), c1.getSaldo(), p1.getNombre());
       System.out.println();
       System.out.println("Validando el saldo de la cuenta 2...");
       c2.agregar(nCuenta,saldo,p2.getNombre());
       System.out.println();
       
       //mostrando contenido de la persona con su respectiva cuenta
       System.out.println("Datos de la cuenta de la persona 1:");
       System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
       System.out.println("Propieatario: " + c1.getPropietario());
       System.out.println("Saldo al momento: " + c1.getSaldo());
       
       System.out.println("Detalles de la persona:");
       System.out.println("Nombre: " + p1.getNombre());
       System.out.println("Apellido: " + p1.getApellido());
       System.out.println("Telefono: " + p1.getTelefono());
       
       System.out.println();
       
       System.out.println("Datos de la cuenta de la persona 2:");
       System.out.println("Numero de cuenta: " + c2.getNumeroCuenta());
       System.out.println("Propieatario: " + c2.getPropietario());
       System.out.println("Saldo al momento: " + c2.getSaldo());
       
      System.out.println("Detalles de la persona:");
      System.out.println("Nombre: " + p2.getNombre());
      System.out.println("Apellido: " + p2.getApellido());
      System.out.println("Telefono: " + p2.getTelefono());
       
       //haciendo depositos y retiros
      
       System.out.println("-----Transacciones persona 1-----");
       c1.transaccion("retiro", 2345);
       c1.transaccion("deposito", 10000);
       System.out.println();
       
       System.out.println("Datos de la cuenta de la persona 1:");
       System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
       System.out.println("Propieatario: " + c1.getPropietario());
       System.out.println("Saldo al momento: " + c1.getSaldo());
       
       System.out.println("Detalles de la persona:");
       System.out.println("Nombre: " + p1.getNombre());
       System.out.println("Apellido: " + p1.getApellido());
       System.out.println("Telefono: " + p1.getTelefono());
       System.out.println();
             
       System.out.println("-----Transacciones persona 2-----");
       c2.transaccion("retiro", 5000);
       c2.transaccion("deposito", 2567);
       System.out.println();
       
       System.out.println("Datos de la cuenta de la persona 2:");
       System.out.println("Numero de cuenta: " + c2.getNumeroCuenta());
       System.out.println("Propieatario: " + c2.getPropietario());
       System.out.println("Saldo al momento: " + c2.getSaldo());
       
      System.out.println("Detalles de la persona:");
      System.out.println("Nombre: " + p2.getNombre());
      System.out.println("Apellido: " + p2.getApellido());
      System.out.println("Telefono: " + p2.getTelefono());
       
    }
    
}
