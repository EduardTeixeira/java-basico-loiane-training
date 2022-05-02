package com.treinamento.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {

			int[] vetor = new int[4];

			System.out.println("Antes da exception");

			vetor[4] = 1;

			System.out.println("N�o ser� exibido");

		} catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Mensagem completa do erro ::: " + exception);

		}

		System.out.println("Exibido ap�s o bloco try/catch");

	}

}
