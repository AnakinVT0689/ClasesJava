
package ejerciciointegradorrepestacion;

import java.util.Scanner;


public class EjercicioIntegradorRepEstacion {


    
    public static void main(String[] args) {
        /**
        Varios Clientes
        El programa debe solicitar por teclado dos datos:
        La patente del vehiculo
        El tipo de estacionamiento
        **/
        
        String patente="";
        int tipoServicio, cantHoras, cont1=0, cont2=0, cont3=0;
        double total, totalDia=0;
        Scanner teclado = new Scanner (System.in);
        
        
        /*El programa debe calcular el monto a pagar para cada cliente en funcion
        del tipo de estacionamiento seleccionado. La carga de datos debe
        continuar hasta que el usuario ingrese la palabra "FIN" en lugar de la
        patente*/
        while(!patente.equalsIgnoreCase("fin")){
            System.out.println("Ingrese la patente de su vehiculo");
            patente = teclado.nextLine();
            
            if(!patente.equalsIgnoreCase("fin")){
            
            System.out.println("Ingrese el tipo de Servicio");
            System.out.println("1 - Por hora");
            System.out.println("2 - Media Jornada(5 Horas)");
            System.out.println("3 - Jornada completa (Hasta 10 horas)");
            teclado = new Scanner (System.in);
            tipoServicio = teclado.nextInt();
            
            if (tipoServicio <=0 || tipoServicio>3){
                System.out.println("No ingreso un tipo de servicio correcto");
            }
            else{
            /*Los tipos de  estacionamiento disponibles son 3:
                -Por hora (cuyo valor es de $3 USD por hora)
                -Media jornada (cuyo valor total es de $ 15 USD y posse 5% de descuento)
                -Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento)
                */
                if (tipoServicio==1){
                    System.out.println("Ingrese la cantidad de horas que desea estacionar");
                    cantHoras = teclado.nextInt();
                    total = cantHoras*3;
                    System.out.println("El total de su estacionamiento es de: $ "+total+" USD");
                    cont1++;
                    totalDia=totalDia+total;
                }
                else{
                    if(tipoServicio ==2){
                        System.out.println("El servicio de media jornada corresponde a 5 hrs y posee 5 %");
                        total = 15 - (15*.05);
                        System.out.println("El total de su estacionamiento es de: $ "+total+ " USD");
                        cont2++;
                        totalDia=totalDia+total;
                    }
                    else{
                        System.out.println("El servicio de media jornada corresponde a 10 hrs y posee 10 %");
                        total = 30 - (30*.1);
                        System.out.println("El total de su estacionamiento es de: $ "+total+ " USD");
                        cont3++;
                        totalDia=totalDia+total;
                    }
                }
                System.out.println("*******************MUCHAS GRACIAS POR SU COMPRA!*****************\n");
            }
            
            
            teclado= new Scanner(System.in);
            }    
        }
        
        
        
        System.out.println("====================================================");
        System.out.println("Totales Monetarios del dia");
        System.out.println("Cantidad Servicios por hora: "+ cont1);
        System.out.println("Cantidad Servicios de Media Jornada: "+ cont2);
        System.out.println("Cantidad Servicios de Jornada Completa: "+ cont3);
        System.out.println("El monto total recaudado en el dia es de: $ " + totalDia + " USD");
    }
    
}
