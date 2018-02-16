/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author infor14
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean salirMenu = false;
        int opcion;
        ArrayList<Biblioteca> redBibliotecas = new ArrayList<>();
        while (!salirMenu) {

            System.out.println("==============================================================");
            System.out.println("Datos Administrador Red Bibliotecas: dni:12345, password:12345");
            System.out.println("==============================================================");
            System.out.println("1. Opcion 1 - Gestión administrativa");
            System.out.println("2. Opcion 2 - Utilidades usuarios");
            System.out.println("3. Opcion 3 - Salir");

            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();
            boolean salirSubmenu = false;
            switch (opcion) {
                
                case 1:
                    while (!salirSubmenu) {

                        System.out.println("Opcion 1 - Alta de biblioteca");
                        System.out.println("Opcion 2 - Alta libro");
                        System.out.println("Opcion 3 - Baja libro");
                        System.out.println("Opcion 4 - Alta adminstrador");
                        System.out.println("Opcion 5 - Baja administrador");
                        System.out.println("Opcion 6 - Estadísticas biblioteca");
                        System.out.println("Opcion 7 - Estadísticas red bibliotecas");
                        System.out.println("Opcion 8 - Regresar al menú principal");

                        System.out.println("Escribe una de las opciones");
                        opcion = teclado.nextInt();
                        boolean autentificado;
                        int id;
                        final String dniAdmin = "12345";
                        final String passAdmin = "12345";

                        switch (opcion) {
                            case 1:
                                System.out.println("Introduce tu dni: ");
                                String dni = teclado.next();
                                System.out.println("Introduce tu password: ");
                                String pass = teclado.next();
                                if (dni.equals(dniAdmin) && pass.equals(passAdmin)) {
                                    redBibliotecas.add(Biblioteca.crearBiblioteca());
                                } else {
                                    System.out.println("Lo siento. Esos datos no corresponden al administrador de la red de bibliotecas.");
                                }
                                break;
                            case 2:
                                autentificado = Biblioteca.localizarBiblioteca(redBibliotecas, id = Biblioteca.pedirBiblioteca()).validarAdministrador();
                                if (autentificado) {
                                    Biblioteca.localizarBiblioteca(redBibliotecas, id).altaLibro();
                                } else {
                                    System.out.println("Lo siento. Esos datos no corresponden a un administrador de esta biblioteca.");
                                }
                                break;
                            case 3:
                                autentificado = Biblioteca.localizarBiblioteca(redBibliotecas, id = Biblioteca.pedirBiblioteca()).validarAdministrador();
                                if (autentificado) {
                                    try {
                                        Biblioteca.localizarBiblioteca(redBibliotecas, id).bajaLibro();
                                    } catch (Exception e){
                                        System.out.println("El ejemplar no exite.");
                                    }
                                } else {
                                    System.out.println("Lo siento. Esos datos no corresponden a un administrador de esta biblioteca.");
                                }
                                    
                                break;
                            case 4:
                                autentificado = Biblioteca.localizarBiblioteca(redBibliotecas, id = Biblioteca.pedirBiblioteca()).validarAdministrador();
                                if (autentificado) {
                                    Biblioteca.localizarBiblioteca(redBibliotecas, id).altaAdministradores();
                                } else {
                                    System.out.println("Lo siento. Esos datos no corresponden a un administrador de esta biblioteca.");
                                }
                                break;
                            case 5:
                                autentificado = Biblioteca.localizarBiblioteca(redBibliotecas, id = Biblioteca.pedirBiblioteca()).validarAdministrador();
                                if (autentificado) {
                                    try {
                                        Biblioteca.localizarBiblioteca(redBibliotecas, id).bajaAdministradores();
                                    } catch (Exception e){
                                        System.out.println("El dni no exite.");
                                    }
                                } else {
                                    System.out.println("Lo siento. Esos datos no corresponden a un administrador de esta biblioteca.");
                                }
                                    
                                break;
                            case 6:
                                autentificado = Biblioteca.localizarBiblioteca(redBibliotecas, id = Biblioteca.pedirBiblioteca()).validarAdministrador();
                                if (autentificado) {
                                    Biblioteca.localizarBiblioteca(redBibliotecas, id).estadisticaBiblioteca();
                                } else {
                                    System.out.println("Lo siento. Esos datos no corresponden a un administrador de esta biblioteca.");
                                }
                                break;
                            case 7:
                                autentificado = Biblioteca.localizarBiblioteca(redBibliotecas, Biblioteca.pedirBiblioteca()).validarAdministrador();
                                if (autentificado) {
                                    Biblioteca.estadisticaRedBibliotecas();
                                } else {
                                    System.out.println("Lo siento. Esos datos no corresponden a un administrador de esta biblioteca.");
                                }
                                break;    
                            case 8:
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Introduce una opción válida");
                        }

                    }
                    break;
                case 2:
                    while (!salirSubmenu) {

                        System.out.println("Opcion 1 - Consultar libro");
                        System.out.println("Opcion 2 - Consultar libro biblioteca");
                        System.out.println("Opcion 3 - Reservar libro");
                        System.out.println("Opcion 4 - Devolver libro");
                        System.out.println("Opcion 5 - Regresar al menú principal");

                        System.out.println("Escribe una de las opciones");
                        opcion = teclado.nextInt();

                        switch (opcion) {
                            case 1:
                                Biblioteca.libroRedBibliotecas(redBibliotecas);
                                break;
                            case 2:
                                try {
                                Libro.localizarLibro(Biblioteca.localizarBiblioteca(redBibliotecas, Biblioteca.pedirBiblioteca()).getListaLibros(), Libro.pedirLibro()).mostrarLibro();
                                } catch (Exception e){
                                    System.out.println("El ejemplar no exite.");
                                }
                                break;
                            case 3:
                                try {
                                Libro.localizarLibro(Biblioteca.localizarBiblioteca(redBibliotecas, Biblioteca.pedirBiblioteca()).getListaLibros(), Libro.pedirLibro()).prestarLibro();
                                } catch (Exception e){
                                    System.out.println("El ejemplar no exite.");
                                }
                                break;
                            case 4:
                                try {
                                Libro.localizarLibro(Biblioteca.localizarBiblioteca(redBibliotecas, Biblioteca.pedirBiblioteca()).getListaLibros(), Libro.pedirLibro()).devolverLibro();
                                } catch (Exception e){
                                    System.out.println("El ejemplar no exite.");
                                }
                                break;
                            case 5:
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Introduce una opción válida");
                        }
                    }
                    break;
                case 3:
                    salirMenu=true; 
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }
        }
    }
}
