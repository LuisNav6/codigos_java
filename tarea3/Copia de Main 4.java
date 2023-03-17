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
        //clientes
        Cliente c1 = new Cliente("Luis ", "Navarrete");
        Cliente c2 = new Cliente("Juanito ", "Lopez");
        //agregamos la persona
        System.out.println("AGREGAMOS EL PRIMER CLIENTE....");
        c1.añadirC(c1.getNombre(),c1.getApellido());
        System.out.println("AGREGAMOS EL SEGUNDO CLIENTE....");
        c2.añadirC(c2.getNombre(),c2.getApellido());
        
        Cuentas [] cu = new Cuentas [100];
        //cuentas del cliente 1
        cu[0] = new Ahorro(12345,0.0,c1.getNombre());
        cu[1] = new Corriente(12345,1200.0,c1.getNombre());
        cu[2] = new Recargo(12345,1000.0,c1.getNombre());
        //cuentas del cliente 2
        cu[3] = new Ahorro(56789,10000.0,c2.getNombre());
        cu[4] = new Corriente(56789,23000.0,c2.getNombre());
        cu[5] = new Recargo(56789,0.0,c2.getNombre());
        
        //MOVIMIENTOS c1
        System.out.println();
        System.out.println("CLIENTE: " + c1.getNombre() + c1.getApellido());
        System.out.println("CUENTA DE AHORRO");
       cu[0].transaccion("deposito", (10000 * 1.055));
       
       System.out.println("CUENTA CORRIENTE");
       cu[1].transaccion("retiro", (500));
       
       System.out.println("CUENTA DE RECARGO");
       cu[2].transaccion("retiro",(1000*0.1));
       System.out.println();
       
       //MOVIMIENTOS C2
       System.out.println();
        System.out.println("CLIENTE: " + c2.getNombre() + c2.getApellido());
        System.out.println("CUENTA DE AHORRO");
       cu[3].transaccion("deposito", (1000 * 1.055));
       
       System.out.println("CUENTA CORRIENTE");
       cu[4].transaccion("retiro", (2000));
       
       System.out.println("CUENTA DE RECARGO");
       cu[5].transaccion("deposito",(1000));
       System.out.println();
       
       //transferencias entre cuentas
       System.out.println("TRANSFERENCIAS ENTRE CUENTAS");
      //luis le deposita 700 a Juanito
      cu[1].transaccion("retiro",700); cu[4].transaccion("deposito",700);
    }
    
}
