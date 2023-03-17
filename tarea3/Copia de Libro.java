/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
public final class Libro extends tipoDeProducto{
    private String editorial,ISBN;

    public Libro(String editorial, String ISBN,String titulo,int precio) {
        super(titulo,precio);
        this.editorial = editorial;
        this.ISBN = ISBN;
    }

    @Override
    public String Mostrar() {
         return super.Mostrar() + "[LIBRO] " + "Titulo del libro: " + titulo 
           + " Editorial: " + editorial + " ISBN: " + ISBN 
                 + " Precio: " + precio + "\n";
    }
}
