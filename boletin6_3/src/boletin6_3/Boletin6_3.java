package boletin6_3;

import java.util.Scanner;

public class Boletin6_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tipos obxNumero = new Tipos();

        System.out.println("Introduce un número:");
        int n = sc.nextInt();
        obxNumero.setNumero(n);
        obxNumero.calcularNumeros();
    }
}
