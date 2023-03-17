/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aviones;

/**
 *
 * @author luisnavarrete
 */
public class Avion {
    protected String NomVuelo;
    protected String destino;

    public Avion(String NomVuelo, String destino) {
        this.NomVuelo = NomVuelo;
        this.destino = destino;
    }

    public String getNomVuelo() {
        return NomVuelo;
    }

    public void setNomVuelo(String NomVuelo) {
        this.NomVuelo = NomVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public String Mostrar(){
       return "Nombre del vuelo: " + this.NomVuelo + " con destino a : " + 
               this.destino + "\t";
    }
}
