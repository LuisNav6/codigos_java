/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Tren extends Vagon{
    private int nVagones,i;
    Vagon [] vagones = new Vagon[100];

    public Tren(int nVagones, double longitud) {
        super(longitud);
        this.nVagones = nVagones;
        this.i = 0;
    }
    
    public boolean añadir(Vagon v){//añadiendo un nuevo tren
        boolean aux=false;
       if(i < 100){
         vagones[i] = v;
         i++;
         aux=true;
       }
       return aux;
    }

    @Override
    public double Volumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public double Volt(){//calculamos el volumen total
        double vt = 0;
       for(int j = 0;j < i; j++){
        vt += vagones[j].Volumen();
       }
        return vt;
    }
}
