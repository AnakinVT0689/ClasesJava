
package repetitivaselectivas;

import java.util.Scanner;

public class RepetitivaSelectivas {

    public static void main(String[] args) {
    String operador;
    int cont =1;
    double resultado = 0;
    
        while (cont <= 2) {
            System.out.println("Ingrese el primer numero");
            Scanner teclado = new Scanner(System.in);
            var num1 = teclado.nextDouble();
            
            System.out.println("Ingrese el segundo numero");
            Scanner teclado2 = new Scanner(System.in);
            var num2 = teclado2.nextDouble();
            
            System.out.println("Ingrese el operador");
            Scanner teclado3 = new Scanner(System.in);
            operador = teclado3.nextLine();
            
            if ("+".equals(operador)){
                resultado = num1 + num2;
            } 
            else {
                if ("-".equals(operador)){
                    resultado = num1-num2;
                }
                else {
                    if ("*".equals(operador)) {
                        resultado = num1*num2;
                    }
                    else{
                        resultado = num1/num2;
                    }
                }
            }
            System.out.println("El Resultado es "+ resultado);
            cont = cont + 1;
        }
    }
    
}
