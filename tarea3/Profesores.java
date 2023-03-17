/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Profesores extends Loros{
    String profesion;
    int edad;
    String nombre;
    int año;

    public Profesores(String profesion, int edad, String nombre, int año) {
        this.profesion = profesion;
        this.edad = edad;
        this.nombre = nombre;
        this.año = año;
    }

    @Override
    public String Mostrar() {
        return "Hola soy " + nombre +
                " y se " + super.Mostrar() 
                + " soy racional, tengo " 
                + edad + " naci en el año : " +
                año + " soy " + profesion;
    } 
}
