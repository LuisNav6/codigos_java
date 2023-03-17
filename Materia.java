/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appestudiantes;

/**
 *
 * @author luisnavarrete
 */
public class Materia {
    private String nombre;
    private int creditos, faltas;
    private float calificacion;

    public Materia() {
    }

    public Materia(String nombre, int creditos, int faltas, float calificacion) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.faltas = faltas;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
}
