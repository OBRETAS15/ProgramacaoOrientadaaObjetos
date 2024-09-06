package com.poolistas.lista4;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {

        int nVendas;
        double soma = 0;
        Scanner leia = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("Bem-vindo ao sistema de vendas!");
        System.out.print("\nPor favor digite quantas vendas foram realizadas hoje: ");
        nVendas = leia.nextInt();
        System.out.print("\n");
        double[] vendas = new double[nVendas];

        for (int i = 0 ; i < nVendas ; i++) {
            System.out.print("Digite o valor da " + (i+1) + "° venda" + ": ");
            vendas[i] = leia.nextDouble();
            
        }
        for (double venda : vendas) {
            soma += venda;    
        }
        System.out.print("\nO total das vendas foi: R$" + soma+ "\n\n");
        System.out.println("Programa encerrado.");
        System.out.println("\n\n\n\n");
    }
}