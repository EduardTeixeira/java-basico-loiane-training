package com.treinamento.cursojava.aula34;

public class TesteCalculadora {

	static int resultSoma;

	public static void main(String[] args) {

		System.out.println(MinhaCalculadora.soma(10, 5));

		System.out.println(MinhaCalculadora.soma(10, 5, 3));

		System.out.println(MinhaCalculadora.soma(5.2, 3.5));

		int[] inteiros = { 5, 1, 3, 4, 2 };
		System.out.println(MinhaCalculadora.soma(inteiros));

		resultSoma = MinhaCalculadora.soma(3, 55);
		exibirResultado(resultSoma);

	}
	
	static void exibirResultado(int myResult) {
		System.out.println(myResult);
	}

}
