package com.treinamento.cursojava.aula24;

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

		Carro fusca = new Carro();
		fusca.setMarca("Volkswagen");
		fusca.setModelo("Fusca");
		fusca.setNumPassageiros(4);
		fusca.setCapCombustivel(30);
		fusca.setConsumoCombustivel(0.15);

		System.out.println(fusca.getMarca());
		System.out.println(fusca.getModelo());
		System.out.println(fusca.getCapCombustivel());

	}

}
