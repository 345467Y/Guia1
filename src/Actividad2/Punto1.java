package Actividad2;

public class Punto1 {
    public static double valorFuncionAlgebraica(double x, double y) {
        return x * x + 2 * x * y + y * y;
    }

    public static void main(String[] args) {
        double x = 7.0;
        double y = 5.4;

        double resultado = valorFuncionAlgebraica(x, y);

        System.out.println("El valor de la función para x = " + x + " y y = " + y + " es: " + resultado);
    }
}

