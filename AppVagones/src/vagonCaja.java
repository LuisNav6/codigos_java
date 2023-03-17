/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class vagonCaja extends Vagon{
    private double ancho,alto;

    public vagonCaja(double ancho, double alto, double longitud) {
        super(longitud);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double Volumen() {
       return alto*ancho*getLongitud();
    }
    
    
}
