package com.treinamento.cursojava.aula24.labs;

public class LivroTest {

	public static void main(String[] args) {

		Livro livro = new Livro();
		livro.setNome("Mastering ExtJS");
		livro.setAutor("Loiane");
		livro.setAnoLancamento(2015);

		System.out.println("Nome do livro ::: " + livro.getNome());

	}

}
