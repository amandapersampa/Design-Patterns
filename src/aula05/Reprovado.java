package aula05;

public class Reprovado extends EstadoDeUmOrcamentoTemp {

	public Reprovado() {
		super(0);
	}

	public double aplicaDescontoExtra(double valor) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public EstadoDeUmOrcamento aprovar() {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados!");
	}

	@Override
	public EstadoDeUmOrcamento reprovar() {
		throw new RuntimeException("O orçamento está reprovado!");
	}

	@Override
	public EstadoDeUmOrcamento finalizar() {
		throw new RuntimeException("Orçamentos reprovados não podem ser finalizados!");
	}

}
