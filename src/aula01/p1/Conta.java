package aula01.p1;

public class Conta {
    private double saldo;
    private String nome;
    private String numero;
    private String agencia;

    
    public Conta(double saldo, String nome, String numero, String agencia){
		this.saldo = saldo;
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
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
	
  }