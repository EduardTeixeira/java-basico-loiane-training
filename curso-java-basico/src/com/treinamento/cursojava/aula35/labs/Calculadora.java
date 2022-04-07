package com.treinamento.cursojava.aula35.labs;

public class Calculadora {

	public static int fibonacci(int num) {

		if (num < 2) {
			return 1;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);

	}

	// 3 = 3 + 2 + 1 = 6
	public static int somatorio(int num) {

		if (num == 1) {
			return 1;
		}

		return num + somatorio(num - 1);

	}

}
