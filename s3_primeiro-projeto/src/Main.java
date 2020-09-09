import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Hello World!");
		System.out.println("Bom dia!" + "\n");
		
		int y = 32;
		double x = 10.223421;
		System.out.println(y);
		System.out.print(x + " // ");
		System.out.printf("%.2f // ", x);
		System.out.printf("%.4f%n%n", x);
		
		int v1 = 11;
		int v2 = 25;
		int v3 = 49;
		
		int resultado = v1 + v2 + v3;
		
		System.out.println("A soma entre " + v1 + " + " + v2 + " + " + v3 + " é = " + resultado); 
		
		double v4 = 11.89231;
		double v5 = 25.73523;
		double v6 = 49.694125;
		
		double resultado2 = v4 + v5 + v6;
		
		System.out.printf("A soma entre %.2f + %.2f + %.2f é = %.2f %n%n", v4, v5, v6, resultado2);
		
		String nome = "Leopoldo";
		int idade = 25;
		double salario = 8599.999;
		
		System.out.printf("%s tem %d anos e uma renda de R$%.2f %n", nome, idade, salario);
		
		
	}

}
