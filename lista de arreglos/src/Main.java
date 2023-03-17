/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> lista = new ArrayList<Integer>();
        int val;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Captura un entero (0 para salir)");
            val = in.nextInt();
            if (val == 0) 
                break;
            lista.add(val);
        }
        System.out.println("El numero de elementos es: " + lista.size());
        for ( Integer i : lista)
            System.out.print("["+i+"] ");
        System.out.println();
    }
    
}
