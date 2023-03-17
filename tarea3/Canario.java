/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author luisnavarrete
 */
public class Canario extends Animal{
    private int Edad;
    private String Nombre;

    public Canario(int Edad, String Nombre) {//con argumentos
        this.Edad = Edad;
        this.Nombre = Nombre;
    }

    public Canario() {//sin argumentos
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public void habla() {
        System.out.println("Pio-Pio!");
    }

    @Override
    public void seDesplaza() {
       System.out.println("Volando");
    }
     public void planea(){
         System.out.println("Extiende sus alas");
     }
}
