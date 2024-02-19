package Actividad1;
public class Fraccionario {
        private int numerador;
        private int denominador;

        public Fraccionario(){

        }
        public Fraccionario(int numerador, int denominador){
            this.numerador = numerador;
            this.denominador = denominador;
    }

    public int getNumerador(){
            return numerador;
    }

    public void setNumerador(int numerador){
            this.numerador = numerador;
    }

    public int getDenominador(){
            return denominador;
    }

    public void setDenominador(int denominador){
            this.denominador = denominador;
    }

    public double calcularValor(){
            return (double) numerador / denominador;
    }

    //Ejemplo

    public static void main(String[] args){
        Fraccionario fraccion = new Fraccionario(7, 10);

        System.out.println("Numerador: " + fraccion.getNumerador());
        System.out.println("Denominador: " + fraccion.getDenominador());

        System.out.println("Valor Decimal: " + fraccion.calcularValor());
    }
}
