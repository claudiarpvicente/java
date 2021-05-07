import java.util.Scanner;

public class Uri1001{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        // definine variaveis
        int A, B, X;
        

        // entrada de dados
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento
        X = A + B;

        //saida
        System.out.println("X = " +X);

        
    }
}