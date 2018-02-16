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
public class Persona {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private String cargoBiblioteca;
    private String password;
    static public int personasTotales;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellidos, String cargoBiblioteca, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargoBiblioteca = cargoBiblioteca;
        this.password = password;
        Persona.personasTotales ++;
    }
    
    public Persona(Persona copia) {
        this.dni = copia.dni;
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
        this.cargoBiblioteca = copia.cargoBiblioteca;
        this.password = copia.password;
        Persona.personasTotales ++;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargoBiblioteca() {
        return cargoBiblioteca;
    }

    public void setCargoBiblioteca(String cargoBiblioteca) {
        this.cargoBiblioteca = cargoBiblioteca;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getPersonasTotales() {
        return personasTotales;
    }

    public static void setPersonasTotales(int personasTotales) {
        Persona.personasTotales = personasTotales;
    }
    
    
    static public Persona altaPersona() {
        Scanner teclado = new Scanner(System.in);
        Persona nuevaPersona = new Persona();
        System.out.println("======================================");
        System.out.println("              ALTA USUARIO            ");
        System.out.println("======================================");
        System.out.println("Introduce el dni: ");
        nuevaPersona.setDni(teclado.next());
        System.out.println("Introduce el nombre: ");
        nuevaPersona.setNombre(teclado.next());
        System.out.println("Introduce los apellidos: ");
        nuevaPersona.setApellidos(teclado.next());
        System.out.println("Introduce el cargo: ");
        nuevaPersona.setCargoBiblioteca(teclado.next());
        System.out.println("Introduce el password: ");
        nuevaPersona.setPassword(teclado.next());
        Persona.personasTotales ++;
        return nuevaPersona;
    }
    
    static public String pedirPersona() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dni: ");
        String dni = teclado.next();
        return dni;
    }
    
        static public Persona localizarPersona(ArrayList<Persona> listaPersonas, String dni) {
        boolean encontrado = false;
        int i = 0;
        while (i < listaPersonas.size() && encontrado == false) {
            if (listaPersonas.get(i).getDni().equals(dni)) {
                System.out.println("El dni existe. Acción completada");
                encontrado = true;
            } else {
                i++;
            }
        }
        return listaPersonas.get(i);
    }
}
