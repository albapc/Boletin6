package boletin6_6;

public class VendasAnuais {

    private String nomeArt;
    private int vendasAno;

    public VendasAnuais() {
    }

    public void setNomeArtigo(String nomeArt1) {
        nomeArt = nomeArt1;
    }

    public void setVendasAnuais(int vendasAno1) {
        vendasAno = vendasAno1;
    }

    public void calcularVendasAnuais() {
        if (vendasAno <= 100) {
            System.out.println("Artigo de consumo baixo");
        } else if (vendasAno > 100 && vendasAno <= 500) {
            System.out.println("Artigo de consumo medio");
        } else if (vendasAno > 500 && vendasAno <= 1000) {
            System.out.println("Artigo de consumo alto");
        } else if (vendasAno > 1000) {
            System.out.println("Artigo de primeira necesidade");
        }
    }
}
