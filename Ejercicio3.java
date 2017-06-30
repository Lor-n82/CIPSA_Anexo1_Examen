/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author CIPSA
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        String[] nombres = new String[5];
        int[] edades = new int[5];
        String nombre;

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("\nIntroduce el nombre: ");
            nombres[i] = tc.nextLine();
            System.out.print("Introduzca la edad de la persona: ");
            edades[i] = tc.nextInt();
            tc.nextLine(); //Limpiar buffer
        }
        System.out.println("\nIntroduce el nombre de la persona a encontrar: ");
        nombre = tc.nextLine();

        int vueltas = 0;
        boolean encontrado = false;

        do {
            if (nombres[vueltas].equalsIgnoreCase(nombre)) {
                System.out.println("\nNombre: " + nombres[vueltas] + " Edad: " + edades[vueltas]);
                encontrado = true;
            } else {
                vueltas++;
            }
        } while (!encontrado && vueltas<5);
        
        if(!encontrado)
            System.out.println("\nPERSONA NO REGISTRADA");

    }

}
