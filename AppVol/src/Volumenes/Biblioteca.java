/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Volumenes;

/**
 *
 * @author luisnavarrete
 */
public class Biblioteca extends Volumen{
    int MAX = 100;
    Volumen [] volumenes = new Volumen[MAX];
    private int i;

    public Biblioteca(int i, String ISBN, String titulo, int nEjemplares) {
        super(ISBN, titulo, nEjemplares);
        this.i = i;
    }

    public void MostrarDatos(){
        for (int j=0; j < i; j++)
        volumenes[j].Mostrar();
    }

    @Override
    public void Mostrar() {
         System.out.println("El titulo del libro es: " + this.titulo + " y el ISBN : " + 
                this.ISBN + " ");
    }
    
    public boolean añadir(Volumen v){
       boolean agregado = false;
        if(i < MAX){
          volumenes[i] = v;
          i++;
          agregado = true;
        }
    return agregado;
}
}
