package com.treinamento.cursojava.aula34.labs;

public class ContadorTest {
	
	public static void main(String[] args) {
		
		Contador contador = new Contador();
		Contador contador1 = new Contador();
	
		imprimirValor();
		
		Contador.incrementar();
		
		Contador.incrementar();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		
		Contador.decrementar();
		
		Contador.decrementar();
		
		imprimirValor();
		
	}
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

}
