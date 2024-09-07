package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        
        Auto aut = new Auto ();
        aut.setId(1L);
        aut.setMarca("Reanult");
        aut.setModelo("Duster");
    
        List<Propietario> listaPropietarios = new ArrayList <Propietario>();
        
        Propietario prop1 = new Propietario ();
        Propietario prop2 = new Propietario ();
        Propietario prop3 = new Propietario ();
        
        prop1.setId(35L);
        prop1.setNombre("Luisina");
        prop1.setApellido("de Paula");
        
        prop2.setId(23L);
        prop2.setNombre("Suscribite");
        prop2.setApellido("A TodoCode");
        
        prop3.setId(21L);
        prop3.setNombre("me gusta");
        prop3.setApellido("A este video");
        
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        listaPropietarios.add(prop3);
        
        aut.setListaPropietarios(listaPropietarios);
        
        System.out.println("El Auto " + aut.getMarca() + " " + aut.getModelo() + "tiene como propietarios a: " + aut.getListaPropietarios().toString());
        
    }
    
}
