
package sentenciaif;

public class SentenciaIF {


    public static void main(String[] args) {
        
        int num1 = 17;
        int num2 = 17;
        
        if (num2> num1){
            System.out.println("El numero num2 es mayor al num1");
        }
        else {
            if (num1 == num2 ){
                System.out.println("Son iguales");
            } 
            else {
                System.out.println("El num1 es mayor al num2");
            }
        }
    }
}
