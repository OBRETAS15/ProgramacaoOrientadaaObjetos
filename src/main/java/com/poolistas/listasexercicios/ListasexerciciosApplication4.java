package com.poolistas.listasexercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolistas.lista4.Exercicio1;
import com.poolistas.lista4.Exercicio2;
import com.poolistas.lista4.Exercicio3;
import com.poolistas.lista4.Exercicio4;


@SpringBootApplication
public class ListasexerciciosApplication4 {

	public static void main(String[] args) {
		SpringApplication.run(ListasexerciciosApplication.class, args);

		Exercicio4.resolucao();
	}

}