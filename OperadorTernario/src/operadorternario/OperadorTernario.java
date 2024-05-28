
package operadorternario;
import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        double promedio;
        String condicionFinal;                ;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el promedio Genereal del alumno en TodoCode");
        promedio = teclado.nextDouble();
        
        condicionFinal = promedio >=6 ? "Aprobado":"Reprobado";
        System.out.println("La condicion final del alumno es: " + condicionFinal);
        
    }
    
}
