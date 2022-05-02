package com.treinamento.cursojava.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {

				System.out.println(numeros[i] + "/" + denom[i] + "=" + (numeros[i] / denom[i]));

			} catch (ArithmeticException e1) {

				System.out.println("Erro ao dividir por zero.");

				erroCompleto(e1.toString());

				System.exit(0);

			} catch (ArrayIndexOutOfBoundsException e2) {

				System.out.println("Posição do array inválida.");

				erroCompleto(e2.toString());

				System.exit(0);

			} finally {

				System.out.println("Impressão após o try ou catch.\n");

			}

		}

	}

	public static void erroCompleto(String error) {
		System.out.println("Mensagem de erro completa ::: " + error);
	}

}
