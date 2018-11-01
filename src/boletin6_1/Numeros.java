package boletin6_1;

public class Numeros {

    private int numero;

    public Numeros() {
    }

    public void setNumero(int num) {
        numero = num;
    }

    public void calcularNumeros() {
        if (numero >= 0) {
            System.out.println(numero + " é un número positivo");
        } else {
            System.out.println("Non é positivo");
        }
    }
}
