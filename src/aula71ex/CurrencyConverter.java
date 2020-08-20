package aula71ex;

public class CurrencyConverter {
	
	public static double dollar;
	public static double quantity;
	
	public static double calcReais() {
		return (dollar * quantity) + ((dollar*quantity *6)/100);
	}
	
}
