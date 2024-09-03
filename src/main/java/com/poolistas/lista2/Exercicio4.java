package com.poolistas.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao2(){
        Scanner scanner1 = new Scanner(System.in);
        String condicao, nome;
        int idade;

        System.out.println("Nome: ");
        nome = scanner1.nextLine();

        System.out.println("Idade: ");
        idade = scanner1.nextInt();

        if(idade >= 16 && idade <= 18){
            System.out.println("Acesso somente acompanhado pelo responsável.");
        }
        else if(idade > 18){
            System.out.println("Acesso Liberado.");
        }
        else{
            System.out.println("Acesso Negado.");
        }

        scanner1.close();
    }     

}