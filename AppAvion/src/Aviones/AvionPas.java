/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aviones;

/**
 *
 * @author luisnavarrete
 */
public class AvionPas extends Avion{
    private int duracion;//tiene que ser en minutos
    private double pesoEqui;

    public AvionPas(String NomVuelo, String destino, int duracion, double pesoEqui) {
        super(NomVuelo, destino);
        this.duracion = duracion;
        this.pesoEqui = pesoEqui;
    }

    @Override
    public String Mostrar() {
        return super.Mostrar() +  "Con duracion de : " + this.duracion + " Minutos, " + 
                " y con capacidad máxima de equipaje de: " + this.pesoEqui + "\n";
    }
    
    
    
    
    
    
    
    
    
    
    
}
