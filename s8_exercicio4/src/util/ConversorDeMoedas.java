package util;

public class ConversorDeMoedas {
	
	public static final double IOF = 0.06;
	
	/*
	
	public static double imposto(double dolar, double comprarDolar) {
		return dolar * comprarDolar * IOF;
	}
	
	public static double somaValorDolar(double dolar, double comprarDolar) {
		return dolar * comprarDolar + imposto(dolar, comprarDolar);
	}
	
	*/
	
	public static double somaValorDolar(double dolar, double comprarDolar) {
		return dolar * comprarDolar * (1.0 + IOF);
	}

}
