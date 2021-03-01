package tema4;
import java.util.Scanner;
/**
 * Clase diseñada para aportar utilidades al programa
 * @author Carlos
 * @version 1.0
 */
public class Utilidades {
	
	static Scanner prompt = new Scanner(System.in);
	/**
	 * Permite solicitar un valor entero al usuario.
	 * @param message mensaje mostrado por el terminal al usuario
	 * @return Valor entero introducido por el usuario
	 */
	public static int readInt(String message) {
		System.out.println(message);
		return prompt.nextInt();
	}

	/**
	 * Imprime todos los números hasta el valor más alto de la matriz +1
	 * Agrupa los números de 10 en 10
	 * @param matrix El método necesita un array de enteros para funcionar.
	 */
	public static void numberPrinter (int [] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (i%10==0) System.out.println();
			System.out.print(i+1+"\t");
		}
	}
	
	/**
	 * Imprime los valores de un array
	 * @param matrix El método solicita un array de números primos
	 */
	
	public static void primePrinter (int [] primeNumber) {
		for (int i = 0; i < primeNumber.length; i++) {
			if (i%10==0) System.out.println();
			System.out.print(primeNumber[i]+"\t");
		}
	}
	
}