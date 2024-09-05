package com.poolistas.listasexercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolistas.lista3.Exercicio1;
import com.poolistas.lista3.Exercicio2;
import com.poolistas.lista3.Exercicio3;

@SpringBootApplication
public class ListasexerciciosApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(ListasexerciciosApplication.class, args);

		Exercicio3.resolucao();
	}

}
