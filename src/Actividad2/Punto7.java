package Actividad2;
import java.util.Scanner;
public class Punto7 {
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            System.out.println("Los puntos son iguales, la pendiente es indefinida.");
            return Double.NaN;
        }

        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);
        double pendiente = calcularPendiente(x1, y1, x2, y2);

        System.out.println("La distancia entre los puntos es: " + distancia);
        if (!Double.isNaN(pendiente)) {
            System.out.println("La pendiente de la recta que une los puntos es: " + pendiente);
        }

        scanner.close();
    }
}

