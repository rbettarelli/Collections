package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> item;

	public CarrinhoDeCompras() {
		this.item = new ArrayList<>();

	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		item.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> removeItem = new ArrayList<>();
		if (!item.isEmpty()) {
			for (Item i : item) {
				if (i.getNome().equalsIgnoreCase(nome)) {
					removeItem.add(i);
				}
			}
			item.removeAll(removeItem);
		} else {
			System.out.println("A lista está vazia");
		}
	}

	public double calculaValor() {
		double valorTotal = 0d;
		if (!item.isEmpty()) {
			for (Item i : item) {
				double valorItem = i.getPreco() * i.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia");

		}

	}
	
	public void exibeLista() {
		if(!item.isEmpty()) {
			System.out.println(this.item);
		}else {
		 	System.out.println("A lista está vazia");

		}
	}
	
	 @Override
	  public String toString() {
	    return "CarrinhoDeCompras{" +
	        "itens=" + item +
	        '}';
	  }
	  public static void main(String[] args) {
		    // Criando uma instância do carrinho de compras
		    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		    // Adicionando itens ao carrinho
		    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
		    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
		    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
		    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

		    // Exibindo os itens no carrinho
		    carrinhoDeCompras.exibeLista();

		    // Removendo um item do carrinho
		    carrinhoDeCompras.removerItem("Lápis");

		    // Exibindo os itens atualizados no carrinho
		    carrinhoDeCompras.exibeLista();

		    // Calculando e exibindo o valor total da compra
		    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calculaValor());
		  }

}