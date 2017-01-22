package aula02;

import aula01.Orcamento;

public interface Desconto {
	double desconto(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
