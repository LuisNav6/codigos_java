/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appestudiantes;

/**
 *
 * @author luisnavarrete
 */
public class Alumno{
    private int Id, faltasTotales; 
    private String nombre, apellido; 
    private float promedio;
    private Materia[] materias;
    
    public Alumno() {}
    
public Alumno(int Id, String nombre, String apellido,int faltasTotales, float promedio, Materia[] materias){ 
    this.Id = Id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.faltasTotales = faltasTotales;
    this.promedio = promedio;
    this.materias = materias;
   }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = Id;
    }

    public int getFaltasTotales() {
        return faltasTotales;
    }

    public void setFaltasTotales(int faltasTotales) {
        this.faltasTotales = faltasTotales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

}
