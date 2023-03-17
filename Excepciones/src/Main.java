/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.util.*;
import java.math.BigInteger;
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Main e = null;
        try{
        e.metodo();
        }catch (NullPointerException er){
            System.err.println("Nulo!!");
        }catch (Miexcepcion ex){
            System.err.println(ex.Mensaje);
        }finally{
            System.err.println("pasamos por aqui");
        }
       Main ex = new Main ();
      try{
          ex.f();
      }catch(tipo2 e2){
          System.err.println(e2.getMessage());
      }
       Main e2 = new Main ();
      try{
          e2.m2(0);
      }catch(Miexcepcion | tipo2 | tipo3 w){
          System.err.println(w.getMessage());
      }
      
      try{
          divide(args[0],args[1]);
      }catch(ArrayIndexOutOfBoundsException e7){
          System.err.println("Faltan argumentos!" + e7.getMessage());
          uso();
      }
      
      Scanner s = new Scanner(System.in);
      int edad;
      boolean r = true;
      while(r){
          System.out.println("Introduce tu edad: ");
          try{
              edad = s.nextInt();
              r = false;
          }catch(InputMismatchException e8){
              s.nextLine();
              System.err.println("error!");
          }
      }
      c c = new c();//creamos el objeto del tipo c
     try{
         ((a)c).met();//upcasting
     }catch(Exception ee9){
         System.err.println(ee9.getMessage());
     }
      
     String a = "2", b = "0", resp;
     int num,den,coci;
     
     try{
         num = Integer.parseInt(a);
         den = Integer.parseInt(b);
         rango(num,den);
         coci = num/den;
         resp = String.valueOf(coci);
     }catch(NumberFormatException e10){
         resp = "Se han introducido valores no numericos";
     }catch(ArithmeticException e10){
         resp = "division entre 0";
     }catch(Excepcioninter e10){
         resp = e10.getMessage();
         e10.printStackTrace();
     }
     System.out.println(resp);
     
       temperatura t = new temperatura();
       char r11;
       
       while(true){
           System.out.println("Captura grados K/C: ");
           r11 = (read.nextLine()).charAt(0);
           try{
               if (r11 == 'c' || r11 == 'C')
                   t.setCelsius();
               else if (r11 == 'k' || r11 == 'K')
                   t.setKelvin();
               else 
                   throw new Other("Valor incorrecto");
               t.getCelsius();
               t.getKelvin();
               break;
           }catch(temperatura e11){
           }catch(Other e11){
               System.out.println(e11.getMessage());
           }
       }
       
       List<Cuenta> lista = new ArrayList();
       lista.add(new CuentaCorriente(500,11111));
       lista.add(new CuentaAhorroEsp(500,22222));
       for(Cuenta i : lista){
           System.out.println(i);
        if(i.saldo < 300){
            try{
               throw new Exception("No se puede retirar, porque excede del saldo con el que cuentas");
            }catch(Exception e12){
              System.err.println(e12.getMessage());
            }
        }else{
            i.transaccion("retiro",300);
        }
       }
    }
    
    public static void rango(int n,int d) throws Excepcioninter{
        if (n > 100 || d <= 0)
            throw new Excepcioninter("numero fuera de rango");
    }
    public static void uso(){
        System.out.println("Entrada java Main number1 number2");
    }
    
    public static void divide(String a,String b){
        try{
            BigInteger b1 = new BigInteger(a);
            BigInteger b2 = new BigInteger(b);
            System.out.println(b1.divide(b2));
        }catch(NumberFormatException e){
            System.err.println("No es numero!!" + e.getMessage());
            uso();
        }catch(ArithmeticException e){
            System.err.println("Operacion indefinida!!" + e.getMessage());
            uso();
        }catch(Exception e){
            System.err.println("Algo más ocurrió!!" + e.getMessage());
            uso();
        }
    }
    public void m2(int n) throws Miexcepcion,tipo2,tipo3{
        if (n >0){
            throw new Miexcepcion("uno");
        }
        else if(n<0){
            throw new tipo2("dos");
        }
        else{
            throw new tipo3("tres");
        }
    }
    public void metodo() throws Miexcepcion{
        //try{
            throw new Miexcepcion("mensaje");
        //}catch (Miexcepcion e){
          // System.err.println(e.Mensaje);
        //}finally{
          //   System.err.println("pasamos por aqui!");
        //}  
    }
    
    public void f() throws tipo2{
        try{
          g(); 
        }catch(Miexcepcion ej){
            throw new tipo2("chuy2");
        }finally{
            System.err.println("segunda vuelta");
        }
    }
    public void g() throws Miexcepcion{
        throw new Miexcepcion("chuy");
    }
}   
 
