
package ejer8;

import java.util.Scanner;

        
/** 
 *
 * @author PC
 */
public class Ejer8 {

    /**
     * @param args the command line arguments
     */
  
  
    public static void main(String[] args) {
      
     Scanner leer = new Scanner(System.in);
      System.out.println("ingrese un numero");
                 int numero= leer.nextInt();
     
            while (numero >= 0&& numero <= 10 ) 
                System.out.println("ingrese otro numero");
              
                 int numero= leer.nextInt();
    
    }
   
}
