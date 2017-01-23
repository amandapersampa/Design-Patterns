package aula01;

public class ISS extends Imposto{
	private final double taxa = 0.06;
	
	 public ISS(Imposto outroImposto) {
         super(outroImposto);
     }
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor()*(this.taxa) + calculoDoOutroImposto(orcamento);
	}	
	

}
