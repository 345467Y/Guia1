package Actividad1;

public class Fecha {

    private int año;
    private int mes;
    private int dia;

    public Fecha() {
    }

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int obtenerAño() {
        return año;
    }

    public int obtenerMes() {
        return mes;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerAño(int año) {
        this.año = año;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return String.format("", año, mes, dia);
    }
}
