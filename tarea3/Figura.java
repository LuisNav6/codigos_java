/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author luisnavarrete
 */
public abstract class Figura {
    protected double area;
   public Figura(){
        this.area = 0;
    }
public abstract double getArea(); 
public abstract double getPerimetro(); 

public abstract void Mostrar();
}


