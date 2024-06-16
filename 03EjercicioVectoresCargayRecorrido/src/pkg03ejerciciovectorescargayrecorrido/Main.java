
package pkg03ejerciciovectorescargayrecorrido;


public class Main {

    public static void main(String[] args) {
        //Vector que guarde una serie de 8 nombres
        String vector[] = new String [8];
        
        //asignacion manual de los valores
        vector [0] = "Alejandra";
        vector [1] = "Ludmila";
        vector [2] = "Gabriel";
        vector [3] = "Rosa";
        vector [4] = "Luisina";
        vector [5] = "Daniel";
        vector [6] = "Loki";
        vector [7] = "Lumel";
        
        //recorrido
        for (int i=0; i<vector.length;i++){
            System.out.println("En la posicion: "+i+" Esta el nombre "+vector[i]);        
        }
    }
    
}
