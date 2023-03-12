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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escribir un programa que lea un número entero por 
        teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        int doble, triple, raiz2;
        doble = num * 2;
        triple = num * 3;
        raiz2 = (int) Math.sqrt(num);
        System.out.println("Doble= " + doble);
        System.out.println("Triple= " + triple);
        System.out.println("Raíz cuadrada= " + raiz2);
                
               
        
    }
    
}
