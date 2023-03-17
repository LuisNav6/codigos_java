/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Cds extends tipoDeProducto{
    private String genero;

    public Cds(String genero, String titulo, int precio) {
        super(titulo, precio);
        this.genero = genero;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String Mostrar() {
        return super.Mostrar() + " [CD] " + " Titulo del disco: "
                + titulo + " Genero: " + genero 
                + " Precio: " + precio + "\n";
    }
    
}
