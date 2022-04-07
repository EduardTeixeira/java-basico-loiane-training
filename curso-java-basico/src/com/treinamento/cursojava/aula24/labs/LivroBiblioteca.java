package com.treinamento.cursojava.aula24.labs;

import java.util.Date;

public class LivroBiblioteca {

	private String nome;
	private String autor;
	private int qtdPaginas;
	private int anoLancamento;
	private String isbn;
	private boolean emprestado;
	private Date dataEntrega;
	private String EmprestadoPara;

	public String getEmprestadoPara() {
		return EmprestadoPara;
	}

	public void setEmprestadoPara(String emprestadoPara) {
		EmprestadoPara = emprestadoPara;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

}
