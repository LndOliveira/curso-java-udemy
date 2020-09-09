package entities;

public class DadosFuncionario {
	public String name;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void acrescimoSalario(double porcentagemAcrescimo) {
		salarioBruto += salarioBruto * porcentagemAcrescimo / 100.0;
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f%n", salarioLiquido());
	}
	
}
