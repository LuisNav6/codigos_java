/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        fabula T = new fabula("Tortuga");
        fabula L = new fabula("Liebre");
        T.start();
        L.start();
        synchronized(T){
            try{
                T.wait();
               // L.wait()
               T.stopThread();
               L.stopThread();
            }catch(InterruptedException e){}
        }
        Runtime.getRuntime().exec("clear");
    }
    
}
class fabula extends Thread{
int posicion;
private boolean exitThread;

    public fabula(String name) {
        super(name);
        this.posicion=1;
        exitThread = false;
    }

   
    public int getPosicion() {
        return posicion;
    }
    
    @Override
    public void run() {
        double random=Math.random();
        
        synchronized (this){
            while(posicion < 70 && !exitThread){
              if(random < 0.7){
                  posicion+=3;
              }else if(random <0.9){
                  posicion+=6;
              }else{
                  posicion+=9;
              }
              System.out.println("nombre: "+this.getName()+" Posicion: " + this.getPosicion());
              this.notify();
            }
            if(this.getPosicion() >= 70){
            System.out.println(this.getName() + " gano!!!"); 
            stopThread();
        }
             System.out.println(this.getName() + " has been Stopped.");
        }
    }
     public void stopThread() {
        exitThread = true;
    }
}