package aula02;

import aula01.Orcamento;

public class CalculadorDeDesconto {
	public double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorQuinhentos();
		
		d1.setProximo(d2);
		return d1.desconto(orcamento);
	}
}
