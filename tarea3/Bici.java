/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Bici extends Vehiculos{
    private String tipo;

    public Bici(String tipo, String color, int ruedas) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    @Override
    public void mostrar() {
         System.out.println ("[Bicicleta] " + 
                 " [Color] "+ color + 
                 " [Llantas] " + ruedas +
                 " [Tipo] " + tipo);
    }
}
