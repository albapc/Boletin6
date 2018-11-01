package boletin6_2;

import java.util.Scanner;

public class Boletin6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacions obxNumero = new Operacions();

        System.out.println("Introduce un número:");
        short n1 = sc.nextShort();
        obxNumero.setNumero1(n1);
        System.out.println("Introduce outro número:");
        short n2 = sc.nextShort();
        obxNumero.setNumero2(n2);

        obxNumero.realizarOperacions();
    }
}
