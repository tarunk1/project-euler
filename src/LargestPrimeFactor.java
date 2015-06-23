import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

	// 6857
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		long num = 600851475143l;

		int sqrtNum = (int) Math.sqrt(num);
		List<Integer> primes = getAllPrimes(sqrtNum);

		int max = 1;
		for (int prime : primes) {	
			if (num % prime == 0) {
				max = prime;
			}
		}

		System.out.println(max);

		System.out.println("Total time taken : "
				+ (System.currentTimeMillis() - startTime));

	}

	private static List<Integer> getAllPrimes(int num) {
		List<Integer> primes = new ArrayList<Integer>();

		for (int i = 3; i <= num; i += 2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}

		return primes;
	}

	private static boolean isPrime(int num) {
		if (num == 1)
			return false;

		if (num == 2)
			return true;

		if (num % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}