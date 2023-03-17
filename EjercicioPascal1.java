/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopascal1;

/**
 *
 * @author luisnavarrete
 */
public class EjercicioPascal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lim=9;//damos el limite
        for(int n=0; n < lim; n++){
            for(int k=0; k <=n ; k++){
            System.out.print(fact(n)/(fact(k)*fact(n-k))+" ");//evaluamos la formula con los valores en la iteracion
        }//fin for k
            System.out.println();
        }//fin for n
    }//fin main
    static int fact(int val){//funcion que evalua el factorial de manera recursiva
        if(val == 0)
            return 1;
        else
            return val * fact(val-1);
    }
}
