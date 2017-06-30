/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author CIPSA
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] lista = new int[10];
        int[] contadorNum = new int[10];
        int valor, contador = 0;

        do {
            for (int i = 0; i < lista.length; i++) {
                do {
                    System.out.print("Introduce un valor entre 1 y 10: ");
                    valor = teclado.nextInt();
                    if (valor < 1 || valor > 10) {
                        System.out.println("Error, valor no valido");
                    }
                } while (valor < 1 || valor > 10);
                lista[i] = valor;
                contador++;
                switch (lista[i]) {
                    case 1:
                        contadorNum[0]++;
                        break;
                    case 2:
                        contadorNum[1]++;
                        break;
                    case 3:
                        contadorNum[2]++;
                        break;
                    case 4:
                        contadorNum[3]++;
                        break;
                    case 5:
                        contadorNum[4]++;
                        break;
                    case 6:
                        contadorNum[5]++;
                        break;
                    case 7:
                        contadorNum[6]++;
                        break;
                    case 8:
                        contadorNum[7]++;
                        break;
                    case 9:
                        contadorNum[8]++;
                        break;
                    case 10:
                        contadorNum[9]++;
                        break;
                }
            }
        } while (contador <10);

        System.out.println("");

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Valor nº" + (i + 1) + " ->  " + lista[i]);
        }

        System.out.println("");

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Valor " + (i + 1) + " ->  " + contadorNum[i] + " veces");
        }

    }

}
