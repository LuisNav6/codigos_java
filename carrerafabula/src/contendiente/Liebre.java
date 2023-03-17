/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contendiente;

/**
 *
 * @author luisnavarrete
 */
public class Liebre extends Animal{
    private static final int DORMIR = 0;
    private static final int GRAN_SALTO = 9;
    private static final int RESBALO_GRANDE = -12;
    private static final int PEQUEÑO_SALTO = 1;
    private static final int RESBALO_PEQUEÑO = -2;

    public Liebre(String name) {
        super(name);
    }

   
    
    
    
    @Override
    public int getMovimiento(int random) {//Adaptacion de cantidad de avance 
        if (random >= 1 && random <= 2) {// 1-2 50%
            return DORMIR;
        } else if (random >= 3 && random <= 4) { // 3-4 20%
            return GRAN_SALTO;
        } else if (random >= 5 && random <= 5) {// 5 10%
            return RESBALO_GRANDE;
        } else if (random >= 6 && random <= 8) {// 6-8  30%
            return PEQUEÑO_SALTO;
        } else if (random >= 9 && random <= 10) {// 9-10 20%
            return RESBALO_PEQUEÑO;
        } else {
            throw new IllegalArgumentException("random debe ser [1-10]");//ponemos la excepcion para evitar que truene, y le decimos que el random es en el rango del 1 al 10
        }
    }

    @Override
    public String getMovimientoName(int random) {//mandamos el nombre del movimiento que hizo
        if (random >= 1 && random <= 2) {
            return "Durme!";
        } else if (random >= 3 && random <= 4) {
            return "hizo un salto largo!";
        } else if (random >= 5 && random <= 5) {
            return "tuvo un resbalon grande!";
        } else if (random >= 6 && random <= 8) {
            return "hizo un salto pequeño!";
        } else if (random >= 9 && random <= 10) {
            return "tuvo un resbalón pequeño!";
        } else {
            throw new IllegalArgumentException("random debe ser [1-10]");
        }
    }
}
