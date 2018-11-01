package boletin6_1;

import java.util.Scanner;

public class Boletin6_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros obxNumero = new Numeros();

        System.out.println("Introduce un número:");
        int n = sc.nextInt();
        obxNumero.setNumero(n);
        obxNumero.calcularNumeros();
    }
}
