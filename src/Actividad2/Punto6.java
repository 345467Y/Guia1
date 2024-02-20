package Actividad2;
import java.util.Scanner;
public class Punto6 {
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);

        double perimetro = ladoA + ladoB + ladoC;

        return perimetro;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese el lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese el lado C: ");
        double ladoC = scanner.nextDouble();

        double areaRectangulo = calcularAreaRectangulo(ladoA, ladoB);
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        double areaTriangulo = calcularAreaTriangulo(ladoC, hipotenusa);
        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC);


        System.out.println("El área del rectángulo es: " + areaRectangulo);
        System.out.println("El área del triángulo es: " + areaTriangulo);
        System.out.println("El perímetro del terreno es: " + perimetroTerreno);

        scanner.close();
    }
}
