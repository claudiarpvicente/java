import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, novoSalario, reajustes;
        int percentual;

        salario = teclado.nextDouble();
       

        if (salario <= 400.00){
            percentual = 15;
            
            System.out.printf("Novo salario: %.2f\n",(salario * (percentual/100)) + salario);
        }
        //else if (salario <= 800.00){
          //  percentual = 12;
        //}
        //else if (salario <= 1200.00){
         //   percentual = 10;
        //}
        //else if (salario <= 2000.00){
        //    percentual = 7;
        //}
        //else if (salario > 2000.00){
        //    percentual = 4;
        //}
         //   System.out.println("Novo salario: ",+salario);
        
        

    }
}



