/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia3;

import java.util.Scanner;

/**
 *
 * @author Pablo Llancafil
 */
public class Ejercicio5 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario 
     * hasta que la suma de los números introducidos supere el límite inicial.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese limite positivo");
          int limite = leer.nextInt();
          int suma = 0;
          int num;
          do {
              System.out.println("Ingrese números para sumar");
              num = leer.nextInt();
              suma += num;
        } while (suma <= limite);
        
          System.out.println("La suma de números a superado el limite positivo ingresado");
          System.out.println("Limite positivo= " + limite);
          System.out.println("Suma de números ingresados= " + suma);
    }
}