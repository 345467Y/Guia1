package Actividad2;
import java.util.Scanner;
public class Punto5 {
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaCorona(double radioGrande, double radioPequeno) {
        double areaCirculoGrande = calcularAreaCirculo(radioGrande);

        double areaCirculoPequeno = calcularAreaCirculo(radioPequeno);

        double areaCorona = areaCirculoGrande - areaCirculoPequeno;

        return areaCorona;
    }

    public static void main(String[] args) {
        ;
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Ingrese el radio grande (R): ");
            double radioGrande = scanner.nextDouble();

            System.out.print("Ingrese el radio pequeño (r): ");
            double radioPequeno = scanner.nextDouble();

            double areaCorona = calcularAreaCorona(radioGrande, radioPequeno);

            System.out.println("El área de la corona circular es: " + areaCorona);
        }
    }
}
