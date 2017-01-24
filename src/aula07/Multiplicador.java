package aula07;

import aula06.NotaFiscal;

class Multiplicador implements AcaoAposGerarNota {
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executar(NotaFiscal nf) {
		System.out.println(nf.getValorBruto()*this.fator);
	}
}
