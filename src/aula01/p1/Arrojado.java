package aula01.p1;

import java.util.Random;

public class Arrojado {

	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	public double calcula(Conta conta) {
		int chute = random.nextInt(10);
		if (chute >= 0 && chute <= 1)
			return conta.getSaldo() * 0.5;
		else if (chute >= 2 && chute <= 4)
			return conta.getSaldo() * 0.3;
		else
			return conta.getSaldo() * 0.006;
	}
}