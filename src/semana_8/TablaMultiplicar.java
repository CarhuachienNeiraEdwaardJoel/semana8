package semana_8;
public class TablaMultiplicar {
    public static void main(String[] args) {
        // Definimos el tamaño de la tabla
        int tamaño = 5;

        // Encabezado de la tabla
        System.out.println("Tabla de Multiplicar del 1 al " + tamaño);
        System.out.print("    ");
        for (int i = 1; i <= tamaño; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("    " + "----".repeat(tamaño));

        // Bucle anidado para generar la tabla de multiplicar
        for (int i = 1; i <= tamaño; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= tamaño; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

