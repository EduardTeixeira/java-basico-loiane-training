package com.treinamento.cursojava.aula24.labs;

public class LampadaTest {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		lampada.setModelo("A60");
		lampada.setTensao("Bivolt");
		lampada.setGarantiaMeses("36");
		lampada.setPotencia(7);
		lampada.setCor("Amarela");
		String[] tipos = new String[5];
		tipos[0] = "Abajur";
		tipos[1] = "Lampeões";
		lampada.setTipos(tipos);

		System.out.println(lampada.getTipos()[0]);

	}

}
