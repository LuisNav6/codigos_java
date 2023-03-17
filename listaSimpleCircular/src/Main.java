/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import static java.lang.System.out; 
import javax.swing.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista ListaCircular = new Lista();
        // Agregar al final de la lista circular
        String s = (String)JOptionPane.showInputDialog(null,"Dame el nombre,direccion,telefono y sexo:\n","INPUT",JOptionPane.PLAIN_MESSAGE);
        ListaCircular.pushBack(s);
        s = (String)JOptionPane.showInputDialog(null,"Dame el nombre,direccion,telefono y sexo:\n","INPUT",JOptionPane.PLAIN_MESSAGE);
        ListaCircular.pushBack(s);
        s = (String)JOptionPane.showInputDialog(null,"Dame el nombre,direccion,telefono y sexo:\n","INPUT",JOptionPane.PLAIN_MESSAGE);
        ListaCircular.pushBack(s);
        // Agregar in inicio de la lista circular
        s = (String)JOptionPane.showInputDialog(null,"Dame el nombre,direccion,telefono y sexo:\n","INPUT",JOptionPane.PLAIN_MESSAGE);
        ListaCircular.pushFront(s);
        s = (String)JOptionPane.showInputDialog(null,"Dame el nombre,direccion,telefono y sexo:\n","INPUT",JOptionPane.PLAIN_MESSAGE);
        ListaCircular.pushFront(s);
        
        //Mostrando
        ListaCircular.toShow();
        
        JOptionPane.showMessageDialog(null,"\nTamaño:" + ListaCircular.getSize() + "\n");
        //System.out.println("\n\n<<-- Tamaño -->");
        //System.out.println(ListaCircular.getSize());
        
        JOptionPane.showMessageDialog(null,"\nNodo al frente:" + ListaCircular.front() + "\n");
        //System.out.println("\n\n<<-- Nodo al frente -->");
        //System.out.println(ListaCircular.front());
        
        JOptionPane.showMessageDialog(null,"\nNodo al final:" + ListaCircular.back() + "\n");
        //System.out.println("\n\n<<-- Nodo al final -->");
        //System.out.println(ListaCircular.back());
        
        JOptionPane.showMessageDialog(null,"\nEliminando el primero y el ultimo Nodo:" + "\n");
        //System.out.println("\n\n<<--Eliminando el primero y el ultimo Nodo-->");
        ListaCircular.popFront();
        ListaCircular.popBack();
        
        //Mostrando
        ListaCircular.toShow();
        
        //buscando un dato
        JOptionPane.showMessageDialog(null,"\n" + ListaCircular.find("Tony,Guadalajara,98876700,H") + "\n");
        //System.out.println("\n" + ListaCircular.find("Tony,Guadalajara,98876700,H"));
    }
    
}
