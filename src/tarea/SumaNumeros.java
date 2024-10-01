package tarea;

public class SumaNumeros {
    public static void main(String[] args) {
        int i = 1; // Inicializamos el contador
        int suma = 0; // Inicializamos la variable para almacenar la suma

        // Bucle while que se ejecuta mientras i sea menor o igual a 10
        while (i <= 10) {
            suma += i; // Sumamos el valor de i a la variable suma
            i++; // Incrementamos el contador
        }

        // Imprimimos el resultado
        System.out.println("La suma de los números del 1 al 10 es: " + suma);
    }
}