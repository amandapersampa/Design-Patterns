package aula01.p1;

import java.util.Random;

public class Moderado implements Investimento{
	private Random random;
	
	public Moderado(){
		random = new Random();
	}
	
	public double calcula(Conta conta){
		if(random.nextInt(2)==0) return conta.getSaldo();
		else return conta.getSaldo()*0.007;
	}
	
}
