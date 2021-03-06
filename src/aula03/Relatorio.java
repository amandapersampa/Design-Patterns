package aula03;

import java.util.List;
import aula01.p1.Conta;

public abstract class Relatorio {
	protected abstract void cabecalho();
	protected abstract void rodape();
	protected abstract void corpo(List<Conta> contas);
	
	public void imprime(List<Conta> contas) {
        cabecalho();
        corpo(contas);
        rodape();
      }
}
