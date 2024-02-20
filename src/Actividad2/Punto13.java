package Actividad2;
import java.util.Scanner;
public class Punto13 {

    public static double calcularAumentoSueldo(double sueldoActual) {
        double aumento;

        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10;
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08;
        } else {
            aumento = sueldoActual * 0.05;
        }

        return aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        double aumentoSueldo = calcularAumentoSueldo(sueldoActual);

        double nuevoSalario = sueldoActual + aumentoSueldo;

        System.out.println("El aumento de sueldo es: $" + aumentoSueldo);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);

        scanner.close();
    }
}
