package aula01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import aula02.Item;
import aula05.EmAprovacao;
import aula05.EstadoDeUmOrcamento;

public class Orcamento {
	private double valor;
	private final List<Item> itens;
	private EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return this.valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void addItem(Item item) {
		this.itens.add(item);
	}

	public void aplicaDescontoExtra() {
		this.valor -= this.estadoAtual.aplicaDescontoExtra(valor);
	}


	public void aprovar() {
		this.estadoAtual = this.estadoAtual.aprovar();
	}

	public void reprovar() {
		this.estadoAtual = this.estadoAtual.reprovar();
	}

	public void finalizar() {
		this.estadoAtual = this.estadoAtual.finalizar();
	}
	
	

}
