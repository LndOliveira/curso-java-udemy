package entities;

public class Retangulo {

	public double largura;
	public double altura;

	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
	
	public String toString() {
		return String.format("ÁREA = %.2f%n", area())
				+ String.format("PERIMETRO = %.2f%n", perimetro())
				+ String.format("Diagonal = %.2f", diagonal());
	}
	
}