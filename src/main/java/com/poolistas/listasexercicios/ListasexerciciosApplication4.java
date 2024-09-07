package com.poolistas.listasexercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolistas.lista4.Exercicio1;
import com.poolistas.lista4.Exercicio2;
import com.poolistas.lista4.Exercicio3;
import com.poolistas.lista4.Exercicio4;
import com.poolistas.lista4.Exercicio5;
import com.poolistas.lista4.Exercicio6;
import com.poolistas.lista4.Exercicio7;


@SpringBootApplication
public class ListasexerciciosApplication4 {

	public static void main(String[] args) {
		SpringApplication.run(ListasexerciciosApplication.class, args);

		Exercicio7.resolucao();
	}

}