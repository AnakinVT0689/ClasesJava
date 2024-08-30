package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Suscribite", "TodoCode");
        
        System.out.println("Id: " + alu2.getId());
        System.out.println("nombre "+ alu2.getNombre());
        System.out.println("apellido " + alu2.getApellido());
    }
    
}
