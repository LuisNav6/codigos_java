/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import javax.swing.*;
import java.awt.*;
public class Main {
public JFrame frame;
Container Panel;

    public Main(String title) {
        frame = new JFrame(title);
        Panel = frame.getContentPane();
    }
    
    public void accion(){
    frame.setSize(400,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Panel.setSize(400,200);
    Panel.setBackground(Color.lightGray);
    Panel.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code app
    Main gui = new Main("Titulo");
    gui.accion();
}
}
