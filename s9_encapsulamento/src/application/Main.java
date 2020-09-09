package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		System.out.println();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Updated data: " + product.getName());
		product.setPrice(1500.00);
		System.out.println("Updated data: " + product.getPrice());
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}