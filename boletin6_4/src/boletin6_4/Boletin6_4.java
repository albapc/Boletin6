package boletin6_4;

import javax.swing.JOptionPane;

public class Boletin6_4 {

    public static void main(String[] args) {
        String nomePersoa1, nomePersoa2;
        Peso obxPersoa = new Peso();

        String nome1 = JOptionPane.showInputDialog("Introduce o nome da primeira persoa:");
        nomePersoa1 = (nome1);
        obxPersoa.setNome1(nome1);
        String nome2 = JOptionPane.showInputDialog("Introduce o nome da segunda persoa:");
        nomePersoa2 = (nome2);
        obxPersoa.setNome2(nome2);

        float pesoPersoa1, pesoPersoa2;
        String peso1 = JOptionPane.showInputDialog("Introduce o peso da primeira persoa:");
        pesoPersoa1 = Float.parseFloat(peso1);
        obxPersoa.setPeso1(pesoPersoa1);
        String peso2 = JOptionPane.showInputDialog("Introduce o peso da segunda persoa:");
        pesoPersoa2 = Float.parseFloat(peso2);
        obxPersoa.setPeso2(pesoPersoa2);

        System.out.println("Persoa con maior peso:");

        obxPersoa.compararPesos();
    }
}
