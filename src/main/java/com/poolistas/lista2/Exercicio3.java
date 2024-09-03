package com.poolistas.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao2(){
        Scanner scanner1 = new Scanner(System.in);
        String condicao,nome;
        int idade;

        System.out.println("Digite seu seu nome: ");
        nome = scanner1.nextLine();

        System.out.println("É deficiente ou gestante: ");
        condicao = scanner1.nextLine();

        System.out.println("Idade do cliente: ");
        idade = scanner1.nextInt();

        if(idade > 65 || condicao.equalsIgnoreCase("gestante")|| condicao.equalsIgnoreCase("deficiente")){
            System.out.println("Preferêncial");
        }
        else{
            System.out.println("Comum");}


        scanner1.close();
    }

}