
package boletin6_5;

import java.util.Scanner;

public class Boletin6_5 {


    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num1, num2, num3;
        System.out.println("Introduce o primeiro número:");
        num1= sc.nextInt();
        System.out.println("Introduce o segundo número:");
        num2= sc.nextInt();
        System.out.println("Introduce o terceiro número:");
        num3= sc.nextInt();
        
       if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("O número maior é: " + num1);
            } else {
                System.out.println("O número maior é: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("O número maior é: " + num2);
        } else {
            System.out.println("O número maior é: " + num3);
        }
    }
}
