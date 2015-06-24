public class Prime10001st {

	public static void main(String[] args) {
		long currentTs = System.currentTimeMillis();

		int num = 10001;
		int prime = getNthPrime(num);
		System.out.println(prime);

		System.out.println("Total time taken : "
				+ (System.currentTimeMillis() - currentTs));
	}

	private static int getNthPrime(int num) {
		if (num == 1)
			return 2;
		int count = 1;

		int currentNum = 3;
		while (true) {
			if (isPrime(currentNum)) {
				count++;
				if (count == num) {
					return currentNum;
				}
			}
			currentNum += 2;
		}

	}

	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;

		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
