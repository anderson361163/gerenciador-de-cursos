package br.com.alura.aula;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	
	
	public static void main(String[] args) {
		
		//set é uma interface, enquanto HasSet e uma implementação
		//hashset não é filha de List, apenas filha de set que é filha de colletion
		//hashset significa tabela de espalhamento
		//Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		
		
		
		alunos.add("Rodrigo turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
		
		//vai retornar 6, mesmo com 7 elementos
		System.out.println(alunos.size());
		System.out.println("-----------------------");
		
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.println("------------------------");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		//não existe remover elementos passando indice, pois não existe ordem explicita
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);
		//remove e procura mais rapido
		System.out.println("------------------------");
		
		//ArrayList tbm recebe collection não somente listas
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
		
		
		
		
		
		
	}
	
}
