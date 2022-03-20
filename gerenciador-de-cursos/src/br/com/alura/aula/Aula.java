package br.com.alura.aula;

import java.util.LinkedList;
import java.util.List;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	//melhora 
	//private List<Aula> aulas = new LinkedList<Aula>();

	//verifica no construtor se o valor não é nulo
	public Aula(String titulo, int tempo) {
	
		this.titulo = titulo;
		this.tempo = tempo;
	}
	/*
	public List<Aula> getAulas() {
		return aulas;
	}
	*/
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: "+this.titulo+",\n "+this.tempo+"]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	
}
