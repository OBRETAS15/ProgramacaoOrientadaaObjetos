package com.poolistas.lista3;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){

            int largura;
            int altura;
            
            System.out.println("Altura: ");
            Scanner scanner1 = new Scanner(System.in);
            altura = scanner1.nextInt();
    
            System.out.println("Largura: ");
            largura = scanner1.nextInt();
            
            for (int j = 0; j < altura; j++) {
                for (int i = 0; i < largura; i++) {
                    System.out.print("*");
                }  
                System.out.println();
            }


        }

}