package com.poolistas.lista3;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){

            int largura;
            int altura;
            
            System.out.println("Altura: ");
            Scanner Scanner1 = new Scanner(System.in);
            altura = Scanner1.nextInt();
    
            System.out.println("Largura: ");
            largura = Scanner1.nextInt();
            
            for (int j = 0; j < altura; j++) {
                for (int i = 0; i < largura; i++) {
                    System.out.print("*");
                }  
                System.out.println();
            }


        }

}