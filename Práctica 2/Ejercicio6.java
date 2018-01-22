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
public class Ejercicio6 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz;
        int fila;
        int columna;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el número de filas de la matriz: ");
        fila = teclado.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        columna = teclado.nextInt();
        matriz = new int[fila][columna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==0 || j==0 || i==matriz.length-1 || j==matriz[i].length-1){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
            
        }
    }  
}
