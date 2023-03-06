// Se pregunta la capital de un país, sino sabe se muestra cual es.

import java.util.Scanner;
import java.util.HashMap;

public class Codigo7 {
    public static void main(String[] args) { //añadí la main

        Scanner s = new Scanner(System.in);
        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        String pais = ""; //renombre a pais

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: "); //cambie de in a out
            pais = s.nextLine(); //cambie a Line

            if (!pais.equalsIgnoreCase("salir")) { // uso IgnoreCase para saber si el usuario quiere salir
                if (capitales.containsKey(pais)) { // renombre a capitales, y suo containsKey para saber si el país está en el HashMap
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais)); //use un solo system
                } else {
                    System.out.print("No conozco la respuesta. ");
                    System.out.print("¿Cuál es la capital de " + pais + "?: "); //cambie ca por pais
                    String capital = s.nextLine();
                    capitales.put(pais, capital); //renombre
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!pais.equalsIgnoreCase("salir")); // salimos del ciclo cuando el usuario escriba "salir"

        System.out.println("¡Bye!"); //añadí mensaje de salida
    }
}