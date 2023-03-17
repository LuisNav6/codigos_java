/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author luisnavarrete
 */
public class Vagon {
    private boolean  []asientos = new boolean [40];
    private boolean  primera;

    public Vagon() {//constructor por defecto
    }
    
    public Vagon(boolean primera){
        this.primera=primera;
    }
    public boolean getAcientos(int ind){
       return this.asientos[ind];
   }
    public boolean getPrimera(){
        return primera;
    }
    public void setPrimera(boolean primera){
        this.primera=primera;
    }
    public void ocupar(){
      double probabilidad = this.primera ? 0.1 : 0.4;
       for(int i = 0; i < 40; i++)
         this.asientos[i] = Math.random() < probabilidad;
    }
    public int asientosocupados(){
      int cont=0;
        for(int i=0; i < asientos.length;i++){
            System.out.print("[" + i + "]" + "[" + asientos[i] + "] ");
            if(asientos[i]==true){
                cont++;
            }
        }
        System.out.println();
        clasificador(cont);
        return cont;
    }
    
    public void clasificador(int cont){
        if(cont < 16){
            System.out.println("Vagon de Primera");
        }else{
             System.out.println("Vagon de Segunda");
        }
    }
}
