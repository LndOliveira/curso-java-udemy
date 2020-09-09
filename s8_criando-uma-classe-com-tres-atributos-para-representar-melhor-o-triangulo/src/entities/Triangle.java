package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		/* Outra maneira que pode ser feito o -> return
		 
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
		
		*/
	}
	
}
