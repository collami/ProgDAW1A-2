/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica3;

import java.util.Scanner;

/**
 *
 * @author infor14
 */
public class Práctica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Solicitamos los datos del cliente1 por teclado y los introducimos a través del constructor con todos los parámetros. 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del cliente1");
        String nom = teclado.next();
        System.out.println("Introduce el número de cuenta del cliente1");
        String numcuenta = teclado.next();
        System.out.println("Introduce el tipo de interés de la cuenta del cliente1");
        Double tipointeres = teclado.nextDouble();
        System.out.println("Introduce el saldo del cliente1");
        Double saldo = teclado.nextDouble();
        Cuenta cliente1 = new Cuenta(nom, numcuenta, tipointeres, saldo);

        //Introducimos directamente los datos del cliente2 con el constructor con todos los parámetros;
        Cuenta cliente2 = new Cuenta("Manuel", "55687", 4, 8523);

        //Solicitamos los datos del cliente3 por teclado y los introducimos a través de los métodos set.
        System.out.println("Introduce el nombre del cliente3");
        String nom2 = teclado.next();
        System.out.println("Introduce el número de cuenta del cliente3");
        String numcuenta2 = teclado.next();
        System.out.println("Introduce el tipo de interés de la cuenta del cliente3");
        Double tipointeres2 = teclado.nextDouble();
        System.out.println("Introduce el saldo del cliente3");
        Double saldo2 = teclado.nextDouble();
        Cuenta cliente3 = new Cuenta();
        cliente3.setNombre(nom2);
        cliente3.setNumCuenta(numcuenta2);
        cliente3.setTipoInteres(tipointeres2);
        cliente3.setSaldo(saldo2);

        //Creamos cliente4 como copia de cliente1 con el constructor copia.
        Cuenta cliente4 = new Cuenta(cliente1);

        //Mostrar los datos de cliente1 con los métodos get.
        System.out.println("Datos del cliente1");
        System.out.println("Nombre del titular: " + cliente1.getNombre());
        System.out.println("Número de cuenta: " + cliente1.getNumCuenta());
        System.out.println("Tipo de interés: " + cliente1.getTipoInteres());
        System.out.println("Saldo: " + cliente1.getSaldo());
        System.out.println();

        //Realizamos ingreso en la cuenta del cliente3. Introducimos la cantidad por teclado y mostramos nuevo saldo.
        System.out.println("Saldo del cliente3: " + cliente3.getSaldo());
        System.out.println("Introduce la cantidad a ingresar");
        Double saldo3 = teclado.nextDouble();
        cliente3.ingresar(saldo3);
        System.out.println("Saldo del cliente3: " + cliente3.getSaldo());
        System.out.println();

        //Transferencia entre la cuenta del cliente1 y la cuenta del cliente2 la cantidad de 250€.
        System.out.println("Saldo del cliente1: " + cliente1.getSaldo());
        System.out.println("Saldo del cliente2: " + cliente2.getSaldo());
        cliente1.transferir(cliente2, 250);
        System.out.println("Saldo del cliente1: " + cliente1.getSaldo());
        System.out.println("Saldo del cliente2: " + cliente2.getSaldo());
        System.out.println();

        //Realizamos reintegro en la cuenta del cliente1. Introducimos la cantidad por teclado y mostramos nuevo saldo.
        System.out.println("Saldo del cliente1: " + cliente1.getSaldo());
        System.out.println("Introduce la cantidad a retirar");
        Double cantidad3 = teclado.nextDouble();
        cliente1.reintegrar(cantidad3);
        System.out.println("Saldo del cliente1: " + cliente1.getSaldo());
        System.out.println();
    }

}
