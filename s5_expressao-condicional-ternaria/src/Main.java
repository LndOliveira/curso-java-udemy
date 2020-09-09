import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double preco, desconto, valorComDesconto;
		
		preco = sc.nextDouble();
		
		desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
		
		valorComDesconto = preco - desconto;
		
		System.out.println("Valor inteiro: " + preco);
		System.out.println("Desconto recebido: " + desconto);
		System.out.println("Valor a pagar com desconto: " + valorComDesconto);
		
		sc.close();

	}

}
