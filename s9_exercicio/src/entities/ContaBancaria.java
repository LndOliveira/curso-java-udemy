package entities;

public class ContaBancaria {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	
	// CONSTRUTORES
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular, double valorInicialConta) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositoDinheiro(valorInicialConta);
	}
	
	// --------------------------------------------------------------------------------------------------------------------------- //
	
	// GETTERS e SETTERS
		
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	// --------------------------------------------------------------------------------------------------------------------------- //
	
	// CONTA FEITA PARA DEPOSITAR E SACAR DINHEIRO
	
	public void depositoDinheiro(double quantidadeDeposito) {
		this.saldoConta += quantidadeDeposito; 
	}
	
	public void saqueDinheiro(double quantidadeSaque) {
		this.saldoConta -= quantidadeSaque + 5.00;
	}
	
	// --------------------------------------------------------------------------------------------------------------------------- //
	
	// IMPRIMIR MENSAGEM
	
	public String toString() {
		return numeroConta
				+ ", "
				+ "Nome do titular: "
				+ nomeTitular
				+ ", "
				+ "Saldo: R$ "
				+ String.format("%.2f", saldoConta);
	}
	
	// --------------------------------------------------------------------------------------------------------------------------- //
	
}
