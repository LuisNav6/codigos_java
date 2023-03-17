/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author luisnavarrete
 */
public class Cuadrado extends Figura{
    private int lado;
  
   public Cuadrado(int lado) { 
    super();
    this.lado = lado; 
   }

    public int getLado() {
        return lado;
    }
   
@Override
   public double getArea() {
   return this.area = lado * lado; 
   }
 @Override
  public double getPerimetro(){
      return this.area = lado + lado + lado + lado;
  }
  @Override 
  public void Mostrar(){
      System.out.println("El area del cuadrado es: " + this.getArea() + " y el perimetro es: "
      + this.getPerimetro());
  }
@Override
    public boolean equals(Object obj) {
     if (obj == null) {
     return false; 
     }
      if (this.getClass() != obj.getClass()) {
      return false; 
    }
    final Cuadrado other = (Cuadrado) obj; 
    if (this.lado != other.lado) {
     return false; 
       }
     return true;
    }
}

