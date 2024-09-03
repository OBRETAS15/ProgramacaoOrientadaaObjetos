package com.poolistas.listasexercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolistas.lista1.Exercicio1;

@SpringBootApplication
public class ListasexerciciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListasexerciciosApplication.class, args);

		Exercicio1.resolucao();
	}

}
