/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inversioncadena;

/**
 *
 * @author luisnavarrete
 */
public class Inversioncadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String c= "Buenos Aires 512B";
        System.out.println(c);//imprimiendo la cadena original
        inv(c);
    }//fin main
static String inv(String c){
String cadena="";
String aux="";
//inviertiendo cadena
for(int i=c.length() -1;i >= 0;i--){
    cadena=cadena + c.charAt(i);
}
//Cambiando mayusculas a minusculas
for(int i=0; i < cadena.length(); i++){
    if(Character.isLowerCase(cadena.charAt(i))){//si es minuscula se invierte
        aux+=Character.toUpperCase(cadena.charAt(i));
    }else{//en caso de ser mayuscula se invierte a minuscula
        aux+=Character.toLowerCase(cadena.charAt(i));
    }
}
System.out.println(aux);
    return c;
}
}
