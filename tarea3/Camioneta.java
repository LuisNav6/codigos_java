/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Camioneta extends Vehiculos{
    private double carga;

    public Camioneta(double carga, String color, int ruedas) {
        super(color, ruedas);
        this.carga = carga;
    }

    @Override
    public void mostrar() {
       System.out.println("[Camioneta] " + 
               " [Color] "+ color + 
               " [Llantas] " + ruedas +
               " [Carga] " + carga + "KG");
    }
}
