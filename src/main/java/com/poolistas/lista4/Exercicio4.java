package com.poolistas.lista4;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){

        Scanner leia = new Scanner(System.in);

        int lista[] = {3,5,6,7,8,10,22,55,110};
        int contPar = 0;

        for (int nPar : lista){

            if (nPar % 2 == 0){
                contPar++;
            }
            
        }

        System.out.println("A quantidades de números pares presentes é: " + contPar + ".");
    }
}
