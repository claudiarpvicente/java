import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X =  teclado.nextInt();
        
        if (X % 2 == 0){
            X++;
        }
        

        for (int i = 1; i <= 6; i++){
            System.out.println(X); 
            X = X + 2;
        
        }

        
         
  
    }
}