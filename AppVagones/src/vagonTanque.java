/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class vagonTanque extends Vagon{
    private double radio;
    final  double pi = 3.1415;
    public vagonTanque(double radio, double longitud) {
        super(longitud);
        this.radio = radio;
    }

    @Override
    public double Volumen() {
      return pi*radio*radio*getLongitud();
    }
    
    
}
