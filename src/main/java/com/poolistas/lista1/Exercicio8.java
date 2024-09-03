package com.poolistas.lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {
        Scanner scanner1 = new Scanner(System.in);

        float fahrenheit;

        System.out.println("Digite a temperatura em fahrenheit: ");
        fahrenheit = scanner1.nextFloat();

        double celsius = ((fahrenheit - 32) / 1.8);

        System.out.println("A temperatura em Celsius é: "+ celsius);
    }
}