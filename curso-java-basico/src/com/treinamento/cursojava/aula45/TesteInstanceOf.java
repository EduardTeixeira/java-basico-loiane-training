package com.treinamento.cursojava.aula45;

public class TesteInstanceOf {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		Aluno aluno = new Aluno();

		Professor prof = new Professor();

		if (pessoa instanceof Pessoa) {
			System.out.println("Tipo Pessoa");
		}

		if (aluno instanceof Aluno) {
			System.out.println("Tipo Aluno");
		}

		if (prof instanceof Professor) {
			System.out.println("Tipo Professor");
		}
		
		if (prof instanceof Pessoa) {
			System.out.println("Tipo Prof-Pessoa");
		}
		
		if (pessoa instanceof Professor) {
			System.out.println("Tipo Pessoa-Professor");
		}

	}

}
