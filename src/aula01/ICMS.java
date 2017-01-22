package aula01;

public class ICMS implements Imposto{
	private final double taxa = 0.10;
	
	public double calcula(Orcamento orcamento){
		return orcamento.getValor()*(1+this.taxa);
	}
	
	
}
