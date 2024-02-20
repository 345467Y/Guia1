package Actividad2;
import java.util.Scanner;
public class Punto10 {
    public static int realizarOperacion(int num1, int num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error ");
                    return 0;
                }
            case "%":
                if (num2 != 0) {
                    return num1 % num2;
                } else {
                    System.out.println("Error ");
                    return 0;
                }
            case "**":
                return (int) Math.pow(num1, num2);
            default:
                System.out.println("Error ");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();

        int resultado = realizarOperacion(num1, num2, operador);
        System.out.println("El resultado de la operación es: " + resultado);

        scanner.close();
    }
}
