import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        int cont = 0;

        for (int i = 0; i < 5; i++){
            X = teclado.nextInt();
            if (X % 2 == 0) cont++;

        }
        System.out.println(cont + " valores pares"); 
           
  


    }
}