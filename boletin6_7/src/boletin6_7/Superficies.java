
package boletin6_7;

import java.util.Scanner;

public class Superficies {
    private int opcion;
    private float superficie;
    private float base;
    private float altura;
    private float radio;
    private final float PI=3.14f;
    
    Scanner sc= new Scanner(System.in);
    public Superficies(){
    }
    
    public void setSuperficie(float superf){
        superficie= superf;
    }
    public void setOpcion(int opc){
        opcion= opc;
    }
    public void calcularSuperficies(){
        switch(opcion){
            case 1: System.out.println("Introduce a base:");
            base= sc.nextFloat();
            superficie= base*base;
                System.out.println("Superficie do cadrado: "+superficie);
                break;
            case 2: System.out.println("Introduce a base:");
            base= sc.nextFloat();
                System.out.println("Introduce a altura:");
            altura=sc.nextFloat();
            superficie= base*(altura/2);
                System.out.println("Superficie do triángulo: "+superficie);
                break;
            case 3: System.out.println("Introduce o radio:");
                radio=sc.nextFloat();
                superficie= PI*radio*radio;
                System.out.println("Superficie do círculo: "+superficie);
                break;
            default: System.out.println("Opción non válida");
            
            
        }
    }
}
