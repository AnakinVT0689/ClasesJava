
package ejerciciointercambiovalores;


public class EjercicioIntercambioValores {

    public static void main(String[] args) {
           
        int num1, num2, aux;
        num1 = 35 ;
        num2 = 20;
        
        System.out.println("--------------ANTES------------");
        System.out.println("NUM1: " + num1);
        System.out.println("NUM2: " + num2);
        
        aux = num1; //**aux = 35
	num1 = num2; //**num1 = 20
	num2 = aux; //**num2 = 35
        
        System.out.println("--------------DESPUES------------");
        System.out.println("NUM1: " + num1);
        System.out.println("NUM2: " + num2);

    }
    
}
