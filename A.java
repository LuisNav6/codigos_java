/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author luisnavarrete
 */
public class A {
public int porDefecto; // será accesible por el paquete datos, normalmente iba solo int, y eso hace
//que no le de acceso a nadie más si no solo dentro del package
public int publico;
public int privado;// manipulado por objetos de la clase A dentro del paquete , normalmente iba 
//pivate int, pero siendo asi no sería visible si no solo dentro de la clase
}
//LAS CLASES QUE NO TIENEN NIVEL DE ACCESO, LAS UNICAS QUE LAS PUEDEN VER SON DENTRO DE SU MISMA CLASE
