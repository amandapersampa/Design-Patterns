package aula05;

public class Reprovado extends EstadoDeUmOrcamentoTemp {

	public Reprovado() {
		super(0);
	}

	public double aplicaDescontoExtra(double valor) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

	@Override
	public EstadoDeUmOrcamento aprovar() {
		throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados!");
	}

	@Override
	public EstadoDeUmOrcamento reprovar() {
		throw new RuntimeException("O or�amento est� reprovado!");
	}

	@Override
	public EstadoDeUmOrcamento finalizar() {
		throw new RuntimeException("Or�amentos reprovados n�o podem ser finalizados!");
	}

}
