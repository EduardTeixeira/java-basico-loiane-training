package com.treinamento.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		int max = 10;

		System.out.println("Incrementação");
		for (int i = 0; i < max; i++) {
			System.out.println("Valor de i " + i);
		}

		System.out.println("\nDecrementação");
		for (int i = 10; i > 0; i--) {
			System.out.println("Valor de i " + i);
		}

		System.out.println("\nDuplo For");
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("Valor de i ::: " + i + " Valor de j ::: " + j);
		}

		System.out.println("\nPartes Ausentes");
		int count = 0;
		for (; count < 10;) {
			System.out.println("Valor de count ::: " + count);
			count += 2;
		}
		System.out.println();
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("Valor de cont ::: " + cont);
		}

		System.out.println();
		int soma = 0;

		for (int i = 1; i < 5; soma += i++)
			System.out.println("Valor da soma é " + soma);

		System.out.println();
		for (int i = 0; i < 5; i++)
			System.out.println("i tem valor de: " + i);

	}

}
