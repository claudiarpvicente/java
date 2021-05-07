import java.util.Scanner;

public class LeituraC{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double base, altura, area;

        // entrada de dados
        System.out.println("Por favor, digite o valor da base:");
        base = teclado.nextDouble();
        System.out.println("Por favor, digite o valor da altura:");
        altura = teclado.nextDouble();

        // processamento
        area = base * altura /2;

        //saida
        System.out.println("O valor da area do triangulo: " + area);
        
    }
}