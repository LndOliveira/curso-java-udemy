package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60) {
			System.out.println("REPROVADO");
			System.out.printf("Faltou %.2f para você ser aprovado!", aluno.ausenciaDePontos());
		}
		
		else {
			System.out.println("APROVADO");
		}
		
		sc.close();

	}
}
