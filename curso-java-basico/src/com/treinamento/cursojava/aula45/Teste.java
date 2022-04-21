package com.treinamento.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {

		// UPCASTING

		Aluno aluno = new Aluno();

		Pessoa pessoaAluno = aluno; // upcasting automatico

		Pessoa aluno1 = new Aluno(); // upcasting manual

		Pessoa aluno2 = (Pessoa) new Aluno(); // upcasting manual

		// DOWNCASTING

		Pessoa aluno3 = new Pessoa();

		Aluno alunoD = (Aluno) aluno3; // Gera um erro de Casting

	}

}
