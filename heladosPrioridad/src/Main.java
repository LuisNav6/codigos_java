/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int sabor [];
        String Sabor2 [];
        int n = 4;
        Sabor2 = new String [n];
        sabor = new int [n];
        Pila<String> Helado = new Pila<String>();
        PriorityQueue<Integer> clientes = new PriorityQueue<Integer>();
        
        System.out.println("----> BIENVENIDO A LA HELADERIA <----" + "\n");
        System.out.print("Cuantas personas quieren helado -> ");
        int personas = s.nextInt();
        
        for(int i=0 ; i < personas; i++) {
            System.out.println("--> Persona " + (i+1) + " <--");
            System.out.print("De que sabor quieren su helado (1 = Chocolate / 0 = Fresa) -> ");
            sabor[i] = s.nextInt();
            clientes.add(sabor[i]);
        }
        
        for(int i=0 ; i < personas; i++){
            System.out.println("--> Sabor del balde " + (i+1) + " <--");
            System.out.print("Sabores del balde (1 = Chocolate / 0 = Fresa) -> ");
            Sabor2[i] = s.nextLine();
            Helado.push(Sabor2[i]);
        }
        
        while (!clientes.isEmpty()) {
            System.out.println(clientes.poll());
        }
    }
    
}