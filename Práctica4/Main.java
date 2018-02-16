/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel Lladó
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        ArrayList<Libro> listaLibros = new ArrayList<>();
        while (!salir) {

            System.out.println("1. Opcion 1 - Crear libro");
            System.out.println("2. Opcion 2 - Prestar libro");
            System.out.println("3. Opcion 3 - Devolver libro");
            System.out.println("4. Opcion 4 - Localizar libro");
            System.out.println("5. Opcion 5 - Mostrar libro");
            System.out.println("6. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    listaLibros.add(Libro.crearLibro());
                    break;
                case 2:
                    try {
                        Libro.localizarLibro(listaLibros, Libro.pedirLibro()).prestarLibro();
                    } catch (Exception e){
                        System.out.println("El ejemplar no exite.");
                    }
                    break;
                case 3:
                    try {
                        Libro.localizarLibro(listaLibros, Libro.pedirLibro()).devolverLibro();
                    } catch (Exception e){
                        System.out.println("El ejemplar no exite.");
                    }
                    break;
                case 4:
                    try {
                        Libro.localizarLibro(listaLibros, Libro.pedirLibro());
                    } catch (Exception e){
                        System.out.println("El ejemplar no exite.");
                    }
                    break;
                case 5:
                    try {
                        Libro.localizarLibro(listaLibros, Libro.pedirLibro()).mostrarLibro();
                    } catch (Exception e){
                        System.out.println("El ejemplar no exite.");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }

        }
    }

}
