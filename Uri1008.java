import java.util.Scanner;

public class Uri1008{
    public static void main(String arg[]){
    Scanner teclado = new Scanner(System.in);

    // define variaveis
    int Number, Horas;
    double Valor, Salary;

    // entrada de dados
    Number = teclado.nextInt();
    Horas  = teclado.nextInt();
    Valor  = teclado.nextDouble();

    // processamento
    Salary = Horas * Valor;

    // saida
    System.out.println("NUMBER = "+Number);
    System.out.printf("SALARY = U$ %.2f\n",+Salary);


    }
}