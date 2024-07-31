    
package Logica;

public class Alumno {
    
    int id;
    String nombre;
    String apellido;
    String direccion;
    String fecha_nac;
    String telefono;

    //*constructor vacio
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, String direccion, String fecha_nac, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public  void mostrarNombre(){
        System.out.println("Hola, soy un Alumno y se decir mi nombre");
    }

}
