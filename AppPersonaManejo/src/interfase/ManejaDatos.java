/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfase;

/**
 *
 * @author luisnavarrete
 */
import Datos.Persona;
import java.util.*;
public class ManejaDatos {
    private List<Persona> lista; 
    
    public ManejaDatos(){
    lista = new ArrayList<Persona>();
    }
    
    public void menu(){
        short opc = 0;
        Scanner in = new Scanner (System.in);
        do{
            System.out.println("1)Altas\n "
                + "2)Bajas\n "
                + "3)Cambios\n "
                + "4)Consultas\n "
                + "5)Salir\n"
            );
           opc = in.nextShort();
           switch(opc){
               case 1 : this.Altas();
               break;
               case 2 : this.Bajas();
               break;
               case 4 : this.Consultas();
               break;
               case 5 : return;
           }
        }while(opc>=1&&opc<=5);
        return;
    }
    public void Altas(){
        String resp = "s";
        Scanner in = new Scanner (System.in);
        do{
            lista.add(ingresar());
            System.out.println("Otra captura? S/N ");
            resp = in.next();
        }while (resp.equals("S") || resp.equals("s"));
        return;
    }
    
    private Persona ingresar(){
        Scanner in;
        in = new Scanner(System.in); 
        System.out.println("ingresa valores"); 
        System.out.println("Nombre ?" );
        String nombre = in.next(); 
        System.out.println("Apellido ?" ); 
        String apellido = in.next();
        System.out.println("Edad ?" ); 
        short edad = in.nextShort(); 
        System.out.println("Sexo ?" ); 
        char sexo = in.next().charAt(0); 
        System.out.println();
        return new Persona(nombre, apellido, edad, sexo);
    }
    
    public void Consultas(){ 
        for(Persona x : lista) {
        System.out.println("nombre :" + x.getNombre());
        } 
    }
    
    public void Bajas(){ 
        Scanner in;
        in = new Scanner(System.in); 
        System.out.print("Nombre ?" ); 
        String nombre = in.next(); 
        Persona temp = null;
        for ( Persona x : lista )
        if (x.getNombre().equals(nombre)) {
        temp = x;
        break; 
        }
        lista.remove(temp); 
    }
}

