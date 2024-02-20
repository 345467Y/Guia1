package Actividad2;

public class Punto2 {
    public static int calcularBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        int sillasEstudiantesGordos = estudiantesGordos * 2;
        int sillasTotales = sillasEstudiantesGordos + estudiantesFlacos;

        int busesNecesarios = sillasTotales / sillasPorBus;
        if (sillasTotales % sillasPorBus != 0) {
            busesNecesarios++;
        }

        return busesNecesarios;
    }

    public static void main(String[] args) {
        int sillasPorBus = 35;
        int estudiantesGordos = 12;
        int estudiantesFlacos = 30;

        int busesNecesarios = calcularBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);

        System.out.println("Se necesitan " + busesNecesarios + " buses para llevar a todos los estudiantes al paseo.");
    }
}
