package aula05;

public class Finalizado extends EstadoDeUmOrcamentoTemp {

	public Finalizado() {
		super(0.0);
	}

	@Override
	public double aplicaDescontoExtra(double valor) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
	}

	@Override
	public EstadoDeUmOrcamento aprovar() {
		throw new RuntimeException("Or�amentos finalizados n�o podem ser aprovados!");
	}

	@Override
	public EstadoDeUmOrcamento reprovar() {
		return new Reprovado();
	}

	@Override
	public EstadoDeUmOrcamento finalizar() {
		throw new RuntimeException("O or�amento est� finalizado!");
	}

}
