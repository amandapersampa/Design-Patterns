package aula07;

import aula06.NotaFiscal;

public class NotaFicalDAO implements AcaoAposGerarNota {

	@Override
	public void executar(NotaFiscal nf) {
		System.out.println("nota fiscal salva!");
	}

}
