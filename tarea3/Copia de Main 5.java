/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int r;
        do{
            System.out.println("LORO---[1]");
            System.out.println("PROFESOR---[2]");
            System.out.println("ALUMNO---[3]");
            System.out.println("SALIR---[4]");
            System.out.println("INSERTE LA OPCION DESEADA: ");
            r = s.nextInt();
            switch(r){
                 case 1 : {
                    Loros l = new Loros();
                    System.out.println(l.Mostrar());
                    break;
                }
                case 2 :{
                    Alumno a = new Alumno(20, "Juanito",2001);
                    System.out.println(a.Mostrar());
                    break;
                }
                case 3 :{ 
                    Profesores p = new Profesores("Profesor",35,"Chuy",1993);
                    System.out.println(p.Mostrar());
                    break;
                }
                case 4 :{
                    System.exit(0);
                }
                default :{
                    System.out.println("Opcion incorrecta!");
                    break;
                }
            }
            }while(r!=4);
        }
    }
