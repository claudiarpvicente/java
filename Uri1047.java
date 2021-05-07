import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, mI, hF, mF, tempoI, tempoF, dur, durH, durM;

        hI = teclado.nextDouble();
        mI = teclado.nextDouble();
        hF = teclado.nextDouble();
        mF = teclado.nextDouble();
       
        tempoI = hI * 60 + mI;
        
        
        if (dur <= 0){
            
            dur = dur + 24;
        }
        System.out.println("O JOGO DUROU "+dur+" HORA(S)");
             
        

    }
}




