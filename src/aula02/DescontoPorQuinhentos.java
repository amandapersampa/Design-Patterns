package aula02;

import aula01.Orcamento;

public class DescontoPorQuinhentos implements Desconto {
	private Desconto proximo;

	public DescontoPorQuinhentos() {
		this.proximo = new DescontoFinal();
	}

	@Override
	public double desconto(Orcamento orcamento) {
		if (orcamento.getValor() >= 500) {
			return orcamento.getValor() * 0.15;
		}
		return proximo.desconto(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
