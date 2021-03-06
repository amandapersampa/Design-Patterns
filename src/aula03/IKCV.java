package aula03;

import aula01.Orcamento;
import aula02.Item;

public class IKCV extends TemplateDeImpostoCondicional{

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && itemMaiorQue100ReaisNo(orcamento);
	}

	private boolean itemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.10;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.06;
	}

}

