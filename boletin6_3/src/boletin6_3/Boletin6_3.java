package boletin6_3;

import java.util.Scanner;

public class Boletin6_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("+");
        } else {
            if (n < 0) {
                System.out.println("-");
            } else {
                if (n == 0) {
                    System.out.println("0");
                }
            }

        }
    }

}
