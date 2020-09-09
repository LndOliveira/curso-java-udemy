package entities;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	// CONSTRUTORES
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	// --------------------------------------------------------------------------------------------------------------------------- //
	
	// Getters e Setters
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	// --------------------------------------------------------------------------------------------------------------------------- //
	
	// Operações
	
	public void aumentoSalario(double porcentagemAumento) {
		salario += salario * porcentagemAumento / 100;
	}
	
	// --------------------------------------------------------------------------------------------------------------------------- //
	
	// Imprimir Mensagem
	
	public String toString() {
		return "ID: " 
				+ id 
				+ " / Nome: "
				+ nome
				+ " / Salário: "
				+ String.format("%.2f", salario);
	}
	
	// --------------------------------------------------------------------------------------------------------------------------- //
	
}
