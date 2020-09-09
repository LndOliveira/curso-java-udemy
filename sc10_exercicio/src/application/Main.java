package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários você quer registrar? ");
		int qtdFuncionario = sc.nextInt();
		
		for (int i = 0; i < qtdFuncionario; i++) {
			
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			list.add(funcionario);
		}
		
		System.out.println();
		System.out.print("Entre com o ID do funcionário que você quer aumentar o salário: ");
		int id = sc.nextInt();
		
		Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		//Integer pos = pos(list, id);
		
		if (funcionario == null) {
			System.out.println("Esse ID não existe");
		}
		
		else {
			System.out.print("Insira a porcentagem: ");
			double porcentagemAumento = sc.nextDouble();
			funcionario.aumentoSalario(porcentagemAumento);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionários:");
		for (Funcionario x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}
	
	/* 

	 public static Integer pos(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	*/
}
