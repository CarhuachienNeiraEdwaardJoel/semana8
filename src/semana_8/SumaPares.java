package semana_8;

public class SumaPares {
    public static void main(String[] args) {
        int sumaPares = 0; 
        int contadorPares = 0;
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) { 
                sumaPares += i; 
                contadorPares++; 
            }
        }

        // Imprimimos los resultados
        System.out.println("La suma de los números pares del 1 al 20 es: " + sumaPares);
        System.out.println("La cantidad de números pares del 1 al 20 es: " + contadorPares);
    }
}
