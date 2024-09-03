package com.poolistas.lista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao2(){
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = scanner1.nextInt();

        System.out.println("Digite outro número: ");
        double numero2 = scanner1.nextInt();
        if(numero1%numero2 == 0){
            System.out.println("Número "+numero1+" é divisivel por "+numero2);
        }
        else if(numero2%numero1 == 0){
            System.out.println("Número "+numero1+" é divisivel por "+numero2);
        }
        else{
            System.out.println("Números informados não são divisiveis.");
        }

    scanner1.close();
    }
}    