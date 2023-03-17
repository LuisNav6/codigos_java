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
    public static void main(String[] args) {
        // TODO code application logic here
        Contador c1 = new Contador("Cont 1", 5);
        Contador c2 = new Contador("Cont 2", 6);
        Contador c3 = new Contador("Cont 3", 7);
        Contador c4 = new Contador("Cont 4", 8);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        synchronized (t1){
            try{
                t1.wait();
            }catch(InterruptedException e){}
        }
        synchronized (t2){
            try{
                t2.wait();
            }catch(InterruptedException e){}
        }
        synchronized (t3){
            try{
                t3.wait();
            }catch(InterruptedException e){}
        }
        synchronized (t4){
            try{
                t4.wait();
            }catch(InterruptedException e){}
        }
        System.out.println("Fin ...");
    }
    
}
class Contador implements Runnable{
    private int c;
    private String nombre;
    private int limite;

    public Contador(String nombre, int limite) {
        this.nombre = nombre;
        this.limite = limite;
    }

    public void run(){
        synchronized (this){
         while(c <= limite){
            System.out.println("Hilo " + nombre + " -> " + c);
            c ++;
          }
         this.notify();
         System.out.println("Hilo " + nombre + " Ya termino ");
        }
    }
}