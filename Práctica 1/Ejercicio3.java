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
public class Ejercicio3 {
         /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num;
        int sumapositivos=0;
        int contadorpositivos=0;
        int sumanegativos=0;
        int contadornegativos=0;
        int contadorceros=0;
        num=new int[5];
        Scanner teclado = new Scanner(System.in); 
        for (int i=0;i<5;i++) {
            System.out.print("Ingrese un número: ");
            num[i] = teclado.nextInt();
        }
        for (int i=0;i<num.length;i++) {
            if (num[i]>0) {
                sumapositivos=sumapositivos+num[i];
                contadorpositivos=contadorpositivos+1;
                  
            }
            else if (num[i]<0) {
                sumanegativos=sumanegativos+num[i];
                contadornegativos=contadornegativos+1;
            }
            else {
                contadorceros=contadorceros+1;
            }
        }
        
        try{
            System.out.println("La media de los números positivos es: "+sumapositivos/contadorpositivos+"");
        }
        catch(ArithmeticException e){
            System.out.println("No has introducido números positivos");
        }
        try{
            System.out.println("La media de los números negativos es: "+sumanegativos/contadornegativos+"");
        }
        catch(ArithmeticException e){
            System.out.println("No has introducido números negativos");
        }
        System.out.println("El número de ceros es: "+contadorceros+"");
    }
    
}
