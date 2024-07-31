package pkg05ejerciciovectorezrellenadomatriz;
public class Main {

    public static void main(String[] args) {
        
        //crear matriz
        int matriz[][] = new int[4][4];
        
        //rellenamos con números 5
        for (int f=0;f<4;f++){
            for (int c=0;c<4;c++){
                if (f!=c){
                matriz[f][c] = 1;
                }
                else{
                matriz[f][c] = 0;
                }
            }
        }
         
        //mostrar en pantalla
        for (int f=0;f<4;f++){
            for (int c=0;c<4;c++){
                System.out.print(matriz[f][c]);
            }
            System.out.println("");
        }
        
    }
    
}
