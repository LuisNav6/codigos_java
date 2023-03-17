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
import java.io.File;
import java.util.Scanner;

public class Main {
  static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int c = args.length;
        
        for(int i=1 ;i<c ;i++){
            busca(args[0],args[i]);
    }
}
     public static void busca(String word,String path){
         String lineas;
         try{
             System.out.println(new File(path).getName());
             FileReader f = new FileReader(path);
            BufferedReader b = new BufferedReader(f);
            
            while((lineas = b.readLine()) != null){
                if(lineas.contains(word)){
                    System.out.println(lineas);
                }
            }
         }catch(FileNotFoundException e){
             System.err.println("El archivo no se encontro!");
         }catch(IOException e){
             System.err.println("El archivo esta vacio!");
         }
     }
}
