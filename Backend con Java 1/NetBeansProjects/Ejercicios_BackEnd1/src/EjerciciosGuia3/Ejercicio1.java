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
public class Ejercicio1 {

    /**
            Crear un programa que dado un número determine si es par o impar.
     * @param args
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para determinar si es para o impar");
        int num = leer.nextInt();
        if (num%2 == 0) {
            System.out.println("Número par");
        }
        else{
                    System.out.println("Número impar");   
        }
    }
    
}
