/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author luisnavarrete
 */
public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override 
    public double getArea(){
        return this.area = (base * altura)/2;
    }
    @Override
    public double getPerimetro(){
    return this.area = base + (2 * altura);
    }
    @Override
    public void Mostrar(){
        System.out.println("El area del triangulo es: " + this.getArea() + 
                " y el perimetro es: " + this.getPerimetro());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangulo other = (Triangulo) obj;
        if (this.base != other.base) {
            return false;
        }
        return this.altura == other.altura;
    }
    
    
}

