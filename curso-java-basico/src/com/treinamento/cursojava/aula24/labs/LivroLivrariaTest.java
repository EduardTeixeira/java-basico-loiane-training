package com.treinamento.cursojava.aula24.labs;

public class LivroLivrariaTest {

	public static void main(String[] args) {

		LivroLivraria livro = new LivroLivraria();
		livro.setNome("Mastering ExtJS");
		livro.setAutor("Loiane");
		livro.setAnoLancamento(2015);
		livro.setPreco(60.55);

		System.out.println("Nome do livro ::: " + livro.getNome());
		System.out.println("Nome do livro ::: " + livro.getPreco());

	}

}
