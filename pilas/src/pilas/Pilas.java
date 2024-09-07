package pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Pila vacia: " + pila);
        System.out.println("Esta vacia? " + pila.isEmpty());
        
        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //recorrido
        for (Integer pilita : pila){
            System.out.println(pilita);
        }
        
        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila Vacia? " + pila.isEmpty());
        
        pila.pop(); //eliminar el ultimo registro que entro
        System.out.println("Esta es el 3? " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());
    }
    
}
