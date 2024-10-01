/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author Edward
 */
public class ejercicio_4 {
   
    public static void main(String[] args) {
        int contador = 10; // Inicializamos el contador en 10
        int acumulador = 0; // Inicializamos el acumulador en 0

        // Bucle while que se ejecuta mientras el contador sea mayor o igual a 1
        while (contador >= 1) {
            acumulador -= contador; // Restamos el valor del contador al acumulador
            contador--; // Decrementamos el contador en 1
        }

        // Imprimimos el resultado final del acumulador
        System.out.println("La resta de los números del 10 al 1 es: " + acumulador);
    }
} 

