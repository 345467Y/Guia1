package Actividad2;
import java.util.Scanner;
public class Punto11 {
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    public static String obtenerRomanoDigito(int digito) {
        switch (digito) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }

    public static String obtenerRomanoDecenas(int digito) {
        switch (digito) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero de dos cifras: ");
        int numero = scanner.nextInt();


        if (numero >= 10 && numero <= 99) {
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            String romanoDecenas = obtenerRomanoDecenas(decenas);
            String romanoUnidades = obtenerRomanoDigito(unidades);

            System.out.println("Número en romano: " + romanoDecenas + romanoUnidades);
        } else {
            System.out.println("Error: El número debe ser un entero de dos cifras.");
        }

        scanner.close();
    }
}
