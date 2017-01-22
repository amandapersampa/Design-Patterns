package aula01;

public class CalculadoraImposto {

	public static double realizaCalculo(Orcamento orcamento,  Imposto imposto){
		return imposto.calcula(orcamento);
	}
}
