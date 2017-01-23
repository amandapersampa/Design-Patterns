package aula01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import aula02.Item;

public class Orcamento {
	private final double valor;
	private final List<Item> itens;
	
	public Orcamento(double valor){
		this.valor = valor;
		itens = new ArrayList<>();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void addItem(Item item) {
		itens.add(item);
	}
	
}
