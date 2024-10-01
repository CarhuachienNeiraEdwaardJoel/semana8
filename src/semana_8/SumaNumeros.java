package semana_8;

public class SumaNumeros {
    public static void main(String[] args) {
        int suma = 0; // Inicializamos la variable suma

        // Bucle for con un contador interno progresivo
        for (int i = 1; i <= 10; i++) {
            suma += i; // Sumamos el valor del contador a la variable suma
        }

        // Imprimimos el resultado
        System.out.println("La suma de los primeros 10 números naturales es: " + suma);
    }
}
