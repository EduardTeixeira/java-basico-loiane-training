package com.treinamento.cursojava.aula36.labs;

import java.util.Scanner;

public class AgendaTeste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o nome da agenda:");
		String nome = scan.nextLine();

		Agenda agenda = new Agenda(nome);

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < contatos.length; i++) {

			System.out.println("\nEntre com as informações do contato de número: " + (i + 1));

			System.out.println("Entre com o nome:");
			String contatoNome = scan.nextLine();

			System.out.println("Entre com o telefone:");
			String contatoTelefone = scan.nextLine();

			System.out.println("Entre com o email");
			String contatoEmail = scan.nextLine();

			Contato contato = new Contato(contatoNome, contatoTelefone, contatoEmail);

			contatos[i] = contato;

		}

		agenda.setContatos(contatos);

		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}

	}

}
