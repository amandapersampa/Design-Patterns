package aula05;

public class Finalizado extends EstadoDeUmOrcamentoTemp {

	public Finalizado() {
		super(0.0);
	}

	@Override
	public double aplicaDescontoExtra(double valor) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	@Override
	public EstadoDeUmOrcamento aprovar() {
		throw new RuntimeException("Orçamentos finalizados não podem ser aprovados!");
	}

	@Override
	public EstadoDeUmOrcamento reprovar() {
		return new Reprovado();
	}

	@Override
	public EstadoDeUmOrcamento finalizar() {
		throw new RuntimeException("O orçamento está finalizado!");
	}

}
