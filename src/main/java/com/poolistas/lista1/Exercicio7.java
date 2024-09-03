package com.poolistas.lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){

        float nota_1;
        float nota_2;
        float nota_3;
        float nota_4;

       
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota_1 = scanner1.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota_2 = scanner1.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota_3 = scanner1.nextFloat();

        System.out.println("Digite a quarta nota: ");
        nota_4 = scanner1.nextFloat();

        
        System.out.println("A média do aluno é: "+ ((nota_1+nota_2+nota_3+nota_4)/4));

    }
}
