package boletin6_2;

import java.util.Scanner;

public class Boletin6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        short num1 = sc.nextShort();
        System.out.println("Introduce outro número:");
        short num2 = sc.nextShort();

        if (num1 >= num2) {
            System.out.println("Resultado resta:");
            System.out.println(num1 - num2);
        } else {
            System.out.println("Resultado suma:");
            System.out.println(num1 + num2);
        }
    }

}
