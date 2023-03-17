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
        Thread hp = Thread.currentThread();
        //hp.start();
      try{
        for(int i=1;i<=6;i++){
            System.out.println("Hello world! hilo: " + i);
            Thread.sleep(i*1000);
        }
      }catch(InterruptedException e){}
 }
}