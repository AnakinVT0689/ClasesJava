
package pruebahashmap;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {
        Map<Integer,String> mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(153, "Suscribite a TodoCode");
        mapaEmpleados.put(154, "Ibra El Yorkie");
        mapaEmpleados.put(155, "Juan Perez");
        mapaEmpleados.put(157, "Hola a todos");
        mapaEmpleados.put(158, "Avril Lavigne");
        
        /*boolean estaono = mapaEmpleados.containsKey(153);
        
        if(estaono==true){
            System.out.println("El valor buscado esta");
        }
        else{
            System.out.println("El Valor buscado no esta");
        }
        
        System.out.println(mapaEmpleados.keySet()); 
        
        String nombre = mapaEmpleados.get(154);
        System.out.println("El empleado buscado es: " + nombre); */
        
        mapaEmpleados.remove(157);
        
    }
    
}
