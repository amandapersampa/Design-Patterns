package aula01.p1;

import java.util.Calendar;

public class Conta {
    private double saldo;
    private String nome;
    private String numero;
    private String agencia;
	private final Calendar dataAbertura;

    
    public Conta(double saldo, String nome, String numero, String agencia){
		this.saldo = saldo;
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.dataAbertura = Calendar.getInstance();
    }

    public void deposita(double valor) {
      this.saldo += valor;
    }

    public double getSaldo() {
      return this.saldo;
    }

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public Calendar getDataAbertura() {
		return this.dataAbertura;
	}
	
  }