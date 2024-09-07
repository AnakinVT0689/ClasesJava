package com.mycompany.ejemploenum;

import com.mycompany.ejemploenum.enums.Color;

public class EjemploEnum {
        
    public static void main(String[] args) {
      
        /*Color color = Color.ROJO;
        
        System.out.println("El Color es: " + color);
        */
        
        for (Color color : Color.values()){
            System.out.println("El color es: " + color);
        }
        
        Color col = Color.AZUL;
        
        System.out.println(col.name());
        System.out.println(col.ordinal());
       
        try{
        col = Color.valueOf("AZUL");
        System.out.println("Encontre: " + col);
        } catch (IllegalArgumentException e){
            System.out.println("Ocurrio un Excepcion. El valor no es correcto");
        }
        
    }
}
