
package boletin6_1;

import java.util.Scanner;


public class Boletin6_1 {


    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n= sc.nextInt();
        if(n>=0){
            System.out.println(n+" é un número positivo");
        }else{
            System.out.println("Non é positivo");
        }
       
    }
    
}
