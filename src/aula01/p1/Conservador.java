package aula01.p1;

public class Conservador implements Investimento{
	public double calcula(Conta conta){
		return conta.getSaldo()*0.008;
	}
}
