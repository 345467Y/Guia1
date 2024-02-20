package Actividad2;
import java.util.Scanner;
public class Punto12 {
    public static String obtenerDiaSiguiente(String dia) {
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        for (int i = 0; i < diasSemana.length; i++) {
            if (dia.equalsIgnoreCase(diasSemana[i])) {
                int indiceSiguiente = (i + 1) % diasSemana.length;

                return diasSemana[indiceSiguiente];
            }
        }
        return "Error: Día no válido";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un día de la semana: ");
        String diaActual = scanner.nextLine();

        String diaSiguiente = obtenerDiaSiguiente(diaActual);

        System.out.println("El día de mañana es: " + diaSiguiente);

        scanner.close();
    }
}
