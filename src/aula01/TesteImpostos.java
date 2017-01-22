package aula01;

public class TesteImpostos {
	public static void main(String[] args){
		Orcamento casa = new Orcamento(5000);
		Imposto iss = new ISS();
		System.out.println(CalculadoraImposto.realizaCalculo(casa, iss));
	}
}
