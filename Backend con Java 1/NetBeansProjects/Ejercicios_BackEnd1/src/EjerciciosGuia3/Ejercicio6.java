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
public class Ejercicio6 {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
      el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
      pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
      que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje 
      de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
     caso contrario se vuelve a mostrar el menú.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese dos números enteros para operar");
          int num1 = leer.nextInt(); 
          int num2 = leer.nextInt();            
          int opcion;
          String opcion2;
        
          do {
              System.out.println("MENU -- Elija una opción ");
              System.out.println("1 - SUMAR; " + num1 + " + " + num2);
              System.out.println("2 - RESTAR; " + num1 + " - " + num2);
              System.out.println("3 - MULTIPLICAR; " + num1 + " * " + num2);
              System.out.println("4 - DIVIDIR; " + num1 + " / " + num2);
              System.out.println("5 - SALIR ");
              
              opcion = leer.nextInt();
              
               switch (opcion) {
                  case 1:
                      System.out.println("Suma= " + (num1+num2));
                      break;
                  case 2: 
                       System.out.println("Resta= " + (num1-num2));
                       break;
                  case 3:
                      System.out.println("Multiplicación= " + (num1*num2));
                      break;
                  case 4: 
                       System.out.println("Divición= " + (num1/num2));
                       break;
                  case 5: 
                      System.out.println("Está seguro que desea salir del programa? (s/n)");
                      opcion2 = leer.nextLine().toLowerCase();
                       if (opcion2.equals("s")) {
                           break;
                       }
                       
 
                  default:
                      throw new AssertionError();
              }
                       
            
        } while (true);
        
     
    }
    
}
