    package com.poolistas.lista3;

    import java.util.Scanner;

    public class Exercicio3 {

    public static void resolucao(){

    Scanner Scanner1 = new Scanner(System.in);

    int numero1 ;
    int numero2;

    System.out.print("Digite o primeiro número:");
    numero1= Scanner1.nextInt();

    System.out.print("Digite o segundo número:");
    numero2= Scanner1.nextInt();

    int maior =0;
    int menor =0; 

    if (numero1 < numero2){
        maior = numero2;
        menor = numero1;
    }
    if (numero2 < numero1){
    maior = numero1;
    menor = numero2;
    }

    for (int i = menor; i <= maior; i++) {
        if (i % 2 == 0){
                System.out.print(i + " ");
                
            }
            
        } 

    }
    }