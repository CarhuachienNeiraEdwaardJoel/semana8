public class AcumuladorConContador {
    public static void main(String[] args) {
        int acumulador = 0; 
        int contador = 1; 

        do {
            acumulador += contador; 
            System.out.println("Contador: " + contador + ", Acumulador: " + acumulador);
            contador++; 
        } while (contador <= 10); 
    }
}