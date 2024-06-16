
package promedionotas;
import java.util.Scanner;
public class PromedioNotas {

    public static void main(String[] args) {
        double promedio;
        
        System.out.println("Ingrese la primera nota");
        Scanner teclado = new Scanner (System.in);
        double nota1 = teclado.nextDouble();
        
        System.out.println("Ingrese la segunda nota");
        Scanner teclado2 = new Scanner (System.in);
        double nota2 = teclado2.nextDouble();
        
        System.out.println("Ingrese la tercera nota");
        Scanner teclado3 = new Scanner (System.in);
        double nota3 = teclado3.nextDouble();
        
        System.out.println("Ingrese la cuarta nota");
        Scanner teclado4 = new Scanner (System.in);
        double nota4 = teclado4.nextDouble();
        
        promedio = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("El promedio de sus 4 notas es: " + promedio);
    }
    
}
