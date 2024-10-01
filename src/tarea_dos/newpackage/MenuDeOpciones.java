import java.util.Scanner;

public class MenuDeOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Contador Progresivo");
            System.out.println("2. Contador Regresivo");
            System.out.println("3. Acumulador Progresivo");
            System.out.println("4. Acumulador con Contador");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    contadorProgresivo();
                    break;
                case 2:
                    contadorRegresivo();
                    break;
                case 3:
                    acumuladorProgresivo();
                    break;
                case 4:
                    acumuladorConContador();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void contadorProgresivo() {
        int contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 10);
    }

    public static void contadorRegresivo() {
        int contador = 10;
        do {
            System.out.println("Contador: " + contador);
            contador--;
        } while (contador > 0);
    }

    public static void acumuladorProgresivo() {
        int acumulador = 0;
        int contador = 1;
        do {
            acumulador += contador;
            System.out.println("Contador: " + contador + ", Acumulador: " + acumulador);
            contador++;
        } while (contador <= 10);
    }

    public static void acumuladorConContador() {
        int acumulador = 0;
        int contador = 1;
        do {
            acumulador += contador;
            System.out.println("Contador: " + contador + ", Acumulador: " + acumulador);
            contador++;
        } while (contador <= 10);
    }
}