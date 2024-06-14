package com.javabasico;

import java.util.Scanner;

public class JavaBasicoIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();
        
        if(nota <= 2){
            System.out.println("Reprovado");
        } else if (nota > 2 && nota < 6){
            System.out.println("Recuperação");
        } else{
            System.out.println("Aprovado");
        }

    }

}
