package Actividad2;
import java.util.Scanner;
public class Punto9 {
    public static int encontrarMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int resultado = encontrarMayor(num1, num2);
        System.out.println("El mayor de los dos números es: " + resultado);

        scanner.close();
    }
}
