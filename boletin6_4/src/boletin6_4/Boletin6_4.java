package boletin6_4;

import javax.swing.JOptionPane;

public class Boletin6_4 {

    public static void main(String[] args) {
        String nomePersoa1, nomePersoa2;
        String nome1 = JOptionPane.showInputDialog("Introduce o nome da primeira persoa:");
        nomePersoa1 = (nome1);
        String nome2 = JOptionPane.showInputDialog("Introduce o nome da segunda persoa:");
        nomePersoa2 = (nome2);

        short pesoPersoa1, pesoPersoa2;
        String peso1 = JOptionPane.showInputDialog("Introduce o peso da primeira persoa:");
        pesoPersoa1 = Short.parseShort(peso1);
        String peso2 = JOptionPane.showInputDialog("Introduce o peso da segunda persoa:");
        pesoPersoa2 = Short.parseShort(peso2);

        System.out.println("Persoa con maior peso:");

        if (pesoPersoa1 > pesoPersoa2) {
            System.out.println(nomePersoa1);
            System.out.println(pesoPersoa1 + " kg");
            System.out.println();
            System.out.println("Diferenza de peso:\n" + (pesoPersoa1 - pesoPersoa2));
        } else {
            System.out.println(nomePersoa2);
            System.out.println(pesoPersoa2 + " kg");
            System.out.println();
            System.out.println("Diferenza de peso:\n" + (pesoPersoa2 - pesoPersoa1));
        }
    }

}
