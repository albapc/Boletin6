package boletin6_3;

public class Tipos {

    private int numero;

    public Tipos() {
    }

    public void setNumero(int num) {
        numero = num;
    }

    public void calcularNumeros() {
        if (numero > 0) {
            System.out.println("+");
        } else {
            if (numero < 0) {
                System.out.println("-");
            } else {
                if (numero == 0) {
                    System.out.println("0");
                }
            }

        }
    }
}
