package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1,"Alex", 35));
        lista.add(new Persona(2,"Gabriel", 30));
        lista.add(new Persona(3,"Ibra", 9));
        lista.add(new Persona(4,"TodoCode", 2));
    
        System.out.println("-----------FOR-------------");
        //recorrer por indice
        for (int i=0; i<lista.size(); i++){
            System.out.println("prueba: "+ lista.get(i).getNombre());
        }
        
        
        System.out.println("-----------FOREACH-------------");
        //recorrido foreach
        for (Persona perso:lista){
            System.out.println("prueba: " + perso.getNombre());
        }
    }
}
