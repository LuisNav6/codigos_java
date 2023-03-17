/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Alumno extends Loros{
    int edad;
    String nombre;
    int año;

    public Alumno(int edad, String nombre, int año) {
        this.edad = edad;
        this.nombre = nombre;
        this.año = año;
    }

    @Override
    public String Mostrar() {
       return "Hola soy " + nombre +
               " y se " + super.Mostrar() 
               + " soy racional, tengo " 
               + edad + " naci en el año: "+ año;
    }
}
