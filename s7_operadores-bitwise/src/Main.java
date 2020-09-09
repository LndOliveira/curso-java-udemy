import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 *  OPERADOR	|	SIGNIFICADO
		 *  	&		|	Opera��o "E" bit a bit
		 *  	|		| 	Opera��o "OU" bit a bit
		 *  	^		| 	Opera��o "OU-exclusivo" bit a bit
		 */
		
		Scanner sc = new Scanner (System.in);
		
		/* int n1, n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		*/
		
		int mask = 32; // pode ser escrito em forma bin�ria tamb�m: int mask = 0b00100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		
		else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();

	}

}
