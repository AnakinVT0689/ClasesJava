package ejercicioenglishschool;

import java.util.Scanner;

public class EjercicioEnglishSchool {

    public static void main(String[] args) {

        //declaracion de variables
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("******BIENVENIDO A ENGLISH SCHOOL******");
        System.out.println("Ingrese la edad del alumno: ");
        edad = teclado.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("El horario del grupo KINDER, es Lunes y Miercoles de 16:00 a 17:00 Hrs.");
        } else {
            if (edad >= 7 && edad <= 8) {
                System.out.println("El horario del grupo 1st year, es Martes y Jueves de 16:30 a 17:30 Hrs.");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("El horario del grupo 2nd year, es Martes y Jueves de 17:30 a 19:00 Hrs.");
                } else {
                    if (edad >= 11 && edad <= 13) {
                        System.out.println("El horario del grupo 3rd year, es Martes y Jueves de 17:00 a 18:30 Hrs.");
                    } else {
                        System.out.println("Ingreso una edad que no corresponde");
                    }
                }
            }
        }
    }
}
