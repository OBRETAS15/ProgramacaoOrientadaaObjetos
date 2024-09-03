package com.poolistas.lista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao2(){
        Scanner scanner1 = new Scanner(System.in);
        String login ="Junior1505";
        String senha ="1505junior";
        String verificaLogin;
        String verificaSenha;

        System.out.println("Login: ");
        verificaLogin = scanner1.nextLine();

        System.out.println("Senha: ");
        verificaSenha = scanner1.nextLine();

        if(!verificaLogin.equals(login)){
            System.out.println("Login incorreto!");
        }
        else if (!verificaSenha.equals(senha)){
            System.out.println("Senha incorreta!");
        }
        else{
            System.out.println("Bem vindo ao sistema!");
        }
        
    scanner1.close();    
    }

}