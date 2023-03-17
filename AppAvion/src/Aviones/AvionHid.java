/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aviones;

/**
 *
 * @author luisnavarrete
 */
public class AvionHid extends Avion{
    private int lt;
    private int capacidad;

    public AvionHid(String NomVuelo, String destino, int x) {
        super(NomVuelo, destino);
        this.lt = x;
        this.capacidad = x;
    }

    public void Descarga(int d){
        this.lt -= d;
    }
    
    public  void Descarga(){
        this.lt = 0;
    }
    @Override
   public String Mostrar(){
       return super.Mostrar() + "Tiene como capacidad : " + this.capacidad + 
               " Lts. Y actualmente tiene: " + this.lt + "Lts.\n";
   }
}
