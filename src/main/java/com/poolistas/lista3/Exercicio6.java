package com.poolistas.lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){

        System.out.println("Digite a altura da pirâmide: ");
        Scanner Scanner1 = new Scanner(System.in);
        int altura = Scanner1.nextInt();
        System.out.print("\n");
        
        for (int i = 0; i < altura; i++) {
            //espaços antes dos asteriscos
            for (int j = altura - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            
            //asteriscos
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}