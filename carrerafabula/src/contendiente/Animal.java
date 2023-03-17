/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contendiente;
import java.util.concurrent.Semaphore;
/**
 *
 * @author luisnavarrete
 */
    public abstract class Animal extends Thread {

    private Semaphore semaforoAnimal = new Semaphore(1);
    private Semaphore semaforoContendiente = null;//es como ponerlo en rojo
    private Semaphore semaforoAvanzar = null;
    private Semaphore semaforoMovimiento = null;
    private boolean meta = false;
    private boolean duerme = false;
    private int posicion = 1;
    private int aleatorio = 0;

    public Animal(String name) {
        super(name);
    }

    public Semaphore getSemaforoAnimal() {
        return semaforoAnimal;
    }

    public void setSemaforoContendiente(Semaphore semaforoContendiente) {
        this.semaforoContendiente = semaforoContendiente;
    }

    public void setSemaforoAvanzar(Semaphore semaforoAvanzar) {
        this.semaforoAvanzar = semaforoAvanzar;
    }

    public void setSemaforoMovimiento(Semaphore semaforoMovimiento) {
        this.semaforoMovimiento = semaforoMovimiento;
    }

    public boolean isDuerme() {
        return duerme;
    }

    public boolean isMeta() {
        return meta;
    }

    public void setMeta(boolean meta) {
        this.meta = meta;
    }

    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }

    public int getPosicion() {
        return posicion;
    }
        private void circuito() throws InterruptedException {

        System.out.println("Nombre: " + getName() + " posicion " + posicion);

        while (!meta) {//mientras que la meta este en false

            semaforoContendiente.acquire(); //espera al contendiente, es un objeto de la libreria semaphore

            int movimiento = getMovimiento(aleatorio);
            if (movimiento == 0) {
                duerme = true;//lo dormimos
                semaforoAnimal.release();
                semaforoAvanzar.acquire();//esperamos que cambie para avanzar
                {
                    System.out.println("Nombre: " + getName() + " Posicion: " + posicion + " movimiento: " + getMovimientoName(aleatorio));
                }
                semaforoMovimiento.release();
                semaforoContendiente.acquire();
            }

            semaforoAnimal.release(); //ya hizo su tirada, entonces mandamos luz verde

            semaforoAvanzar.acquire();
            {
                posicion += movimiento;
                if (posicion <= 1) {
                    posicion = 1;
                } else if (posicion >= 70) {
                    meta = true;
                }
                System.out.println("Nombre: " + getName() + " posicion: " + posicion + " movimiento: " + getMovimientoName(aleatorio));
                duerme = false;//despertamos
            }
            semaforoMovimiento.release();

        }

        semaforoAnimal.release(); //le damos luz verde
    }

    @Override
    public void run() {//aqui solo mandamos toda nuestra funcion de como funciona la carrera, junto con sus 
        //respectivos semaforos, pero lo metemos a un try-catch porque necesitamos cubir la excepcion que generan los hilos
        try {
            circuito();
        } catch (InterruptedException e) {
            e.printStackTrace();//mandamos la ubicamos del error
        }
    }
    //metodos para movimiento, son abstractos porque cada animal lo adapta a su manera
     public abstract int getMovimiento(int random);//da cuanto avanza

    public abstract String getMovimientoName(int random);//da el tipo de movimiento
}

