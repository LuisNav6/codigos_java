

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Persona {
    private String  nombre;
    private String apellido;
    private int telefono;
    public Persona [] p = new Persona[2];
    public int indP = 0;

    public Persona(String nombre, String apellido,int telefono) {// c/ parametros
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Persona() {// por defecto
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + ", telefono: " + this.getTelefono();
    }
   
    public boolean validarTel(int t){
        String tel = Integer.toString(t);
        if(tel.length() == 9){
            return true;
        }else{
            return false;
        }
    }
    
    public void añadirP(String nom, String ap, int tel){
        if(this.validarTel(tel) == true){
            p [indP] = new Persona (nom,ap,tel);
            indP += 1;
            System.out.println("Validacion con exito!");
        }else{
            System.out.println("El telefono excede el tamaño!!");
        }
    }
    
}
