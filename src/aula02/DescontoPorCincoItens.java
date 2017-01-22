package aula02;

import aula01.Orcamento;

public class DescontoPorCincoItens implements Desconto{
	private Desconto proximo;
	
	public DescontoPorCincoItens(){
		this.proximo = new DescontoFinal();
	}
	
	@Override
	public double desconto(Orcamento orcamento) {
		if(orcamento.getItens().size()>=5){
			return orcamento.getValor()*0.10;
		}
		return proximo.desconto(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
	
	

}
