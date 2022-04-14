package com.treinamento.cursojava.aula39;

public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;

	public Professor() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public void verificarAcesso() {
		
		this.getCpf();
		super.getCpf();
		
		//super.nomeVisibilidade = "Meu nome";
		//this.nomeVisibilidade = "Nome";
		
	}

}
