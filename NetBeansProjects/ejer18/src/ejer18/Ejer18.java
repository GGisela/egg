/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer18;

/**
 *
 * @author PC
 */
public class Ejer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).*/

        int[][] arregloM = new int[4][4];
        System.out.println("Matriz inicial:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arregloM[i][j] = (int)(Math.random()*10);
                System.out.print(arregloM[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\nMatriz Traspuesta:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arregloM[j][i]);
            }
            System.out.println("");
        }
    }
}
    
