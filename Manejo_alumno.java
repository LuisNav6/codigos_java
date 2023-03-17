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
public class Manejo_alumno {
    private Alumno [] grupo;

    public Manejo_alumno(int tam) {//maneja el tamaño de alumno
        grupo=new Alumno [tam];
    }
    
    public void capturar() { // recaba la información de cada alumno 
    System.out.println("*** ALUMNO ***");
    for( int i = 0; i < grupo.length; i++)
    grupo[i] = ingresar(); 
    }
    
    /* recolecta de manera individual cada alumno, es la responsable de interactuar con el usuario final desde la consola */
    private Alumno ingresar(){
        Alumno al=new Alumno();
        Scanner in = new Scanner(System.in); 
        System.out.print("ID :");
        do{
            al.setId(in.nextInt());
        }while (al.getId() < 0 || al.getId() > 10);
        System.out.print("Nombre :"); 
        in.skip("\\s*\\n"); //permite capturar con espacios
        al.setNombre(in.nextLine()); 
        System.out.print("apellido :"); 
        al.setApellido(in.nextLine());
        /* crea un objeto de tipo Manejo_materias, debido a que recabamos la información relativa a cada materia, capturar en Materia regresa
un arreglo de materias que es fácilmente manipulado */
        al.setMaterias(new Manejo_materia().capturar());
        al.setPromedio(promedioC(al.getMaterias())); 
        al.setFaltasTotales(promedioF(al.getMaterias())); 
        return al;
    }
    
    private float promedioC(Materia [] tem){ // calculamos el promedio 
    float prom = 0;
    for (Materia i : tem)
    prom += i.getCalificacion();
    prom /= tem.length;
    return prom;
    }
    
    private int promedioF(Materia [] tem){ // calculamos el total de faltas 
    int suma = 0;
    for (Materia i : tem) 
    suma += i.getFaltas();
    return suma;
    }
    
    public void mostrar(){ 
    System.out.println("*** CONSULTA ***"); 
    for(Alumno i : grupo)
    imprimir(i);
    }
    
    private void imprimir(Alumno i){
    System.out.println("ID: "+i.getId()); 
    System.out.println("nombre: "+i.getNombre()+" "+i.getApellido()); 
    System.out.println("promedio: "+i.getPromedio()); 
    System.out.println("faltas: "+i.getFaltasTotales ());
    new Manejo_materia(i.getMaterias()).mostrar();
    }
    // Ordenamos el arreglo en base a dos criterios, promedio y faltas
    
    public void ordenar(){
    for (int i = 0; i < grupo.length-1; i++)
    for (int j = i+1; j < grupo.length; j++){
     if (grupo[i].getPromedio() < grupo[j].getPromedio()) {
         Alumno temp;
         temp = grupo[i]; 
         grupo[i] = grupo[j]; 
         grupo[j] = temp;
     }else if(grupo[i].getPromedio() == grupo[j].getPromedio() &&
         grupo[i].getFaltasTotales() > grupo[j].getFaltasTotales()){
         Alumno temp;
         temp = grupo[i];
         grupo[i] = grupo[j];
         grupo[j] = temp;
        }
    }
   }
        
}
