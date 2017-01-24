package aula05;

public abstract class EstadoDeUmOrcamentoTemp implements EstadoDeUmOrcamento {
	private final double taxa;
	private boolean descontoAplicado = false;

	public EstadoDeUmOrcamentoTemp(double taxa) {
		this.taxa = taxa;
	}

	public double aplicaDescontoExtra(double valor) {
		if(!this.descontoAplicado){
			descontoAplicado = true;
			return valor * this.taxa;
		}
		throw new RuntimeException("O desconto já foi aplicado!");
	}

	public double getTaxa() {
		return taxa;
	}

}
