/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Cuenta {
    private int numeroCuenta;
    private int saldo;
    private String propietario;
    public Cuenta [] c = new Cuenta[2];
    public int indC = 0;

    public Cuenta(int numeroCuenta, int saldo, String propietario) {//constructor c/parametros
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public Cuenta() {//constructor por defecto
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    public boolean validacion(int sal){
        if (sal>0){
            return true;
        }else{
            return false;
        }
    }
    
    public void transaccion(String tipo, int cant){
        if(tipo == "retiro"){
            this.saldo = saldo - cant;
        }else if(tipo == "deposito"){
            this.saldo = saldo + cant;
        }
        System.out.println("Se efectua un@ : " + tipo + " Tu saldo es de : " + saldo);
    }
    @Override
    public String toString() {
        return (this.getPropietario() + this.getNumeroCuenta() + this.getSaldo());
    }
    
    public void agregar(int cuen, int s, String per){
       if (this.validacion(s) == true){
           c [indC] = new Cuenta(cuen,s,per);
           indC += 1;
           System.out.println("El saldo es correcto!");
        }else{
          System.out.println("el saldo es incorrecto"); 
        }
    }
}
