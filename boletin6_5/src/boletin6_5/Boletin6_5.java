package boletin6_5;

import java.util.Scanner;

public class Boletin6_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        Comparacion obxNumero = new Comparacion();

        System.out.println("Introduce o primeiro número:");
        num1 = sc.nextInt();
        obxNumero.setNumero1(num1);
        System.out.println("Introduce o segundo número:");
        num2 = sc.nextInt();
        obxNumero.setNumero2(num2);
        System.out.println("Introduce o terceiro número:");
        num3 = sc.nextInt();
        obxNumero.setNumero3(num3);

        obxNumero.compararNumeros();
    }
}
