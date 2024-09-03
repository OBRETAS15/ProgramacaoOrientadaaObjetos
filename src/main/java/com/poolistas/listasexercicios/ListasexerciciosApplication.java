package com.poolistas.listasexercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolistas.lista2.Exercicio2;
import com.poolistas.lista2.Exercicio3;

@SpringBootApplication
public class ListasexerciciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListasexerciciosApplication.class, args);

		Exercicio3.resolucao2();
	}

}
