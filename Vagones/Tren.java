/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author luisnavarrete
 */
public class Tren {
   private Vagon[] vagones;
    private String salida,destino,nombre;
    private int numPrim, numSeg;
    private int precioPrim,precioSeg;

    public Tren(String nombre, String salida, String destino, int numPrim, int numSeg, int precioPrim, int precioSeg) {
        this.nombre = nombre;
        this.numPrim = numPrim;
        this.numSeg = numSeg;
        this.salida = salida;
        this.destino = destino;
        this.precioPrim = precioPrim;
        this.precioSeg = precioSeg;
        this.vagones = new Vagon[numPrim + numSeg];
    }
    
    public Vagon getVagon(int i) {
        return vagones[i];
    }
        public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPrim() {
        return numPrim;
    }

    public void setNumPrim(int numPrim) {
        this.numPrim = numPrim;
    }

    public int getNumSeg() {
        return numSeg;
    }

    public void setNumSeg(int numSeg) {
        this.numSeg = numSeg;
    }

    public int getPrecioPrim() {
        return precioPrim;
    }

    public void setPrecioPrim(int precioPrim) {
        this.precioPrim = precioPrim;
    }

    public int getPrecioSeg() {
        return precioSeg;
    }

    public void setPrecioSeg(int precioSeg) {
        this.precioSeg = precioSeg;
    }
    
    public void llenar(){
        for(int i=0;i<this.vagones.length;i++)
            if(i<numPrim){
                this.vagones[i] = rellenar(true);
            }else{
               vagones[i] = rellenar(false);
    }
}

    private Vagon rellenar(boolean a){
        Vagon v =new Vagon();
        v.setPrimera(a);
        v.ocupar();
        return v;
}
    public int totalVentas() {
        int total = 0;
        for (int i = 0; i < this.vagones.length; i++) {
            if (i < numPrim) {
                total += (vagones[i].asientosocupados() * precioPrim);
            } else {
                total += (vagones[i].asientosocupados() * precioSeg);
            }
        }
        return total;
    }
}
        