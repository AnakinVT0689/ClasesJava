
package Logica;

public class POO {

    
    public static void main(String[] args) {

        Alumno alu1 = new Alumno ();
        Alumno alu2 = new Alumno (5, "Luisina", "de Paula", "misiones #5", "05/01/1991", "33-55-44-88-55");
        
        
        System.out.println("La id del Alumno 2 es: " +  alu2.getId());
        System.out.println("El nombre es; " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
        alu1.setId(8);
        alu1.setNombre("Suscribite");
        alu1.setApellido("TodoCode");
        
        System.out.println("---------------------------------------");
        System.out.println("La id del Alumno 1 es: " +  alu1.getId());
        System.out.println("El nombre es; " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
        
        alu2.setId(35); 
        System.out.println("---------------------------------------");
        System.out.println("La id del Alumno 2 es: " +  alu2.getId());
        System.out.println("El nombre es; " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
       
    }
    
}
