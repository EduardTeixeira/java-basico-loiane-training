package com.treinamento.cursojava.aula42;

public class Aluno {

	private String cursos;
	private String[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone) {
		// super(nome, endereco, telefone);
	}

	public Aluno(String nome, String endereco) {
		// super(nome, endereco);
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public String[] getNotas() {
		return notas;
	}

	public void setNotas(String[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public void meuMetodo() {
		// this.getCpf();
		// super.getCpf();
	}

	public String obterEtiquetaEndereco() {
		String s = "Endere?o do Aluno: ";
		// s += super.getEndereco();
		return s;
	}

	// @Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}

}
