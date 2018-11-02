package boletin6_5;

public class Comparacion {

    private int numero1;
    private int numero2;
    private int numero3;

    public Comparacion() {
    }

    public void setNumero1(int n1) {
        numero1 = n1;
    }

    public void setNumero2(int n2) {
        numero2 = n2;
    }

    public void setNumero3(int n3) {
        numero3 = n3;
    }

    public void compararNumeros() {
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("O número maior é: " + numero1);
            } else {
                System.out.println("O número maior é: " + numero3);
            }
        } else if (numero2 > numero3) {
            System.out.println("O número maior é: " + numero2);
        } else {
            System.out.println("O número maior é: " + numero3);
        }
    }
}
