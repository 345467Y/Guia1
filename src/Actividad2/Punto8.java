package Actividad2;
import java.util.Scanner;
public class Punto8 {
    public static int calcularNumeroSalones(int numEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }

    public static int calcularNumeroPisos(int numSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes en la universidad: ");
        int numEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el número de salones por piso del nuevo edificio: ");
        int salonesPorPiso = scanner.nextInt();

        int numSalones = calcularNumeroSalones(numEstudiantes, capacidadSalon);
        int numPisos = calcularNumeroPisos(numSalones, salonesPorPiso);

        System.out.println("El número de salones en el nuevo edificio es: " + numSalones);
        System.out.println("El número de pisos en el nuevo edificio es: " + numPisos);

        scanner.close();
    }
}
