/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appestudiantes;
import java.util.Scanner;
/**
 *
 * @author luisnavarrete
 */
public class Manejo_materia {
  private Materia [] materias;
  
  public Manejo_materia() { /* inicializa con 2 materias el arreglo */
   materias = new Materia[2];
  }
  /* recibe un arreglo de materias a referenciar */

   public Manejo_materia(Materia[] materias) {
        this.materias = materias;
   }
   /* recupera la informacion de las materias */
   public Materia [] capturar(){ 
    System.out.println("*** MATERIAS ***"); 
    for (int i = 0; i < materias.length; i++)
    materias[i] = ingresar(); 
    return materias;
   }
   
    /* recupera cada materia del arreglo */
   private Materia ingresar(){
   Scanner in = new Scanner(System.in); 
   Materia m = new Materia(); 
   System.out.print("Nombre de la materia:"); 
   m.setNombre(in.nextLine()); 
   System.out.print("creditos :"); 
   m.setCreditos(in.nextInt()); 
   System.out.print("calificacion :"); 
   m.setCalificacion(in.nextFloat()); 
   System.out.print("faltas :"); 
   m.setFaltas(in.nextInt());
   return m;
  }
   
  /* muestra el contenido de cada materia */
  public void mostrar(){
  for (Materia i : materias)
      verMateria(i);
  }
  
  private void verMateria( Materia temp){ 
    System.out.println("Materia:"+temp.getNombre()); 
    System.out.println("creditos:"+temp.getCreditos()); 
    System.out.println("faltas:"+temp.getFaltas()); 
    System.out.println("calificacion:"+temp.getCalificacion());
  }
  
}
