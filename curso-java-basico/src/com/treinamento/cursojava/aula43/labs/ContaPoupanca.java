package com.treinamento.cursojava.aula43.labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + ", nomeCliente=" + getNomeCliente() + ", numConta="
				+ getNumConta() + ", saldo=" + getSaldo() + "]";
	}

	public boolean calcularNovoSaldo(double taxaRendimento) {

		Calendar hoje = Calendar.getInstance();

		if (this.diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			System.out.println("Saldo antes do dia de rendimento - R$ " + super.getSaldo());
			super.setSaldo(super.getSaldo() + ((super.getSaldo() * taxaRendimento) / 100));
			System.out.println("Saldo após o rendimento - R$ " + super.getSaldo());
			return true;
		}
		System.out.println("Ainda não é o dia de rendimento.");
		return false;

	}

}
