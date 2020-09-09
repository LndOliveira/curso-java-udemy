package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosFuncionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DadosFuncionario funcionario = new DadosFuncionario();
		
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		System.out.println();
		
		System.out.println("Funcionário: " + funcionario);
		
		System.out.print("Porcentagem de acréscimo no salário do funcionário? ");
		double porcentagemAcrescimo = sc.nextDouble();
		funcionario.acrescimoSalario(porcentagemAcrescimo);
		System.out.println();
		
		System.out.println("Dados atualizados: " + funcionario);
		
		
		sc.close();

	}
}
