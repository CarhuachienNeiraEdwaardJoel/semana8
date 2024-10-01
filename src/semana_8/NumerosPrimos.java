package semana_8;

public class NumerosPrimos {
    public static void main(String[] args) {
        int inicio = 1; // Inicio del rango
        int fin = 20;   // Fin del rango

        // Bucle para iterar a través del rango de números
        for (int i = inicio; i <= fin; i++) {
            boolean esPrimo = true; // Asumimos que el número es primo

            // Bucle para verificar si el número es primo
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false; // Si encontramos un divisor, no es primo
                    break; // Salimos del bucle
                }
            }

            // Estructura condicional anidada para imprimir el resultado
            if (i == 1) {
                System.out.println(i + " no es primo.");
            } else if (esPrimo) {
                System.out.println(i + " es primo.");
            } else {
                System.out.println(i + " no es primo.");
            }
        }
    }
}

