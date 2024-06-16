
package ejercicio1estructurasrepetitivas;
import java.util.Scanner
public class Ejercicio1EstructurasRepetitivas {

    public static void main(String[] args) {
        /* Realizar un programa que dado por teclaro un limite numerico
        por teclado (por ejemplo 100) muestre en pantalla 
        todos los numeros hasta el limite (empezando por 1) */
        
        System.out.println("Ingrese el limite hasta el que quiere contar");
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        int cont = 1;
        
        while (cont <= limite){
            System.out.println(cont);
            cont ++;
        }
    }
    
}
