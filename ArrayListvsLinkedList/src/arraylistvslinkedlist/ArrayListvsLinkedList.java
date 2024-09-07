
package arraylistvslinkedlist;

   
    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;

public class ArrayListvsLinkedList {

   public static void main(String[] args) {
        List<Persona> listaArray = new ArrayList<Persona> ();
        listaArray.add(new Persona(1,"Alex", 35));
        listaArray.add(new Persona(2,"Gabriel", 30));
        listaArray.add(new Persona(3,"Ibra", 9));
        listaArray.add(new Persona(4,"TodoCode", 2));
        
        List<Persona> listaLinkedList = new LinkedList<Persona> ();
        listaLinkedList.add(new Persona(1,"Alex", 35));
        listaLinkedList.add(new Persona(2,"Gabriel", 30));
        listaLinkedList.add(new Persona(3,"Ibra", 9));
        listaLinkedList.add(new Persona(4,"TodoCode", 2));
   
        //remove en ArrayList
        listaArray.remove(1);
        
        //remove en LinkedList
        String nombreBorrar = "Gabriel";
        for (Persona persona2 : listaLinkedList){
            if (persona2.getNombre().equals(nombreBorrar)){
                listaLinkedList.remove(persona2);
                break; //corto que deje de recorrer
            }
        }
        
        System.out.println("------Luego de eliminar------");
        //recorrido por foreach
        System.out.println("------ArrayList-------");
            for(Persona persona:listaArray){
                System.out.println("prueba " + persona.getNombre());
            }
            
        System.out.println("------LinkedList-------");
            for(Persona persona:listaLinkedList){
                System.out.println("prueba " + persona.getNombre());
            }
            
            
         //tamaño de la lista
         System.out.println("--------Que tamaño tiene la lista?-------");
         System.out.println("ArrayList: " + listaArray.size());
         System.out.println("LinkedList: " + listaLinkedList.size());
         
         //Obtener primer Objeto
         System.out.println("-------Primer y Ultimo objeto (Solo en LinkedList)------------");
         
         System.out.println("Primero de LinkedList: " + listaLinkedList.getFirst().toString());
         System.out.println("Ultimo de LinkedList: " + listaLinkedList.getLast().toString());
         
         //borrar lista
         System.out.println("-----Borrado de listas---------");
         listaArray.clear();
         listaLinkedList.clear();
         
         //comprobar si esta vacia
         System.out.println("--------Esta Vacia la Lista?-----------");
         System.out.println("ArrayList: " + listaArray.isEmpty());
         System.out.println("LinkedList: " + listaLinkedList.isEmpty());
   }
}
