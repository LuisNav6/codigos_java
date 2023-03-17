/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author luisnavarrete
 */
public class Perro extends Animal{
    private int Edad;
    private String nombre;

    public Perro(int Edad, String nombre) {//con argumentos
        this.Edad = Edad;
        this.nombre = nombre;
    }

    public Perro() {
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void habla() {
       System.out.println("Guau!");
    }

    @Override
    public void seDesplaza() {
       System.out.println("Caminando");
    }
    
    
}
