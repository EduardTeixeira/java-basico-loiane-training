package com.treinamento.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}

		System.out.println("\nUsando foreach");
		for (int nota : notas) {
			System.out.println(nota);
		}

		// Percorrendo com foreach

		double[][] notasAlunos = new double[4][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		System.out.println();
		double media;
		for (double[] notasAluno : notasAlunos) {
			media = 0;
			for (double nota : notasAluno) {
				System.out.println(nota + " ");
				media += nota;
			}
			media = media / 4;
			System.out.println("Nota média do aluno ::: " + media);
			System.out.println();
		}

	}

}
