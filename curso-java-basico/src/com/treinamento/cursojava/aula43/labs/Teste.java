package com.treinamento.cursojava.aula43.labs;

public class Teste {

	public static void main(String[] args) {

		ContaBancaria contaBancaria = new ContaBancaria("Eduard", "1234", 250.0);
		System.out.println(contaBancaria.toString());
		contaBancaria.depositar(125);
		System.out.println(contaBancaria.toString());
		contaBancaria.sacar(25.5);
		System.out.println(contaBancaria.toString());
		contaBancaria.sacar(1000);
		System.out.println(contaBancaria.toString());

		System.out.println("\n ### CONTA POUPANÇA ###");
		ContaPoupanca contaPoupanca = new ContaPoupanca("Eduard-Poupança", "2324", 250.0, 12);
		System.out.println(contaPoupanca.toString());
		contaPoupanca.depositar(125);
		System.out.println(contaPoupanca.toString());
		contaPoupanca.sacar(25.5);
		System.out.println(contaPoupanca.toString());
		contaPoupanca.sacar(1000);
		System.out.println(contaPoupanca.toString());
		contaPoupanca.calcularNovoSaldo(10);
		System.out.println(contaPoupanca.toString());

		System.out.println("\n ### CONTA ESPECIAL ###");
		ContaEspecial contaEspecial = new ContaEspecial("Eduard-Especial", "5677", 250.0, 500);
		System.out.println(contaEspecial.toString());
		contaEspecial.depositar(125);
		System.out.println(contaEspecial.toString());
		contaEspecial.sacar(25.5);
		System.out.println(contaEspecial.toString());
		contaEspecial.sacar(500);
		System.out.println(contaEspecial.toString());

	}

}
