package com.treinamento.cursojava.aula24.labs;

import java.util.Date;

public class LivroBibliotecaTest {

	public static void main(String[] args) {

		LivroBiblioteca livro = new LivroBiblioteca();
		livro.setNome("Mastering ExtJS");
		livro.setAutor("Loiane");
		livro.setAnoLancamento(2015);
		livro.setEmprestado(true);
		livro.setDataEntrega(new Date());
		livro.setEmprestadoPara("Mim");

		System.out.println("Nome do livro ::: " + livro.getNome());
		System.out.println("Nome do livro ::: " + livro.getEmprestadoPara());
		System.out.println("Nome do livro ::: " + livro.getDataEntrega());
		System.out.println("Nome do livro ::: " + livro.getEmprestadoPara());

	}

}
