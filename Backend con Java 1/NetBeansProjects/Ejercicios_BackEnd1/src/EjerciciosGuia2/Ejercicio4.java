/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia2;

import java.util.Scanner;

/**
 *
 * @author Pablo Llancafil
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dada una cantidad de grados centígrados 
        se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese temperatura en °c...");
        int temperatura = leer.nextInt();
        int fahrenheit = 32 + (9*temperatura/5);
        System.out.println("Temperatura en °C= " + temperatura);
        System.out.println("Temperatura en °F= " + fahrenheit);
              
        
               
            
        
}
}