package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		ContaBancaria conta;
		
		System.out.print("Entre com o número de sua conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.print("Você quer depositar um valor inicial (s/n): ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's' || resposta == 'S') {
			System.out.print("Entre com o valor inicial de depósito: ");
			double quantidadeInicialDeposito = sc.nextDouble();
			conta = new ContaBancaria(numeroConta, nomeTitular, quantidadeInicialDeposito);
		}
		
		else {
			conta = new ContaBancaria(numeroConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Entre com o valor de depósito: ");
		double quantidadeDeposito = sc.nextDouble();
		conta.depositoDinheiro(quantidadeDeposito);
		System.out.println();
		
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Entre com o valor de saque: ");
		double quantidadeSaque = sc.nextDouble();
		conta.saqueDinheiro(quantidadeSaque);
		System.out.println();
		
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		
		sc.close();

	}

}
