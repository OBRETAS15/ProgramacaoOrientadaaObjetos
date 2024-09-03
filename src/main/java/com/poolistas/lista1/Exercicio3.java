package com.poolistas.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        Scanner scanner1 = new Scanner(System.in);

        double n1, valor;

        System.out.println("Digite o valor em reais($): ");
        n1 = scanner1.nextDouble();

        valor = n1 / 5.25;
        String resultado = String.format("%.2f", valor);

        System.out.println( "(US$): " + resultado + " Dolares.");
    }
}
