/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.util.HashMap;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,String> copa = new HashMap<String,String>();
        copa.put("England","");
        copa.put("EUA","");
        copa.put("BRASIL","");
        for (String i : copa.keySet()) {
      System.out.println("key: " + i );
    }
    }
    
}
