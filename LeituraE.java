import java.util.Scanner;

public class LeituraE{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double baseMaior, baseMenor, altura, area;

        // entrada de dados
        System.out.println("Por favor, digite o valor da base maior:");
        baseMaior = teclado.nextDouble();
        System.out.println("Por favor, digite o valor da base menor:");
        baseMenor = teclado.nextDouble();
        System.out.println("Por favor, digite o valor da altura:");
        altura = teclado.nextDouble();


        // processamento
        area = (baseMaior + baseMenor) * altura /2;

        //saida
        System.out.println("O valor da area do trapezio: " + area);
        
    }
}