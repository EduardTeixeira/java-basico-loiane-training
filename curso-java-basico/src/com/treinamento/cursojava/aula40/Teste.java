package com.treinamento.cursojava.aula40;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setEndereco("Rua da Pessoa");
		System.out.println(pessoa.obterEtiquetaEndereco());

		Pessoa aluno = new Aluno();
		aluno.setEndereco("Rua do Aluno");
		System.out.println(aluno.obterEtiquetaEndereco());

		Pessoa professor = new Professor();
		professor.setEndereco("Rua do Professor");
		System.out.println(professor.obterEtiquetaEndereco());

	}

}
