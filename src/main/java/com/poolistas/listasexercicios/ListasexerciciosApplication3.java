package com.poolistas.listasexercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolistas.lista3.Exercicio1;

@SpringBootApplication
public class ListasexerciciosApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(ListasexerciciosApplication.class, args);

		Exercicio1.resolucao();
	}

}
