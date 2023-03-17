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
        //float EnergiaIni;
        float coef;
        float alturaini;
        float longtot;
        float masa;
        float energy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la energia inicial:");
        energy = sc.nextFloat();
        System.out.println("Dame la altura inicial:");
        alturaini = sc.nextFloat();
        System.out.println("Dame el coeficiente :");
        coef = sc.nextFloat();
        System.out.println("Dame la longitud inicial:");
        longtot = sc.nextFloat();
        System.out.println("Dame la masa:");
        masa = sc.nextFloat();
        double gravedad = 9.81;
        System.out.println("La Friccion : " + friccion(longtot));
        System.out.println("La velocidad: " + veloci(longtot,energy));
        System.out.println("La altura que alcanzo es: " + altura(longtot,energy) + "\n");
        while(altura(longtot,energy) > 0.0){
                energy-=friccion(longtot);
            System.out.println("La velocidad: " + (float)veloci(longtot,energy));
            System.out.println("La altura que alcanzo es: " + (float)altura(longtot,energy)); 
            System.out.println("Valor de la energia: " + (float)energy + "\n");
            if(energy < 0.0)
               System.out.println("x:" +(float)(Math.pow(veloci(longtot,energy),2))/(coef*gravedad));
        }
    }
    public static double friccion(float longi){
        double coef=0.3;
        double gravedad=9.81;
        double masa=0.1;
        return ((coef)*(gravedad)*(masa)*(longi));
    }
    public static double veloci(float longi,float energia){
        if(energia>0)
        return Math.sqrt(((energia-friccion(longi))/0.05));
        else
          return Math.sqrt((((-1*energia)-friccion(longi))/0.05));  
    }
    public static double altura(float longi,float energia){
        double EnergiaIni=4.905;
        double gravedad=9.81;
        double resta;
        resta = ((Math.pow(veloci(longi,energia),2))-energia);
        return  ((resta)/(2*gravedad));
    }
   /* public static void resfinal(float longi,float energia,float coef,double gravedad){
        double res;
        res = ();
        System.out.println("La longitud final alcanzada es: " + (float)res);
    }*/
}
