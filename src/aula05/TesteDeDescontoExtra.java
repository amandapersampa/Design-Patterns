package aula05;

import aula01.Orcamento;

public class TesteDeDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}
}
