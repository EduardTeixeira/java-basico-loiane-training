package com.treinamento.cursojava.aula24.labs;

public class ContaCorrenteTest {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("12345");
		conta.setAgencia("456");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(100);

		System.out.println("Conta ::: " + conta.getNumero());
		System.out.println("Saldo ::: " + conta.getSaldo());

	}

}
