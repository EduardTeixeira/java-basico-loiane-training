package com.treinamento.cursojava.aula43.labs;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", nomeCliente=" + getNomeCliente() + ", numConta=" + getNumConta()
				+ ", saldo=" + getSaldo() + "]";
	}

	public boolean sacar(double valor) {
		double saldoComLimite = super.getSaldo() + this.limite;
		if ((saldoComLimite - valor) >= 0) {
			super.setSaldo(super.getSaldo() - valor);
			System.out.println("Saque efetuado com sucesso, novo saldo R$ " + super.getSaldo());
			return true;
		}
		System.out.println(
				"Você não possui saldo em conta para sacar R$ " + valor + "\nSaldo atual R$ " + super.getSaldo());
		return false;
	}

}
