/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public class Peculiares extends tipoDeProducto{
 private String genero;
    public Peculiares(String genero, String titulo, int precio) {
        super(titulo, precio);
        this.genero = genero;
    }

    @Override
    public String Mostrar() {
       return super.Mostrar() + " [CD] " + " Titulo del disco: "
                + titulo + " Genero: " + genero 
                + " Precio: " + precio + "\n";
    }
}
