
package com.mycompany.excepciones;

public class Excepciones {

    public static void main(String[] args) {
        
        
     System.out.println("----------Exception personalizada de una division por cero---wwqwWxsxasxsadddsadsadsadsadsad-----");
     try {
        int edades = 3/0;
     }
     catch (Exception e){
         System.out.println("No se puede dividir por cero");
     }
        System.out.println(" ");
     System.out.println("------Exception personalizada de desbordamiento de un arrego-----");
     int edades [] = {15,12,23,30};
     
     try {
        System.out.println("La edad de la posicion 4 es: " + edades [4]);
     }
     catch(Exception e){
         System.out.println("Intentaste acceder a un indice que no existe!");     
     }
    }
}
