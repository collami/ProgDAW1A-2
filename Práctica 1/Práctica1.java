/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1;

import java.util.Scanner;
import práctica1.*;

/**
 *
 * @author infor14
 */
public class Práctica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       System.out.println("1-Ejercicio1");
       System.out.println("2-Ejercicio2");
       System.out.println("3-Ejercicio3");
       System.out.println("4-Ejercicio4");
       System.out.println("5-Ejercicio5");
       System.out.println("6-Ejercicio6");
       System.out.println("7-Salir");
       
       Scanner teclado = new Scanner(System.in);
       
       int opcion;
       System.out.print("Ingrese una opción: ");
       opcion= teclado.nextInt();
       
       switch(opcion){
           case 1:
               Ejercicio1.main(args);
               break;
           case 2:
               Ejercicio2.main(args);
               break;
           case 3:
               Ejercicio3.main(args);
               break;
           case 4:
               Ejercicio4.main(args);
               break;
           case 5:
               Ejercicio5.main(args);
               break;
           case 6:
               Ejercicio6.main(args);
               break;
           case 7:
               break;    
       }
    }
    
}
