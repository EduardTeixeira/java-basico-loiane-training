package com.treinamento.cursojava.aula24.labs;

public class ContatoTest {

	public static void main(String[] args) {

		Contato contato1 = new Contato();
		contato1.setNome("Zé");
		contato1.setEmail("zé@email.com");
		contato1.setEndereco("Avenida Brasil, 1234");
		String[] telefones = new String[5];
		telefones[0] = "12345678";
		telefones[1] = "11223344";
		telefones[2] = "02023030";
		contato1.setTelefones(telefones);

		System.out.println(contato1.getNome());
		System.out.println(contato1.getEmail());

	}

}
