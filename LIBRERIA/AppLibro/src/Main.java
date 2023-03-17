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
        String titulo, autor;
        int ejemplares;
        
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1, 0);//utilizamos el constructor c/parametros
        
        Libro libro2 = new Libro();//utilizamos el constructor por defecto
        System.out.println("----Añadir Libro----");
        System.out.println("Introduce titulo: ");
        titulo = s.nextLine();
        System.out.println("Introduce autor: ");
        autor = s.nextLine();
        System.out.println("Numero de ejemplares: ");
        ejemplares = s.nextInt();
        
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);
        //mostramos los libros que tenemos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados() + "\n");
        
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados() + "\n");
        //prestamos el libro 1 y 2
        System.out.println();
                      if (libro1.prestamo()) {
                      System.out.println("Se ha prestado el libro " + libro1.getTitulo());
                      } else {
                      System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + 
                      " para prestar");         
                      }  
  
                      if (libro2.prestamo()) {
                      System.out.println("Se ha prestado el libro " + libro2.getTitulo());
                      } else {
                      System.out.println("No quedan ejemplares del libro " + libro2.getTitulo() + 
                      " para prestar");         
                      }
                      System.out.println();
                      //mostramos su status
                       System.out.println("Libro 1:");
                        System.out.println("Titulo: " + libro1.getTitulo());
                        System.out.println("Autor: " + libro1.getAutor());
                        System.out.println("Ejemplares: " + libro1.getEjemplares());
                        System.out.println("Prestados: " + libro1.getPrestados());
                        System.out.println();
                        
                         System.out.println("Libro 2:");
                        System.out.println("Titulo: " + libro2.getTitulo());
                        System.out.println("Autor: " + libro2.getAutor());
                        System.out.println("Ejemplares: " + libro2.getEjemplares());
                        System.out.println("Prestados: " + libro2.getPrestados());
                        System.out.println();
                        //volvemos a pedir el libro 2 para que nos diga que no esta en stock
                        if (libro2.prestamo()) {
                      System.out.println("Se ha prestado el libro " + libro2.getTitulo());
                      } else {
                      System.out.println("No quedan ejemplares del libro " + libro2.getTitulo() + 
                      " para prestar");         
                      }
                        System.out.println();
        //devolvemos libro 1 y 2
                    if (libro1.devolucion()) {
                    System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
                    } else {
                    System.out.println("No hay ejemplares del libro " + libro1.getTitulo() +
                    " prestados");
                     } 
                     if (libro2.devolucion()) {
                     System.out.println("Se ha devuelto el libro " + libro2.getTitulo());
                     } else {
                     System.out.println("No hay ejemplares del libro " + libro2.getTitulo() +
                     " prestados");
                      }
                     System.out.println();
                   //mostramos su status
                 System.out.println("Libro 1:");
                        System.out.println("Titulo: " + libro1.getTitulo());
                        System.out.println("Autor: " + libro1.getAutor());
                        System.out.println("Ejemplares: " + libro1.getEjemplares());
                        System.out.println("Prestados: " + libro1.getPrestados());
                        System.out.println();
                    
                 System.out.println("Libro 2:");
                        System.out.println("Titulo: " + libro2.getTitulo());
                        System.out.println("Autor: " + libro2.getAutor());
                        System.out.println("Ejemplares: " + libro2.getEjemplares());
                        System.out.println("Prestados: " + libro2.getPrestados());
                        System.out.println();
            
    }
    
}
