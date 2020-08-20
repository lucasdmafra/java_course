package aula80ex;

public class Conta {
	
	private int numeroConta;
	private String titular;
	private double depositoInicial;
	
	//constructor
	public Conta(int numeroConta, String titular, double valor) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.depositoInicial = valor;
	}

	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	
	public int getNumeroConta() {
		return numeroConta;
	}

	
	public double getDepositoInicial() {
		return depositoInicial;
	}
	
	//method -5reais 
	

}
