package com.treinamento.cursojava.aula36;

public class ContatoTeste {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setNomeRua("Avenida Brasil");
		endereco.setComplemento("Casa");
		endereco.setNumero("888");
		endereco.setCidade("Franca");
		endereco.setEstado("SP`");
		endereco.setCep("14400-500");

		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("16");
		telefone.setNumero("99955-8877");

		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Fixo");
		telefone2.setDdd("16");
		telefone2.setNumero("3344-5566");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;

		Contato contato = new Contato();
		contato.setNome("Eduard");
		contato.setEndereco(endereco);
		contato.setTelefone(telefones);

		System.out.println(contato.getNome());

//		if (contato != null && contato.getTelefone() != null) {
//			System.out.println(contato.getTelefone().getNumero());
//		}

		if (contato != null && contato.getTelefone() != null) {
			for (Telefone fone : contato.getTelefone()) {
				if (fone != null) {
					System.out.println(fone.getDdd() + " " + fone.getNumero());
				}
			}
		}

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}

	}

}
