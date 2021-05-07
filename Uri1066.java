import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        int qpares = 0;
        int qimpares = 0;
        int qpos = 0;
        int qneg = 0;

        for (int i = 0; i < 5; i++){
            X = teclado.nextInt();
            if (X % 2 == 0) qpares++;
            else qimpares++;
            if (X > 0) qpos++;
            else if (X < 0) qneg++;
        }

        System.out.println(qpares + " valor(es) par(es)"); 
        System.out.println(qimpares + " valor(es) impar(es)");
        System.out.println(qpos + " valor(es) positivo(s)");
        System.out.println(qneg + " valor(es) negativo(s)");
           
  
    }
}