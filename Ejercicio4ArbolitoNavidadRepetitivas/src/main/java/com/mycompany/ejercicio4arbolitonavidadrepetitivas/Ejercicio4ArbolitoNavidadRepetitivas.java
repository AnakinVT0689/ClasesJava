
package com.mycompany.ejercicio4arbolitonavidadrepetitivas;
import java.util.Scanner;
public class Ejercicio4ArbolitoNavidadRepetitivas {

    public static void main(String[] args) {
        //declarar la altura del arbol
        System.out.println("Ingrese la altura de su arbolito");
        Scanner teclado = new Scanner (System.in);
        int altura = teclado.nextInt();
        
        //bucle para recorrer todas las filas (altura)
        for(int fila=0; fila<altura; fila++){
    
            //bucle para los espacion
            for (int espacio=0;espacio < (altura-fila-1); espacio++){
                System.out.print(" ");
            }
            //bucle para los asteriscos **
            for (int asterisco=0; asterisco <(fila*2)+1; asterisco++){
                System.out.print("*");
            }
            //salto de linea
            System.out.println("");
        }
        
        //tronco
        int largoTronco = 2;
        for (int base=0; base<largoTronco ; base++){
            //bucle para los espacion en blanco
            for (int espacio=0;espacio<(altura-2);espacio++){
                System.out.print(" ");
            }
        
            //barritas tronco
            for (int tronco=0; tronco<3; tronco++){
                System.out.print("|");
            }
        System.out.println("");
        }
    }
}
