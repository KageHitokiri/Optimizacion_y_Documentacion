package tema4;
/**
 * Clase que permite realizar el cribado de números primos mediante el cribado de erastótenes
 * @author Carlos
 * @version 1.0
 */
public class Calculos {
	
	/**
	 * Genera la criba de Erastótenes hasta @max.
	 * @param max Valor numérico máximo hasta el que llegará la criba.
	 * @return Array numérico con todos los números primos entre 2 y max
	 */
	public static int[] generarPrimos (int max) {
		int primeCounter = 0;
		
		if (max >= 2) {
			int originalArrayLength;			
			boolean[] isPrime;
			
			originalArrayLength = max + 1;
			isPrime = new boolean[originalArrayLength];
			
			for (int i=0; i<originalArrayLength; i++) {
				isPrime[i] = true;
			}

			isPrime[0] = isPrime[1] = false;

			for (int i=2; i<Math.sqrt(originalArrayLength)+1; i++) {
				if (isPrime[i]) {
					for (int j=2*i; j<originalArrayLength; j+=i)
						isPrime[j] = false;
				}
			}

			for (int i=0; i<originalArrayLength; i++) {
				if (isPrime[i])
					primeCounter++;
			}

			int[] primos = new int[primeCounter];
			for (int i=0, j=0; i<originalArrayLength; i++) {
				if (isPrime[i])
					primos[j++] = i;
			}
			return primos;
		} else {
			return new int[0];
		}
	}

}