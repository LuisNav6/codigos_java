/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1cadena;

/**
 *
 * @author luisnavarrete
 */
public class Ejercicio1Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0;
      String s1="si";
      String s2="si y solo si";
      
      while(s2.indexOf(s1) > -1){
          s2=s2.substring(s2.indexOf(s1)+s1.length(),s2.length());
          cont++;
      }
      System.out.println(cont);
    }
    
}
