/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Persona {
    //CONSTANTES
    //definiciones por defecto de algunas variables
    private final static char S_DEF='H';
    public static final int INFRA=-1;
    public static final int IDEAL=0;
    public static final int SOBRE=1; 
   
    private String nombre,ID;
    private int edad;
    private char sexo;
    private double peso,altura;

   
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        generarID();
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();        
        this.peso = peso;
        this.altura = altura;
    }
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    private void comprobarSexo() {//en caso de que el sexo no sea H o M se aplica la constante
        if (sexo != 'H' && sexo != 'M') {
            this.sexo=S_DEF;
        }
    }
    
    private void generarID() {
        //aleatorio de 3 cifras
        int numID=((int) Math.floor(Math.random() * (1000 - 100) + 100));
        //Math.floor devuelve el maximo entero menor o igual a un numero
        char letraID=generaLetraID(0);
        ID=Integer.toString(numID)+letraID;
    }
    
    private char generaLetraID(int res) {//devuelve la primer letra del nombre ingresado
        char letras []=this.nombre.toCharArray();
        return letras[res];
    }
    
    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return IDEAL;
        } else if (pesoActual < 20) {
            return INFRA;
        } else {
            return SOBRE;
        }
    }
    
    public boolean MayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "Hombre";
        } else {
            sexo = "Mujer";
        }
        return "INFORMACION DEL PACIENTE:\n"
                + "NOMBRE: " + nombre + "\n"
                + "SEXO " + sexo + "\n"
                + "EDAD: " + edad + " AÑOS\n"
                + "ID: " + ID + "\n"
                + "PESO: " + peso + " Kg\n"
                + "ALTURA: " + altura + " Mts.\n";
    }
}
