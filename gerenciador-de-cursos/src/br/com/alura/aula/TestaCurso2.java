package br.com.alura.aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es java",
				"Paulo Silveira");
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 18));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		System.out.println(aulasImutaveis);
		
		//N�O PODE ALTERAR A ORDEM DOS J� QUE � PRIVADO
		Collections.sort(aulasImutaveis);
		
		//-----
		
		//automaticamente ele t� passando todos os itens para uma nova lista mutavel
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		
		System.out.println(javaColecoes.getTempoTotal());
		
	}
}
