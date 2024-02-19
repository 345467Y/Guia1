package Actividad1;

public class Proyectil {
    private double velocidad;
    private double angulo;


    public Proyectil() {

    }

    public Proyectil(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }


    public double obtenerVelocidad() {
        return velocidad;
    }

    public double obtenerAngulo() {
        return angulo;
    }

    public void establecerVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void establecerAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double calcularEjeX() {
        return velocidad * Math.cos(Math.toRadians(angulo));
    }

    public double calcularEjeY() {
        return velocidad * Math.sin(Math.toRadians(angulo));
    }
}
