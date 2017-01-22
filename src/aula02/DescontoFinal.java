package aula02;

import aula01.Orcamento;

public class DescontoFinal implements Desconto{

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		
	}

}
