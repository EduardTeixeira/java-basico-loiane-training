package com.treinamento.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

	private String cursos;
	private double[] notas;

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

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
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
		String s = "Endereço do Aluno: ";
		// s += super.getEndereco();
		return s;
	}

	// @Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}

	@Override
	public String toString() {
		return "Aluno [cursos=" + cursos + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(cursos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cursos.equalsIgnoreCase(other.getCursos())) {
			return true;
		}
		return Objects.equals(cursos, other.cursos) && Arrays.equals(notas, other.notas);
	}

//	public String toString() {
//		String s = this.cursos + "\n";
//		for (double nota : notas) {
//			s += nota + " ";
//		}
//		return s;
//	}

}
