package reservadeasientos;

import java.util.Scanner;

public class ReservadeAsientos {

    public static void main(String[] args) {
        //declaracion de variables
        boolean bandera = false;
        char asientos[][] = new char[10][10];
        Scanner teclado = new Scanner(System.in);
        int fila = 0, asiento = 0;
        String respuesta, verMapa;

        //cargamos la matriz
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }

        //bienvenida al sistema
        System.out.println("-----------------BIENVENIDO AL SISTEMA DE RESERVAS-----------------");

        //reserva de asientos
        while (bandera != true) {
            //visualizacion de mapa
            System.out.println("¿Desea ver los asientos a Disponibles? S: Si, cualquier tecla para: No");
            verMapa = teclado.next();
            if (verMapa.equalsIgnoreCase("S")) {
                dibujarMapa(asientos);
            }

            //reserva
            boolean estaOk = false;
            while (estaOk != true) {
                System.out.println("Ingrese Fila y Asiento a reservar");
                System.out.print("Fila(entre 0 y 9): ");
                fila = teclado.nextInt();

                System.out.print("Asiento(entre 0 y 9): ");
                asiento = teclado.nextInt();

                if (fila <= 9 && fila >= 0) {
                    if (asiento <= 9 && asiento >= 0) {
                        estaOk = true;
                    } else {
                        System.out.println("El numero de asiento no es valido");
                    }
                } else {
                    System.out.println("El numero de fila no es valido");
                }
            }

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado con exito!!");
            } else {
                System.out.println("El asiento está ocupado. Por favor elija otro");
            }
            System.out.println("¿Desea finalizar la reserva? S: para Si y cualquier tecla para No");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }
        }

    }

    static void dibujarMapa(char asientos[][]) {
        for (int f = 0; f < 9; f++) {
            System.out.print(f + " ");
            for (int c = 0; c < 9; c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }

    }

}
