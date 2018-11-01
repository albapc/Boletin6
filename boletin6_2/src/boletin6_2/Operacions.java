package boletin6_2;

public class Operacions {

    private int numero1;
    private int numero2;

    public Operacions() {
    }

    public void setNumero1(int num1) {
        numero1 = num1;
    }

    public void setNumero2(int num2) {
        numero2 = num2;
    }

    public void realizarOperacions() {
        if (numero1 >= numero2) {
            System.out.println("Resultado resta:");
            System.out.println(numero1 - numero2);
        } else {
            System.out.println("Resultado suma:");
            System.out.println(numero1 + numero2);
        }
    }
}