class Miexcepcion extends Exception{
    public String Mensaje;
    
    public Miexcepcion(String msj){
        super(msj);
        this.Mensaje = msj;
    }
}
 class tipo2 extends Exception{

        public tipo2(String message) {
            super(message);
        }
 }

 class tipo3 extends Exception{

        public tipo3(String message) {
            super(message);
        }
 }
class a extends Exception{

    public a(String message) {
        super(message);
    }
    public a(){}
    public void met() throws a{
       throw new a("base");
    }
}

class b extends a{

    public b(String message) {
        super(message);
    }
   public b(){}
    @Override
    public void met() throws b {
       throw new b("nivel dos"); 
    }
    
}

class c extends b{

    public c(String message) {
        super(message);
    }
   public c(){}
    @Override
    public void met() throws c {
      throw new c("nivel tres");
    }
}

class Excepcioninter extends Exception{

    public Excepcioninter(String message) {
        super(message);
    }
    
}

class temperatura extends Exception{
    public double c,k;
    public String v;
    
    temperatura(){}

    public temperatura(String message) {
        super(message);
    }
    
    void setCelsius() throws temperatura{
        try{
           System.out.print("Grados c: ");  
           v = Main.read.nextLine();
           c = Double.parseDouble(v);
           if (c < -273.15)
               throw new temperatura("La temperatura es muy baja");
           else
               changeCK();
        }catch(temperatura e){
            c=0;
            System.out.println(e.getMessage());
            throw new temperatura();
        }catch(NumberFormatException e){
            c=0;
            System.out.println("Error captura invalida");
            throw new temperatura();
        }
    }
    
    void setKelvin() throws temperatura{
         try{
           System.out.print("Grados k: ");  
           v = Main.read.nextLine();
           k = Double.parseDouble(v);
           if (k < 0)
               throw new temperatura("Error en el valor");
           else
               changeKC();
        }catch(temperatura e){
            c=0;
            System.out.println(e.getMessage());
            throw new temperatura();
        }catch(NumberFormatException e){
            c=0;
            System.out.println("Error captura invalida");
            throw new temperatura();
        }
    }
    
    void getCelsius(){
        System.out.println("C "+ c + "º");
    }
    
    void getKelvin(){
        System.out.println("K "+ k + "º");
    }
    
    void changeCK(){k = c + 273.15;}
    void changeKC(){c = k - 273.15;}
}
class Other extends Exception{

    public Other(String message) {
        super(message);
    }
    
}

abstract class Cuenta {
    double saldo;
    int NIC;
    public Cuenta(){}
    public Cuenta(double saldo, int NIC) {
        this.saldo = saldo;
        this.NIC = NIC;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", NIC=" + NIC + '}';
    }
    
    abstract void transaccion(String tipo,double cant);
}
class CuentaCorriente extends Cuenta{
  public CuentaCorriente(){}
    public CuentaCorriente(double saldo, int NIC) {
        super(saldo, NIC);
    }
    
    @Override
    void transaccion(String tipo, double cant) {
         if(tipo == "retiro"){
            this.saldo = saldo - cant;
        }else if(tipo == "deposito"){
            this.saldo = saldo + cant;
        }
        System.out.println("Se efectua un@ : " + tipo + " Tu saldo es de : " + saldo);
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }  
}

class CuentaAhorro extends CuentaCorriente{
public CuentaAhorro(){}
public CuentaAhorro(double saldo, int NIC) {
        super(saldo, NIC);
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    void transaccion(String tipo, double cant) {
        if(tipo == "retiro"){
            this.saldo = saldo - cant;
        }else if(tipo == "deposito"){
            this.saldo = saldo + cant;
        }
        System.out.println("Se efectua un@ : " + tipo + " Tu saldo es de : " + saldo);
    }
}

class CuentaAhorroEsp extends CuentaAhorro{
    
    public CuentaAhorroEsp(){}
    public CuentaAhorroEsp( double saldo, int NIC) {
        super(saldo, NIC);
    }
    
    @Override
    void transaccion(String tipo, double cant){
         if(tipo == "retiro"){
            this.saldo = saldo - (cant*1.05);
        }else if(tipo == "deposito"){
            this.saldo = saldo + cant;
        }
        System.out.println("Se efectua un@ : " + tipo + " Tu saldo es de : " + saldo);
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

    