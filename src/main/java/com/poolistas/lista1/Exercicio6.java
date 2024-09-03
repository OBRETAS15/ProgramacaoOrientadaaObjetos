package com.poolistas.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){
        Scanner scanner1 = new Scanner(System.in);

        float dist_Percorrida, total_Gasto;

        System.out.println("Digite a distancia percorrida (Km): ");
        dist_Percorrida = scanner1.nextFloat();
        System.out.println("Digite o total gasto de combustivel (L): ");
        total_Gasto = scanner1.nextFloat();

        float consumo_Medio = dist_Percorrida/total_Gasto;
         
        System.out.printf("Consumo medio do carro em (Km/l):%.2f " ,consumo_Medio);
    }
}