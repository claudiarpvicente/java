import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // define variaveis
        int horas, veloc, distancia;
        double litros, consumo;

        // entrada de dados
        horas = teclado.nextInt();
        veloc = teclado.nextInt();
        consumo = 12;
        
        // processamento
        distancia = horas * veloc;
        litros = distancia / consumo;
        
        // saida
        System.out.printf("%.3f\n",+litros);
        
        
    }
}