package com.treinamento.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[30][4];

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

		double media;
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println("\nAluno número ::: " + (i + 1));
			media = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println("Notas do aluno ::: " + notasAlunos[i][j]);
				media += notasAlunos[i][j];
			}
			media = media / notasAlunos[i].length;
			System.out.println("Nota média do aluno ::: " + media);
		}

	}

}
