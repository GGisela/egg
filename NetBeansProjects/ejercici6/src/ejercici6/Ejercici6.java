
package ejercici6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercici6 {

   
    public static void main(String[] args) {
       
         Scanner leer =new Scanner(System.in);
         
           System.out.println("ingrese Un numero");
           int numero1 = leer.nextInt();
           if (numero1>= 25 ){
           System.out.println("el numero ingresado " + numero1 + " es igual o mayor de 25 "); 
           
            }else{
             
                System.out.println("el numero es menor a 25 ");
            }
    }
    
    
}
