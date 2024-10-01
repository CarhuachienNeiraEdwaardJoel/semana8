package semana_8;

public class ReporteSismos {
    public static void main(String[] args) {
        // Datos ficticios de sismos
        String[] fechas = {"2024-09-25", "2024-09-26", "2024-09-27"};
        double[] magnitudes = {4.5, 5.2, 3.8};
        String[] ubicaciones = {"Lima", "Arequipa", "Cusco"};

        // Encabezado del reporte
        System.out.println("Reporte de Sismos en Perú");
        System.out.println("Fecha       | Magnitud | Ubicación");
        System.out.println("-------------------------------");

        // Bucle for para imprimir los datos de los sismos
        for (int i = 0; i < fechas.length; i++) {
            System.out.printf("%-11s | %-8.1f | %s%n", fechas[i], magnitudes[i], ubicaciones[i]);
        }
    }
}
