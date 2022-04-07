package com.treinamento.cursojava.aula35.labs;

public class TesteCalculadora {

	public static void main(String[] args) {

		System.out.println("Fibonacci");
		
		for (int i = 0; i < 10; i++) {

			int resultF = Calculadora.fibonacci(i);

			System.out.println(resultF);

		}

		int resultS = Calculadora.somatorio(5);

		System.out.println("\nSomatório");
		
		System.out.println(resultS);

	}

}
