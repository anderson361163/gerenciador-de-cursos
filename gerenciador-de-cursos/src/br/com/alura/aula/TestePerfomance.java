package br.com.alura.aula;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerfomance {

	public static void main(String[] args) {
		
		TesteVelocidadeList();
		TesteVelocidadeSet();
	}

	private static void TesteVelocidadeSet() {
		Collection<Integer> numeros = new HashSet<>();
		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto com Set: " + tempoDeExecucao);
	}

	private static void TesteVelocidadeList() {
		Collection<Integer> numeros = new ArrayList<Integer>();

		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto com ArrayList: " + tempoDeExecucao);
	}
}
