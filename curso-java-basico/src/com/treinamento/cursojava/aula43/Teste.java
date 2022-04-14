package com.treinamento.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setCursos("ADS");
		double[] notas = { 10, 5, 6, 6.5 };
		aluno.setNotas(notas);

		System.out.println(aluno.toString());
		
		String s1 = "aaabbb";
		String s2 = "aaabbB";
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCursos("Sistemas");
		double[] notas2 = { 10, 5, 6, 6.5 };
		aluno2.setNotas(notas2);
		
		System.out.println("\nComparando Classes");
		System.out.println(aluno == aluno2);
		System.out.println(aluno.equals(aluno2));		

	}

}
