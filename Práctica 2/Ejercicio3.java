/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica2;

import java.util.Scanner;

/**
 *
 * @author infor14
 */
public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz1;
        int[][] matriz2;
        matriz1 = new int[3][3];
        matriz2 = new int[3][3];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("Ingrese un número para la primera matriz bidimensional, para la posición "+i+","+j+": ");
                matriz1[i][j]=teclado.nextInt();
            }
        }    
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("Ingrese un número para la segunda matriz bidimensional, para la posición "+i+","+j+": ");
                matriz2[i][j]=teclado.nextInt();
            }    
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]+matriz2[i][j]);
            }
            System.out.println();
        }
    } 
}
