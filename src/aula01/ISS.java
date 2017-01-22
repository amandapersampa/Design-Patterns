package aula01;

public class ISS implements Imposto{
	private final double taxa = 0.2;
	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor()*(1+this.taxa);
	}

}
