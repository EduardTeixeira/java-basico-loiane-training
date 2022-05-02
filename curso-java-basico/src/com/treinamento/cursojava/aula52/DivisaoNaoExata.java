package com.treinamento.cursojava.aula52;

public class DivisaoNaoExata extends Exception {

	private int num;

	private int denominador;

	public DivisaoNaoExata(int num, int denominador) {
		super();
		this.num = num;
		this.denominador = denominador;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + denominador + " não é um inteiro!";
	}

}
