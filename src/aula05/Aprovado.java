package aula05;

public class Aprovado extends EstadoDeUmOrcamentoTemp {

	public Aprovado() {
		super(0.02);
	}

	@Override
	public EstadoDeUmOrcamento aprovar() {
		throw new RuntimeException("O or�amento est� aprovado");
	}
	
	@Override
	public EstadoDeUmOrcamento reprovar() {
		 throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");
	}

	@Override
	public EstadoDeUmOrcamento finalizar() {
		return new Finalizado();
	}

}
