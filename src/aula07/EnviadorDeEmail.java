package aula07;

import aula06.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{
	public void executar(NotaFiscal nf) {
		System.out.println("enviado por email");
	}
}
