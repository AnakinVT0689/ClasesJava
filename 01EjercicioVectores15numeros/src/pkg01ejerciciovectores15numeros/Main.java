
package pkg01ejerciciovectores15numeros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int vector [] = new int [15];
        Scanner teclado = new Scanner (System.in);
        
        //Cargar nuestro vector
        for (int i=0;i<15;i++){
            System.out.println("Ingrese un numero al Vector:");
            vector[i] = teclado.nextInt();
        }
        
        //recorrer y contar cuantos nuemros 3 hay
        int cont = 0;
        for (int i=0;i<15;i++){
            if(vector[i] == 3){
            cont++;
            }
        }
        if (cont>0){
        System.out.println("La cantidad de numeros 3 que hay en el vector es: " + cont);
        }
        else{
            System.out.println("El numero 3 no se encontro");
        }
    }
    
}
