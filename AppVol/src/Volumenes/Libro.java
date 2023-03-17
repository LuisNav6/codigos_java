/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Volumenes;

/**
 *
 * @author luisnavarrete
 */
public class Libro extends Volumen{
    private String autor;
    private String editorial;

    public Libro(String autor, String editorial, String ISBN, String titulo, int nEjemplares) {
        super(ISBN, titulo, nEjemplares);
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libro(Libro obj) {
        super(obj);
       this.autor = obj.autor;
       this.editorial = obj.editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public void Mostrar() {
      System.out.println( "El autor del libro es:  " + this.autor + " y la editorial es : "
                + this.editorial + " Y la cantidad de volumenes es: " + this.nEjemplares);
    }
   
   
}
