package com.treinamento.cursojava.aula27;

public class TesteCarro {

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

		
		
		Carro fusca = new Carro();
		fusca.setMarca("Volkswagen");
		fusca.setModelo("Fusca");
		fusca.setNumPassageiros(4);
		fusca.setCapCombustivel(30);
		fusca.setConsumoCombustivel(0.15);

		System.out.println();
		System.out.println(fusca.getMarca());
		System.out.println(fusca.getModelo());
		System.out.println(fusca.getCapCombustivel());
		fusca.exibirAutonomia();
		System.out.println("Autonomia de " + fusca.obterAutonomia());
		System.out.println("Calculo combustivel 10km ::: " + fusca.calculaCombustivel(10));

	}

}
