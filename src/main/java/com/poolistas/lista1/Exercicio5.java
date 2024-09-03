package com.poolistas.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){
        Scanner scanner1 = new Scanner(System.in);

        double area, metro_Q;

        System.out.print("Digite a area do terreno:");
        area = scanner1.nextDouble();
        System.out.print("Digite a area do Metro²:");
        metro_Q = scanner1.nextDouble();

        double valor =  area * metro_Q;
        

        System.out.printf("O valor do terreno é(R$):%.2f " ,valor);





    }

}
