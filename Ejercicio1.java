/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author CIPSA
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        
        int valor= (int) (Math.random() *100+1);
        int numero;
        int contador = 0;
        
        do{
        System.out.print("Introduce un numero entre 1 y 100: ");
            numero=tc.nextInt();
            if(numero <1 || numero >100)
                System.out.println("VALOR FUERA DE RANGO");
            
            if(numero<valor && (numero >=1 && numero <=100)){
                System.out.println("VALOR DEMASIADO BAJO");
                contador++;
            }else if(numero>valor && (numero >=1 && numero <=100)){
                System.out.println("VALOR DEMASIADO ALTO");
                contador++;
            }else if(numero==valor && (numero >=1 && numero <=100))
                System.out.println("VALOR CORRECTO");
        }while((numero <1 || numero >100)|| numero>valor || numero<valor);
        
        
        
        
        
        
        
    }
    
}
