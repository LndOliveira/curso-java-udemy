package application;

import java.util.Scanner;

import entities.Aluguel;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[11];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Aluguel(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 1; i <= 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		sc.close();
	}
}
