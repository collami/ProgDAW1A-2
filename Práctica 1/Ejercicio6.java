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
public class Ejercicio6 {
      /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num;
        num=new int[12];
        int [] num2;
        num2=new int[12];
        int [] num3;
        num3=new int[24];
        Scanner teclado = new Scanner(System.in); 
        for (int i=0;i<12;i++) {
            System.out.print("Ingrese un número para la primera tabla: ");
            num[i] = teclado.nextInt();
        }
        for (int i=0;i<12;i++) {
            System.out.print("Ingrese un número para la segunda tabla: ");
            num2[i] = teclado.nextInt();
        }
        for (int i=0;i<4;i++) {
            for (int j=0;j<3;j++) {
                num3[(i*6)+j] = num[i+j];
            }    
            for (int k=3;k<6;k++) {
                num3[(i*6)+k] = num2[i+k];
            }
        }
        System.out.print("La secuencia de los valores pedidos es: ");
        for (int i=0;i<num3.length;i++) {
            System.out.print(num3[i]);
        }
    }
}
