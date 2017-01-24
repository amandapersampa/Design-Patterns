package aula05;

public class EmAprovacao extends EstadoDeUmOrcamentoTemp {

	public EmAprovacao() {
		super(0.05);
	}

	@Override
	public EstadoDeUmOrcamento aprovar() {
		return new Aprovado();
	}

	@Override
	public EstadoDeUmOrcamento reprovar() {
		return new Reprovado();
	}

	@Override
	public EstadoDeUmOrcamento finalizar() {
		throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
	}
}
