import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // define variaveis
        int X;
        double Y, consumo;

        // entrada de dados
        X = teclado.nextInt();
        Y = teclado.nextDouble();
        
        // processamento
        consumo = X / Y;
        
        // saida
        // System.out.printf("%.3f km/l\n",+consumo);
        System.out.printf("%.3f",+consumo);
        System.out.println(" km/l");
        
    }
}