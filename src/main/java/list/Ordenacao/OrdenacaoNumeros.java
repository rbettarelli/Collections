package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	private List<Integer> numeros;

	public OrdenacaoNumeros() {

		this.numeros = new ArrayList<Integer>();
	}

	public void adicionarNumero(Integer numero) {
		this.numeros.add(numero);

	}

	public List<Integer> ordenarAscendente() {
		List<Integer> ascendente = new ArrayList<>(this.numeros);
		if (!numeros.isEmpty()) {
			Collections.sort(ascendente);
			return ascendente;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public List<Integer> ordenarDecrescente() {
		List<Integer> decrescente = new ArrayList<>(this.numeros);
		if (!numeros.isEmpty()) {
			decrescente.sort(Collections.reverseOrder());
			return decrescente;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}

	}
	
	public void exibirNumeros() {
		if(!numeros.isEmpty()) {
			System.out.println(this.numeros);
		}else { 
			System.err.println("A lista está vazia!");
		}
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe OrdenacaoNumeros
	    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

	    // Adicionando números à lista
	    numeros.adicionarNumero(2);
	    numeros.adicionarNumero(5);
	    numeros.adicionarNumero(4);
	    numeros.adicionarNumero(1);
	    numeros.adicionarNumero(99);

	    // Exibindo a lista de números adicionados
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem ascendente
	    System.out.println(numeros.ordenarAscendente());

	    // Exibindo a lista
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem descendente
	    System.out.println(numeros.ordenarDecrescente());

	    // Exibindo a lista
	    numeros.exibirNumeros();
	  }

}
