package tema4;
import java.util.Scanner;

public class Utilidades {
	static Scanner prompt = new Scanner(System.in);

	public static int readInt(String message) {
		System.out.println(message);
		return prompt.nextInt();
	}

	public static void numberPrinter (int [] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (i%10==0) System.out.println();
			System.out.print(i+1+"\t");
		}
	}
	
	public static void primePrinter (int [] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (i%10==0) System.out.println();
			System.out.print(matrix[i]+"\t");
		}
	}
	
}