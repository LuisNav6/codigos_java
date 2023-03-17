/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Moto extends Vehiculos{
    private double velocidad;
    private double cc;

    public Moto(double velocidad,double cc, String color, int ruedas) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cc = cc;
    }

    @Override
    public void mostrar() {
       System.out.println( "[MOTOCICLETA] " + " [Color]: "
                + color + " [Llantas]: " + ruedas +
                " [Velocidad]: "+ velocidad + " KM/H [CC]: " 
                + cc);
    }
    
    
}
