/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1;

import java.util.Scanner;

/**
 *
 * @author infor14
 */
public class Ejercicio4 {
        /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num;
        num=new int[10];
        Scanner teclado = new Scanner(System.in); 
        for (int i=0;i<10;i++) {
            System.out.print("Ingrese un número: ");
            num[i] = teclado.nextInt();
        }
        System.out.print("La secuencia de los valores pedidos es: ");
        for (int i=0;i<num.length/2;i++) {
            System.out.print(num[i]);
            System.out.print(num[(num.length-1)-i]);
        }
    }
}
