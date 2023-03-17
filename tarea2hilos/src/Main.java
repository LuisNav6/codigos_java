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
         HiloNumeroLetras thread1 = new HiloNumeroLetras(1);
        HiloNumeroLetras thread2 = new HiloNumeroLetras(2);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
    
} 
class HiloNumeroLetras implements Runnable {
    private int tipo;

    public HiloNumeroLetras(int tipo) {
        this.tipo = tipo;
    }

public void run(){
        switch(tipo){
            case 1:{
                tipo1();
                break;
            }
            case 2:{
                tipo2();
                break;
            }
        }
    }
synchronized private void tipo1(){
    for(int i=1; i <= 30; i++){
        System.out.println(i);
    }
}

synchronized private void tipo2(){
for(char c = 'a' ; c < 'z'; c++){
    System.out.println(c);
    }
}
}