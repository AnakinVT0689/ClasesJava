
package ejgenerics;

import ejgenerics.Logica.Caja;

public class EjGenerics {

    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Suscribite a TodoCode");
        String contenido = cajaString.obtenerAlgo();
        
        System.out.println("El contenido es: " + contenido);
        
        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(32);
        Integer numero = cajaEnteros.obtenerAlgo();
        
        System.out.println("El contenido es: " + numero);
    }
    
}
