package com.treinamento.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/*
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scanner.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scanner.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade:");
		int idade = scanner.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura:");
		double altura = scanner.nextDouble();
		System.out.println("Sua altura é: " + altura);
		 */
		
		System.out.println("Digite seu nome, idade, quantidade de filhos, altura e tem pet?");
		String nome = scanner.next();
		int idade = scanner.nextInt();
		byte qtdeFilhos = scanner.nextByte();
		float altura = scanner.nextFloat();
		boolean temPet = scanner.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de Filhos: " + qtdeFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem pet: " + temPet);

	}

}
