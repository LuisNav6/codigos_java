/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Cuentas {
    public int numeroCuenta;
    public double saldo;
    public String propietario;
    final int MAX = 100;
    public Cuentas [] c = new Cuentas[MAX];
    public int indC = 0;

    public Cuentas(int numeroCuenta,double saldo, String propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
     public boolean validacion(double sal){
        if (sal > 0.0){
            return true;
        }else{
            return false;
        }
    }
    public void agregar(int cuen, double s, String per){
       if (this.validacion(s) == true){
           c [indC] = new Cuentas(cuen,s,per);
           indC += 1;
           System.out.println("El saldo es correcto!");
        }else{
          System.out.println("el saldo es incorrecto"); 
        }
    }
    
    public void transaccion(String tipo, double cant){
        if(tipo == "retiro"){
            this.saldo = saldo - cant;
        }else if(tipo == "deposito"){
            this.saldo = saldo + cant;
        }
        System.out.println("Se efectua un@ : " + tipo + " Tu saldo es de : " + saldo);
    }
}
