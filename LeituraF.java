import java.util.Scanner;

public class LeituraF{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double altura, largura, profundidade, volume;

        // entrada de dados
        System.out.println("Por favor, digite o valor da altura:");
        altura = teclado.nextDouble();
        System.out.println("Por favor, digite o valor da largura:");
        largura = teclado.nextDouble();
        System.out.println("Por favor, digite o valor da profundidade:");
        profundidade = teclado.nextDouble();


        // processamento
        volume = altura * largura * profundidade;

        //saida
        System.out.println("O valor da volume do paralelepipedo: " + volume);
        
    }
}