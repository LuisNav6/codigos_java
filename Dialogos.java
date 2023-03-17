/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialogos;
import static java.lang.System.out;
import javax.swing.*;
/**
 *
 * @author luisnavarrete
 */
public class Dialogos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s=(String)JOptionPane.showInputDialog(null,"filas: \n","Input",JOptionPane.PLAIN_MESSAGE);
        int f=Integer.parseInt(s);
        
        s= (String)JOptionPane.showInputDialog(null,"Columnas: \n","Input",JOptionPane.PLAIN_MESSAGE);
        int c=Integer.parseInt(s);
        
        double [][] m=new double [f][c];
        JOptionPane.showMessageDialog(null,"Filas "+f+'\n'+"Columnas"+c);
        
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[i].length;j++)
                m[i][j]=(Math.random()*100.0);
                for(int i=0;i<m.length;i++){
                    for(int j=0;j<m[i].length;j++)
                      out.print(" ("+i+","+j+")->"+m[i][j]);
                    out.println();
    }           
    }
}
