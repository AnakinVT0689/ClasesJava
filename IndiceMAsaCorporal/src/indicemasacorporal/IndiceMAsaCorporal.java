
package indicemasacorporal;
import java.util.Scanner;
public class IndiceMAsaCorporal {

    public static void main(String[] args) {
        double indice;

    System.out.println("Ingrese por favor su peso en kg: ");
    Scanner teclado = new Scanner (System.in);
    double peso = teclado.nextDouble();
    System.out.print("Ingrese por favor su estatura en metros: ");
    Scanner teclado2 = new Scanner (System.in);
    double estatura = teclado2.nextDouble();

    indice = peso / (estatura * estatura);
    System.out.println("Su indice de Masa corporal es: " + indice);
    
        
    }
    
}
