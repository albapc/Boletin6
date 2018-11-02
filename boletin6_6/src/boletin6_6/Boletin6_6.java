package boletin6_6;

import java.util.Scanner;

public class Boletin6_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomArtigo;
        VendasAnuais obxArtigo = new VendasAnuais();

        System.out.println("Introduce o nome do producto:");
        nomArtigo = sc.nextLine();
        obxArtigo.setNomeArtigo(nomArtigo);

        int vendasAnuais;
        System.out.println("Introduce o número de vendas anuais:");
        vendasAnuais = sc.nextInt();
        obxArtigo.setVendasAnuais(vendasAnuais);
        
        obxArtigo.calcularVendasAnuais();
    }
}
