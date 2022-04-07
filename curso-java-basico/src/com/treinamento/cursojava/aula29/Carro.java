package com.treinamento.cursojava.aula29;

public class Carro {

	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;

	public Carro() {
		System.out.println("Instancia de carro");
		this.numPassageiros = 4;
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel,
			double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	public void exibirAutonomia() {
		System.out.println("Autonomia do carro é: " + this.getCapCombustivel() * this.getConsumoCombustivel() + " km");
	}

	public double obterAutonomia() {
		return this.getCapCombustivel() * this.getConsumoCombustivel();
	}

	public double calculaCombustivel(double km) {
		return km / this.consumoCombustivel;
	}

}
