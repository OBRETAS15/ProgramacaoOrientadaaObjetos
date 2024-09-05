package com.poolistas.lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){

        int numero;
        int numeroPalpite;

        Scanner Scanner1 = new Scanner(System.in);
        numero = Scanner1.nextInt();

        do{
            System.out.println("Tente adivinhar o número digitado: ");
            numeroPalpite = Scanner1.nextInt();

            if (numeroPalpite == numero){
                System.out.println("Parabéns! Você acertou.");

            }else if (numeroPalpite == (numero - 1) || numeroPalpite == (numero + 1)){
                System.out.println("Está quente!");
            
            }else{
                System.out.println("Tá frio!");
            }
        
        }while(numeroPalpite != numero);
    }
}
