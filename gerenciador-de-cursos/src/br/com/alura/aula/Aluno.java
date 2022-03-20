package br.com.alura.aula;

public class Aluno {
	//� uma boa pr�tica primeiro s� criar o getter depois voc� cria o setter se houver necessidade
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("nome n�o pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		//valor do tamanho da string
		//return this.nome.charAt(0);
		//Devolve o c�digo
		return this.nome.hashCode();
	}
	
	
	@Override
	public String toString() {
		return "[Aluno: "+this.nome+", matricula: "+this.numeroMatricula+"]";
	}

}
