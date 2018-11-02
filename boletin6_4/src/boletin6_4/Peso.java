package boletin6_4;

public class Peso {

    private String n1;
    private String n2;
    private float p1;
    private float p2;

    public Peso() {
    }

    public void setNome1(String nom1) {
        n1 = nom1;
    }

    public void setNome2(String nom2) {
        n2 = nom2;
    }

    public void setPeso1(float pes1) {
        p1 = pes1;
    }

    public void setPeso2(float pes2) {
        p2 = pes2;
    }

    public void compararPesos() {
        if (p1 > p2) {
            System.out.println(n1);
            System.out.println(p1 + " kg");
            System.out.println();
            System.out.println("Diferenza de peso:\n" + (p1 - p2));
        } else {
            System.out.println(n2);
            System.out.println(p2 + " kg");
            System.out.println();
            System.out.println("Diferenza de peso:\n" + (p2 - p1));
        }
    }
}
