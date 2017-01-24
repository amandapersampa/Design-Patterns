package aula07;

import aula06.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("imprimindo notaFiscal");
	}
}
