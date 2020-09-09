import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Exemplo 1 \n");
		
		int x, y;
		
		x = 11;
		y = 2 * x;
		
		System.out.println("Valor de X: " + x);
		System.out.println("Valor de Y: " + y + "\n");
		
		System.out.println("***************************** \n");
		
		System.out.println("Exemplo 2 \n");
		System.out.println("Valor da área de um trapézio");
		
		double h, b, B, area;
		
		h = 5.0;
		b = 6.0;
		B = 8.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.printf("Valor da área: %.2f%n%n", area);
		
		System.out.println("***************************** \n");
		
		System.out.println("Exemplo 3 \n");
		
		int v1, v2;
		double resultado, resultado2;
		
		v1 = 5;
		v2 = 2;
		
		resultado =  v1 / v2;
		resultado2 = (double) v1 / v2; // Utiliza se o DOUBLE atras dos números pois em sua variavel esta definido como INT, ele converte a variavel para double, processo de casting.
		
		System.out.println("Sem casting: " + resultado);
		System.out.println("Com casting: " + resultado2 + "\n");
		
		System.out.println("***************************** \n");
		
	}

}
