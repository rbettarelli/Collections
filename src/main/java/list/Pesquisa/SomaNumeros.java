package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	private List<Integer> numeros;

	public SomaNumeros() {

		this.numeros = new ArrayList<Integer>();

	}

	public void adicionaNumeros(Integer numero) {
		this.numeros.add(numero);
	}

	public int calcularSoma() {
		int soma = 0;
		for (Integer i : numeros)

			soma += i;

		return soma;
	}

	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		if (!numeros.isEmpty()) {
			for (Integer i : numeros) {
				if (i >= maiorNumero) {
					maiorNumero = i;
				}
			}
			return maiorNumero;

		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		if (!numeros.isEmpty()) {
			for (Integer i : numeros) {
				if (i <= menorNumero) {
					menorNumero = i;
				}
			}
			return menorNumero;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void exibirNumeros() {
		if(!numeros.isEmpty()) {
			System.out.println(this.numeros);
		}else {
			System.err.println("A lista esta vazia");
		}

	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe SomaNumeros
	    SomaNumeros somaNumeros = new SomaNumeros();

	    // Adicionando números à lista
	    somaNumeros.adicionaNumeros(5);
	    somaNumeros.adicionaNumeros(0);
	    somaNumeros.adicionaNumeros(0);
	    somaNumeros.adicionaNumeros(-2);
	    somaNumeros.adicionaNumeros(10);

	    // Exibindo a lista de números adicionados
	    System.out.println("Números adicionados:");
	    somaNumeros.exibirNumeros();

	    // Calculando e exibindo a soma dos números na lista
	    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

	    // Encontrando e exibindo o maior número na lista
	    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

	    // Encontrando e exibindo o menor número na lista
	    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
	  }

}
