package com.treinamento.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um número decimal.");

		try {

			double num = lerNumero();

			System.out.println("Você digitou " + num);

		} catch (Exception e) {

			erroCompleto(e);

		}

	}

	public static double lerNumero() throws Exception {

		Scanner scan = new Scanner(System.in);

		double num = scan.nextDouble();

		return num;

	}

	public static void erroCompleto(Throwable error) {
		System.out.println("Mensagem de erro completa ::: " + error);
		error.printStackTrace();
	}

}
