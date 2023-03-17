/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Coche extends Vehiculos{
    private double velocidad;
    private int cc;

    public Coche(double velocidad, int cc, String color, int ruedas) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cc = cc;
    }

    @Override
    public void mostrar() {
        System.out.println( "[COCHE] " + " [Color]: "
                + color + " [Llantas]: " + ruedas +
                " [Velocidad]: "+ velocidad + " KM/H [CC]: " 
                + cc);
    }
}
