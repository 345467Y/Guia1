package Actividad1;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    public Reloj(){
    }
    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public int obtenerHora() {
        return hora;
    }
    public int obtenerMinutos() {
        return minutos;
    }
    public int obtenerSegundos() {
        return segundos;
    }
    public void establecerHora(int hora) {
        this.hora = hora;
    }
    public void establecerMinutos(int minutos) {
        this.minutos = minutos;
    }
    public void establecerSegundos(int segundos) {
        this.segundos = segundos;
    }
    public void incrementarTiempo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    public void reiniciar() {
        hora = 0;
        minutos = 0;
        segundos = 0;
    }

    @Override
    public String toString() {
        return String.format("", hora, minutos, segundos);
    }

    //Ejemplo
    public static void main(String[] args) {

        Reloj miReloj = new Reloj(12, 30, 45);


        System.out.println("Hora: " + miReloj.obtenerHora());
        System.out.println("Minutos: " + miReloj.obtenerMinutos());
        System.out.println("Segundos: " + miReloj.obtenerSegundos());
    }

}
