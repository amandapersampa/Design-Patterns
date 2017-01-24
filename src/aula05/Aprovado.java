package aula05;

public class Aprovado extends EstadoDeUmOrcamentoTemp {

	public Aprovado() {
		super(0.02);
	}

	@Override
	public EstadoDeUmOrcamento aprovar() {
		throw new RuntimeException("O orçamento está aprovado");
	}
	
	@Override
	public EstadoDeUmOrcamento reprovar() {
		 throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
	}

	@Override
	public EstadoDeUmOrcamento finalizar() {
		return new Finalizado();
	}

}
