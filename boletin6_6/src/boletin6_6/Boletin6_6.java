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

        if (vendasAnuais <= 100) {
            System.out.println("Artigo de consumo baixo");
        } else if (vendasAnuais > 100 && vendasAnuais <= 500) {
            System.out.println("Artigo de consumo medio");
        } else if (vendasAnuais > 500 && vendasAnuais <= 1000) {
            System.out.println("Artigo de consumo alto");
        } else if (vendasAnuais > 1000) {
            System.out.println("Artigo de primeira necesidade");
        }
    }
}
