package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoedas;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos dólares você deseja comprar? ");
		double comprarDolar = sc.nextDouble();
		
		double valorPagarDolar = ConversorDeMoedas.somaValorDolar(dolar, comprarDolar);
		System.out.printf("%.2f", valorPagarDolar);
		
		sc.close();

	}

}
