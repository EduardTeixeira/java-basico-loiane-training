package com.treinamento.cursojava.aula29;

public class CarroTest {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.setMarca("Fiat");
		van.setModelo("Ducato");
		van.setNumPassageiros(10);
		van.setCapCombustivel(100);
		van.setConsumoCombustivel(0.2);

		System.out.println(van.getMarca());
		System.out.println(van.getModelo());
		System.out.println(van.getCapCombustivel());
		van.exibirAutonomia();
		System.out.println("Autonomia de " + van.obterAutonomia());
		System.out.println("Calculo combustivel 10km ::: " + van.calculaCombustivel(10));

		Carro carro = new Carro("Renault", "Ducato", 10, 100, 0.2);
		System.out.println(carro.getMarca());

	}

}
