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
 * @author Miguel Lladó
 */
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int ejemplares;
    private int prestados;
    static public int ejemplaresTotales;
    static public int prestadostotales;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        Libro.ejemplaresTotales += this.ejemplares;
    }

    public Libro(Libro copia) {
        this.titulo = copia.titulo;
        this.autor = copia.autor;
        this.isbn = copia.isbn;
        this.ejemplares = copia.ejemplares;
        this.prestados = 0;
        Libro.ejemplaresTotales += this.ejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public static int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public static void setEjemplaresTotales(int ejemplaresTotales) {
        Libro.ejemplaresTotales = ejemplaresTotales;
    }

    public static int getPrestadostotales() {
        return prestadostotales;
    }

    public static void setPrestadostotales(int prestadostotales) {
        Libro.prestadostotales = prestadostotales;
    }

    public boolean prestarLibro() {
        if (this.prestados < this.ejemplares) {
            this.prestados++;
            Libro.prestadostotales++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolverLibro() {
        if (this.prestados > 0) {
            this.prestados--;
            Libro.prestadostotales--;
            return true;
        } else {
            return false;
        }
    }

    static public String pedirLibro() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro: ");
        String isbn = teclado.next();
        return isbn;
    }

    public void mostrarLibro() {
        System.out.println("======================");
        System.out.println("   FICHA DEL LIBRO    ");
        System.out.println("======================");
        System.out.println("Título: " + this.getAutor());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ejemplares: " + this.getEjemplares());
        System.out.println("Ejemplares prestados: " + this.getPrestados());
        System.out.println("======================");
    }

    static public Libro localizarLibro(ArrayList<Libro> listaLibros, String isbn) {
        boolean encontrado = false;
        int i = 0;
        while (i < listaLibros.size() && encontrado == false) {
            if (listaLibros.get(i).getIsbn().equals(isbn)) {
                System.out.println("El ejemplar existe. Acción completada");
                encontrado = true;
            } else {
                i++;
            }
        }
        return listaLibros.get(i);
    }

    static public Libro crearLibro() {
        Scanner teclado = new Scanner(System.in);
        Libro nuevoLibro = new Libro();
        System.out.println("======================");
        System.out.println("       ALTA LIBRO     ");
        System.out.println("======================");
        System.out.println("Introduce el título del libro: ");
        nuevoLibro.setTitulo(teclado.next());
        System.out.println("Introduce el autor del libro: ");
        nuevoLibro.setAutor(teclado.next());
        System.out.println("Introduce el ISBN del libro: ");
        nuevoLibro.setIsbn(teclado.next());
        System.out.println("Introduce el número de ejemplares del libro: ");
        nuevoLibro.setEjemplares(teclado.nextInt());
        nuevoLibro.setPrestados(0);
        Libro.ejemplaresTotales+=nuevoLibro.ejemplares;
        Libro.prestadostotales+=nuevoLibro.prestados;
        return nuevoLibro;
    }
}