/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public abstract class Vagon {
    private double longitud;

    public Vagon(double longitud) {
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }
    
    public abstract double Volumen(); 
}
