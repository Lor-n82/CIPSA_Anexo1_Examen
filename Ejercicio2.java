/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author CIPSA
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        
        double precio, cantidad, precioFinal, descuento;
        String respuesta;
        
        
        System.out.print("¿Cantidad de productos adquirida?: ");
            cantidad=tc.nextInt();
            
        System.out.print("¿Precio por unidad adquirida?: ");
            precio=tc.nextDouble();
        
        tc.nextLine();
        System.out.print("¿Compra con VISA?: ");
            respuesta=tc.nextLine();
            
        if(cantidad>=5 && cantidad<=9){
            precioFinal=cantidad*precio;
            descuento=5;
        }else if(cantidad>=10 && cantidad<=19){
            precioFinal=cantidad*precio;
            descuento=10;
        }else if(cantidad>=20 && cantidad<=39){
            precioFinal=cantidad*precio;
            descuento=20;
        }else if(cantidad>40){
            precioFinal=cantidad*precio;
            descuento=50;
        }else{
            precioFinal=cantidad*precio;
            descuento=0;
        }
        
        if(respuesta.equalsIgnoreCase("si"))
            
            System.out.println(precioFinal-(precioFinal+(precioFinal*descuento/100))*5/100);
        else
            System.out.println(precioFinal-(precioFinal*descuento/100));
    }
      
}
