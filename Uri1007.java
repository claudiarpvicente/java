import java.util.Scanner;

public class Uri1007{
    public static void main(String arg[]){
    Scanner teclado = new Scanner(System.in);

    // define variaveis
    int A, B, C, D, Dif;

    // entrada de dados
    A = teclado.nextInt();
    B = teclado.nextInt();
    C = teclado.nextInt();
    D = teclado.nextInt();

    // processamento
    Dif = ((A*B)-(C*D));

    // saida
    System.out.println("DIFERENCA = "+Dif);

    }
}