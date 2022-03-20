package br.com.alura.aula;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 18));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		//TODA VEZ QUE FALAR, "PRECISO DE UMA MANEIRA DE ..." É MÉTODO
		//javaColecoes.getAlunos().add(a1);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		
		System.out.println("Todos os alunos matriculados: ");
		
		//javaColecoes.getAlunos().forEach(alunos -> System.out.println(alunos));
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		
		System.out.println("-------------------a");
		alunosSincronizados.forEach(a -> System.out.println(a));
		
		System.out.println("-------------------a");
		
		System.out.println("O aluno "+a1+"está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		System.out.println("-------------------b");
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		String nome = "Rodrigo Turini";
		
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?"
		+ " (Por de baixo dos panos ele verifica se o elemento"
		+ "  é o mesmo que o outro, ou seja deve possui a mesma referencia)");
		System.out.println(a1.equals(turini));
		System.out.println("-------------------b");
		
		//Sempre que foi implementar e utilizar o equals, 
		//deve-se usar o hascode quando for utilizar 
		//recomendo utilizar estrutura de dados
		System.out.println(a1.hashCode() == turini.hashCode());
		
		System.out.println("-------------------b");
		
		//Utilizando interable
		Set<Aluno> alunos1 = javaColecoes.getAlunos();
		
		Iterator<Aluno> interatorAlunos = alunos1.iterator();
		
		if(interatorAlunos.hasNext()) {
			Aluno alunoInterado = interatorAlunos.next();
		}
		
		
		System.out.println("-------------------b");
		
		Vector<Aluno> vetor = new Vector<>();
		
		
		
		System.out.println("-------------------b");
		
		
		
	}
	
}
