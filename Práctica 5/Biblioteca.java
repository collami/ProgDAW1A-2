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
public class Biblioteca {

    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Persona> listaAdministradores;

    public Biblioteca() {

    }

    public Biblioteca(int id, String nombre, String direccion, ArrayList<Libro> listaLibros, ArrayList<Persona> listaAdministradores) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaLibros = listaLibros;
        this.listaAdministradores = listaAdministradores;
    }

    public Biblioteca(Biblioteca copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.direccion = copia.direccion;
        this.listaLibros = copia.listaLibros;
        this.listaAdministradores = copia.listaAdministradores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Persona> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(ArrayList<Persona> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    static public int pedirBiblioteca() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el id de la biblioteca: ");
        int id = teclado.nextInt();
        return id;
    }

    public void mostrarBiblioteca() {
        System.out.println("==============================");
        System.out.println("    FICHA DE LA BIBLIOTECA    ");
        System.out.println("==============================");
        System.out.println("ID: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("======================");
    }

    static public Biblioteca crearBiblioteca() {
        Scanner teclado = new Scanner(System.in);
        Biblioteca nuevaBiblioteca = new Biblioteca();
        System.out.println("===========================");
        System.out.println("       ALTA BIBLIOTECA     ");
        System.out.println("===========================");
        System.out.println("Introduce el id: ");
        nuevaBiblioteca.setId(teclado.nextInt());
        System.out.println("Introduce el nombre: ");
        nuevaBiblioteca.setNombre(teclado.next());
        System.out.println("Introduce la dirección: ");
        nuevaBiblioteca.setDireccion(teclado.next());
        nuevaBiblioteca.listaLibros = new ArrayList();
        nuevaBiblioteca.listaAdministradores = new ArrayList();
        Persona AdministradorRedBibliotecas = new Persona("12345", "Miguel", "lladó", "Administrador Red Bibliotecas", "12345");
        nuevaBiblioteca.listaAdministradores.add(AdministradorRedBibliotecas);
        return nuevaBiblioteca;
    }

    public void altaLibro() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {

            System.out.println("1. Opcion 1 - Nuevo Libro");
            System.out.println("2. Opcion 2 - Salir");

            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    this.listaLibros.add(Libro.crearLibro());
                    System.out.println("=============================");
                    System.out.println("LIBRO AÑADIDO A LA BIBLIOTECA");
                    System.out.println("=============================");
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }
        }
    }
        

    public void bajaLibro() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {

            System.out.println("1. Opcion 1 - Eliminar Libro");
            System.out.println("2. Opcion 2 - Salir");

            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("======================");
                    System.out.println("       BAJA LIBRO     ");
                    System.out.println("======================");
                    this.listaLibros.remove(Libro.localizarLibro(listaLibros, Libro.pedirLibro()));
                    System.out.println("================================");
                    System.out.println("LIBRO ELIMINADO DE LA BIBLIOTECA");
                    System.out.println("================================");
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }
        }
    }

    public void altaAdministradores() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {

            System.out.println("1. Opcion 1 - Nuevo Adminstrador");
            System.out.println("2. Opcion 2 - Salir");

            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    this.listaAdministradores.add(Persona.altaPersona());
                    System.out.println("=====================================");
                    System.out.println("ADMINISTRADOR AÑADIDO A LA BIBLIOTECA");
                    System.out.println("=====================================");
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }

        }

    }
    
    public void bajaAdministradores() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {

            System.out.println("1. Opcion 1 - Eliminar Adminstrador");
            System.out.println("2. Opcion 2 - Salir");

            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    this.listaAdministradores.remove(Persona.localizarPersona(listaAdministradores, Persona.pedirPersona()));
                    System.out.println("========================================");
                    System.out.println("ADMINISTRADOR ELIMINADO DE LA BIBLIOTECA");
                    System.out.println("========================================");
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }

        }

    }

    static public Biblioteca localizarBiblioteca(ArrayList<Biblioteca> listaBibliotecas, int id) {
        boolean encontrado = false;
        int i = 0;
        while (i < listaBibliotecas.size() && encontrado == false) {
            if (listaBibliotecas.get(i).getId() == id) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return listaBibliotecas.get(i);
    }
    
    public void estadisticaBiblioteca() {
        
        
        System.out.println("=======================================================");
        System.out.println("    INFORMACIÓN DE LA BIBLIOTECA "+this.getNombre());
        System.out.println("=======================================================");
        System.out.println("Libros disponibles");
        System.out.println("====================");
        for (int i = 0; i<this.listaLibros.size(); i++) {
            System.out.println("Isbn: "+listaLibros.get(i).getIsbn()+"; Título: "+listaLibros.get(i).getTitulo()+"; Ejemplares: "+listaLibros.get(i).getEjemplares()+"; Prestados: "+listaLibros.get(i).getPrestados()+"; Disponibles: "+(listaLibros.get(i).getEjemplares()-listaLibros.get(i).getPrestados()));
        }
        System.out.println("Administradores");
        System.out.println("=================");
        for (int i = 0; i<this.listaAdministradores.size(); i++) {
            System.out.println(listaAdministradores.get(i).getNombre()+ " "+listaAdministradores.get(i).getApellidos());
        }
        System.out.println("======================");
    }
    
    static public void estadisticaRedBibliotecas() {
        System.out.println("=========================================");
        System.out.println("    INFORMACIÓN DE LA RED DE BIBLIOTECAS ");
        System.out.println("=========================================");
        System.out.println("Libros disponibles: "+Libro.getEjemplaresTotales());
        System.out.println("====================");
        System.out.println("Libros prestados: "+Libro.getPrestadostotales());
        System.out.println("====================");
        System.out.println("Administradores totales: "+Persona.getPersonasTotales());
        System.out.println("====================");
    }
    
    static public void libroRedBibliotecas(ArrayList<Biblioteca> redBibliotecas) {
        System.out.println("=========================================");
        System.out.println("    LIBRO EN LA RED DE BIBLIOTECAS ");
        System.out.println("=========================================");
        String isbn = Libro.pedirLibro(); 
        boolean salir = false;
        for (int i = 0; i < redBibliotecas.size(); i++) {
            try {
                Libro.localizarLibro(redBibliotecas.get(i).listaLibros, isbn).mostrarLibro();                 
                System.out.println("====================================================================");
                System.out.println("Biblioteca "+redBibliotecas.get(i).nombre+" "+redBibliotecas.get(i).direccion);
                System.out.println("====================================================================");
                
                }catch (Exception e){
                System.out.println("En la biblioteca "+redBibliotecas.get(i).nombre+" el ejemplar no exite.");
            }
            
            
        }
    }
    
    public boolean validarAdministrador (){
        boolean encontrado = false;
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu dni: ");
        String dni = teclado.next();
        System.out.println("Introduce tu password: ");
        String password = teclado.next();
        while (i < this.listaAdministradores.size() && encontrado == false) {
            if (listaAdministradores.get(i).getDni().equals(dni) && listaAdministradores.get(i).getPassword().equals(password) ) {
                encontrado = true;
            } else {
                i++;
                encontrado = false;
            }
        }
        return encontrado;
        
    }
}
