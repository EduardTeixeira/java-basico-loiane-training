package com.treinamento.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calculadora = new MinhaCalculadora();

		System.out.println(calculadora.soma(10, 5));

		System.out.println(calculadora.soma(10, 5, 3));

		System.out.println(calculadora.soma(5.2, 3.5));

		int[] inteiros = { 5, 1, 3, 4, 2 };
		System.out.println(calculadora.soma(inteiros));

	}

}
