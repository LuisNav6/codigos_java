/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import Datos.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura [] contenedor = new Figura [3]; 
        contenedor [0] = new Circulo(5); 
        contenedor [1] = new Cuadrado(12); 
        contenedor [2] = new Triangulo(15,12);
        //mostramos el contenido de cada figura
        for(Figura x : contenedor){
            x.Mostrar();
        }
           if(contenedor[0].getArea() > contenedor[1].getArea() && 
               contenedor[0].getArea() > contenedor [2].getArea()){
                System.out.println("LA FIGURA CON MAYOR AREA ES: circulo");
            }else if(contenedor[1].getArea() > contenedor[0].getArea() && 
               contenedor[1].getArea() > contenedor[2].getArea()){
               System.out.println("LA FIGURA CON MAYOR AREA ES: cuadrado"); 
            }else{
                System.out.println("LA FIGURA CON MAYOR AREA ES: triangulo");
            }
           
           if(contenedor[0].getPerimetro()> contenedor[1].getPerimetro()&& 
               contenedor[0].getPerimetro() > contenedor [2].getPerimetro()){
                System.out.println("LA FIGURA CON MAYOR PERIMETRO ES: circulo");
            }else if(contenedor[1].getPerimetro() > contenedor[0].getPerimetro() && 
               contenedor[1].getPerimetro() > contenedor[2].getPerimetro()){
               System.out.println("LA FIGURA CON MAYOR PERIMETRO ES: cuadrado"); 
            }else{
                System.out.println("LA FIGURA CON MAYOR PERIMETRO ES: triangulo");
            }
    }
}
