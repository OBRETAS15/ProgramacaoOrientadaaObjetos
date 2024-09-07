package com.poolistas.lista4;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio7 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        int opcao;
        double valor;

        do{
            System.out.println("\nLista de compras");
            System.out.println("O que você deseja ?");
            System.out.println("**************************");
            System.out.println("1 - Inserir item na lista");
            System.out.println("2 - Ver lista de compras");
            System.out.println("3 - Remover item da lista");
            System.out.println("4 - Sair");
            opcao = leia.nextInt();
        
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite um item para adicionar: ");
                    String item = leia.nextLine();
                    listaDeCompras.add(item);

                    //Recebe valor do item
                    System.out.println("Digite o valor do item: ");
                    valor = leia.nextDouble();
                    listaDePrecos.add(valor);

                    System.out.println("Item adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("\nSua Lista de Compras:");
                    System.out.println("  Item  "+ "    Preco");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i +1 ) + "- " + listaDeCompras.get(i) + "    R$ " + listaDePrecos.get(i));
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o número do item que deseja remover da lista: ");
                    int removerItem = leia.nextInt();
                    leia.nextLine();

                    if (removerItem > 0 && removerItem <= listaDeCompras.size() && removerItem <= listaDePrecos.size()) {
                        listaDeCompras.remove(removerItem - 1);
                        listaDePrecos.remove(removerItem - 1);
                        System.out.println("Item removido com sucesso!");
                    } else {
                        System.out.println("ERRO: O item não existe.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

       }
}