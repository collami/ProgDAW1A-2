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
public class Ejercicio5 {
      /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num;
        num=new int[10];
        int [] num2;
        num2=new int[10];
        int [] num3;
        num3=new int[20];
        Scanner teclado = new Scanner(System.in); 
        for (int i=0;i<10;i++) {
            System.out.print("Ingrese un número para la primera tabla: ");
            num[i] = teclado.nextInt();
        }
        for (int i=0;i<10;i++) {
            System.out.print("Ingrese un número para la segunda tabla: ");
            num2[i] = teclado.nextInt();
        }
        for (int i=0;i<10;i++) {
            num3[i*2] = num[i];
            num3[(i*2)+1] = num2[i];
        }
        System.out.print("La secuencia de los valores pedidos es: ");
        for (int i=0;i<num3.length;i++) {
            System.out.print(num3[i]);
        }
    }
}
