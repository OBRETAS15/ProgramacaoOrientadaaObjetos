//1) Escreva um programa que faça a soma entre 2 números.
package com.poolistas.lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {

        int n1, n2;

        System.out.print("Digite o primeiro numero: ");
        Scanner scanner1 = new Scanner(System.in);
        n1 = scanner1.nextInt(); // leia o próximo inteiro

        System.out.println("Digite o segundo numero: ");
        n2 = scanner1.nextInt();

        System.out.println("A soma é = "+(n1+n2));

    }

}