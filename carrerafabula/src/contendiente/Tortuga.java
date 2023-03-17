/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contendiente;

/**
 *
 * @author luisnavarrete
 */
public class Tortuga extends Animal{
    private static final int AVANCE_RAPIDO = 3;
    private static final int RESBALO = -6;
    private static final int AVANCE_LENTO = 1;

    public Tortuga(String name) {
        super(name);
    }
    
    
   
    @Override
    public int getMovimiento(int aleatorio) {
        if (aleatorio >= 1 && aleatorio <= 5) {// 1-5  50%
            return AVANCE_RAPIDO;
        } else if (aleatorio >= 6 && aleatorio <= 7) {// 6-7  20%
            return RESBALO;
        } else if (aleatorio >= 8 && aleatorio <= 10) { // 8-10 30%
            return AVANCE_LENTO;
        } else {
            throw new IllegalArgumentException("aleatorio debe ser [1-10]");
        }
    }

    @Override
    public String getMovimientoName(int aleatorio) {
        if (aleatorio >= 1 && aleatorio <= 5) {
            return "avanzó rapido!";
        } else if (aleatorio >= 6 && aleatorio <= 7) {
            return "Resbalò!";
        } else if (aleatorio >= 8 && aleatorio <= 10) {
            return "avanzó lento!";
        } else {
            throw new IllegalArgumentException("aleatorio debe ser [1-10]");
        }
    }
}
