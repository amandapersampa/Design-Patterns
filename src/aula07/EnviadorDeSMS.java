package aula07;

import aula06.NotaFiscal;

public class EnviadorDeSMS implements AcaoAposGerarNota{
	public void executar(NotaFiscal nf) {
		System.out.println("enviado por sms");
	}
}