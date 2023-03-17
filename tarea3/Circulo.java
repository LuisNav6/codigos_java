/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author luisnavarrete
 */
public class Circulo extends Figura{
    private double radio;
   
   public Circulo(double radio) { 
    super();
    this.radio = radio; 
   }
   public double getRadio() {
    return radio; 
   }
   public void setRadio(double radio) {
    this.radio = radio; 
   }
@Override
   public double getArea(){
   return this.area = Math.PI * Math.pow(this.radio, 2.0);
   }
@Override
    public double getPerimetro(){
        return this.area = (2*Math.PI)*this.radio;
    }
@Override
public void Mostrar(){
    System.out.println( "El area del circulo es: " + this.getArea() + " y su perimetro es: " + 
            this.getPerimetro());
}
@Override
   public boolean equals(Object obj) {
    if (obj == null) return false;
    if (!(obj instanceof Circulo)) {
    return false; 
    }
    if (this.radio != ((Circulo)obj).radio) 
        return false;
        return true;
    }
}
