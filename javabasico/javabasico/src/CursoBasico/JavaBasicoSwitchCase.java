package CursoBasico;
import java.util.Scanner;

public class JavaBasicoSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entr com um dia da semana: ");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
            System.out.println("Domingo");                
                break;
            case 2:
            System.out.println("Segunda");                
                break;
                 case 3:
            System.out.println("Terça");                
                break;
            case 4:
            System.out.println("Quarta");                
                break;
                case 5:
            System.out.println("Quinta");                
                break;
                case 6:
            System.out.println("Sexta");                
                break;
                case 7:
            System.out.println("Sabado");                
                break;                
                       
            default://Se todos derem falso executa 
            System.out.println("Não é um dia valido");
                break;
        }
    }

}
