package com.treinamento.cursojava.aula16;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		int max = 10;

		System.out.println("Contando até " + max);

		while (i <= max) {
			System.out.println("Valor de i " + i);
			i++;
		}

		System.out.println(i);

		do {
			System.out.println("Valor de i " + i);
			i++;
		} while (i < 15);

		System.out.println(i);

	}

}
