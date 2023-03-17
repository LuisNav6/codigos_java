/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int c = args.length;
        int a,t=0;
        
        for(int i=0; i < c; i++){
            a = cuentalinea(args[i]);
            System.out.println("Arch "+ (i+1) + ": "+a);
                    t+=a;
        }
        System.out.println("Total: "+ t);
    }
    public static int cuentalinea(String path){
        String lineas;
        int c = 0;
        Thread hp = Thread.currentThread();
        hp.start();
        synchronized(hp){
        try{
            FileReader f = new FileReader(path);
            BufferedReader b = new BufferedReader(f);
            while((lineas = b.readLine())!= null){
                c++;
            }
            hp.wait(1000);
            return c;
        }catch(FileNotFoundException ex){
            System.err.println("El archivo no se encontro!");
            return 0;
        }catch(IOException ex){
             System.err.println("El archivo esta vacio!");
             return 0;
        }catch(InterruptedException e){return 0;
        }
    }
    }
}