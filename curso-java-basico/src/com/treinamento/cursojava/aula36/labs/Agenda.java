package com.treinamento.cursojava.aula36.labs;

public class Agenda {

	private String nome;
	private Contato[] contatos;

	public Agenda() {
	}

	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String obterInfo() {
		String info = "\nNome da Agenda = " + this.nome + "\n";
		if (contatos != null) {
			for (Contato c : contatos) {
				if (c != null) {
					info += c.obterInfo() + "\n";
				}
			}
		}
		return info;
	}

}
