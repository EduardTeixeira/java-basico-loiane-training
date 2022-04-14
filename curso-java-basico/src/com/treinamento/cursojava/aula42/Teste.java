package com.treinamento.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setEndereco(Constantes.ENDERECO + "De teste");
		System.out.println(pessoa.obterEtiquetaEndereco());

//		Pessoa aluno = new Aluno();
//		aluno.setEndereco("Rua do Aluno");
//		System.out.println(aluno.obterEtiquetaEndereco());
		Aluno aluno = new Aluno();

//		Pessoa professor = new Professor();
//		professor.setEndereco("Rua do Professor");
//		System.out.println(professor.obterEtiquetaEndereco());
		Professor professor = new Professor();

	}

}
