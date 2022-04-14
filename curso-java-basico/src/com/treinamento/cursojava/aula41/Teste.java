package com.treinamento.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {

//		Pessoa pessoa = new Pessoa();
//		pessoa.setEndereco("Rua da Pessoa");
//		System.out.println(pessoa.obterEtiquetaEndereco());

		Pessoa aluno = new Aluno();
		aluno.setEndereco("Rua do Aluno");
		aluno.imprimirEtiquetaEndereco();

		Pessoa professor = new Professor();
		professor.setEndereco("Rua do Professor");
		professor.imprimirEtiquetaEndereco();

	}

}
