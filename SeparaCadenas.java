/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package separacadenas;

/**
 *
 * @author luisnavarrete
 */
public class SeparaCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String c="He said that’s not a good idea Bye amigo";//cadena a trabajar
        System.out.println(c);//mostramos la cadena a trabajar
        dividir(c);
    }//fin main
      public static void dividir(String c){//dividimos el string en arreglos
        String [] vec= c.split(" ");//funcion que sirve para dividir 
        String[] aux=new String [100];//utilizamos un auxiliar
        for(int i=0;i<vec.length;i++){
            int cont;//contador de caracteres
            aux[i]=cambio(vec[i]);
            cont=aux[i].length();
            System.out.println(aux[i]+" "+"["+cont+"]");
        }   
      }
      public static String cambio(String c){//cambiamos la primer letra de c/arreglo
           char [] vec= c.toCharArray();
           vec[0]=Character.toUpperCase(vec[0]);//cambiamos la primer letra por mayuscula
           return new String(vec);
       }
}