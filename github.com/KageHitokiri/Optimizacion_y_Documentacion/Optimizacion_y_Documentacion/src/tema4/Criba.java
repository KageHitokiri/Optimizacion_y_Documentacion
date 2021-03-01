package tema4;
/**
 * Clase principal
 * @author Carlos
 * @version 1.0
 */

public class Criba {
	/**
	 * Llama a los métodos de las otras clases para funcionar de forma limpia y eficiente. 
	 * @param args args
	 */
	
	public static void main(String[] args) {
		int maxNumber;
		int numberArray[]; 
		
		maxNumber=Utilidades.readInt("Introduce el número para la criba de Erastótenes:");
		numberArray =new int[maxNumber];
		
		System.out.println("\nVector inicial hasta: "+maxNumber);
		Utilidades.numberPrinter(numberArray);
		
		numberArray=Calculos.generarPrimos(maxNumber);
		System.out.println("\n\nVector de primos hasta: "+maxNumber);
		Utilidades.primePrinter(numberArray);
	}
	
}