package CursoBasico;
public class JavBasicoLoopWhile {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        while(i < max){
            System.out.println("Valor de i: " + i);
            i++;
        }do{
            i++;
            System.out.println("Valor de i: " + i);
        }while(i<13);

        System.out.println("Valor de apos o uso do do while: " + i);
    }

}
