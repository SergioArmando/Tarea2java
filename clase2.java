
package clase2p2b;


import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Sergio Armando
 */
public class clase2 {
    private static Scanner teclado = new Scanner(System.in);
    public static String codifica(String palabra){
     int codificar = 0;
     String Resultado ="";
     int llave = 9; 
     
     for(int x=0; x<palabra.length();x++){
         codificar = (int)palabra.charAt(x);
         codificar = codificar + llave; 
         char caracter = (char) codificar;
         Resultado = Resultado + caracter;
         
     }
          return Resultado;
    }
    public static void main(String[]args){
        String palabra;
        String Resultado;
        System.out.println("Hola! por favor ingresa una palabra:");
        palabra = teclado.nextLine();
        Resultado = codifica(palabra);
        
         
        System.out.println("codificación de palabra="+Resultado);
        
         byte[] bytes = Resultado.getBytes(StandardCharsets.US_ASCII);
          
        System.out.println("Ascii  :"+bytes[0]);
        System.out.println("Ascii  : "+bytes[1]);
        System.out.println("Ascii  : "+bytes[2]);
        System.out.println("Ascii  : "+bytes[3]);
       
         
    }



}

