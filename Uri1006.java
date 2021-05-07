import java.util.Scanner;

public class Uri1006{
    public static void main(String arg[]){
    Scanner teclado = new Scanner(System.in);

    // define variaveis
    Double A, B, C, Media;

    // entrada de dados
    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();

    // processamento
    Media = ((A*2) + (B*3) + (C*5)) / (2+3+5);

    // saida
    System.out.printf("MEDIA = %.1f\n",+Media);
    }
}