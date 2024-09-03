package com.poolistas.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){

        int n1;

        System.out.print("Digite um número: \n");
        Scanner scanner1 = new Scanner(System.in);
        n1 = scanner1.nextInt();

        System.out.print("O antecessor é: "+(n1-1)+ "\nE o sucessor é: "+(n1+1));
    }

}
