package br.com.alura.aula;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	
	private List<Aula> aulas = new LinkedList<Aula>();
	// a diferença entre ArrayList com List é que o List diminuiu o acoplamento
	
//	public ArrayList<Aula> getAulas() {
//		return aulas;
//	}
	//é mais importante não ter aluno repetido do que ter uma ordem
	//private Set<Aluno> alunos = new HashSet<>();
	//nesta implementação ele permite imprimir os objetos na ordem adicionada
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap();
	
	
	//--------------------
	
	
	public List<Aula> getAulas(){
		//devolve uma lista readonly(somente de leitura)
		return Collections.unmodifiableList(aulas);
	}
	
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	//é melhor deixar a propria classe mexer na lista dela
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public int getTempoTotal() {
//		// TODO Auto-generated method stub
//		int tempoTotal = 0;
//		for(Aula aulas : aulas) {
//			tempoTotal += aulas.getTempo();
//		}
//		return tempoTotal;
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "Curso: [nome:"+nome+","
				+ " tempo total: "+this.getTempoTotal()+","
				+ " aulas: " + this.aulas +"] ";
	}
	
	public List<List<Aula>> getSIngletonList() {
		return Collections.singletonList(aulas);
	}

	//-----------------------------------
	
	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		//semelhante ao excel
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		
		for (Aluno aluno : alunos) {
			if(aluno.getNumeroMatricula() ==numero) {
				return aluno;
			}
		}
		return null;
	}
}
