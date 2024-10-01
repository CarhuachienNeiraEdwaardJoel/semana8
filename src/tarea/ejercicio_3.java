/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author Edward
 */
public class ejercicio_3 {
    
    public static void main(String[] args) {
        int contador = 1; // Inicializamos el contador en 1
        int acumulador = 0; // Inicializamos el acumulador en 0

        // Bucle while que se ejecuta mientras el contador sea menor o igual a 10
        while (contador <= 10) {
            acumulador += contador; // Sumamos el valor del contador al acumulador
            contador++; // Incrementamos el contador en 1
        }

        // Imprimimos el resultado final del acumulador
        System.out.println("La suma de los números del 1 al 10 es: " + acumulador);
    }
}

