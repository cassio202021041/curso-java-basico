package CursoBasico;
import java.util.Scanner;

public class JavaBasicoBreak {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um numero: ");
        int num = scan.nextInt();

        System.out.println("Entre com o limite maximo: ");
        int max = scan.nextInt();

        for (int i=num; i<=max; i++){
            //System.out.println(i);  

            if (i % 7 == 0){

                System.out.println("O valor de I é: " + i);
            
                break;//Para o for no primeito divisor de 7
            }

           
        }
    }

}
