import java.util.Scanner;

public class Uri1003{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        // define variaveis
        int A, B, Soma;
        
        // entrada de dados
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento
        Soma = A + B;

        // saida
        System.out.println("SOMA = "+Soma);

    }

}