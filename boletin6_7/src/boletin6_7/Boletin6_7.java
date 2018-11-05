package boletin6_7;

import java.util.Scanner;

public class Boletin6_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Superficies figuras = new Superficies();

        System.out.println("***********CÁLCULO DE SUPERFICIES***********\n"
                + "1-> Cadrado\n2-> Triángulo\n3-> Círculo\nElixe unha opción:");
        op = sc.nextInt();
        figuras.setOpcion(op);
        figuras.calcularSuperficies();

    }

}
