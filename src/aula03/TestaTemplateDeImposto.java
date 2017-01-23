package aula03;

import aula01.Imposto;
import aula01.Orcamento;
import aula02.Item;

public class TestaTemplateDeImposto {
	public static void main(String[] args){
		Orcamento orcamento = new Orcamento(500);
		orcamento.addItem(new Item("lapis", 250));
		orcamento.addItem(new Item("borracha", 250));
		Imposto icpp = new ICPP();
		System.out.println(icpp.calcula(orcamento));
	}
}
