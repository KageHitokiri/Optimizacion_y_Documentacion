package tema4;

public class Criba {

	public static void main(String[] args) {
		int maxNumber;
		int numberArray[]; 
		
		maxNumber=Utilidades.readInt("Introduce el n�mero para la criba de Erast�tenes:");
		numberArray =new int[maxNumber];
		
		System.out.println("\nVector inicial hasta: "+maxNumber);
		Utilidades.numberPrinter(numberArray);
		
		numberArray=Calculos.generarPrimos(maxNumber);
		System.out.println("\nVector de primos hasta: "+maxNumber);
		Utilidades.primePrinter(numberArray);
	}
	
}