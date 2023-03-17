/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import contendiente.Animal;
import contendiente.Liebre;
import contendiente.Tortuga;

import java.util.concurrent.Semaphore;//crea un semfaro con caracteristicas especiales, como las que ocupamos
import java.util.concurrent.ThreadLocalRandom;//numero aleatorio en un rango
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaforoAvanzar = new Semaphore(0);//inicializamos el semaforo de avance 
        Semaphore semaforoMovimiento = new Semaphore(0);//inicializamos el semaforo del tipo de movimiento

        Animal liebre = new Liebre("liebre");
         Animal tortuga = new Tortuga("tortuga");
         //LIEBRE
        liebre.setSemaforoContendiente(tortuga.getSemaforoAnimal());
        liebre.setSemaforoAvanzar(semaforoAvanzar);
        liebre.setSemaforoMovimiento(semaforoMovimiento);
        
       //TORTUGA
        tortuga.setSemaforoContendiente(liebre.getSemaforoAnimal());
        tortuga.setSemaforoAvanzar(semaforoAvanzar);
        tortuga.setSemaforoMovimiento(semaforoMovimiento);

        System.out.println("------LUIS HUMBERTO NAVARRETE BALANDRÁN-----");
        System.out.println();
        int aleatorio;//variable en la que mandamos a llamar a nuestro aleatorio con rango
        aleatorio = ThreadLocalRandom.current().nextInt(1, 10 + 1);//generamos el aleatorio
        liebre.setAleatorio(aleatorio);//mandamos el aleatorio que sucedió
        tortuga.setAleatorio(aleatorio);

        tortuga.start();
        liebre.start();

        while (!liebre.isMeta() && !tortuga.isMeta()) {//while que nos sirve para ver si ya llegaron a la meta
            Thread.sleep(10);//se espera un segundo

            semaforoAvanzar.release();
            semaforoAvanzar.release();

            aleatorio = ThreadLocalRandom.current().nextInt(1, 10 + 1);
            liebre.setAleatorio(aleatorio);
            tortuga.setAleatorio(aleatorio);

            semaforoMovimiento.acquire();
            semaforoMovimiento.acquire();

        }//fin while

        if (liebre.isMeta() && tortuga.isMeta()) {
                System.out.println("Es un empate!");
                
            }  else if (liebre.isMeta()) {
            System.out.println("La liebre ganó!");

        } else if (tortuga.isMeta()) {
            System.out.println("La tortuga ganó!");
        }
            System.out.println("FINALIZA LA CARRERA DEL DIA DE HOY, ADIOS!");
        // finalizamos carrera
        liebre.setMeta(true);//cambiamos de valor la bandera para finalizar
        tortuga.setMeta(true);//le decimos que ya finalizo la carrera
        semaforoAvanzar.release(2+1); //le sumamos uno por si hay algun hilo dormido
    }
}
    
