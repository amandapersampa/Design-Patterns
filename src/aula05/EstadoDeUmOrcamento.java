package aula05;

public interface EstadoDeUmOrcamento {
	public double aplicaDescontoExtra(double valor);
	
	public EstadoDeUmOrcamento aprovar();
	
	public EstadoDeUmOrcamento reprovar();
	
	public EstadoDeUmOrcamento finalizar();
	
	
}
