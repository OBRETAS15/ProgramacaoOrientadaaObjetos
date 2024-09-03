package com.poolistas.listasexercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolistas.lista2.Exercicio1;
import com.poolistas.lista2.Exercicio2;
import com.poolistas.lista2.Exercicio3;
import com.poolistas.lista2.Exercicio4;
import com.poolistas.lista2.Exercicio5;
import com.poolistas.lista2.Exercicio6;
import com.poolistas.lista2.Exercicio7;
import com.poolistas.lista2.Exercicio8;

@SpringBootApplication
public class ListasexerciciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListasexerciciosApplication.class, args);

		Exercicio8.resolucao2();
	}

}
