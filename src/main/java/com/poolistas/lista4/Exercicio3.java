package com.poolistas.lista4;

import java.util.Scanner;

public class Exercicio3 {
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

        double menorValor = vendas[0];
        double maiorValor = vendas[0];

        for (double venda : vendas) {
            soma += venda;
            
            if(venda < menorValor){
                menorValor = venda;
            }

            if(venda > maiorValor){
                maiorValor = venda;
            }
        }

        double ticketMedio = (soma / nVendas);

        System.out.print("\nO total das vendas foi: R$" + soma+ "\n");

        System.out.print("\nA menor venda foi: R$" + menorValor+ "\n");
        System.out.print("\nA maior venda foi: R$" + maiorValor+ "\n");

        System.out.print("\nO ticket médio de vendas do dia foi: R$" + ticketMedio+ "\n");

        System.out.println("Programa encerrado.");
        System.out.println("\n\n\n\n");
    }
}