package br.com.alura.aula;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es java",
				"Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		//Utilizar o arraylist
		//aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		//s�o o mesmo objeto
		System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
		
		//true
		System.out.println(aulas == javaColecoes.getAulas());
	}
}
