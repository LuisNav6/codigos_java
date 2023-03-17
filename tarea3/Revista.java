/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Volumenes;

/**
 *
 * @author luisnavarrete
 */
public class Revista extends Volumen{
    private int año;
    private int nRevista;

    public Revista(int año, int nRevista, String ISBN, String titulo, int nEjemplares) {
        super(ISBN, titulo, nEjemplares);
        this.año = año;
        this.nRevista = nRevista;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getnRevista() {
        return nRevista;
    }

    public void setnRevista(int nRevista) {
        this.nRevista = nRevista;
    }
    
    @Override
    public String Mostrar(){
    return super.Mostrar() + " El año de la revista es: " + this.año + " y la cantidad de ejemplares es: "
            + this.nEjemplares + " ";
    }
    
}
