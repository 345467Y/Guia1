package Actividad2;
import java.util.Scanner;
public class Punto4 {
    public static double calcularGastoArriendo(double sueldo) {
        return 0.4 * sueldo;
    }

    public static double calcularGastoComida(double sueldo) {
        return 0.15 * sueldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();

        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);

        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);
    }
}
