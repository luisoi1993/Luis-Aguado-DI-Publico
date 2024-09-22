/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luis
 */

public class Principal {
    static ArrayList<Persona> personas = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        llenarPersona();
        mostrarMenu();
    }

    public static void llenarPersona() {
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("Digite qué tipo de persona va a crear:");
                System.out.println("1. Futbolista");
                System.out.println("2. Entrenador");
                System.out.println("3. Doctor");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();
                entrada.nextLine(); // Para limpiar el buffer del Scanner
                
                switch (opcion) {
                    case 1: llenarFutbolista(); break;
                    case 2: llenarEntrenador(); break;
                    case 3: llenarDoctor(); break;
                }
            } while (opcion < 1 || opcion > 3);
            
            System.out.print("¿Desea introducir otra persona? (s/n): ");
            respuesta = entrada.next().charAt(0);
            entrada.nextLine(); // Limpiar el buffer
        } while (respuesta == 's' || respuesta == 'S');
    }

    public static void llenarFutbolista() {
        System.out.print("Nombre del futbolista: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido del futbolista: ");
        String apellido = entrada.nextLine();
        System.out.print("Edad del futbolista: ");
        int edad = entrada.nextInt();
        System.out.print("Dorsal del futbolista: ");
        int dorsal = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer
        System.out.print("Posición del futbolista: ");
        String posicion = entrada.nextLine();

        Futbolista futbolista = new Futbolista(nombre, apellido, edad, dorsal, posicion);
        personas.add(futbolista);
    }

    public static void llenarEntrenador() {
        System.out.print("Nombre del entrenador: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido del entrenador: ");
        String apellido = entrada.nextLine();
        System.out.print("Edad del entrenador: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer
        System.out.print("Estrategia del entrenador: ");
        String estrategia = entrada.nextLine();

        Entrenador entrenador = new Entrenador(nombre, apellido, edad, estrategia);
        personas.add(entrenador);
    }

    public static void llenarDoctor() {
        System.out.print("Nombre del doctor: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido del doctor: ");
        String apellido = entrada.nextLine();
        System.out.print("Edad del doctor: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer
        System.out.print("Titulación del doctor: ");
        String titulacion = entrada.nextLine();
        System.out.print("Años de experiencia del doctor: ");
        String experiencia = entrada.nextLine();

        Doctor doctor = new Doctor(nombre, apellido, edad, titulacion, experiencia);
        personas.add(doctor);
    }

    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar datos de las personas");
            System.out.println("2. Ejecutar método de una persona");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: mostrarPersonas(); break;
                case 2: ejecutarMetodoPersona(); break;
                case 3: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }

    public static void mostrarPersonas() {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(i + 1 + ". " + personas.get(i).getClass().getSimpleName() + ": " + personas.get(i));
        }
    }

    public static void ejecutarMetodoPersona() {
        System.out.print("Seleccione el número de la persona: ");
        int index = entrada.nextInt() - 1;
        entrada.nextLine(); // Limpiar buffer

        if (index >= 0 && index < personas.size()) {
            Persona persona = personas.get(index);
            
            if (persona instanceof Futbolista) {
                int opcionPersona;
                do{
                  System.out.println("Eliga una opcion: ");
                System.out.println("1.Entrenamiento: ");
                System.out.println("2.Partido: ");
                opcionPersona=entrada.nextInt();
                if
                ((Futbolista) persona).jugarPartido(); 
                }while();
               
            } else if (persona instanceof Entrenador) {
                ((Entrenador) persona).planificarEntrenamiento();
            } else if (persona instanceof Doctor) {
                ((Doctor) persona).curarLesion();
            }
        } else {
            System.out.println("Persona no válida.");
        }
    }
}
