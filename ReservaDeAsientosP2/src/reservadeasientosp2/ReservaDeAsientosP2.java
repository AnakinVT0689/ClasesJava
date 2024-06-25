
package reservadeasientosp2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import reservadeasientosp2.logica.Cliente;
import reservadeasientosp2.logica.Ticket;

public class ReservaDeAsientosP2 {

    public static void main(String[] args) {
        //creo estructura de datos
        List<Ticket> listaTickets = new ArrayList<Ticket>();
        
        //creo ticket
        Ticket ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(13, 2, 4, 1500, new Date(), new Date());
        
        //creo ticket mediante constructor vacio y aplico encapsulamiento
        Ticket ticket3 = new Ticket();
        ticket3.setNumero(20);
        ticket3.setFila(5);
        ticket3.setAsiento(1);
        ticket3.setPrecio(2300);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        
        //agrego elemento a la lista
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        
        //Suma de precios
        double suma = 0;
        
        for (Ticket tick : listaTickets){
            suma = suma + tick.getPrecio();
        }
        
        System.out.println("La suma de precios es de: " + suma);
        
        //pedir fila al usuario
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese la fila de la que desea ver tickets");
        int fila = teclado.nextInt();
        
        boolean bandera = false;
        
        for (Ticket tick : listaTickets){
            if (tick.getFila()==fila){
                System.out.println(tick.toString());
                bandera = true;
        }
        
        }
        if (bandera == false){
            System.out.println("No se encontro datos de la fila en cuestion");
        }
        
        //prueba de cliente
        Cliente cli = new Cliente();
        cli.setId(1);
        cli.setNombre("Suscribite");
        cli.setApellido("A TodoCode");
        cli.setDni("1234567");
        cli.getListaTickets().add(ticket1);
        
        Ticket ticket4 = new Ticket(12, 2, 6, 2000, new Date(2023-10-12), new Date());
        cli.getListaTickets().add(ticket4);
        
        
        
    }

}
