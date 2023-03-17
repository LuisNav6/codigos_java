/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public abstract class Vehiculos {
     public String color;
    public int ruedas;

    public Vehiculos(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    abstract public void mostrar();
}
