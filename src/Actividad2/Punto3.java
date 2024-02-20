package Actividad2;

public class Punto3 {
    public static double calcularLongitudEscalera(double altura, double angulo) {
        double anguloEnRadianes = Math.toRadians(angulo);

        double longitudEscalera = altura / Math.sin(anguloEnRadianes);

        return longitudEscalera;
    }

    public static void main(String[] args) {
        double altura = 6.0;
        double angulo = 25.0;

        double longitudEscalera = calcularLongitudEscalera(altura, angulo);

        System.out.println("La longitud de la escalera es: " + longitudEscalera);
    }
}
