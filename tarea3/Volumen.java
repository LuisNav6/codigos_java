/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Volumenes;

/**
 *
 * @author luisnavarrete
 */
public class Volumen {
    protected String ISBN;
    protected String titulo;
    protected int nEjemplares;

    public Volumen(String ISBN, String titulo, int nEjemplares) {//constructor inicializado
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.nEjemplares = nEjemplares;
    }
    
    public Volumen(Volumen obj){
        this.ISBN = obj.ISBN;
        this.titulo = obj.titulo;
        this.nEjemplares = obj.nEjemplares;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }
    
    public  String Mostrar(){
        return "El titulo del libro es: " + this.titulo + " y el ISBN : " + 
                this.ISBN + " ";
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }
    
    
}
